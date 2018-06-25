import java.util.Calendar;

public class Pos extends LinhaTelefonica{

	
private Fatura[] faturas;

 
	
public Pos(String numero, Cliente cliente){
		super(numero,cliente);

		this.faturas = new Fatura[10];

	}

	public boolean chamar(String destinatario,LinhaTelefonica[] linhas){

		if(super.chamar(destinatario, linhas)){

			Calendar dataInicial = Calendar.getInstance();

			int faturaId = (Integer.parseInt(destinatario))%100+1;

			Calendar dataFinal = Calendar.getInstance();

			long horaInicial = dataInicial.getTimeInMillis();

			long horaFinal = dataFinal.getTimeInMillis();

			float valor = (horaFinal-horaInicial) * Utilitario.custoChamadaVoz;
  			this.faturas[0] = new Fatura(faturaId, dataInicial, dataFinal,valor);
			return true;

		}
		return false;

	}

	public boolean chamar(String destinatario,String conteudo, LinhaTelefonica[] linhas){

		if(super.chamar(destinatario, conteudo, linhas)){

			Calendar dataInicial = Calendar.getInstance();

			int faturaId = (Integer.parseInt(destinatario))%100+1;

			Calendar dataFinal = Calendar.getInstance();

			float valor = ((conteudo.length())/Utilitario.comprimentoChamadaTexto) * Utilitario.custoChamadaTexto;
  	
		this.faturas[0] = new Fatura(faturaId, dataInicial, dataFinal, valor);

			return true;

		}

		return false;

	}

	// public boolean pagarFatura (){
//
//		Calendar atual = Calendar.getInstance();
//
//		Fatura[] fatura = getFaturas();
//	
//		int i;
//
//		*for(i=0;i<faturas.length;i++){
//
//			if(faturas[i].getDataFinal().getTimeInMillis())
//		}
//
//		return true;
//
//	}

	public void setFaturas (Fatura[] faturas){

		this.faturas = faturas;

	}

	public Fatura[] getFaturas (){

		return this.faturas;

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

	public String toString (){

		String aux = "";

		aux +=super.toString();

		aux+="\nFATURA: "+this.faturas;
		
		return aux;

	}

	public static Pos criar(){

		System.out.println ("Informe o Numero :");

		String num = Leitura.lerString();

		Cliente c = Cliente.criar();

		Calendar vencimento = Calendar.getInstance();

		return new Pos(num, c);

	}


}