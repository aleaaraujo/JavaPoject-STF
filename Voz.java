import java.util.Calendar;
public class Voz extends Chamada {

	private Calendar termino;
	public Voz(int transId, Calendar hor,LinhaTelefonica dest,float custo,Calendar termino){
		super(trasnId, hor, dest, custo);
		this.termino = termino;
	}
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
