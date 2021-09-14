package maven.prueba.tres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//			 Declaramos las variables a utilizar

		int clave = 8548;
		int saldo = 1000;
		int valoraretirar;
		int claveleida;
		int opcion = 0;
		int cantidadAtransferir = 0;
		int cuentaAtransferir;

		Scanner lector = new Scanner(System.in);

		System.out.print("Ingrese la clave: ");
		claveleida = Integer.parseInt(lector.next());
		if (clave == claveleida) {

			do {
				System.out.println("***************************************");
				System.out.println("******** BANCO PRODUBANCO ********");
				System.out.println("     Elija una opcion    ");
				System.out.println("*****************************************");
				System.out.println("1. Realizar transferencia");
				System.out.println("2. Consultar Transacciones");
				System.out.println("3. Consultar saldo");
				System.out.println("4. SALIR");

				opcion = lector.nextInt();
				switch (opcion) {

				case 1:
					System.out.println("Ingrese el monto a tranferir:");
					cantidadAtransferir = lector.nextInt();
					if (cantidadAtransferir <= saldo) {
						System.out.println("Por favor ingrese el numero de cuenta donde va a transferir el dinero:");
						cuentaAtransferir = lector.nextInt();
						saldo = saldo - cantidadAtransferir;
						System.out.println("Transferencia satisfactoria por valor de : " + cantidadAtransferir);
						System.out.println("Su nuevo saldo es: " + saldo);
					}
					break;
				case 2:
					System.out.println(" En este momento se estan procesando las transacciones, intente mas tarde");
					break;
				case 3:
					System.out.println("Su saldo Actual es: " + saldo);
					break;
				case 4:
					System.out.println("Gracias por preferirnos");
					System.out.println("-.-.-.-.-.-.-Alex Pachacama.-.-.-.-.-");

					System.exit(0);
					break;

				}
				System.out.println("Para salir digite 0");
				opcion = lector.nextInt();
			} while (opcion != 0);
			System.out.println("Gracias por preferirnos");
		} else {
			System.out.println(" La Clave es incorrecta");
		}

	}

}
