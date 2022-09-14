package latecurio.webfluxeg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.testcontainers.containers.MySQLContainer;
//import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
class WebfluxegApplicationTests {

//	@Container
//	public PostgreSQLContainer postgresDb = new PostgreSQLContainer("postgres:13.1")
//			.withDatabaseName("testdb")
//			.withUsername("postgres")
//			.withPassword("postgres");

	@Container
	public MySQLContainer postgresDb = new MySQLContainer("mysql:8")
			.withDatabaseName("testdb")
			.withUsername("admin")
			.withPassword("admin");

	@Autowired
	private ItemService itemService;

	@LocalServerPort
	private int port;

	private TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	void createAndGetItem() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			String title = Long.toString(System.currentTimeMillis());
			Item created = itemService.create(title);
			Optional<Item> found = itemService.get(created.getId());

			Assertions.assertNotNull(created);
			Assertions.assertTrue(found.isPresent());
			Assertions.assertEquals(created.getTitle(), found.get().getTitle());

			restTemplate.getForEntity("http://localhost:" + port + "/items", String.class);

			Thread.sleep(1000);
		}
	}

}
