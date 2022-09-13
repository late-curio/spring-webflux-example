package latecurio.webfluxeg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class WebfluxegApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxegApplication.class, args);
	}

}
