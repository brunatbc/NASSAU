// Primeira Questão
package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		String nome;
		int idade;
        Scanner n = new Scanner (System.in);
		Scanner i = new Scanner (System.in);
		System.out.println ("Olá, digite o seu nome");
		nome = n.nextLine();
		System.out.println("Digite a sua idade");
	    idade = i.nextInt();
	    System.out.println("NOME: "+nome+ " IDADE: "+idade);
	    


	}

}

//Segunda Questão
package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner n = new Scanner (System.in);
		System.out.println("Olá, insira um número inteiro");
		n1= n.nextInt ();
		System.out.println ("Agora insira outro número inteiro");
		n2 = n.nextInt ();
		int dividendo;
		int divisor;
		double resto;
		double quociente;
		dividendo = n1;
		divisor = n2;
		resto = n1 % n2;
		quociente = n1 / n2;
		System.out.println("Dividendo: "+dividendo+", Divisor: "+divisor+", Quociente: "+quociente+", Resto: "+resto);
	}

}

//Terceira Questão
package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		int horas;
		double salario;
		Scanner hrs = new Scanner (System.in);
		Scanner sal = new Scanner (System.in);
		System.out.println("Olá, quantas horas você trabalhou esse mês?");
		horas = hrs.nextInt ();
		System.out.println("Quanto você recebe por hora?");
		salario = sal.nextDouble ();
		double salario_total;
		salario_total = salario * horas;
		System.out.println("Olá, você receberá nesse mês um total de: R$ "+salario_total);
		
	}

}

//Quarta Questão
package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		double n1;
		Scanner n = new Scanner (System.in);
		System.out.println ("Olá, insira um número");
		n1 = n.nextDouble ();
		double quadrado;
		quadrado = n1 * n1;
		System.out.println("NÚMERO: "+n1+", QUADRADO: "+quadrado);		
	}

}

//Quinta Questão
package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		double fah;
		double cel;
		Scanner f = new Scanner (System.in);
		System.out.println ("Olá, insida a temperatura em graus Fahrenheit");
		fah = f.nextDouble();
		cel = (5*(fah - 32)/9);
		System.out.println("A sua temperatura em graus Célsius é: "+cel+"ºC");
		
	}

}

//Sexta Questão
 package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
	double saldo;
	double saldo_final;
	Scanner s = new Scanner (System.in);
	System.out.println ("Olá, digite o seu saldo atual");
	saldo = s.nextDouble();
	saldo_final = (saldo * 3/100) + saldo;
	System.out.println("O seu saldo após o reajuste é de: $"+saldo_final);	
	}

}

//Sétima Questão
package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
	double metros;
	double centimetros;
	Scanner m = new Scanner (System.in);
	System.out.println("Olá, insira a medida em metros:");
	metros = m.nextDouble();
	centimetros = metros * 100;
	System.out.println("A medida em metros inserida, convertida em centímetros é: "+centimetros);
	}

}

//Oitava Questão é igual a terceira.

//Nona Questão
A)  package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
	double num_r;
	int num1;
	int num2;
	double calculo;
	Scanner n = new Scanner (System.in);
	System.out.println("Olá, digine um número inteiro:");
	num1=n.nextInt();
	System.out.println("Insira outro número inteiro:");
	num2=n.nextInt ();
	System.out.println("Agora insira um número real");
	num_r=n.nextDouble();
	calculo = (2 * num1) * (num2/2);
	System.out.println("O produto entre o dobro do primeiro e o produto do segundo é: "+calculo);
		}

}

 B) package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
	double num_r;
	int num1;
	int num2;
	double calculo;
	Scanner n = new Scanner (System.in);
	System.out.println("Olá, digine um número inteiro:");
	num1=n.nextInt();
	System.out.println("Insira outro número inteiro:");
	num2=n.nextInt ();
	System.out.println("Agora insira um número real");
	num_r=n.nextDouble();
	calculo = (num1*3)+num_r;
	System.out.println("A soma do triplo do primeiro com o terceiro: "+calculo);
		}

}


 C)    package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
	double num_r;
	int num1;
	int num2;
	double calculo;
	Scanner n = new Scanner (System.in);
	System.out.println("Olá, digine um número inteiro:");
	num1=n.nextInt();
	System.out.println("Insira outro número inteiro:");
	num2=n.nextInt ();
	System.out.println("Agora insira um número real");
	num_r=n.nextDouble();
	calculo = (num_r*num_r*num_r);
	System.out.println("O terceiro número elevado ao cubo é: "+calculo);
		}

}

//Décima Questão
package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
	      double altura;
	      double peso_ideal;
	      Scanner a = new Scanner (System.in);
	      System.out.println("Olá, insira a sua altura");
	      altura = a.nextDouble();
	      peso_ideal = (72.7*altura)-58;
	      System.out.println ("Baseado em sua altura, o seu peso ideal é de: "+peso_ideal+ "Kg");
	    		  
		}

}

//Décima Primeira
//ver.1  
package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
	    double horas;
	    double minutos;
	    double segundos;
	    Scanner s = new Scanner (System.in);
	    System.out.println("Olá, insira o tempo do evento ocorrido em segundos");
	    segundos = s.nextDouble();
	    minutos = segundos/60;
	    horas = segundos /3.600;
	    System.out.println("O tempo do evento em horas foi: "+horas);
	    System.out.println("Minutos: "+minutos);
	    System.out.println("Segundos: "+segundos);
	    
	    		  
		}

}

//ver.2
    package lista1;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
	    double horas;
	    double minutos;
	    double segundos;
	    double segundos_total;
	    double horas_2;
	    double minutos_2;
	    Scanner s = new Scanner (System.in);
	    System.out.println("Olá, insira o tempo do evento ocorrido em segundos");
	    segundos = s.nextDouble();
	    horas = segundos / 3.600;
	    horas_2 = (horas*3.600) - segundos;
	    minutos = horas_2 / 60;
	    segundos_total = horas_2 - (minutos * 60);		
	    System.out.println("O tempo do evento em horas foi: "+horas+"horas,"+minutos+" minutos,"+segundos_total+" segundos.");
	    
	    		  
		}

}



