import java.util.Calendar;
public class Fatura {

	private int faturaId;
	private Calendar dataInicial;
	private Calendar dataFinal;
	private float valor;
	
	public Fatura (int faturaId, Calendar dataInicial, Calendar dataFinal, float valor){ //construtor
		this.faturaId = faturaId;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.valor = valor;
	}

	public void setFaturaId (int faturaId){
		this.faturaId = faturaId;
	}
	public int getFaturaId (){
		return this.faturaId;
	}
	public void setDataInicial (Calendar dataInicial){
		this.dataInicial =dataInicial;
	}
	public Calendar getDataInicial (){
		return this.dataInicial;
	}
	public void setDataFinal (Calendar dFinal){
		this.dataFinal = dFinal;
	}
	public Calendar getDataFinal (){
		return this.dataFinal;
	}
	public void setValor (float valor){
		this.valor  = valor;
	}
	public float getValor (){
		return this.valor;
	}
	public String toString (){
		String aux = "";
		aux +="ID da Fatura: "+this.faturaId+"\nDATA INICIAL: "+this.dataInicial;
		aux +="\nDATA FINAL:"+this.dataFinal+"\nValor : "+this.valor; 
		return aux;
	}
}
