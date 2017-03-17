package co.com.bancodebogota.digital;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("/")
	String hellow() {
		return "Hello World!";
	}
}
