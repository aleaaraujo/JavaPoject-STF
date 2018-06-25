public class Cliente{

	private int clienteId;
	private String cpf;
	private String nome;
	private Endereco endereco;

	public Cliente(int clienteId, String cpf, String nome, Endereco endereco) {
		this.clienteId = clienteId;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	public void setClienteId(int id) {
		this.clienteId = id;
	}
	public int getClienteId (){
		return this.clienteId;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public String toString (){
		String aux = "";
		aux +="ID: "+this.clienteId +"\nCPF: "+this.cpf+"\nNOME: "+this.nome;
		aux +="\n"+this.endereco;
		return aux;
	}
    public static Cliente criar() {
        Endereco endereco = new Endereco("",0,"","","");
        String nome = "";
        String cpf = "";
        String varLerString = "";
        int varLerInt = 0;
        int clienteId = 0;
        int cont = 0;
        int op;
        int i;
        boolean flag = true;
        boolean flag2 = true;



        do{
            System.out.println("\nInforme a ID do Cliente: ");
            varLerInt = Leitura.lerInt();
            if(varLerInt == -1) {
                System.out.printf("\nErro de leitura! Por favor, entre com o cadastro novamente.\n");
                cont++;
                if(cont == 3) {
                    System.out.printf("Erro no Sistema de Leitura! Saindo...");
                    System.exit(1);
                }
                continue;
            } else {
                clienteId = varLerInt;
                varLerInt = 0;
            }

            System.out.println ("Informe o CPF: ");
            varLerString = Leitura.lerString();
            if(varLerString.equals("-1")) {
                System.out.printf("\nErro de leitura! Por favor, entre com o cadastro novamente.\n");
                cont++;
                if(cont == 3) {
                    System.out.printf("Erro no Sistema de Leitura! Saindo...");
                    System.exit(1);
                }
                continue;
            } else {
                varLerString = varLerString.replaceAll("[^\\w]","");
                if(varLerString.length() != 11){
                    System.out.printf("\nCPF Inexistente! Por favor, entre com o cadastro novamente.\n");
                    continue;
                }
                cpf = varLerString;
                varLerString = "";
            }

            System.out.println ("Informe o nome da Cliente: ");
            varLerString = Leitura.lerString();
            if(varLerString.equals("-1")) {
                System.out.printf("\nErro de leitura! Por favor, entre com o cadastro novamente.\n");
                cont++;
                if(cont == 3) {
                    System.out.printf("Erro no Sistema de Leitura! Saindo...");
                    System.exit(1);
                }
                continue;
            } else {
                try{
                    Double.parseDouble(varLerString);
                    System.out.printf("\nNome inválido! Por favor, entre com o cadastro novamente.\n");
                    continue;
                }catch (NumberFormatException err) {
                    nome = varLerString;
                }
            }

            endereco = Endereco.criar();

            while(flag2) { //loop infinito intencional
                System.out.printf("\nOs dados acima estão corretos?\n Digite 1 -> p/ Sim ou 2 -> p/ Não\n Opção: ");
                op = Leitura.lerInt();
                switch(op) {
                    case 1:
                        flag2 = false;
                        flag = false;
                        break;

                    case 2:
                        System.out.printf("\nInsira novamente os dados!\n");
                        flag2 = false;
                        break;

                    default:
                        System.out.printf("\nOpção Inválida!\n");
                }
            }
        }while(flag);

        return new Cliente (clienteId,cpf,nome,endereco);
    }
}