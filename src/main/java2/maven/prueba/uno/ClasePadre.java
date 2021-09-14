package maven.prueba.uno;

import java.util.Scanner;

public abstract class  ClasePadre {
	
	protected int retirarDinero;
	protected int cambiarClave;
	protected int bloquearCuenta;
	private static int saldo;
	 Scanner entrada = new Scanner(System.in);
	 
	 public void Operaciones() {
		 int bandera = 0;
		 int sellecion = 0;
		 
		 do {
			 System.out.println("CAJERO BANCO PICHINCHA");
			 System.out.println();
			 System.out.println("SELECCIONE UNA OPCION:");
			 System.out.println("      1.RETIRAR DINERO");
			 System.out.println("      2.CAMBIAR CLAVE");
			 System.out.println("      3.BLOQUEAR CUENTA");
			 System.out.println("      4.SALIR");
			 sellecion = entrada.nextInt();
			 
			 if(sellecion>= 1 && sellecion <= 4 ) {
				 bandera = 1;
			 }else {
				 System.out.println(".....................");
				 System.out.println("OPCION DISPONIBLE");
				 System.out.println(".....................");
			 }
		 }while(bandera==0) ;
		 
		 if (sellecion == 1) {
			 
		 }else if (sellecion == 2) {
			 
		 }else if(sellecion == 3) {
			 
		 }else if(sellecion == 4) {
			 System.out.println(".....................");
			 System.out.println("GRACIAS POR SU PREFERENCIA");
			 System.out.println(".....................");
			 bandera = 2;
		 }
		 
	  while (bandera!= 2);
	 
}
	 
	 public void RetiraraDinero() {
		 retirarDinero = entrada.nextInt();	
	 }
	 
	 public void CambiarClave() {
		 cambiarClave = entrada.nextInt();
	 }
	 public abstract void BloquearCuenta();
	 
	 public int getSaldo() {
		 return saldo;
	
	 }
	 public void setSaldo(int saldo) {
		 this.saldo = saldo;
		 
	 }
	 
	 
	 
	 
}
	 
	 
			 
			  


	

