public class Voz extends Chamada {

	private Calendar termino;
	
	public void setTermino(Calendar ter){
		this.termino = ter;
	}
	public Calendar getTermino (){
		return this.termino;
	}
	public String toString (){
		String aux = "";	
		aux +=super.toString();
		aux +="TERMINO: "this.termino;		
		retunr aux;
	}
}