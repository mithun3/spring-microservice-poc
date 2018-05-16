package app.client;

import feign.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mithun on 28.04.2018.
 */
@FeignClient(value = "level2-hello-service", fallback = Level2HelloClientFallback.class)
public interface Level2HelloClient {
	@GetMapping(value = "/give-me-high5")
	String giveMeHigh5();

	@GetMapping(value = "/level2-hello")
	String hello2();
}
