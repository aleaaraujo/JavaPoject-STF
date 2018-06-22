public class SistemaDeTarifacao {
	public static void main(String [] args){
		// Vetores de classes
		Pre linhasPre[] = new Pre[100];
		Pos linhasPos[] = new Pos[100];
		Cliente listaClientes[] = new Cliente[100];
		// Variaveis auxiliares
		Leitura ler = new Leitura();
		String consulta;
		Cliente consultaLinha;
		int i, op1, op2, op3, sair = 1, aux = 0; // op = opção
		do{
			System.out.println("SISTEMA DE TARIFACAO\n");
			System.out.println("1 - Cadastrar\n2 - Consultar\n3 - Atualizar\n0 - Sair\n");
			op1 = ler.lerInt();
			switch (op1){
				case 1:
					System.out.println("CADASTRO\n");
					System.out.println("1 - Cliente\n2 - Linha Telefonica\n3 - Chamada\n0 - cancelar");
					op2 = ler.lerInt();
					switch(op2){
						case 1:
							for(i=0; i<listaCliente.length; i++){
								if(listaClientes[i].getCpf == NULL){
									listaClientes[i].criar();
								} else{
									System.out.println("Vetor Cheio!");
								}
							}
							break;
						case 2:
							System.out.println("1 - Pre\n2 - Pos\n0 - cancelar");
							op3 = ler.lerInt();
							switch(op3){
								case 1:
									for(i=0; i<linhasPre.length; i++){
										if(linhasPre[i].getCpf == NULL){
											linhasPre[i].criar();
										} else{
											System.out.println("Vetor Cheio!");
										}
									}
									break;
								case 2:
									for(i=0; i<linhasPos.length; i++){
										if(linhasPos[i].getCpf == NULL){
											linhasPos[i].criar();
										} else{
											System.out.println("Vetor Cheio!");
										}
									}
									break;
								case 0:
									break;		
							}
							break;
						case 3: // cadastrar chamada
							break;
						case 0:
							break;
					}
					break;
				case 2:
					System.out.println("CONSULTA\n");
					System.out.println("1 - Cliente\n2 - Linha Telefonica\n0 - cancelar\n");
					op2 = ler.lerInt();
					aux = 0;
					switch(op2){
						case 1:
							System.out.println("Informe o cpf do cliente: ");
							consulta = lerString();
							for(i=0; i<listaClientes.length; i++){
								if(consulta.equals(listaClientes[i].getCpf) == TRUE){
									System.out.println(listaClientes[i].toString());
									aux = 1;
								}
								if (aux = 0){
									System.out.println("Cliente nao encontrado");
								}
							}
							break;
						case 2:
							System.out.println("CONSULTA LINHA TELEFONICA\n");
							System.out.println("1 - Pre\n2 - Pos\n0 cancelar\n");
							aux = 0;
							switch(op3){
								case 1:
									System.out.println("Informe o cpf cadastrado na linha telefonica: ");
									consulta = lerString();
									for(i=0; i<linhasPre.length; i++){
										consultaLinha = linhasPre[i].getCliente;
										if(consulta.equals(consultaLinha.getCpf) == TRUE){
											System.out.println(linhasPre[i].toString());
											aux = 1;
										}
										if (aux = 0){
											System.out.println("Linha Telefonica nao encontrada");
										}
									}
									break;
								case 2:
									System.out.println("Informe o cpf cadastrado na linha telefonica: ");
									consulta = lerString();
									for(i=0; i<linhasPos.length; i++){
										consultaLinha = linhasPos[i].getCliente;
										if(consulta.equals(consultaLinha.getCpf) == TRUE){
											System.out.println(linhasPos[i].toString());
											aux = 1;
										}
										if (aux = 0){
											System.out.println("Linha Telefonica nao encontrada");
										}
									}
									break;
								case 0:
									break;
							}		
							break;
						case 0:
							break;
					}
					break;
				case 3:
					System.out.println("ATUALIZAR");
					break;
				case 0:
					break;
			}
		} while (sair != 0);
	}
}
		