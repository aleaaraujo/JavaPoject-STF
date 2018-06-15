public class Saldo {
	
	private float valor;
	private Calendar vencimento;
	
	public Saldo (float v, Calendar ven){
		this.valor = v;
		this.vencimento = ven;
	}
	public void setValor (float v){
		this.valor = v;
	}
	public float getValor (){
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
