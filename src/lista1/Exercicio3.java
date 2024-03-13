package lista1;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd números"));
		String pares = "";
		String impares = "";
		int somaPares = 0;
		int somaImpares = 0;
		int qtImpares = 0;
		
		for(int i=0; i< n; i++) {
			int nr = Integer.parseInt(JOptionPane.showInputDialog((i+1) +"º número:"));
			if(nr % 2 == 0) {
				pares +=  nr + " ";
				somaPares += nr;
			}else {
				impares += nr + " ";
				somaImpares += nr;
				qtImpares ++;
			}
		}
		
		String resultado = "Números pares: "+ pares + "\n"
				+"Soma dos pares: "+ somaPares+ "\n"
		        +"Números ímpares: "+ impares+ "\n"
		        +"Média ímpares: "+ ((double)somaImpares/qtImpares )+ "\n";
		
		JOptionPane.showMessageDialog(null, resultado);
	}

}
