package SpringBoot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootServiceProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceProductosApplication.class, args);
	}

}
