package vetores;

import javax.swing.JOptionPane;

public class Desafio1 {

	public static void main(String[] args) {

		String menu = "1 - Cadastrar\n" + "2 - Nome do aluno(a) mais alto(a)\n"
				+ "3 - Mulheres mais altas que a média\n" + "4 - Pessoas mais baixas que a média\n\n" + "5 - Sair";
		int op = 0;
		int cont = 0;

		String[] nomes = new String[5];
		int[] alturas = new int[5];
		String[] sexos = new String[5];

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			//CADASTRAR
			if (op == 1) {
				if (cont < nomes.length) {
					nomes[cont] = JOptionPane.showInputDialog("Nome");
					alturas[cont] = Integer.parseInt(JOptionPane.showInputDialog("Altura"));
					sexos[cont] = JOptionPane.showInputDialog("Sexo");
					cont++;
				}else {
					JOptionPane.showMessageDialog(null, "Memória Cheia");
				}
			}
			
			//NOME DO ALUNO(A) MAIS ALTO(A)
			if(op == 2) {
				String nmAlto = nomes[0];
				int altAlto = alturas[0];
				for(int i=0; i< cont; i++) {
					if(alturas[i] > altAlto) {
						nmAlto = nomes[i];
						altAlto = alturas[i];
					}
				}
				JOptionPane.showMessageDialog(null, nmAlto);
			}
			
			//MULHERES MAIS ALTAS QUE A MÉDIA DAS MULHERES
			if(op == 3) {
				double somaAlturas = 0;
				int contMulheres = 0;
				for(int i=0; i< cont; i++) {
					if(sexos[i].equalsIgnoreCase("F")) {
						somaAlturas += alturas[i];
						contMulheres ++;
					}
				}
				double media = somaAlturas / contMulheres;
				String ret = "Mulheres mais altas que a média das mulheres\n";
				for(int i=0; i< cont; i++) {
					if(alturas[i] > media && sexos[i].equalsIgnoreCase("F")) {
						ret += nomes[i]+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, ret);
			}
			
			//ALUNOS MAIS BAIXOS QUE A MÉDIA
			if(op == 4) {
				double somaAlturas = 0;
				for(int i=0; i< cont; i++) {
					somaAlturas += alturas[i];
				}
				double media = somaAlturas / cont;
				String ret = "Alunos abaixo da média\n";
				for(int i=0; i< cont; i++) {
					if(alturas[i] < media) {
						ret += nomes[i]+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, ret);
			}
			

		} while (op != 5);
	}

}
