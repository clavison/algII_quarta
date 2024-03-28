package vetores.lista;

import javax.swing.JOptionPane;

public class Questao3 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qtdade"));
		
		String[] nomes = new String[n];
		double[] salarios = new double[n];
		double[] salariosNovos = new double[n];
		
		//CADASTRAR
		for(int i=0; i<n; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome");
			salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
		}
		
		//DAR AUMENTO
		for(int i=0; i<n; i++) {
			if(salarios[i] <= 400) {
				salariosNovos[i] = salarios[i]*1.25;
			}else {
				if(salarios[i] <= 600) {
					salariosNovos[i] = salarios[i]*1.20;
				}else {
					if(salarios[i] <= 800) {
						salariosNovos[i] = salarios[i]*1.15;
					}else {
						salariosNovos[i] = salarios[i]*1.10;
					}
				}
			}
		}
		
		//MOSTRAR USUÁRIO
		String ret = "";
		for(int i=0; i<n; i++) {
			String nome = nomes[i];
			double salarioAntigo = salarios[i];
			double salarioNovo = salariosNovos[i];
			ret += nome +"-"+salarioAntigo+"-"+salarioNovo+"\n";
		}
		JOptionPane.showMessageDialog(null, ret);
	}

}
