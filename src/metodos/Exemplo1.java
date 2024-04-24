package metodos;

public class Exemplo1 {
	
	public static void main(String[] args) {
		soma(5,6);
		soma(5.5,6.5);
		int x = multiplica(5, 5);
		System.out.println("Multiplicação: "+x);
	}
	
	private static void soma(double n1, double n2) {
		double resultado = n1 + n2;
		System.out.println("Soma (double, double): "+resultado);
	}
	
	private static void soma(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println("Soma (int, int): "+resultado);
	}
	
	private static int multiplica(int n1, int n2) {
		int resultado = n1 * n2;
		return resultado;
	}
	
	
	
	
}