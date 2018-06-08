public class Fatura {

	private int faturaId;
	private Calendar dataInicial;
	private Calendar dataFinal;
	private double valor;

	public void setFaturaId (int id){
		this.faturaId = id;
	}
	public int getFaturaId (){
		return this.faturaId;
	}
	public void setDataInicial (Calendar dInicio){
		this.dataInicial =dInicio;
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
	public void setValor (double v){
		this.valor  = v;
	}
	public double getValor (){
		return this.valor;
	}
	public String toString (){
		String aux = "";
		aux +="ID da Fatura: "+this.faturaId+"\nDATA INICIAL: "+this.dataInicial;
		aux +="\nDATA FINAL:"+this.dataFinal+"\nValor : "+this.valor; 
		return aux;
	}
}