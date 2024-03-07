package revisao_algoritmos_1;

import javax.swing.JOptionPane;

public class Exemplo4 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("X"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Y"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Z"));

		if ((x < y + z) && (y < x + z) && (z < y + x)) {
			
			if((x == y) && (x == z)) {
				JOptionPane.showMessageDialog(null, "Equilátero");
			}else {
				if(x != y && x != z) {
					JOptionPane.showMessageDialog(null, "Escaleno");
				}else {
					JOptionPane.showMessageDialog(null, "Isósceles");
				}
			}

		} else {
			JOptionPane.showMessageDialog(null, "Não é triângulo");
		}
	}

}
