package vetores;

import javax.swing.JOptionPane;

public class Exemplo3 {
	
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		int[] idades = new int[5];
		
		String menu = "1 - Cadastar\n"
				+ "2 - Nome da pessoa mais velha\n"
				+ "3 - Buscar pessoa\n\n"
				+ "4 - Sair";
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				for(int i=0; i<nomes.length; i++) {
					nomes[i] = JOptionPane.showInputDialog("Nome");
					idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade de "+nomes[i]));
				}
			}
			if(op == 2) {
				String nomeMaisVelho = nomes[0];
				int idadeMaisVelho = idades[0];
				for(int i=0; i<nomes.length; i++) {
					if(idades[i] > idadeMaisVelho) {
						nomeMaisVelho = nomes[i];
						idadeMaisVelho = idades[i];
					}
				}
				JOptionPane.showMessageDialog(null, "Mais velho(a):"+nomeMaisVelho);
			}
			if(op == 3) {
				String nmBusca = JOptionPane.showInputDialog("Qual nome buscar:");
				String resultado = "Nome não encontrado";
				for(int i=0; i<nomes.length; i++) {
					if(nomes[i].equalsIgnoreCase(nmBusca)) {
						resultado = "Nome localizado. Idade de "+idades[i];
					}
				}
				JOptionPane.showMessageDialog(null, resultado);
			}
		}while (op!= 4);
	}

}
