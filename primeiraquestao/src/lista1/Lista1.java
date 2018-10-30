//Primeira Questão
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
