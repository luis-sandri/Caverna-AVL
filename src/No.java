public class No {

    private String nome;
    private No anterior;
    private No esquerda;
    private No direita;

    public No(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public No getAnterior() {
        return anterior;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
}