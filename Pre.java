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
	public boolean recarregar (float valor){
		Calendar atual = Calendar.getInstance(); 
		if (valor>=1){
			this.saldo.setValor(valor);
			this.saldo.setVencimento(atual.set((Calendar.getDATE)+)Utilitario.vencimentoRecarga);
			return true;
		}else{
			return false;
		}	
	}
	public boolean chamar(String destinatario,LinhaTelefonica[] linhas){
		if(super.chamar(destinatario,linhas) && ((this.saldo).getValor() > 0)){
			(this.saldo).setValor((this.saldo).getValor()-Utilitario.custoChamadaVoz);
			return true;
		} 
		return false
	}
	public boolean chamar(String destinatario, String conteudo, LinhaTelefonica[] linhas){
		if(super.chamar(destinatario, conteudo, linhas) && ((this.saldo).getValor() > 0)){
			(this.saldo).setValor((this.saldo).getValor()-Utilitario.custoChamadaTexto);
			return true;
		} 
		return false
	}
	public static Pre criar(){
		
	}	


}
