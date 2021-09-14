package maven.prueba.uno;

public abstract class ClaseHijaRetiro extends ClasePadre {
	
	public void CambiarClave() {
		System.out.println("Cuanto deseas retirar:");
		RetiraraDinero();
		if(retirarDinero <= getSaldo()  ) {
			cambiarClave = getSaldo();
			setSaldo(cambiarClave = retirarDinero);
			System.out.println("Retiraste:"+retirarDinero);
			System.out.println("Tu saldo actual es:"+getSaldo());
		
	}
		
	}

}
 