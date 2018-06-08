public class Saldo {
	
	private double valor;
	private Calendar vencimento;

	public void setValor (double v){
		this.valor = v;
	}
	public double getValor (){
		return this.valor;
	}
	public void setVencimento (Calendar v){
		this.vencimento = v;
	}
	public Calendar getVencimento (){
		return this.vencimento;
	}
	public String toString (){
		String aux ="";
		aux +="VALOR: "+this.valor+"\nVENCIMENTO: "+this.vencimento; 
		return aux;
	}

}