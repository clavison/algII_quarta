package metodos;

import javax.swing.JOptionPane;

/*
 * Faça um programa que apresente o seguinte menu:
1 - Cadastrar pessoa (nome, idade e sexo - armazenar em vetores)
2 - Buscar por nome
3 - Média das idades dos homens
4 - Média das idades das mulheres
5 - Quantidade de mulheres com menos de 18 anos 
6 - Sair

Deve ser utilizado sub-rotinas.
 */
public class Exercício1 {
	
	static String[] nomes = new String[20];
	static int[] idades = new int[20];
	static String[] sexos = new String[20];
	static int count=0;
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			if(op == 1) cadastrar();
			if(op == 2) buscarNome();
			if(op == 3) mediaIdades("M");
			if(op == 4) mediaIdades("F");
			if(op == 5) qtMulheresMenos18();
		}while(op!=6);
	}
	
	
	
	private static int menu() {
		String m ="1 - Cadastrar\n"
				+ "2 - Buscar por nome\n"
				+ "3 - Média idades homens\n"
				+ "4 - Média idades mulheres\n"
				+ "5 - QT Mulheres com  menos de 18\n"
				+ "6 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));		
	}
	
	private static void cadastrar( ) {
		nomes[count] = JOptionPane.showInputDialog("Nome:");
		idades[count] = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		sexos[count] = JOptionPane.showInputDialog("Sexo (M/F):");
		count++;
	}
	
	private static void buscarNome() {
		String nm = JOptionPane.showInputDialog("Buscar por:");
		String result = "Não encontrado(a)";
		for (int i=0; i<count; i++) {
			if(nomes[i].equalsIgnoreCase(nm)) {
				result = nm+ " está cadastrado(a)";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	private static void mediaIdades(String sexo) {
		int soma = 0;
		int qtsexo = 0;
		for(int i=0; i<count; i++) {
			if(sexos[i].equalsIgnoreCase(sexo)) {
				soma += idades[i];
				qtsexo++;
			}
		}
		JOptionPane.showMessageDialog(null, "Média "+sexo+": "+soma / qtsexo); 
	}
	
	private static void qtMulheresMenos18() {
		int qt = 0;
		for(int i=0; i<count; i++) {
			if(sexos[i].equalsIgnoreCase("F") && idades[i]<18) {
				qt++;
			}
		}
		JOptionPane.showMessageDialog(null,qt);
	}
}
