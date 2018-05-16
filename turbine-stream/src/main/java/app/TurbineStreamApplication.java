package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Created by mithun on 29.03.2018.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbineStream
public class TurbineStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineStreamApplication.class, args);
	}
}