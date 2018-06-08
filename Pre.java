public class Pre extends LinhaTelefonica {

	private Saldo saldo;
	
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
		
		return true ;
	}
		


}