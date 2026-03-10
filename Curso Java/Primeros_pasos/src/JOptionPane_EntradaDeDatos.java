import javax.swing.*;
public class JOptionPane_EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
		
		System.out.println("Te llamas " + nombre_usuario + " y tienes " + edad + " años");
		
	}

}
