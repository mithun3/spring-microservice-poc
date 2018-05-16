package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created by mithun on 29.03.2018.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinStreamServer
public class TracingApplication {


	public static void main(String[] args) {
		SpringApplication.run(TracingApplication.class, args);
	}

}