package SpringBoot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.springboot.app.commons.entity"}) // Solo si tiene persistencia JPA
public class SpringBootServiceProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceProductosApplication.class, args);
	}

}
