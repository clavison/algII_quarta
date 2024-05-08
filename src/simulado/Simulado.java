package simulado;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Simulado {
	
	
	public static void main(String[] args) {
		String[]nomes = new String[20];
		int[]idades = new int[20];
		String[]sexos = new String[20];
		double[][]notas = new double[20][3];
		int count = 0;
		int op = 0;
		do {
			op = escolheMenu();
			if(op==1) cadastra(nomes, idades, sexos, notas, count++);
			if(op==2) mostraMediaAlunos(nomes, notas, count);
			if(op==3) mostraStatusAlunos(nomes, notas, count);
			if(op==4) pcReprovados(sexos, notas, count);
			if(op==5) mediaIdades(idades, count);
			if(op==6) listarPorSexo(nomes, sexos, count);
			if(op==7) listarPorIdade(nomes, idades, count);
			
		}while(op != 8);
		
	}
	
	private static void listarPorSexo(String[]nomes, String[]sexos, int count) {
		String sexoBusca = lerSexo();
		String ret = "";
		for(int i=0; i<count; i++) {
			if(sexos[i].equals(sexoBusca)) {
				ret += nomes[i]+"\n";
			}
		}
		msg(ret);
	}
	private static void listarPorIdade(String[]nomes, int[]idades, int count) {
		int idadeBusca = lerIdade();
		String ret = "";
		for(int i=0; i<count; i++) {
			if(idades[i]==idadeBusca) {
				ret += nomes[i]+"\n";
			}
		}
		msg(ret);
	}
	
	private static void mediaIdades(int[]idades, int count) {
		int soma = 0;
		for(int i=0; i<count; i++) {
			soma += idades[i];
		}
		msg("Média idades da turma "+(soma/count));
	}
	
	private static void pcReprovados(String[]sexos, double[][]notas, int count) {
		int totMasc = 0;
		int totFem = 0;
		double repMasc = 0;
		double repFem = 0;
		for(int i=0; i<count; i++) {
			if(sexos[i].equals("M")) {
				totMasc++;
				double media = calculaMedia(notas, i);
				if(verificaStatus(media).equals("Reprovado")) {
					repMasc++;
				}
			}else {
				totFem++;
				double media = calculaMedia(notas, i);
				if(verificaStatus(media).equals("Reprovado")) {
					repFem++;
				}
			}
		}
		msg("% Homens reprovados: "+ (repMasc / totMasc*100));
		msg("% Mulheres reprovadas: "+ (repFem / totFem *100));
	}
	
	private static String verificaStatus(double media) {
		if(media >= 7 ) return "Aprovado";
		if(media < 3 ) return "Reprovado";
		return "Recuperação";
	}
	
	private static void mostraMediaAlunos(String[]nomes,double[][]notas, int count ) {
		String ret = "";
		for(int i=0; i<count; i++) {
			ret += nomes[i] + " - " + formataDouble(calculaMedia(notas, i))+"\n";
		}
		msg(ret);
	}
	private static void mostraStatusAlunos(String[]nomes,double[][]notas, int count ) {
		String ret = "";
		for(int i=0; i<count; i++) {
			ret += nomes[i] + " - " + verificaStatus(calculaMedia(notas, i))+"\n";
		}
		msg(ret);
	}
	
	private static String formataDouble(double nr) {
		DecimalFormat df = new DecimalFormat("00.00");
		return df.format(nr);
	}
	
	private static double calculaMedia(double[][]notas, int linha) {
		double soma = 0;
		for(int i=0; i<3; i++) {
			soma += notas[linha][i];
		}
		return soma / 3;
	}
	
	private static void cadastra(String[]nomes, int[]idades, String[]sexos, double[][]notas, int count) {
		if(count < 20) {
			nomes[count] = lerNome();
			idades[count] = lerIdade();
			sexos[count] = lerSexo();
			for(int i=0; i<3; i++) {
				notas[count][i] = lerNota();
			}
		}else {
			msg("Memória cheia");
		}
	}
	
	private static void msg(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	
	private static int escolheMenu() {
		String menu = "1 - Cadastrar\n"
				+ "2 - Calcular a média de todos os alunos\n"
				+ "3 - Exibir situação dos alunos\n"
				+ "4 - Percentual de mulheres e homens reprovados\n"
				+ "5 - Média das idades da turma\n"
				+ "6 - Listar alunos por sexo\n"
				+ "7 - Listar alunos por idade\n"
				+ "8 - Sair";
		int x = Integer.parseInt(JOptionPane.showInputDialog(menu));
		if( x>=1 && x<=8) return x;
		return escolheMenu();
	}
	
	private static int lerIdade() {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		if(idade >=17 && idade <= 99) return idade;
		return lerIdade();
	}
	
	private static String lerNome() {
		String nome = JOptionPane.showInputDialog("Nome:");
		if(!nome.isEmpty()) return nome;
		return lerNome();
	}
	
	private static String lerSexo() {
		String sexo = JOptionPane.showInputDialog("Sexo(M/F):").toUpperCase();
		if(sexo.equals("M") || sexo.equals("F")) return sexo;
		return lerSexo();
	}
	
	private static double lerNota() {
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota"));
		if(nota>=0 && nota<=10) return nota;
		return lerNota();
	}

}
