package heterogeneos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class PrincipalImc {
	
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[10];
		int count = 0;
		int op = 0;
		do {
			op = menu();
			if(op == 1) cadastrar(pessoas, count++);
			if(op == 2) buscarNome(pessoas, count);
			if(op == 3) ListarPorSexo(pessoas, count);
			if(op == 4) maiorMenorImc(pessoas, count);
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
	
	public static void cadastrar(Pessoa[] pessoas, int count ) {
		Pessoa p = new Pessoa();
		p.nome = lerNome();
		p.sexo = lerSexo();
		p.peso = lerDouble("Peso");
		p.altura = lerDouble("Altura");
		pessoas[count] = p;
	}
	
	public static double calcularImc(Pessoa p) {
		return p.peso / (p.altura * p.altura);
	}
	
	public static void buscarNome(Pessoa[] pessoas, int count) {
		String ret = "Não encontado";
		String nomeBusca = lerNome();
		for(int i=0; i<count; i++) {
			if(nomeBusca.equals(pessoas[i].nome)) {
				ret = pessoas[i].nome + " IMC: " + formata(calcularImc(pessoas[i]));
			}
		}
		msg(ret);
	}
	
	public static void ListarPorSexo(Pessoa[] pessoas, int count) {
		String sexoBusca = lerSexo();
		String ret = "";
		for (int i = 0; i < count; i++) {
			Pessoa p = pessoas[i];
			if(p.sexo.equals(sexoBusca)) {
				ret += p.nome + " IMC: " + formata(calcularImc(p)) + "\n";
			}
		}
		msg(ret);
	}
	
	public static void maiorMenorImc(Pessoa[] pessoas, int count) {
		Pessoa maiorImc = pessoas[0];
		Pessoa menorImc = pessoas[0];
		for (int i = 0; i < count; i++) {
			Pessoa p = pessoas[i];
			double imc = calcularImc(p);
			if(imc > calcularImc(maiorImc)) {
				maiorImc = p;
			}
			if(imc < calcularImc(menorImc)) {
				menorImc = p;
			}
		}
		msg("Maior IMC" + maiorImc.nome + " IMC: " + formata(calcularImc(maiorImc))+"\n" +
			"Menor IMC" + menorImc.nome + " IMC: " + formata(calcularImc(menorImc)));
	}

}
