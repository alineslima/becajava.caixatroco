package poo;

public class ProcedimentoDoCaixa {

	private double valorPago;
	private double troco;
	private Produto produto;
	
	public ProcedimentoDoCaixa(Produto produto, double valorPago) {
		this.produto = produto;
		this.valorPago = valorPago;
	}
	
	public void darTroco() {
		if(valorPago > produto.getValorProduto()) {
			double troco = valorPago - produto.getValorProduto();
			System.out.println("O troco é " + troco);
		} else {
			System.out.println("Não há troco");
		}
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
}
