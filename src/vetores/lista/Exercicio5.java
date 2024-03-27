package vetores.lista;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		final int TAMANHO = 20;
		String menu = "1 - Cadastrar\n"
				+ "2 - Qtdade menos de 10 unidades\n"
				+ "3 - Qtdade mais que 100,00 e mais de 10 unidades\n"
				+ "4 - Preço da que tem menor estoque\n"
				+ "5 - Estoque da que tem maior preço\n"
				+ "6 - % estoque zerado\n"
				+ "7 - Sair";
		double[] precos = new double[TAMANHO];
		int[] estoques = new int[TAMANHO];
		int count = 0;
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				if(count < TAMANHO) {
					precos[count]= Double.parseDouble(JOptionPane.showInputDialog("Preço"));
					estoques[count] = Integer.parseInt(JOptionPane.showInputDialog("Estoque"));
					count++;
				}else {
					JOptionPane.showMessageDialog(null, "Memória cheia");
				}
				break;
			case 2:
				int qtMenos10 = 0;
				for(int i=0; i< count; i++) {
					if(estoques[i] < 10) {
						qtMenos10 ++;
					}
				}
				JOptionPane.showMessageDialog(null, qtMenos10);
				break;
			case 3:
				int qtMais100Mais10 = 0;
				for(int i=0; i< count; i++) {
					if(precos[i] > 100 && estoques[i]>10) {
						qtMais100Mais10 ++;
					}
				}
				JOptionPane.showMessageDialog(null, qtMais100Mais10);
				break;
			case 4:
				double precoMenorEstoque = precos[0];
				int menorEstoque = estoques[0];
				for(int i=0; i< count; i++) {
					if(estoques[i] < menorEstoque) {
						menorEstoque = estoques[i];
						precoMenorEstoque = precos[i];
					}
				}
				JOptionPane.showMessageDialog(null, precoMenorEstoque);
				break;
			case 5:
				double maiorPreco = precos[0];
				int estoquemaiorPreco = estoques[0];
				for(int i=0; i< count; i++) {
					if(precos[i] > maiorPreco) {
						maiorPreco = precos[i];
						estoquemaiorPreco = estoques[i];
					}
				}
				JOptionPane.showMessageDialog(null, estoquemaiorPreco);
				break;
			case 6:
				int qtEstZero = 0;
				for(int i=0; i< count; i++) {
					if(estoques[i] == 0) {
						qtEstZero++;
					}
				}
				double pc = (double)qtEstZero/count*100;
				JOptionPane.showMessageDialog(null, pc);
				break;
			}
		}while(op != 7);
	}

}
