import java.util.Calendar;
public class Pos extends LinhaTelefonica{
	 
	private Fatura[] faturas; 
	
	public Pos(String numero, Cliente cliente){
		super(numero,cliente);
		this.faturas = new fatura[10];
	}
	public boolean chamar(String destinatario,LinhaTelefonica[] linhas){
		if(super.chamar(destinatario, linhas)){
			Calendar dataInicial = Calendar.getInstance();
			int faturaId = (Integer.parseInt(destinatario))%100+1;
			Calendar dataFinal = Calendar.getInstance();
			long horaInicial = dataInicial.getTimeInMillis();
			long horaFinal = dataFinal.getTimeInMillis();
			float valor = (horaFinal-horaInicial) * Utilitario.custoChamadaVoz;   			
			this.faturas[0] = new Fatura(faturaId, dataInicial, dataFinal,valor);

		}

	}
	public boolean chamar(String destinatario,String conteudo, LinhaTelefonica[] linhas){
		if(super.chamar(destinatario, conteudo, linhas)){
			Calendar dataInicial = Calendar.getInstance();
			int faturaId = (Integer.parseInt(destinatario))%100+1;
			Calendar dataFinal = Calendar.getInstance();
			float valor = (conteudo.length()) * Utilitario.custoChamadaTexto;  	
			this.faturas[0] = new Fatura(faturaId, dataInicial, dataFinal, valor);
			return true;
		}
		return false;
	}
	public boolean pagarFatura (){
		return true;
	}
	public void setFaturas (Fatura[] faturas){
		this.faturas = faturas;
	}
	public Fatura[] getFatura (){
		return this.faturas;
	}
	public String toString (){
		String aux = "";
		aux +=super.toString();
		aux+="\nFATURA: "+this.faturas;		
		return aux;
	}
}
