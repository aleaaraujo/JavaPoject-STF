public class Pos extends LinhaTelefonica{
	 
	private Fatura[] faturas; 
	
	public Pos(String num, Cliente cli, Fatura[] fatura) {
		super(num, cli);
		this.faturas = fatura;
	}
	public boolean pagarFatura (){
	
		return true;
	}
	public void setFaturas (Fatura[] fat){
		this.faturas = fat;
	}
	public Fatura[] getFatura (){
		return this.faturas;
	}
	public String toString (){
		String aux = "";
		aux +=super.toString();
		aux+="\nFATURA: "+this.faturas;		
		return aux;
	}
	public boolean pagarFatura(){      //teste
		Fatura [] fat = getFatura();
		Calendar agora = Calendar.getInstance();
		long h3 = agora.getTimeInMillis();
		double valor = 0;
		for(int x=0; x<fat.length; x++){
			long h1 = fat[x].getDataFinal().getTimeInMillis();
			if(h1 < h3){
				valor += fat[x].getValor();
			}
		}
		if(valor > 0){
			return true;
		}else{
			return false;
		}
	} 
}
