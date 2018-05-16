package app.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mithun on 3.05.2018.
 */
@FeignClient(value = "level3-hello-service", fallback = Level3HelloClientFallback.class)
public interface HelloLevel3Client {
	@GetMapping(value = "/level3-hello")
	String giveMeLevel3Hello();
}
