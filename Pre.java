public class Pre extends LinhaTelefonica {

	private Saldo saldo;
	
	public Pre (Saldo sal, String num, Cliente cli, Chamada cha){
		super(num,cli,cha);
		this.saldo = sal;
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
		aux +="SALDO: "+this.saldo;
		return aux;
	}
	public boolean recarregar (double valor){
		if (valor>=1){
			this.saldo.setValor(valor);
			//this.saldo.
			return true;
		}else{
			return false;
		}	
	}
		


}
