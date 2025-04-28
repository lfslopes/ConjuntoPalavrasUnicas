package conjunto_palavras_unicas;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoPalavras {
    private Set<String> palavrasUnicas;

    private final String PALAVRA_PATTERN = "[a-zA-Z]+";

    public ConjuntoPalavras() {
        palavrasUnicas = new TreeSet<>();
    }
    public ConjuntoPalavras(Set<String> palavrasUnicas){
        Set<String> temp = new TreeSet<>();
        if (palavrasUnicas == null)
            System.out.println("Conjunto nulo");
        else {
            for (String palavra : palavrasUnicas) {
                if (this.palavrasValidas(palavra))
                    temp.add(palavra);
            }

            this.palavrasUnicas = temp;
        }
        this.palavrasUnicas = new TreeSet<>();
    }
    public ConjuntoPalavras(String...palavrasUnicas) {
        this.palavrasUnicas = new TreeSet<>();

        if (palavrasUnicas == null)
            System.out.println("Conjunto nulo");
        else {
            for (String palavra : palavrasUnicas) {
                if (this.palavrasValidas(palavra))
                    this.adicionarPalavra(palavra);
            }
        }
    }

    private boolean palavrasValidas(String palavra) {
        return palavra.matches(PALAVRA_PATTERN);
    }

    public void adicionarPalavra(String palavra) {
        if (!palavrasValidas(palavra))
            System.out.println("Palavra inválida");
        else if (palavrasUnicas.contains(palavra))
            System.out.println("Palavra já presente no conjunto");
        else
            palavrasUnicas.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.contains(palavra))
            System.out.println("a palavra " + palavra + " não está no conjunto");
        palavrasUnicas.remove(palavra);
    }
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }
    public void exibirPalavras() {
        this.palavrasUnicas.forEach(System.out::println);
    }
}
