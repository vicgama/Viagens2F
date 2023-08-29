import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        // Classe Objeto = Construtor
        Turista mochileiro = new Turista("Noah");
        Turista mochileira = new Turista();
        // Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Any");
        mochileira.setCpf("456");
        // Definir comportamento
        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null, retorno);

    }
}