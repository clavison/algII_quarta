package lista1;

import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {
		String menu = "1 - Cadastrar\n" + "2 - estatísticas\n\n" + "3 - Sair";
		int op = 0;
		int qtAzul = 0;
		int qtPreto21 = 0;
		int qt1020 = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				String cor = JOptionPane.showInputDialog("Cor:");
				int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
				if (cor.equalsIgnoreCase("azul")) {
					qtAzul++;
				}
				if (cor.equalsIgnoreCase("preto") && ano == 2021) {
					qtPreto21++;
				}
				if (ano >= 2010 && ano <= 2020) {
					qt1020 ++;
				}
			}

			if (op == 2) {
				String res = "Qtdade carros na cor azul: " + qtAzul + "\n" + "Qtdade carros pretos no ano de 2021: "
						+ qtPreto21 + "\n" + "Qtdade carros entre 2010 e 2020: " + qt1020;
				JOptionPane.showMessageDialog(null, res);
			}

		} while (op != 3);
	}

}
