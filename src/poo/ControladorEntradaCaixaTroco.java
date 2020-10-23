package poo;

import java.util.Scanner;

public class ControladorEntradaCaixaTroco {
	
	public void executarCaixaTroco() {
		Scanner leitor= new Scanner(System.in);
		Produto produto = new Produto(Double.parseDouble(leitor.nextLine()));
		boolean vazio = false;
		while(!vazio) {
			String valorDigitado = leitor.nextLine();
			if(valorDigitado.isBlank()) {
				vazio = true;
			} else {
				double valorPago = Double.parseDouble(valorDigitado);
				ProcedimentoDoCaixa procedimentoDoCaixa = new ProcedimentoDoCaixa(produto, valorPago);
				procedimentoDoCaixa.darTroco();
			}
		}
		leitor.close();
	}

}
