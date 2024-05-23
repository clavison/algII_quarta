package heterogeneos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ImcVetores {
	
	public static void main(String[] args) {
		String[] nomes = new String[10];
		String[] sexos = new String[10];
		double[] pesos = new double[10];
		double[] alturas = new double[10];
		int count = 0;
		int op = 0;
		do {
			op = menu();
			if(op == 1) cadastrar(nomes, pesos, alturas, sexos, count++);
			if(op == 2) buscarNome(nomes, pesos, alturas, count);
			if(op == 3) ListarPorSexo(nomes, sexos, pesos, alturas, count);
			if(op == 4) maiorMenorImc(nomes, pesos, alturas, count);
		} while (op != 5);
	}
	
	public static String formata(double d) {
		DecimalFormat df = new DecimalFormat("###,00");
		return df.format(d);
	}
	
	public static int menu() {
		String m = "1 - Cadastrar\n"
				+ "2 - Buscar por nome\n"
				+ "3 - Listar po sexo\n"
				+ "4 - Maior e Menor IMC\n"
				+ "5 - SAIR";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	public static void msg(String str) {
		JOptionPane.showMessageDialog(null, str);
	}
	
	public static String lerNome() {
		String nome = JOptionPane.showInputDialog("Nome");
		if(nome.equals("")) {
			msg("Nome incorreto!");
			return lerNome();
		}
		return nome;
	}
	
	public static String lerSexo() {
		String sexo = JOptionPane.showInputDialog("Sexo(M/F)").toUpperCase();
		if(!sexo.equals("M") && !sexo.equals("F")) {
			msg("Sexo incorreto!");
			return lerSexo();
		}
		return sexo;
	}
	
	public static double lerDouble(String campo) {
		double d = Double.parseDouble(JOptionPane.showInputDialog(campo));
		if(d <= 0) {
			msg(campo +" incorreto!");
			return lerDouble(campo);
		}
		return d;
	}
	
	public static void cadastrar(String[] n, double[] p, double[] a, String[] s, int count ) {
		n[count] = lerNome();
		s[count] = lerSexo();
		p[count] = lerDouble("Peso");
		a[count] = lerDouble("Altura");
	}
	
	public static double calcularImc(double peso, double altura) {
		return peso / (altura * altura);
	}
	
	public static void buscarNome(String[] n, double[] p, double[] a, int count) {
		String ret = "Não encontado";
		String nome = lerNome();
		for(int i=0; i<count; i++) {
			if(nome.equals(n[i])) {
				ret = n[i] + " IMC: " + formata(calcularImc(p[i], a[i]));
			}
		}
		msg(ret);
	}
	
	public static void ListarPorSexo(String[] n, String[] s, double[] p, double[] a, int count) {
		String sexoBusca = lerSexo();
		String ret = "";
		for (int i = 0; i < count; i++) {
			if(s[i].equals(sexoBusca)) {
				ret += n[i] + " IMC: " + formata(calcularImc(p[i], a[i])) + "\n";
			}
		}
		msg(ret);
	}
	
	public static void maiorMenorImc(String[] n, double[] p, double[] a, int count) {
		double maiorImc = calcularImc(p[0], a[0]);
		String nomeMaior = n[0];
		double menorImc = calcularImc(p[0], a[0]);
		String nomeMenor = n[0];
		for (int i = 0; i < count; i++) {
			double imc = calcularImc(p[i], a[i]);
			if(imc > maiorImc) {
				maiorImc = imc;
				nomeMaior = n[i];
			}
			if(imc < menorImc) {
				menorImc = imc;
				nomeMenor = n[i];
			}
		}
			msg("Maior IMC" + nomeMaior + " IMC: " + formata(maiorImc)+"\n" +
			    "Menor IMC" + nomeMenor + " IMC: " + formata(menorImc));
	}
	

}
