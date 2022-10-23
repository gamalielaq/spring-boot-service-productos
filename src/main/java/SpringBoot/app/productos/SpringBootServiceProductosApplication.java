package SpringBoot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootServiceProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceProductosApplication.class, args);
	}

}
