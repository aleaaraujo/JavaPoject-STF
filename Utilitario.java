public class Utilitario {
    //Atributos
    public static final int comprimentoChamdaTexto = 144; // Variável estática final com a quantidade de caracteres limite de cada bloco de chamada de texto
    public static final int vencimentoRecarga = 90;
    public static float custoChamadaVoz;
    public static float custoChamadaTexto;

    //Construtor
    public Utilitario(float custoChamadaVoz, float custoChamadaTexto) {
        Utilitario.custoChamadaVoz = custoChamadaVoz;
        Utilitario.custoChamadaTexto = custoChamadaTexto;
    }

    //Sets/Gets

    //Métodos
    public boolean recarregar(LinhaTelefonica[] linhas, String numero, float valor) {
        if(valor >= 7.00) { // Recarga minima = R$ 7,00
            numero = numero.replaceAll("[^\\w]",""); //Tratamento para numero que possuem carac. espec.
            for(int i = 0; i < linhas.length; i++){
                if(linhas[i].getNumero().equals(numero)){
                    if(linhas[i] instanceof Pre){
                            Pre linha = (Pre) linhas[i];
                            if(linha.recarregar(valor)) {
                                linhas[i] = linha;
                                return true;
                            }
                            return false;
                    } else {
                        System.out.printf("\nO numero (%s) %s-%s pertence ao Plano Pós Pago!\n", numero.substring(0,3), numero.substring(3,8), numero.substring(8,12));
                        return false;
                    }
                } else {
                    System.out.printf("\nNumero não cadastrado!\n");
                }
            }

        }
        System.out.printf("\nO Valor minímo da recarga deve ser de R$ 7,00");
        return false;
    }

    //ToString
    @Override
    public String toString (){
        return String.format("\nTamanho Máx. da Chamada de Texto: %-3d letras | Validade da Recarga: %-2d dias | Custo da Chamada de Voz: R$ %-2.2f/min | Custo da Chamada de Texto: R$ %-2.2f \n",comprimentoChamdaTexto, vencimentoRecarga, custoChamadaVoz, custoChamadaTexto);
    }
}
