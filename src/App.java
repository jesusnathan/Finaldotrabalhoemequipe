public class App {
    public static void main(String[] args) throws Exception {
        Personagem arqueiro = new Personagem();
        arqueiro.nome = "Gojo";
        arqueiro.nivel = 15;
        arqueiro.forca = 17;

        arqueiro.mostrarStatus();
        arqueiro.atacar();
    }
}

class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d força. ", nome, nivel, forca);
    }

    void atacar() {
        System.out.format("%s atacou e retirou %d de dano.", nome, forca);
    }
}
