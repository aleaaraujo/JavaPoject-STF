public class Texto extends Chamada {
	
	private String conteudo;
	
	public Texto (int trnasId, Calendar hor, LinhaTelefonica dest, float custo, String cont){
		super(transId, hor, dest, custo);
		this.conteudo = cont;
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
