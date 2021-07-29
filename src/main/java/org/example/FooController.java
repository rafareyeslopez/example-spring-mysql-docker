package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class FooController {

	@GetMapping("/hello")
	public ResponseEntity<String> helloWorld() {

		return ResponseEntity.ok("Hello!");

	}

}
