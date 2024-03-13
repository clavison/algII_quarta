package vetores;

import javax.swing.JOptionPane;

public class Exemplo {
	
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		
		for(int i=0; i<nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome "+(i+1)+":");
		}
		
		for(int i=0; i<nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
	}

}
