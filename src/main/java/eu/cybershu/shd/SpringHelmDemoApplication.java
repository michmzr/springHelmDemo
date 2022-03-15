package eu.cybershu.shd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringHelmDemoApplication {

	public static void main(String[] args) {
		log.info("Welcome to Spring Helm Demo app!!");
		SpringApplication.run(SpringHelmDemoApplication.class, args);
	}
}
