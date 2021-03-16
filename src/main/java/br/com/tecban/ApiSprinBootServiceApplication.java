package br.com.tecban;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiSprinBootServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(ApiSprinBootServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ApiSprinBootServiceApplication.class, args);
		log.info("--------------------------------------------------------------------> SERVIÇO PRONTO PARA SER CONSUMIDO!");
	}

}
