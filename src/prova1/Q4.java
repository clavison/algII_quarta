package prova1;

import javax.swing.JOptionPane;

public class Q4 {
	
	public static void main(String[] args) {
		String menu = "1 - Cadastrar\n"
				+ "2 - Buscar por produto\n"
				+ "3 - Listar compras maior que 10\n"
				+ "4 - Sair";
		int op = 0;
		String[] produtos = new String[100];
		int[] qtds = new int[100];
		int count = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1) {
				if(count < 100) {
					produtos[count] = JOptionPane.showInputDialog("Produto");
					qtds[count] = Integer.parseInt(JOptionPane.showInputDialog("QT"));
					count++;
				}
			}
			
			if(op == 2) {
				String busca = JOptionPane.showInputDialog("Buscar por:");
				String ret = "Produto não encontrado";
				for(int i=0; i< count; i++) {
					if(produtos[i].equals(busca)) {
						ret = produtos[i]+"-"+qtds[i];
					}
				}
				JOptionPane.showMessageDialog(null, ret);
			}
			
			if(op == 3) {
				String ret = "Produto que a lista tem mais de 10\n";
				for(int i=0; i< count; i++) {
					if(qtds[i] > 10) {
						ret = produtos[i]+"-"+qtds[i]+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, ret);
			}
		}while(op!=4);
				
	}

}
