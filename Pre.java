import java.util.Calendar;
public class Pre extends LinhaTelefonica {
	private Saldo saldo;

	public Pre (String numero, Cliente cliente, Saldo saldo){
		super(numero, cliente);
		this.saldo = saldo;
	}
	public void setSaldo (Saldo saldo){
		this.saldo = saldo;
	}
	public Saldo getSaldo (){
		return this.saldo;
	}
	public String toString (){
		String aux ="";
		aux +=super.toString();
		aux +="\nSALDO: "+this.saldo;
		return aux;
	}
		public void setNumero (String numero){

		super.setNumero(numero);

	}

	public String getNumero(){

		return super.getNumero();

	}

	public void setCliente(Cliente cliente){

		super.setCliente(cliente);

	}

	public Cliente getCliente(){

		return super.getCliente();

	}

	public Chamada[] getChamada(){

		return super.getChamada();

	}
	public boolean recarregar(float valor) {
		Calendar atual = Calendar.getInstance();
		if(valor >= 1) {
			this.saldo.setValor(valor);
			atual.add(Calendar.DAY_OF_MONTH,Utilitario.vencimentoRecarga);
			this.saldo.setVencimento(atual);
			return true;
		}else{
			return false;
		}
	}
	public boolean chamar(String destinatario,LinhaTelefonica[] linhas){
		if(super.chamar(destinatario,linhas) & ((this.saldo).getValor() > 0)){
			(this.saldo).setValor((this.saldo).getValor()-Utilitario.custoChamadaVoz);
			return true;
		} 
		return false;
	}
	public boolean chamar(String destinatario, String conteudo, LinhaTelefonica[] linhas){
		if(super.chamar(destinatario, conteudo, linhas) & ((this.saldo).getValor() > 0)){
			(this.saldo).setValor((this.saldo).getValor()-Utilitario.custoChamadaTexto);
			return true;
		} 
		return false;
	}
	public static Pre criar(){
		System.out.println ("Informe o Numero :");
		String num = Leitura.lerString();
		Cliente c = Cliente.criar();
		System.out.printf("Informe o saldo: ");
		float valSaldo = Leitura.lerFloat();
		Calendar vencimento = Calendar.getInstance();
		if(valSaldo > 0) {vencimento.add(Calendar.DAY_OF_MONTH, Utilitario.vencimentoRecarga);}
		Saldo saldo = new Saldo(valSaldo, vencimento);
		return new Pre(num, c,saldo);
	}
}
