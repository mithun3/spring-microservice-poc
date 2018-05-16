package cloud.authorization.application;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mithun on 27.04.2018.
 */
public class CustomTokenEnhancer extends JwtAccessTokenConverter {
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		final Map<String, Object> additionalInfo = new HashMap<>();
		additionalInfo.put("organization", "mithun");
		additionalInfo.put("put", "additional");
		additionalInfo.put("stuff", "here");
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
		return super.enhance(accessToken, authentication);
	}

}
