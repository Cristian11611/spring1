package co.com.bancodebogota.digital;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estrategiaDigital")
public class Cristian {

	@RequestMapping("/pruebaCristian")
	String saludarCristian() {
		return "Ola que hacen XD";
	}
}
