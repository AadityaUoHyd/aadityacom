package org.aadi.aadityacom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class AadityaComBackendApplication {

  static {
    Dotenv.configure()
      .ignoreIfMissing()
      .load()
      .entries()
      .forEach(e -> System.setProperty(e.getKey(), e.getValue()));
  }

	public static void main(String[] args) {
		SpringApplication.run(AadityaComBackendApplication.class, args);
	}

}
