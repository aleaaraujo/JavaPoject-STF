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
		Voz v = new Voz();		


		return true;
	}
	public boolean chamar(String destinatario, String conteudo){

		return true;
	}
	
}
