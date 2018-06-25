
public class Endereco{
	//Atributos
	private String rua;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;

	//Construtor
	public Endereco(String rua,int numero,String cep,String cidade,String estado){
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	//Sets/Gets
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
		cep = cep.replaceAll("[^\\w]", "");
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

	//Métodos

	public static Endereco criar() {
		String rua = "";
		String cep = "";
		String cidade = "";
		String estado =" ";
		String UF[] = {"AC","AL","AM","AP","BA","CE","DF","ES","GO","MA","MG","MS","MT","PA","PB","PE","PI","PR","RJ","RN","RO","RR","RS","SC","SE","SP","TO"};
		int numero = 0;
		int cont = 0;
		int i;
		boolean flagWhile = true;
		boolean flagPesquisa = true;
		String varLerString = "";
		int varLerInt = 0;

		do{
			System.out.println ("\nInforme a Rua/Av onde vc mora: ");
			varLerString = Leitura.lerString();
			if(varLerString.equals("-1")) {
				System.out.printf("\nErro de leitura! Por favor, entre com o endereço novamente.\n");
				cont++;
				if(cont == 3) {
					System.out.printf("Erro no Sistema de Leitura! Saindo...");
					System.exit(1);
				}
				continue;
			} else {
				rua = varLerString;
			}

			System.out.println ("Informe o numero da residência: ");
			varLerInt = Leitura.lerInt();
			if(varLerInt == -1) {
				System.out.printf("\nErro de leitura! Por favor, entre com o endereço novamente.\n");
				cont++;
				if(cont == 3) {
					System.out.printf("Erro no Sistema de Leitura! Saindo...");
					System.exit(1);
				}
				continue;
			} else {
				numero = varLerInt;
			}

			System.out.println ("Informe a sigla do Estado (Ex: PR): ");
			varLerString = Leitura.lerString();
			if(varLerString.equals("-1")) {
				System.out.printf("\nErro de leitura! Por favor, entre com o endereço novamente.\n");
				cont++;
				if(cont == 3) {
					System.out.printf("Erro no Sistema de Leitura! Saindo...");
					System.exit(1);
				}
				continue;
			} else {
				varLerString= varLerString.toUpperCase();
				if(varLerString.length() > 2){
					System.out.printf("\nEstado Inexistente! Por favor, entre com o endereço novamente.\n");
					continue;
				}
				for(i = 0; i < UF.length; i++) {
					if(UF[i].equals(varLerString)) {
						estado = varLerString;
						flagPesquisa = false;
					}
				}
				if(flagPesquisa) {
				 System.out.printf("\nEstado Inexistente! Por favor, entre com o endereço novamente.\n");
				 continue;
				}
			}

			System.out.println ("Informe o nome da Cidade ");
			varLerString = Leitura.lerString();
			if(varLerString.equals("-1")) {
				System.out.printf("\nErro de leitura! Por favor, entre com o endereço novamente.\n");
				cont++;
				if(cont == 3) {
					System.out.printf("Erro no Sistema de Leitura! Saindo...");
					System.exit(1);
				}
				continue;
			} else {
				try{
					Double.parseDouble(varLerString);
					System.out.printf("\nNome de Cidade inválido! Por favor, entre com o endereço novamente.\n");
					continue;
				}catch (NumberFormatException err) {
					cidade = varLerString;
				}
			}

			System.out.println ("Informe o seu CEP ");
			varLerString = Leitura.lerString();
			if(varLerString.equals("-1")) {
				System.out.printf("\nErro de leitura! Por favor, entre com o endereço novamente.\n");
				cont++;
				if(cont == 3) {
					System.out.printf("Erro no Sistema de Leitura! Fechando o programa...");
					System.exit(1);
				}
				continue;
			} else {
                if(varLerString.length() < 8 || varLerString.length() > 9) {
                    System.out.printf("\nCEP Incorreto! Por favor, entre com o endereço novamente.\n");
                    continue;
                }
				varLerString = varLerString.replaceAll("[^\\w]", "");
				cep = varLerString;
			}

			flagWhile = false;

		}while(flagWhile);

		return new Endereco(rua,numero,cep,cidade,estado);
	}

	//ToString
	@Override
	public String toString() {
	  return String.format("Endereço: %s | N: %d | CEP: %s-%s | Cidade: %s | Estado: %s |", this.rua, this.numero, this.cep.substring(0,5), this.cep.substring(5,8), this.cidade, this.estado);
	}
}