package app.client;

import org.springframework.stereotype.Component;

/**
 * Created by mithun on 3.05.2018.
 */
@Component
public class Level3HelloClientFallback implements HelloLevel3Client {
	@Override
	public String giveMeLevel3Hello() {
		return "level 3 application is unavailable";
	}
}
