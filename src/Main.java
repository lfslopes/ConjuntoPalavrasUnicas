import conjunto_palavras_unicas.ConjuntoPalavras;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras("Palavra dupla", "Abacate", "Manada", "Silva");
        conjuntoPalavras.exibirPalavras();

        conjuntoPalavras.removerPalavra("Palavra dupla");
        conjuntoPalavras.removerPalavra("Silva");
        System.out.println("\n############################ - Atualizando as Palavras - ############################\n");
        conjuntoPalavras.adicionarPalavra("Rosa");
        conjuntoPalavras.exibirPalavras();

        System.out.println("\nProcurando uma palavra");
        String palavra = "Rosa";
        if (conjuntoPalavras.verificarPalavra(palavra))
            System.out.println("A palavra " + palavra + " está presente no conjunto");
        else
            System.out.println("A palavra " + palavra + " não foi encontrada");
    }
}
