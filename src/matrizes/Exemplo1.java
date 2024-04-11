package matrizes;

import java.text.DecimalFormat;
import java.util.Random;

public class Exemplo1 {
	
	public static void main(String[] args) {
		double [][] gastos = new double[12][4];
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		for(int i=0; i<12; i++) {
			for(int j=0; j<4; j++) {
				gastos[i][j] = new Random().nextDouble()*1000;
			}
		}
		
		for(int i=0; i<12; i++) {
			System.out.println("");
			for(int j=0; j<4; j++) {
				System.out.print(df.format(gastos[i][j])+"\t");
			}
		}
		
		System.out.println("");
		
		for(int i=0; i<12; i++) {
			double tot = 0;
			for(int j=0; j<4; j++) {
				tot += gastos[i][j];
			}
			System.out.println("Mês "+(i+1)+":"+df.format(tot));
		}
	}

}
