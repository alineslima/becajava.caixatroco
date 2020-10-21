import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		
		boolean vazio = false;
		
		double valorProduto = Double.parseDouble(leitor.nextLine());
		while(!vazio) {
			String valorDigitado = leitor.nextLine();
			if(valorDigitado.isBlank()) {
				vazio = true;
			} else {
				double valorPago = Double.parseDouble(valorDigitado);
				if(valorPago > valorProduto) {
					double troco = valorPago - valorProduto;
					System.out.println("O troco é " + troco);
				} else {
					System.out.println("Não há troco");
				}
			}
		}
		
		
		
		leitor.close();
	}

}
