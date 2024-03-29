package model;
import java.util.*;

public class Pagamento {
	private Double valorPago;
	private String formaPag;
	private Date dataPag;
	private int numParcelas;
	
	public Pagamento(Double valorPago, String formaPag, Date dataPag, int numParcelas) {
		setValorPago(valorPago);
		setFormaPag(formaPag);
		setDataPag(dataPag);
		setNumParcelas(numParcelas);
	}

	public Pagamento() {
		setValorPago(0.0);
		setFormaPag("");
		setDataPag(null);
		setNumParcelas(0);
	}
	
	public void cadastrar(Double valorPago, String formaPag, Date dataPag, int numParcelas) {
		setValorPago(valorPago);
		setFormaPag(formaPag);
		setDataPag(dataPag);
		setNumParcelas(numParcelas);
	}

	public void imprimir() {
		String saida = "\nDados do Pagamento: ";
		saida = saida + "\nValor Pago: R$" + this.getValorPago() + ".\nForma de Pagamento: " + this.getFormaPag()
		+ ".\nData de Pagamento: " + this.getDataPag() + ".\nN�mero de Parcelas: " + this.getNumParcelas() + ".";
		System.out.println(saida);
	}
	
	public void editar(Double valorPago, String formaPag, Date dataPag, int numParcelas) {
		setValorPago(valorPago);
		setFormaPag(formaPag);
		setDataPag(dataPag);
		setNumParcelas(numParcelas);
	}

	@Override
	public String toString() {
		return "\nValor Pago: " + this.getValorPago() + ".\nForma de Pagamento: " + this.getFormaPag()
		+ ".\nData de Pagamento: " + this.getDataPag() + ".\nN�mero de Parcelas: " + this.getNumParcelas() + ".";
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public Date getDataPag() {
		return dataPag;
	}

	public void setDataPag(Date dataPag) {
		this.dataPag = dataPag;
	}

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

}
