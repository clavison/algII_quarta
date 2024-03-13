package vetores;

import javax.swing.JOptionPane;

public class Exemplo2 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd números"));
		int[] numeros = new int[n];
		
		for(int i=0; i< numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane
					.showInputDialog((i+1) +"º número de "+n));
		}
		
		int somaTodos = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for(int i=0; i< numeros.length; i++) {
			somaTodos += numeros[i];
			if((numeros[i] % 2)==0) {
				somaPares += numeros[i];
			}else {
				somaImpares += numeros[i];
			}
		}
		
		System.out.println("Todos: "+somaTodos
				+"\nPares:"+somaPares
				+"\nÍmpares:"+somaImpares);
		
		
		
	}

}
