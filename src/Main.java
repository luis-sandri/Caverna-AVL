public class Main {

    public static void main(String[] args) {

        No entrada = new No("Entrada da Caverna");

        No tunelEscuro = new No("Túnel Escuro");
        No tunelCristais = new No("Túnel de Cristais");

        No lago = new No("Lago Subterrâneo");
        No ponte = new No("Ponte de Pedra");

        No morcegos = new No("Caverna dos Morcegos");
        No tesouro = new No("Sala do Tesouro");


        // Entrada
        entrada.setEsquerda(tunelEscuro);
        entrada.setDireita(tunelCristais);

        tunelEscuro.setAnterior(entrada);
        tunelCristais.setAnterior(entrada);


        // Túnel Escuro
        tunelEscuro.setEsquerda(lago);
        tunelEscuro.setDireita(ponte);

        lago.setAnterior(tunelEscuro);
        ponte.setAnterior(tunelEscuro);


        // Túnel de Cristais
        tunelCristais.setEsquerda(morcegos);
        tunelCristais.setDireita(tesouro);

        morcegos.setAnterior(tunelCristais);
        tesouro.setAnterior(tunelCristais);


        // Inicia o jogo
        Menu menu = new Menu();
        menu.iniciar(entrada);
    }
}