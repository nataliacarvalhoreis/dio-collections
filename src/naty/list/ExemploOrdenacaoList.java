package naty.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        /*
         * 1 - Dadas as seguintes informações sobre os meus gatos, crie uma Lista
         * e ordene a lista exibindo: (nome-idade-cor)
         * 
         * Gato 1 = nome: Jon, idade: 18, cor: preto
         * Gato 2 = nome: Simba, idade: 6, cor: tigrado
         * Gato 3 = nome: Jon, idade: 12, cor: amarelo
         */

        List<Gato> meusGatos = new ArrayList<>() {
            {
                add(new Gato("Jon", 18, "preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Jon", 12, "amarelo"));
            }
        };

        // 2- Mostre os gatos pela ordem de inserção
        System.out.println("--\tOrdem de Inserção:\t--- ");
        System.out.println(meusGatos);

        // 3- Mostre os gatos em ordem aleatória
        System.out.println("--\tOrdem Aleatória:\t--- ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // 4- Mostre os gatos em ordem natural, para isso é necessário implementar a
        // classe Comparable e sobrescrever o metodo CompareTo
        System.out.println("--\tOrdem Natural(Nome):\t--- ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        // 5- Ordem de idade
        System.out.println("--\tOrdem Idade:\t--- ");
        Collections.sort(meusGatos, new ComparatorIdade());
        // meusGatos.sort(new ComparatorIdade()); TAMBÉM FUNCIONA
        System.out.println(meusGatos);

        // 6- Ordem de cor
        System.out.println("--\tOrdem Cor:\t--- ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        // 7- Ordem Nome/Cor/Idade
        System.out.println("--\tOrdem Nome/Cor/Idade:\t--- ");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{nome=" + nome + ", idade=" + idade + ", cor=" + cor + "}";
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0)
            return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0)
            return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}