package revisao_algoritmos_1;

import javax.swing.JOptionPane;

public class Exemplo1 {
	
	public static void main(String[] args) {
		//System.out.println("Olá Java!!!");
		String nome = JOptionPane.showInputDialog("Seu nome:");
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Sua idade:")
				);
		JOptionPane.showMessageDialog(
				null, "Nome: "+nome+"\nIdade:"+idade);
	}

}
