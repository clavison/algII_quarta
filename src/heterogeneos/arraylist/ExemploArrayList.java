package heterogeneos.arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		int op = 0;
		do {
			op = menu();
			if(op == 1) nomes.add(lerNome());
			if(op == 2) listarTodos(nomes);
			if(op == 3) buscarPorNome(nomes);
			
		}while(op!=4);
				
	}
	
	private static int menu() {
		String m = "1 - Cadastar\n"
				+ "2 - Listar todos\n"
				+ "3 - Buscar por nome\n"
				+ "4 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	private static String lerNome() {
		String nome = JOptionPane.showInputDialog("Nome");
		if(nome.trim().equals("")) {
			return lerNome();
		}
		return  nome.trim();
	}
	
	private static void listarTodos(ArrayList<String> nomes) {
		String ret = "";
		for(String str: nomes) {
			ret += str + "\n";
		}
		msg(ret);
		
//		for(int i=0; i< nomes.size(); i++) {
//			String str = nomes.get(i);
//			ret += str + "\n";
//		}
//		msg(ret);
	}
	
	private static void buscarPorNome(ArrayList<String> nomes) {
		String nomeBusca = lerNome();
		String ret = "Nome não encontrado";
		for(String str: nomes) {
			if(str.equals(nomeBusca)) {
				ret = str;
			}
		}
		msg(ret);
	}
	
	private static void msg(String txt) {
		JOptionPane.showMessageDialog(null, txt);
	}

}
