package revisao_algoritmos_1;

import javax.swing.JOptionPane;

public class Exemplo5 {
	
	public static void main(String[] args) {
		String nome = "";
		do {
			nome = JOptionPane.showInputDialog("Nome");
			if(nome.equals("sair")) {
				System.out.println("Adeus!!!!!");
			}else {
				System.out.println(nome.toUpperCase());
			}
		}while(!nome.equals("sair"));
	}

}
