import java.util.Calendar;
public class Texto extends Chamada {
	
	private String conteudo;
	
	public Texto (int transmissaoId, Calendar horario, LinhaTelefonica destinatario, float custo, String conteudo){
		super(transmissaoId, horario, destinatario, custo);
		this.conteudo = conteudo;
	}
	public void setConteudo (String conteudo){
		this.conteudo = conteudo;
	}
	public String getConteudo (){
		return this.conteudo;
	}
	public String toString (){
		String aux = "";
		aux +=super.toString()+"\nCONTEUDO DA MENSAGEM :"+this.conteudo;
		return aux;
	}


}
