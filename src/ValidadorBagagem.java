import java.util.Scanner;

public class ValidadorBagagem {
    public static void main(String[] args) {
        int pesoPermitidoTipoMao = 10;
        int pesoPermitidoTipoPorao = 23;

        String[] tipoBagagem = {"de mão","de porão"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Boas vindas. Qual o peso da sua bagagem?");
        String bagagemPassageiro = scanner.nextLine();

        System.out.println("Qual o tipo da sua bagagem? Informe 0 para tipo mão e 1 para tipo Porão.");
        String bagagemTipoPassageiro = scanner.nextLine();

        boolean ehNumeroPeso = bagagemPassageiro.matches("\\d+");
        boolean ehNumeroTipo = bagagemTipoPassageiro.matches("[01]");

        if (ehNumeroPeso && ehNumeroTipo) {
            int pesoBagagemPassageiro = Integer.parseInt(bagagemPassageiro);
            int tipoBagagemPassageiro = Integer.parseInt(bagagemTipoPassageiro);

            if (tipoBagagemPassageiro == 0 && pesoBagagemPassageiro <= pesoPermitidoTipoMao) {
                System.out.println("A sua bagagem do tipo " + tipoBagagem[tipoBagagemPassageiro] + " pode embarcar.");
            } else if (tipoBagagemPassageiro == 1 && pesoBagagemPassageiro <= pesoPermitidoTipoPorao) {
                System.out.println("A sua bagagem do tipo " + tipoBagagem[tipoBagagemPassageiro] + " pode embarcar.");
            } else {
                System.out.println("A sua bagagem do tipo " + tipoBagagem[tipoBagagemPassageiro] + " passa o limite permitido.");
            }
        } else {
            System.out.println("O peso e tipo da bagagem precisam ser válidos.");
        }

        scanner.close();
    }
}

//DESAFIO:
//Ex: preciso de um programa para verificar se o peso
// da bagagem do passageiro é permitido para a classe do voo comprado.
//Dica: é possível usar 2 argumentos no código, um para a classe (M = Mão e P = Porão)
// e outro para o peso em decimal.
//Critério de aceite: o limite de peso para bagagem de mão é 10 kg e o
// limite de peso para o porão é de 23 kg.
//        Entrada: args[0] = “M” e args[1] = “12”;
//Saída esperada: “Bagagem não está dentro do limite de peso permitido
// para esta categoria.”
