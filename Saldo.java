import java.util.Calendar;
public class Saldo {
	
	private float valor;
	private Calendar vencimento;
	
	public Saldo (float valor, Calendar vencimento){
		this.valor = valor;
		this.vencimento = vencimento;
	}
	public void setValor (float valor){
		this.valor = valor;
	}
	public float getValor (){
		return this.valor;
	}
	public void setVencimento (Calendar vencimento){
		this.vencimento = vencimento;
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
