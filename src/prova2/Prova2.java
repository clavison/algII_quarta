package prova2;

import javax.swing.JOptionPane;

public class Prova2 {
	
	public static void main(String[] args) {
        int op = 0;
        int maxProdutos = 20;
        String[] nomes = new String[maxProdutos];
        double[] qtdEstoques = new double[maxProdutos];
        double[] valorProdutos = new double[maxProdutos];
        double[][] qtdVendidos = new double[maxProdutos][4];
        int indice = 0;

        do {
            op = Integer.parseInt(menu());

            switch (op){
                case 1:
                    cadastrar(qtdVendidos, nomes, qtdEstoques, valorProdutos, indice++, maxProdutos);
                    break;
                case 2:
                    buscarNome(qtdVendidos, nomes, qtdEstoques, valorProdutos, indice);
                    break;
                case 3:
                    buscarMes(qtdVendidos, valorProdutos, indice);
                    break;
                case 4:
                    mostrarEstoque(qtdEstoques, nomes, indice);
                    break;
            }

        }while(op != 5);

    }
    public static void msg(String txt){
        JOptionPane.showMessageDialog(null,txt);
    }

    public static void mostrarEstoque(double[] qtdEstoques, String[] nomes, int indice){
        StringBuilder estoque = new StringBuilder("O estoque geral está com: \n");
        for (int i = 0; i < indice; i++){
            estoque.append("Nome: ").append(nomes[i]).append("\n").append("Quantidade: ").append(qtdEstoques[i]).append("\n");
        }

        msg(estoque.toString());
    }

    public static void buscarMes(double[][] qtdVendidos, double[]valorProdutos, int indice){
        int  mes = insMes();
        valorVendido(qtdVendidos, valorProdutos, indice, mes);
    }
    public static void valorVendido(double[][] qtdVendidos, double[]valorProdutos, int indice, int mes){
        double total = 0;
        for (int i = 0; i < indice; i++){
          total += valorProdutos[i] * qtdVendidos[i][mes -1];
        }
        msg("O total vendido foi: " + total);
    }
    public static void buscarNome(double[][] qtdVendidos, String[] nomes, double[] qtdEstoques, double[]valorProdutos, int indice){
        String dados = "O produto não foi encontrado!";
        String nome = insNome();
        for (int i = 0; i < indice; i++){
            if (nome.equalsIgnoreCase(nomes[i])){
                dados = "Os dados do produto são:  \n";
                dados += "Nome: " + nomes[i] +"\n";
                dados += "Quantidade em estoque: " + qtdEstoques[i] + "\n";
                dados += "Valor desse produto: " + valorProdutos[i] + "\n";
                dados += "A quantidade vendida por cada mês: " + "\n";
                for (int j =0; j < 4; j++){
                	dados += "Mês " + (j + 1) + ": " + qtdVendidos[i][j] + "\n";
                }
            }
        }
        msg(dados);
    }
    public static void cadastrar(double[][] qtdVendidos, String[] nomes, double[] qtdEstoques, double[]valorProdutos, int indice, int maxProdutos){
        if (indice < maxProdutos){
            nomes[indice] = insNome();
            qtdEstoques[indice] = insQtd();
            valorProdutos[indice] = insValor();
            for (int j = 0; j < 4; j++){
                qtdVendidos[indice][j] = insQtdVendida(j+1);
            }
        }else {
            msg( "Não é possivel, número máximo foi alcançado.");
        }
    }
    public static int insMes(){
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês: \n" +
                "1 - Janeiro \n" +
                "2 - Fevereiro \n" +
                "3 - Março \n" +
                "4 - Abril"));
        return mes;
    }
    public static double insQtdVendida(int mes){
        double qtdvendida = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a quantidade vendida do produto para o mes: "+mes));
        if (qtdvendida < 0){
            msg("Quantidade incorreta!\nPor favor, digite uma quantidade positiva!" );
            return insQtdVendida(mes);
        }

        return qtdvendida;
    }
    public static String insNome(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do produto: ");
        if (nome.trim().length() < 3) {
            msg("Nome incorreto!\nPor favor, digite um nome!");
            return insNome();
        }
        return nome;
    }
    public static double insQtd(){
        double qtd = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade em estoque: "));
        if (qtd < 0){
            msg("Quantidade incorreta!\nPor favor, digite uma quantidade positiva!" );
            return insQtd();
        }
        return qtd;
    }

    public static double insValor(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto: "));
        if (valor <= 0){
            msg("Quantidade incorreta!\nPor favor, digite uma quantidade positiva!" );
            return insValor();
        }
        return valor;
    }
    public static String menu(){
        String op = "1 - Cadastrar \n" +
                 "2 - Buscar por nome \n" +
                "3 - Total de vendas do mês \n" +
                "4 - Mostrar estoque de todos os produtos cadastrados \n" +
                "5 - Sair";

        return JOptionPane.showInputDialog(null, op);
    }

}
