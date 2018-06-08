public class Pos extends LinhaTelefonica{
	 
	private Fatura[] faturas; 
	
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
}
