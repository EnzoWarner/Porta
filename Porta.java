public class Porta {
    // Atributos
    private boolean aberta;
    private String cor;
    private float altura;
    private float largura;

    // Construtor
    public Porta(boolean aberta, String cor, float altura, float largura) {
        this.aberta = aberta;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }

    // Método para abrir a porta
    public void abrir() {
        if (!aberta) {
            System.out.println("Abrindo a porta...");
            aberta = true;
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    // Método para fechar a porta
    public void fechar() {
        if (aberta) {
            System.out.println("Fechando a porta...");
            aberta = false;
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    // Método para pintar a porta
    public void pintar(String c) {
        System.out.println("Pintando a porta de " + c + "...");
        cor = c;
    }

    // Método para verificar se a porta está aberta
    public boolean estaAberta() {
        return aberta;
    }

    // Método para definir a altura da porta
    public void setAltura(float a) {
        System.out.println("Alterando a altura da porta para " + a + " metros...");
        altura = a;
    }

    // Método para definir a largura da porta
    public void setLargura(float l) {
        System.out.println("Alterando a largura da porta para " + l + " metros...");
        largura = l;
    }
}