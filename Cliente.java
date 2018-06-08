public class Cliente{

	private int clienteId;
	private String cpf;
	private String nome;
	private Endereco endereco;

	public Cliente (int id, String cpf, String nome, Endereco end){
		
		this.clienteId = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = end;
	}
	public void setClienteId (int id){
		this.clienteId = id;
	}
	public int getClienteId (){
		return this.clienteId;
	}
	public void setCpf (String cpf){
		this.cpf = cpf;
	}
	public String getCpf (){
		return this.cpf;
	}
	public void setNome (String nome){
		this.nome = nome;
	}
	public String getNome (){
		return this.nome;
	}
	public String toString (){
		String aux = "";
		aux +="ID: "+this.clienteId +"\nCPF: "+this.cpf+"\nNOME: "+this.nome;
		aux +="\n"+this.endereco;	
		return aux;		
	}
	public static Cliente criar(){
		Leitura ler = new Leitura;
		System.out.println ("Informe a ID do Cliente :");
		int id = ler.lerInt();
		System.out.println ("Informe o CPF do Cliente :");
		String cpf = ler.lerString();
		System.out.println ("Informe o nome do Cliente :");
		String nome = ler.lerString();
		Endereco end= Endereco.criar();
		return new Cliente(id, cpf, nome, end);
	}

}