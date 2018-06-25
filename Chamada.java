import java.util.Calendar;
public class Chamada {
	
	private int transmissaoId;
	private Calendar horario; 
	private LinhaTelefonica destinatario;
	private float custo;

	public Chamada (int transmissaoId, Calendar horario, LinhaTelefonica destinatario, float custo){
		this.transmissaoId = transmissaoId;
		this.horario = horario;
		this.destinatario = destinatario;
		this.custo = custo;
	}
	public void setTransmissaoId (int transmissaoId){
		this.transmissaoId = transmissaoId;
	}
	public int getTransmissaoId (){
		return this.transmissaoId;
	}
	public void setCusto (float custo){
		this.custo = custo;
	}
	public float getCusto (){
		return this.custo;
	}
	public void setHorario(Calendar horario){
		this.horario = horario;
	}
	public Calendar getHorario(){
		return this.horario;
	}
	public void setDestinatario(LinhaTelefonica destinatario){
		this.destinatario = destinatario;
	}
	public LinhaTelefonica getDestinatario(){
		return this.destinatario;
	}

	public String toString (){
		String aux = "";
		aux +="ID transmissao : "+this.transmissaoId+"\nHORARIO: "+this.horario;
		aux +="\nDESTINATARIO : "+this.destinatario+"\nCUSTO: "+this.custo; 
		return aux;
	}
	

}
