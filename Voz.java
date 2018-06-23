public class Voz extends Chamada {

	private Calendar termino;
	
	public Voz (int transmissaoId, Calendar horario, LinhaTelefonica destinatario, float custo, Calendar termino){
		super(transmissaoId, horario,destinatario, custo);
		this.termino = termino;
	}
	public void setTermino(Calendar termino){
		this.termino = termino;
	}
	public Calendar getTermino (){
		return this.termino;
	}
	public String toString (){
		String aux = "";	
		aux +=super.toString();
		aux +="\nTERMINO: "+this.termino;		
		retunr aux;
	}
}
