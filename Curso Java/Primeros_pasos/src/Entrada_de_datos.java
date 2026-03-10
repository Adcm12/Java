import java.util.Scanner;	
public class Entrada_de_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("Hola " + nombre_usuario);
		
		entrada.close();
		

	}

}
