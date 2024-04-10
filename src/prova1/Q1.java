package prova1;

import javax.swing.JOptionPane;

public class Q1 {
	public static void main(String[] args) {
		String[] sexos  = new String[5000];
		String[] cursos = new String[5000];
		
		for(int i=0; i<sexos.length; i++) {
			sexos[i] = JOptionPane.showInputDialog("Sexo");
			cursos[i] = JOptionPane.showInputDialog("Curso");
		}
		
		int femSistemas = 0;
		int countSistemas = 0;
		
		for(int i=0; i<sexos.length; i++) {
			if(cursos[i].equals("Sistemas de informação")) {
				countSistemas++;
				if(sexos[i].equals("F")) {
					femSistemas++;
				}
			}
		}
		String ret = "Alunas: "+femSistemas+"\n"
				+ "Percentual: "+(countSistemas/5000.00*100);
		JOptionPane.showMessageDialog(null, ret);
	}

}
