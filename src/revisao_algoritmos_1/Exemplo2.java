package revisao_algoritmos_1;

import javax.swing.JOptionPane;

public class Exemplo2 {
	
	public static void main(String[] args) {
		double vlPoupanca = Double.parseDouble(JOptionPane.showInputDialog("Saldo atual:"));
		double pcJuro = Double.parseDouble(JOptionPane.showInputDialog("% de juros:"));
		double saldo = vlPoupanca + (vlPoupanca * pcJuro / 100);
		JOptionPane.showMessageDialog(null, "Saldo final: R$"+saldo);
	}

}
