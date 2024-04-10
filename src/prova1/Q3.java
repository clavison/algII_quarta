package prova1;

import javax.swing.JOptionPane;

public class Q3 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("N"));
		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		for(int i=0; i<n; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Nº A"));
			vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Nº B"));
		}
		String linha1="Vetor A:";
		String linha2="Vetor B:";
		String linha3="Soma:";
		String linha4="Substração:";
		String linha5="Multiplicação:";
		String linha6="Divisão:";
		
		for(int i=0; i<n; i++) {
			linha1 += (vetorA[i]+ " | ");
			linha2 += (vetorB[i]+ " | ");
			linha3 += (vetorA[i]+vetorB[i]+ " | ");
			linha4 += (vetorA[i]-vetorB[i]+ " | ");
			linha5 += (vetorA[i]*vetorB[i]+ " | ");
			if(vetorB[i]==0)
				linha6 += ("NaN | ");
			else
				linha6 += (vetorA[i]/vetorB[i]+ " | ");
		}
		JOptionPane.showMessageDialog(null, 
				linha1+"\n"+
				linha2+"\n"+
				linha3+"\n"+
				linha4+"\n"+
				linha5+"\n"+
				linha6+"\n"
		);
		
	}

}
