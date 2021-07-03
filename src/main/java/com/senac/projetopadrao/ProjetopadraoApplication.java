package com.senac.projetopadrao;

import com.senac.projetopadrao.schedulingtasks.Calculadora;
import com.senac.projetopadrao.schedulingtasks.Usuario;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjetopadraoApplication {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.setNome("lucas");
		usuario.setSenha("123");
		System.out.println("");

		if(!usuario.isLogado()){
			usuario.logar();

		}





//
//		Calculadora calculadora = new Calculadora();
//
//		calculadora.somar(30,40);
//		System.out.println(calculadora.getSoma());
//
//		calculadora.subtrair(90,80);
//		System.out.println(calculadora.getSubtracao());

	//	calculadora.setarDigito1(21);


//		int numero1 = 10;
//		int numero2 = 20;

//		somaNumeros(numero1, numero2);
//		divisaoNumeros(numero1, numero2);
//		subtracaoNumeros(numero1, numero2);
//		System.out.println(subtracaoNumeros(numero1, numero2));
//		System.out.println(divisaoNumeros(numero1, numero2));
//		System.out.println(somaNumeros(numero1, numero2));
	}

//	private static int subtracaoNumeros(int numero1, int numero2) {
//		int subtracao = numero2 - numero1;
//		return subtracao;
//	}
//
//	private static int divisaoNumeros(int numero1, int numero2) {
//		int divisao = numero2/numero1;
//
//		return divisao;
//	}
//
//	private static int somaNumeros(int numero1, int numero2) {
//		int soma = numero1 + numero2;
//
//		return soma;
//	}


}
