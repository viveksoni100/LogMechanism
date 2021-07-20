package com.vivek.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoggingTutorialApplication {

	public static final Logger LOG = LoggerFactory.getLogger(LoggingTutorialApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingTutorialApplication.class, args);
	}

	@GetMapping("/check")
	public String getLoggingData() {
		LOG.info("I Love Programming!");
		return "Logging is set!";
	}

}
