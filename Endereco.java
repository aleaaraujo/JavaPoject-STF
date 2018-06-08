public class Endereco{
	
	private String rua;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;    // metodo construtor mesmo nome da classe e nao retorna nada
	
	public Endereco(String rua,int numero,String cep,String cidade,String estado){
		this.rua =rua;
		this.numero= numero;
		this.cep=cep;
		this.cidade=cidade;
		this.estado=estado;
	}
	
	public void setRua(String rua){
		this.rua = rua;
	}
	public String getRua(){
		return this.rua;
	}
	public void setNumero(int numero){
		this.numero= numero;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setCep(String cep){
		this.cep = cep;
	}
	public String getCep(){
		return this.cep;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public String getCidade(){
		return this.cidade;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}
	public String toString(){
		String aux ="";
		aux ="Rua: "+this.rua+"\nNumero: "+this.numero+"\nCEP: "+this.cep +"\nCidade: "+ this.cidade+"\nUF: "+this.estado;
		return aux; 
	}

	public static  Endereco criar(){
		Leitura in = new Leitura();
		
		System.out.println ("Informe a Rua onde vc mora ");
		String rua = in.lerString();
		System.out.println ("Informe o numero da casa ");
		int num = in.lerInt();
		System.out.println ("Informe o nome do Estado");
		String est = in.lerString();
		System.out.println ("Informe o nome da Cidade ");
		String cid = in.lerString();
		System.out.println ("Informe o seu CEP ");
		String cep = in.lerString();
			
		return new Endereco(rua,num,cep,cid,est);
	}	

 



}