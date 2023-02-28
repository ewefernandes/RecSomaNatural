package view;
import javax.swing.JOptionPane;
import controller.cModulos;

public class principal {
	public static void main (String [] args) {
		cModulos mod = new cModulos();
		int num = 0, soma = 0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Número natural:"));
		} while (num < 0);
		
		int retorno = mod.somaNaturais(num, soma);
		System.out.println("Soma = " +retorno);
		
	}
}
