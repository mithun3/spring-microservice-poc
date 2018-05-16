package cloud.authorization.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by mithun on 16.04.2018.
 */
@RestController
class UserController {
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
}
