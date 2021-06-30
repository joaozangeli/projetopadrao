package com.senac.projetopadrao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjetopadraoApplication {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 20;

		somaNumeros(numero1, numero2);
		divisaoNumeros(numero1, numero2);
		subtracaoNumeros(numero1, numero2);
		System.out.println(subtracaoNumeros(numero1, numero2));
		System.out.println(divisaoNumeros(numero1, numero2));
		System.out.println(somaNumeros(numero1, numero2));
	}

	private static int subtracaoNumeros(int numero1, int numero2) {
		int subtracao = numero2 - numero1;
		return subtracao;
	}

	private static int divisaoNumeros(int numero1, int numero2) {
		int divisao = numero2/numero1;

		return divisao;
	}

	private static int somaNumeros(int numero1, int numero2) {
		int soma = numero1 + numero2;

		return soma;
	}


}
