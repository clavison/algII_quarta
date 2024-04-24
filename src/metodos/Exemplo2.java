package metodos;

import javax.swing.JOptionPane;

public class Exemplo2 {
	
	public static void main(String[] args) {
		double[] precos = new double[20];
		int[]   estoques = new int[20];
		int count = 0;
		int op = 0;
		do {
			op = menu();
			if(op == 1)cadastra(precos, estoques, count++);
			if(op == 2)menos10(estoques, count);
			if(op == 3)mais100mais10(precos, estoques, count);
			if(op == 4)System.out.println(precoMenorEstoque(precos, estoques, count));
			if(op == 5)System.out.println(estoqueMaiorPreco(precos, estoques, count));
		}while(op != 7);
	}
	
	private static int menu() {
		String m = "1 - Cadastrar\n"
				+ "2 - Qtdade menos de 10 unidades\n"
				+ "3 - Qtdade mais que 100,00 e mais de 10 unidades\n"
				+ "4 - Preço da que tem menor estoque\n"
				+ "5 - Estoque da que tem maior preço\n"
				+ "6 - % estoque zerado\n"
				+ "7 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	private static void cadastra(double[] precos, int[] estoques, int count) {
		if(count < 20) {
			precos[count] = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
			estoques[count] = Integer.parseInt(JOptionPane.showInputDialog("Estoque"));
		}else {
			JOptionPane.showMessageDialog(null, "Memória cheia");
		}
	}
	
	private static void menos10(int[] estoques, int count) {
		int qtMenos10 = 0;
		for(int i=0; i< count; i++) {
			if(estoques[i] < 10) {
				qtMenos10 ++;
			}
		}
		JOptionPane.showMessageDialog(null, qtMenos10);
	}
	
	private static void mais100mais10(double[] precos, int[] estoques, int count) {
		int qtMais100Mais10 = 0;
		for(int i=0; i< count; i++) {
			if(precos[i] > 100 && estoques[i]>10) {
				qtMais100Mais10 ++;
			}
		}
		JOptionPane.showMessageDialog(null, qtMais100Mais10);
	}
	
	private static double precoMenorEstoque(double[] precos, int[] estoques, int count) {
		double precoMenorEstoque = precos[0];
		int menorEstoque = estoques[0];
		for(int i=0; i< count; i++) {
			if(estoques[i] < menorEstoque) {
				menorEstoque = estoques[i];
				precoMenorEstoque = precos[i];
			}
		}
		return precoMenorEstoque;
	}
	
	private static int estoqueMaiorPreco(double[] precos, int[] estoques, int count) {
		double maiorPreco = precos[0];
		int estoquemaiorPreco = estoques[0];
		for(int i=0; i< count; i++) {
			if(precos[i] > maiorPreco) {
				maiorPreco = precos[i];
				estoquemaiorPreco = estoques[i];
			}
		}
		return estoquemaiorPreco;
	}

}
