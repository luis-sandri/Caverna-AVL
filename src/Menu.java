import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void iniciar(No entrada) {

        No atual = entrada;
        int opcao;

        do {
            System.out.println("\n==============================");
            System.out.println("Você está em:");
            System.out.println(atual.getNome());
            System.out.println("==============================");

            System.out.println("1 - Ir para a esquerda");
            System.out.println("2 - Ir para a direita");
            System.out.println("3 - Voltar");
            System.out.println("0 - Sair da caverna");

            System.out.print("\nEscolha um caminho: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        System.out.println("Não existe caminho pela esquerda.");
                    }
                    break;

                case 2:
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        System.out.println("Não existe caminho pela direita.");
                    }
                    break;

                case 3:
                    if (atual.getAnterior() != null) {
                        atual = atual.getAnterior();
                    } else {
                        System.out.println("Você já está na entrada da caverna.");
                    }
                    break;

                case 0:
                    System.out.println("Você saiu da caverna!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}