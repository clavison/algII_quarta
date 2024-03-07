package revisao_algoritmos_1;

import javax.swing.JOptionPane;

public class Exemplo6 {
	
	public static void main(String[] args) {
		int qt = Integer.parseInt(JOptionPane.showInputDialog("qt"));
		int soma = 0;
		
		for(int i = 0; i < qt; i++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º número"));
			soma += n;
		}
		
		JOptionPane.showMessageDialog(null, soma);
	}

}
