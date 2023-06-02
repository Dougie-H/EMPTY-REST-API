package kr.co.pcninc.ecoes.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EcoesApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcoesApiApplication.class, args);
	}

}
