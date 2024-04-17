package matrizes;

import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ExercicioAlunosComNome {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd Alunos:"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Qtd Provas:"));
		double[][] notas = new double[n][m];
		String[] nomes = new String[n];
		
		//LEITURA DE DADOS
		for(int i=0; i<n; i++) {
			nomes[i]=JOptionPane.showInputDialog("Nome do aluno(a) "+(i+1));
			for(int j=0; j<m; j++) {
				notas[i][j] = new Random().nextDouble()*10;
			}
		}
		
		//MOSTRA A MATRIZ
//		for(int i=0; i<n; i++) {
//			System.out.println();
//			for(int j=0; j<m; j++) {
//				System.out.print(df.format(notas[i][j])+"\t");
//			}
//		}
		
		//CALCULO DA MÉDIA
		String ret = "";
		for(int i=0; i<n; i++) {
			double soma = 0;
			ret += "\n";
			for(int j=0; j<m; j++) {
				soma += notas[i][j];
			}
			double media = soma / m;
			ret += nomes[i]+"\t"+df.format(media);
		}
		
		JOptionPane.showMessageDialog(null, new JTextArea(ret));
	}

}
