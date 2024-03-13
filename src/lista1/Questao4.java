package lista1;

import javax.swing.JOptionPane;

public class Questao4 {
	
	public static void main(String[] args) {
		int chico = 150;
		int ze = 110;
		int anos = 0;
		while(ze <= chico) {
			anos ++;
			chico += 2;
			ze += 3;
		}
		JOptionPane.showMessageDialog(null, anos);
	}

}
