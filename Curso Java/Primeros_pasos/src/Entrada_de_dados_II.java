import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada_de_dados_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in); // Se crea el objeto scanner
		
		System.out.print("Introduce la lectura del medidor de hoy (Kwh): \n");
		double lectura_actual = entrada.nextDouble(); // Lo leemos como un decimal
		
		System.out.println("Lectura registrada exitosamente: " + lectura_actual + " Kwh");
		
		entrada.close(); //  Buena practica: cerrar el scanner
	}

}

// Usando JOptionPane 




class Ventana_consumo {
	public static void main (String[] args) {
		
		// Todo lo que entra por JOptionPane es String, hay que convertirlo  al tipo de dato que queremos
		
		String input = JOptionPane.showInputDialog("Ingrese el consumo de su computador: ");
		double consumo_pc = Double.parseDouble(input);
		
		JOptionPane.showMessageDialog(null, "El computador consume: " + consumo_pc);
	}
}