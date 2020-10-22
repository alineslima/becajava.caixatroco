package Poo;
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
			
			System.out.println("Dados pessoais do usuario que utilizou o caixa:");
			
			UsuarioCaixa usuario = new UsuarioCaixa();
			usuario.setNome("Marcos");
			usuario.setIdade(30);
			usuario.setCpf("467.456.777-90");
			usuario.setProfissao("desenvolvedor");
			
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Idade: " + usuario.getIdade());
			System.out.println("CPF nº: " + usuario.getCpf());
			System.out.println("Profissão: " + usuario.getProfissao());
		
			
			
		}
		
		
		
		
		leitor.close();
	}

}
