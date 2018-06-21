public class Pre extends LinhaTelefonica {

	private Saldo saldo;
	
	public Pre (Saldo sal, String num, Cliente cli){
		super(num,cli);
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
	public boolean recarregar (float valor){
		if (valor>=1){
			this.saldo.setValor(valor);
			//this.saldo.
			return true;
		}else{
			return false;
		}	
	}
	/*public boolean recarregar(float valor){
		double numero3 = valor;
		if(valor >=0){
			Saldo numero = new Saldo(numero3, Calendar.getInstance());
			this.saldo = numero;
			Calendar datadarecarga = Calendar.getInstance();
			datadarecarga.add(Calendar.DATE, Utilitario.vencimentoRecarga);
			return true;
		}else{
			return false;
		}
		
	}
	*/	


}
