/*Crie uma classe Porta com os seguintes atributos: aberta (boolean), cor (String), altura (float) e largura (float). A classe deve possuir pelo menos um construtor e os métodos: void abrir(), void fechar(), void pintar(String c), boolean estaAberta(), void setAltura(float a) e void setLargura(float l). Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método estaAberta() para verificar se ela está aberta. */

public class Main {
    public static void main(String[] args) {

        Porta porta = new Porta(false, "amarelo", 2.0f, 0.8f);

        // Abrindo e fechando a porta
        porta.abrir();
        porta.fechar();

     
        porta.pintar("preto");
        porta.pintar("marrom");

       
        porta.setAltura(2.5f);
        porta.setLargura(1.3f);

      
        System.out.println("A porta está aberta? " + porta.estaAberta());
        }
    }