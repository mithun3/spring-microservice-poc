package app.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * Created by mithun on 28.04.2018.
 */
@ConfigurationProperties(prefix="foo")
@RefreshScope
@Validated
public class PropertyConfig {

	@NotNull
	private String bar;

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}
}
