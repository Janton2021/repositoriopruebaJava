import javax.swing.JOptionPane;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Intoduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad");
		
		System.out.println("Hola " + nombre_usuario + ". Tienes " + edad + " años."); //Aquí edad es una cadena de texto, es un string
		
		int edad_usuario = Integer.parseInt(edad); //Aquí cambiamos la variable edad a otra, edad_usuario, y la cambbiamos de string a int
		
		System.out.println("El año viene vas a tener " + (edad_usuario+1) + " años.");
	}

}
