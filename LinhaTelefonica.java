import java.util.Calendar;
public class LinhaTelefonica{
	
	private String numero;
	private Cliente cliente;
	private Chamada[] chamadas;
	
	public LinhaTelefonica (String numero,Cliente cliente){
		this.numero = numero;
		this.cliente = cliente;
		this.chamada = new Chamadas[10];
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
	public cliente getCliente (){
		return this.cliente;
	}
	public Chamada[] getChamada(){
		return this.chamadas;
	}
	public String toString (){
		String aux = "";
		aux +="NUMERO: "+this.numero+"\nCLIENTE "+this.cliente;
		aux +="\nCHAMADA: "+this.chamada;
		return aux;
	}

	public static LinhaTelefonica criar (){
		Leitura ler = new Leitura();
		System.out.println ("Informe o Numero :");
		String num = ler.lerString();
		Cliente c =Cliente.criar();
		return new LinhaTelefonica (num, c);
	}
	public static LinhaTelefonica pesquisarLinha (String numero, LinhaTelefonica[] Linhas){
		for (int i=0;i<linhas.length;i++){
			if((linhas[i].getNumero()).equals(numero)){ 
				return Linhas[i];
			}
		}
		return null;
	// tem que testar	
	}
	public boolean chamar(String destinatario){
		// Duração deve receber valor aleatório.
		int duracao;
		int id;
		double c = duracao * Utilitario.custoChamadaVoz;
		Voz v = new Voz();
		// podemos colocar construtor carregado?
		// o vetor chamadas desta classe pode receber objetos que herdaram dela? No caso pre e pos.
		// se puder, então aqui dentro devemos fazer this.chamadas receber esse objeto.
		return true;
	}
	public boolean chamar(String destinatario, String conteudo, LinhaTelefonica[] Linhas){
		int id, i;
		double custo;
		LinhaTelefonica linhaDestinatario;
		Calendar horario = Calendar.getInstance();
		for(i=0; i<Linhas.length; i++){
			if(destinatario.equals(Linhas[i].getNumero == TRUE){
				linhaDestinatario = Linhas[i];
			}
		}
		if(linhaDestinatario.getNumero != NULL){
			custo = (conteudo.length() / Utilitario.comprimentoTexto)*Utilitaro.custoChamadaTexto;
			Texto t = new Texto(,horario, linhaDestinatario, custo, conteudo); // FALTA O NUMERO ALEATORIO
		} else{
			System.out.println("Numero Inexixtente!");
		}
		return true;
	}
	
}
