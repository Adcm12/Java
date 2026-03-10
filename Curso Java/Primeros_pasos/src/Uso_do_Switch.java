import java.util.Scanner;

public class Uso_do_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una opcion (1 - 2) : \n");
		int opcionMenu = entrada.nextInt();
		
		switch (opcionMenu) {
		
		case 1:
			System.out.println("Registrando nueva lectura...");
			break; //importante poner el break para que no ejecute el resto
		
		case 2: 
			System.out.println("Calculando diferencia de consumo...");
			break;
		
		default: 
			System.out.println("Opcion no valida!!!");
		}

	}

}
