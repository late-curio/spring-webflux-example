package latecurio.webfluxeg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class WebfluxegApplicationTests {

//	@ClassRule
//	public static MySQLContainer mySQLContainer = new MySQLContainer("mysql:8");

	@Container
	public GenericContainer mySQLContainer = new GenericContainer("mysql").withExposedPorts(3306);

	@Test
	void contextLoads() {
	}

}
