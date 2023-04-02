package br.edu.infnet.AppFreteHidroviario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppFreteHidroviarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppFreteHidroviarioApplication.class, args);
	}

}
