package Módulo19;

import java.util.Scanner;

public class laboratorioFinal {

	public static void main(String[] args) {
		
		double[] notas_alumnos;
		String[] nombres_alumnos;
		

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de notas a cargar");
		int cantidadAlumnos = teclado.nextInt();

		
		notas_alumnos = new double[cantidadAlumnos];
		nombres_alumnos = new String[cantidadAlumnos];

		for (int i = 0; i < cantidadAlumnos; i++) {
				System.out.println("Ingrese el nombre del alumno [" + (i+1) + "]: ");
				nombres_alumnos[i] = teclado.next();
				
				System.out.println("Ingrese la nota del alumno");
				notas_alumnos[i] = teclado.nextDouble();
		}
		
		System.out.println("\n");

		
		double promedioNotas = 0, sumaNotas = 0, 
				   notaMayor = notas_alumnos[0], 
				   notaMenor = notas_alumnos[0];
			
			int posicion_notaMayor = 0, posicion_notaMenor = 0;

		
		for (int i = 0; i < cantidadAlumnos; i++) {

			sumaNotas += notas_alumnos[i];

			if (i == 0) {
				continue;
			}

	
			if (notaMayor < notas_alumnos[i]) {
				notaMayor = notas_alumnos[i];
				posicion_notaMayor = i;
			}

			if (notaMenor > notas_alumnos[i]) {
				notaMenor = notas_alumnos[i];
				posicion_notaMenor = i;
			}

		}
		
		promedioNotas = (sumaNotas / cantidadAlumnos);
		
		System.out.println("El promedio de notas es: " + promedioNotas);
		System.out.println("El alumno con la mejor nota es " + nombres_alumnos[posicion_notaMayor] + " que obtuvo un "
				+ notaMayor);
		System.out.println("El alumno con la peor nota es " + nombres_alumnos[posicion_notaMenor] + " que obtuvo un "
				+ notaMenor);

		
		teclado.close();

}

}