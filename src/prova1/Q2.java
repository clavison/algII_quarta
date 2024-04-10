package prova1;

import javax.swing.JOptionPane;

public class Q2 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("N"));
		
		String[] eletros = new String[n];
		int[] consumos = new int[n];
		
		String menu = "1 - cadastrar\n"
				+ "2 - Listar\n"
				+ "3 - Verconsumos hrs\n"
				+ "4 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				for(int i=0; i<n; i++) {
					eletros[i]=JOptionPane.showInputDialog("nome");
					consumos[i] = Integer.parseInt(JOptionPane.showInputDialog("whats"));
				}
			}
			if(op == 2) {
				String ret = "";
				for(int i=0; i<n; i++) {
					ret = eletros[i]+"-"+consumos[i]+"\n";
				}
				JOptionPane.showMessageDialog(null, ret);
			}
			
			if(op == 3) {
				int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas"));
				int tot = 0;
				for(int i=0; i<n; i++) {
					tot += consumos[i];
				}
				JOptionPane.showMessageDialog(null, tot*horas);
			}
			
		}while(op!=4);
	}

}
