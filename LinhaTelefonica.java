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
	public void setCliente (cliente cli){
		this.cliente = cli;
	}
	public cliente getCliente (){
		return this.cliente;
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
		Cliente c =new Cliente();
		return new LinhaTelefonica (num, c);
	}
	public static LinhaTelefonica pesquisarLinha (String numero, LinhaTelefonica[] Linhas){
		for (int i=0;i<linhas.length;i++){
			if((linhas[i].numero).equals(numero)){ 
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
	public boolean chamar(String destinatario, String conteudo){
		int id;
		double c; ;
		// Verificação do tamanho to texto
		//em seguida, é necessario verificar se a conta que esta realizando a chamada possui créditos o suficiente.
		if(conteudo.length <= Utilitario.comprimentoChamadaTexto){
			c = conteudo.length * Utilitario.custoChamadaTexto;
			Texto t = new Texto();
			// podemos fazer construtor sobrecarregato aqui tbm?
			// Verificar os .length
		}
		else {
			System.out.println("Conteudo muito longo!");
		}
		return true;
	}
	
}
