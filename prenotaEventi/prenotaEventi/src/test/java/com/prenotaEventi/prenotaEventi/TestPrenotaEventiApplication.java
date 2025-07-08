package com.prenotaEventi.prenotaEventi;

import org.springframework.boot.SpringApplication;

public class TestPrenotaEventiApplication {

	public static void main(String[] args) {
		SpringApplication.from(PrenotaEventiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
