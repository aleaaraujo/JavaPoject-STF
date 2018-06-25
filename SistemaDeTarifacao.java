import java.util.Calendar;

public class SistemaDeTarifacao {
	public static void main(String [] args){
		// Vetores de classes
		Pre linhasPre[] = new Pre[100];
		Pos linhasPos[] = new Pos[100];
		Cliente listaClientes[] = new Cliente[100];
		// Variaveis auxiliares
		Leitura ler = new Leitura();
		String consulta, atualiza, destinatario, msgTexto;
		Cliente consultaLinha;
		int i, j, op1, op2, op3, op4, atualizaInt, sair = 1, aux = 0, aux2 = 0; // op = opção
		do{
			System.out.println("SISTEMA DE TARIFACAO\n");
			System.out.println("1 - Cadastrar\n2 - Consultar dados\n3 - Atualizar dados\n4 - Opcoes adicionais\n0 - Sair\n");
			op1 = ler.lerInt();
			switch (op1){
				case 1:  // cadastro inicio
					System.out.println("CADASTRO\n");
					System.out.println("1 - Cliente\n2 - Linha Telefonica\n3 - Chamada\n0 - cancelar");
					op2 = ler.lerInt();
					switch(op2){
						case 1: //cadastra cliente
							for(i=0; i<listaClientes.length; i++){
								if(listaClientes[i] == null){
									listaClientes[i].criar();
									break;
								} 
							}
							break; 
						case 2: // cadastra linha telefonica
							System.out.println("1 - Pre\n2 - Pos\n0 - cancelar");
							op3 = ler.lerInt();
							switch(op3){
								case 1: // cadastra linha pre
									for(i=0; i<linhasPre.length; i++){
										if(linhasPre[i] == null){
											linhasPre[i].criar();
										} else{
											System.out.println("Vetor Cheio!");
										}
									}
									break;
								case 2: // cadastra linha telefonica pos
									for(i=0; i<linhasPos.length; i++){
										if(linhasPos[i] == null){
											linhasPos[i].criar();
										} else{
										}
									}
									break;
								case 0: // sai menu cadastro linha telefonica
									break;		
							}
							break;
						case 3: // cadastrar chamada
							break;
						case 0: // sai menu cadastro
							break;
					}
					break;
				case 2: // inicio consulta
					System.out.println("CONSULTA\n");
					System.out.println("1 - Cliente\n2 - Linha Telefonica\n0 - cancelar\n");
					op2 = ler.lerInt();
					aux = 0;
					switch(op2){
						case 1: // consulta Cliente
							System.out.println("Informe o cpf do cliente: ");
							consulta = ler.lerString();
							for(i=0; i<listaClientes.length; i++){
								if(listaClientes[i] != null){
									if(consulta.equals(listaClientes[i].getCpf())){
										System.out.println(listaClientes[i].toString());
										aux = 1;
									}
								}	
							}
							if (aux == 0){
								System.out.println("Cliente nao encontrado");
							}
							break;
						case 2: // consulta linha telefonica
							System.out.println("CONSULTA LINHA TELEFONICA\n");
							System.out.println("1 - Pre\n2 - Pos\n0 cancelar\n");
							op3 = ler.lerInt();
							aux = 0;
							switch(op3){
								case 1: // consulta linha pre
									System.out.println("Informe o cpf cadastrado na linha telefonica: ");
									consulta = ler.lerString();
									for(i=0; i<linhasPre.length; i++){
										consultaLinha = linhasPre[i].getCliente();
										if(consultaLinha != null){
											if(consulta.equals(consultaLinha.getCpf())){
												System.out.println(linhasPre[i].toString());
												aux = 1;
											}
										}
									}
									if (aux == 0){
										System.out.println("Linha Telefonica nao encontrada");
									}
									break;
								case 2: // consulta linha pos
									System.out.println("Informe o cpf cadastrado na linha telefonica: ");
									consulta = ler.lerString();
									for(i=0; i<linhasPos.length; i++){
										consultaLinha = linhasPos[i].getCliente();
										if (consultaLinha != null){
											if(consulta.equals(consultaLinha.getCpf())){
												System.out.println(linhasPos[i].toString());
												aux = 1;
											}
										}	
									}
									if (aux == 0){
										System.out.println("Linha Telefonica nao encontrada");
									}
									break;
								case 0: // sai menu consulta linha
									break;
							}		
							break;
						case 0: // sai menu consulta
							break;
					}
					break;
				case 3: // inicio atualiza
					System.out.println("ATUALIZAR\n");
					System.out.println("1 - Cliente\n2 - Linha Telefonica\n0 - cancelar\n");
					op2 = ler.lerInt();
					aux = 0;
					switch(op2){
						case 1: // atualiza cliente
							System.out.println("Informe o cpf do cliente: ");
							consulta = ler.lerString();
							for(i=0; i<listaClientes.length; i++){ // procura o cliente
								if(listaClientes[i] != null){
									if(consulta.equals(listaClientes[i].getCpf())){
										System.out.println(listaClientes[i].toString());
										aux = 1;
										break;
									}
								}	
							}
							if (aux == 0){
									System.out.println("Cliente nao encontrado\n");
								} else {
									System.out.println("Modifiacar:\n");
									System.out.println("1 - ID\n2 - CPF\n3 - Nome\n4 - Endereco\n0 - cancelar\n");
									op3 = ler.lerInt();
									switch(op3){
										case 1: // atualiza id cliente
											System.out.println("Informe o novo ID: ");
											atualizaInt = ler.lerInt();
											listaClientes[i].setClienteId(atualizaInt);
											System.out.println("ID atualizado!\n");
											break;
										case 2: // atualiza cpf cliente
											System.out.println("Informe o novo CPF: ");
											atualiza = ler.lerString();
											listaClientes[i].setCpf(atualiza);
											System.out.println("CPF atualizado!\n");
											break;
										case 3: // atualiza nome cliente
											System.out.println("Informe o novo Nome: ");
											atualiza = ler.lerString();
											listaClientes[i].setNome(atualiza);
											System.out.println("Nome atualizado!\n");
											break;
										case 4: // atualiza endereco cliente
											System.out.println(" ENDERECO: \n");
											System.out.println("1 - Rua\n2 - Numero\n3 - CEP\n4 - Cidade\n5 - Estado\n0 - cancelar");
											op4 = ler.lerInt();
											switch(op4){
												case 1: // atualiza rua do endereco
													System.out.println("Informe a nova Rua: ");
													atualiza = ler.lerString();
													listaClientes[i].getEndereco().setRua(atualiza);
													System.out.println("Rua atualizada!\n");
													break;
												case 2: // atualiza numero do endereco
													System.out.println("Informe o novo Numero: ");
													atualizaInt = ler.lerInt();
													listaClientes[i].getEndereco().setNumero(atualizaInt);
													System.out.println("Rua atualizada!\n");
													break;
												case 3: // atualiza cep do endereco
													System.out.println("Informe o novo CEP: ");
													atualiza = ler.lerString();
													listaClientes[i].getEndereco().setCep(atualiza);
													System.out.println("CEP atualizado!\n");
													break;
												case 4: // atualiza cidade do endereco
													System.out.println("Informe a nova cidade: ");
													atualiza = ler.lerString();
													listaClientes[i].getEndereco().setCidade(atualiza);
													System.out.println("Cidade atualizada!\n");
													break;
												case 5: // atualiza estado do endereco
													System.out.println("Informe o novo Estado: ");
													atualiza = ler.lerString();
													listaClientes[i].getEndereco().setEstado(atualiza);
													System.out.println("Estado atualizado!\n");
													break;
												case 0: // sai menu atualizar endereco
													break;
											}
											break;
										case 0: // sai menu atualiza cliente
											break;
									}
								}
							break;
						case 2: // inicio atualizar linha telefonica
							System.out.println("Informe:\n1 - Pre\n2 - Pos\n0 - cancelar");
							op3 = ler.lerInt();
							switch(op3){
								case 1: // atualiza linha PRE
									System.out.println("Informe o cpf do cliente: ");
									consulta = ler.lerString();
									for(i=0; i<linhasPre.length; i++){ // verifica linha cadastrada
										if (linhasPre[i] != null){
											if(consulta.equals(linhasPre[i].getCliente().getCpf())){
												System.out.println(linhasPre[i].toString());
												aux = 1;
												break;
											}
										}	
									}
									if(aux == 0){
										System.out.println("Cliente nao encontrado\n");
									} else {
										System.out.println("Modificar: \n");
										System.out.println("1 - Numero\n2 - Cliente da conta\n0 - cancelar");
										op4 = ler.lerInt();
										switch(op4){
											case 1: // modifica numero pre
												System.out.println("Informe o novo Numero: ");
												atualiza = ler.lerString();
												linhasPre[i].setNumero(atualiza);
												System.out.println("Numero atualizado!\n");
												break;
											case 2: // modifica cliente pre
												System.out.println("Informe o cpf do novo cliente: ");
												atualiza = ler.lerString();
												System.out.println("Informe o cpf do novo cliente: ");
												atualiza = ler.lerString();
												for(j=0; j<linhasPre.length; j++){
													if(listaClientes[j] != null){
														if(atualiza.equals(listaClientes[j].getCpf())){
															linhasPre[i].setCliente(listaClientes[j]);
															aux2 = 1;
															break;
														}
													}	
													if(aux2 != 0){
														System.out.println("Cliente atualizado!\n");
													} else {
														System.out.println("CPF nao encontrado!\n");
													}
												}
												break;
											case 0:
												break;
										}
									}
									break;
								case 2: // atualiza linha POS
									System.out.println("Informe o cpf do cliente: ");
									consulta = ler.lerString();
									for(i=0; i<linhasPos.length; i++){
										if(consulta.equals(linhasPos[i].getCliente().getCpf())){
											System.out.println(linhasPos[i].toString());
											aux = 1;
											break;
										}
									}
									if(aux == 0){
										System.out.println("Cliente nao encontrado\n");
									} else {
										System.out.println("Modificar: \n");
										System.out.println("1 - Numero\n2 - Cliente da conta\n0 - cancelar");
										op4 = ler.lerInt();
										switch(op4){
											case 1: // modifica numero pos
												System.out.println("Informe o novo Numero: ");
												atualiza = ler.lerString();
												linhasPos[i].setNumero(atualiza);
												System.out.println("Numero atualizado!\n");
												break;
											case 2: // modifica cliente pos
												System.out.println("Informe o cpf do novo cliente: ");
												atualiza = ler.lerString();
												System.out.println("Informe o cpf do novo cliente: ");
												atualiza = ler.lerString();
												for(j=0; j<linhasPos.length; j++){
													if(atualiza.equals(listaClientes[j].getCpf())){
														linhasPos[i].setCliente(listaClientes[j]);
														aux2 = 1;
														break;
													}
													if(aux2 != 0){
														System.out.println("Cliente atualizado!\n");
													} else {
														System.out.println("CPF nao encontrado!\n");
													}
												}
												break;
											case 0: // sai menu atualiza pos
												break;
										}
									}
									break;
								case 0: // sai menu atualizar linha
									break;
							}								
							break;
						case 0: // sai menu atualizar
							break;
					}
					break;
				case 4: // opcoes adicionais
					System.out.println("OPCOES ADICIONAIS\n");
					System.out.println("1 - Realizar chamada\n2 - Recarregar linha Pre\n3 - Gerar fatura linha Pos\n0 - cancelar");
					op2 = ler.lerInt();
					switch(op2){
						case 1: // realizar chamada
							System.out.println("1 - PRE\n2 - POS\n\n0 - cancelar");
							op3 = ler.lerInt();
							aux = 0;
							switch(op3){
								case 1: // Ligacao pre
									System.out.println("Informe o numero a realizar chamada: ");
									consulta = ler.lerString();
									System.out.println("Informe o numero do destinatario: ");
									destinatario = ler.lerString();
									for(i=0; i<linhasPre.length; i++){
										if(consulta.equals(linhasPre[i].getNumero())){
											aux = 1;
											break;
										}
									}
									if(aux == 0){
										System.out.println("Numero nao encontrado!");
									} else {
										System.out.println("1 - Voz\n2 - Texto\n0 - cancelar");
										op4 = ler.lerInt();
										switch(op4){
											case 1: // chamada voz
												linhasPre[i].chamar(destinatario, linhasPre);
												break;
											case 2: // chamada texto
												System.out.println("Digite o texto enviado: ");
												msgTexto = ler.lerString();
												linhasPre[i].chamar(destinatario, msgTexto, linhasPre);
												break;
											case 0: // sai menu tipo chamada
												break;
										}	
									}
									break;
								case 2: // Ligacao pos
									System.out.println("Informe o numero a realizar chamada: ");
									consulta = ler.lerString();
									System.out.println("Informe o numero do destinatario: ");
									destinatario = ler.lerString();
									for(i=0; i<linhasPos.length; i++){
										if(consulta.equals(linhasPos[i].getNumero())){
											aux = 1;
											break;
										}
									}
									if(aux == 0){
										System.out.println("Numero nao encontrado!");
									} else {
										System.out.println("1 - Voz\n2 - Texto\n0 - cancelar");
										op4 = ler.lerInt();
										switch(op4){
											case 1: // chamada voz
												linhasPos[i].chamar(destinatario, linhasPos);
												break;
											case 2: // chamada texto
												System.out.println("Digite o texto enviado: ");
												msgTexto = ler.lerString();
												linhasPos[i].chamar(destinatario, msgTexto, linhasPos);
												break;
											case 0: // sai menu tipo chamada
												break;
										}	
									}
									break;
								case 0:
									break;
							}
						case 2: // recarregar linha pre
							System.out.println("Informe o numero da linha: ");
							consulta = ler.lerString();
							for(i=0; i<linhasPre.length; i++){
								if(consulta.equals(linhasPre[i].getNumero())){
									aux = 1;
									break;
								}
							}
							if(aux == 0){
								System.out.println("Numero nao encontrado!");
							} else {
							}
							break;
						case 3: // gerar fatura linha pos
							System.out.println("Informe o numero da linha: ");
							consulta = ler.lerString();
							for(i=0; i<linhasPos.length; i++){
								if(consulta.equals(linhasPos[i].getNumero())){
									aux = 1;
									break;
								}
							}
							if(aux == 1){
								System.out.println("Fatura paga com sucesso!");
							} else {
								System.out.println("Nao foi possivel pagar a fatura");
							}								
							break;
						case 0: // sai menu opcoes adicionais
							break;
					}
					break;
				case 0: // sai menu
					sair = 0;
					break;
			} 
		} while (sair != 0);
	}
}
