package revisao_algoritmos_1;

import javax.swing.JOptionPane;

public class Exemplo3 {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		if (idade <= 12) {
			JOptionPane.showMessageDialog(null, "Criança");
		} else {
			if(idade < 18) {
				JOptionPane.showMessageDialog(null, "Jovem");
			}else{
				JOptionPane.showMessageDialog(null, "Outro");
			}
		}
	}

}
