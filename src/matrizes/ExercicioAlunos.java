package matrizes;

import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ExercicioAlunos {
	
//Uma turma com N alunos realizou M provas. 
//Faça um programa que leia todas as notas 
//obtidas pelos alunos e ao final mostre 
//a média de cada aluno 
//(trate os alunos como 1, 2, 3 ...)
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd Alunos:"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Qtd Provas:"));
		double[][] notas = new double[n][m];
		
		//LEITURA DE DADOS
		for(int i=0; i<n; i++) {
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
			ret += "Aluno(a) "+(i+1)+"\t"+df.format(media);
		}
		
		JOptionPane.showMessageDialog(null, new JTextArea(ret));
	}
		
		
	
}
