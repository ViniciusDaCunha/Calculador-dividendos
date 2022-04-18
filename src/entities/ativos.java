package entities;
import java.util.*;
public class ativos {

	private String ticker;
	private double preco;
	private double valorInvestido;
	private double dy;

	public ativos(String ticker, double preco, double valorInvestido, double dy) {
		this.ticker = ticker;
		this.preco = preco;
		this.valorInvestido = valorInvestido;
		this.dy = dy;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	public double getDy() {
		return dy;
	}

	public void setDy(double dy) {
		this.dy = dy;
	}

	public Double quantiAtivo() {

		return valorInvestido / preco;
	}

	public Double proventos() {

		return dy * quantiAtivo();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ativo: " + ticker);
		sb.append(" Preço: " + "R$" + String.format("%.2f", preco));
		sb.append(" Dividend Yield: " + "R$" + String.format("%.2f", dy));
		sb.append(" Quantidade de ativos: " + String.format("%.0f", quantiAtivo()));
		sb.append(" Total de dividendos por ativo: " + "R$" + String.format("%.2f", proventos()));
	    
		return sb.toString();

	}

}
