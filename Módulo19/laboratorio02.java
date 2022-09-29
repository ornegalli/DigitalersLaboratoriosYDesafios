package Módulo19;

public class laboratorio02 {

	public static void main(String[] args) {

		int numero_1 = 20;
		int numero_2 = 5;
		int numero_3 = 13;
		
		if (numero_1 > numero_2 && numero_1 > numero_3) {
			System.out.println("El numero mayor es " + numero_1);
		}else if (numero_2 > numero_1 && numero_2 > numero_3) {
			System.out.println("El numero mayor es " + numero_2);
		}else {
			System.out.println("El numero mayor es " + numero_3);
		}
		

	}

}
