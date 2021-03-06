package app;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Created by mithun on 29.03.2018.
 */
@EnableAdminServer
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminApplication.class, args);
	}
}

