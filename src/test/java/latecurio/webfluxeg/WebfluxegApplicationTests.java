package latecurio.webfluxeg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.Optional;

@SpringBootTest
@Testcontainers
class WebfluxegApplicationTests {


	@Container
	public PostgreSQLContainer postgresDb = new PostgreSQLContainer("postgres:13.1")
			.withDatabaseName("testdb")
			.withUsername("postgres")
			.withPassword("postgres");

	@Autowired
	private ItemService itemService;

	@Test
	void createAndGetItem() {
		Item created = itemService.create("Title");
		Optional<Item> found = itemService.get(created.getId());

		Assertions.assertNotNull(created);
		Assertions.assertTrue(found.isPresent());
	}

}
