package com.injecaoDep.aulaInjecaoDepSpring;

import com.injecaoDep.aulaInjecaoDepSpring.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaInjecaoDepSpringApplication implements CommandLineRunner {

    @Autowired
	private PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(AulaInjecaoDepSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Resultado é R$ " + payService.finalPrice(300.0, "SC"));

	}
}
