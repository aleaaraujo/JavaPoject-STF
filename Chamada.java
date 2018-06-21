public class Chamada {
	
	private int transmissaoId;
	private Calendar horario; //  ?
	private LinhaTelefonica destinatario;
	private double custo;

	public Chamada (int trans,LinhaTelefonica dest, double custo){
		this.transmissaoId = trans;
		this.horario = hor;
		this.destinatario = dest;
		this.custo = custo;
	}
	public void setTransmissaoId (int id){
		this.transmissaoId = id;
	}
	public int getTransmissaoId (){
		return this.trasmissaoId;
	}
	public void setCusto (double custo){
		this.custo = custo;
	}
	public double getCusto (){
		return this.custo;
	}

	public String toString (){
		String aux = "";
		aux +="ID transmissao : "+this.transmissaoId+"\nHORARIO: "+this.horario;
		aux +="\nDESTINATARIO : "+this.destinatario+"\nCUSTO: "+this.custo; 
		return aux;
	}
	

}
