import java.util.Calendar;
public class LinhaTelefonica{
	
	private String numero;
	private Cliente cliente;
	private Chamada[] chamadas;
	
	public LinhaTelefonica (String numero, Cliente cliente){
		this.numero = numero;
		this.cliente = cliente;
		this.chamadas = new Chamada[10];
	}
	public void setNumero (String numero){
		this.numero = numero;
	}
	public String getNumero (){
		return this.numero;
	}
	public void setCliente (Cliente cliente){
		this.cliente = cliente;
	}
	public Cliente getCliente (){
		return this.cliente;
	}
	public Chamada[] getChamada(){
		return this.chamadas;
	}
	public String toString (){
		String aux = "";
		aux +="NUMERO: "+this.numero+"\nCLIENTE "+this.cliente;
		aux +="\nCHAMADA: "+this.chamadas;
		return aux;
	}

	public static LinhaTelefonica criar (){
		Leitura ler = new Leitura();
		System.out.println ("Informe o Numero :");
		String num = ler.lerString();
		Cliente c = Cliente.criar();
		return new LinhaTelefonica (num, c);
	}
	public static LinhaTelefonica pesquisarLinha (String numero, LinhaTelefonica[] linhas){
		for (int i=0;i<linhas.length;i++){
			if((linhas[i].getNumero()).equals(numero)){ 
				return linhas[i];
			}
		}
		return null;
	// tem que testar	
	}
	public boolean chamar(String destinatario, LinhaTelefonica[] linhas){ // chamadas de voz
		if (destinatario.length()<=13 & destinatario.length() >0){
			LinhaTelefonica dest = pesquisarLinha(destinatario, linhas);
			Calendar horario = Calendar.getInstance();
			int transmissaoId = (Integer.parseInt(destinatario))%100+1;
			Calendar termino = Calendar.getInstance(); 
			long horaInicial = horario.getTimeInMillis();
			long horaFinal = termino.getTimeInMillis();
			float custo = (horaFinal-horaInicial) * Utilitario.custoChamadaVoz;//falta atribuir valor a variavel estatica
			Voz voz = new Voz(transmissaoId, horario, dest, custo, termino);
			return true;
		}
		return false;

	}
	public boolean chamar(String destinatario, String conteudo, LinhaTelefonica[] linhas){ // chamadas de texto sms
		if (destinatario.length()<=13 & destinatario.length() >0){
			LinhaTelefonica dest = pesquisarLinha(destinatario, linhas);
			Calendar horario = Calendar.getInstance();
			int transmissaoId = (Integer.parseInt(destinatario))%100+1;
			float custo = ((conteudo.length())/Utilitario.comprimentoChamadaTexto) * Utilitario.custoChamadaTexto;
			Texto texto = new Texto(transmissaoId, horario, dest, custo, conteudo);
			return true;
		}
		return false;
	}
	
}
