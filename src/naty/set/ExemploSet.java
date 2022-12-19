package naty.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        // Exercícios usando a biblioteca Set. IMPORTANTE: o Set não permite adicionar
        // itens duplicados e também não insere os elementos na ordem dada.
        // 1- Criar uma lista com sete notas de alunos
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8. / 5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Conjunto de notas: " + notas);

        // 2- Exiba a posição da nota 5.0
        // não tem como resolver, porque no set não conseguimos ter a posição dos
        // elementos.

        // 3- Adicione a lista a nota 8.0 na posição 4
        // não consigo trabalhar com posições dentro do set!

        // 4- Substitua a nota 5.0 pela nota 6.0
        // não consigo substituir um item especifico quando uso o set.

        // 5- Confira se a nota 5.0 esta no conjunto
        System.out.println("Nota 5.0 está no conjunto: " + notas.contains(5d));

        // 6- Exiba a terceira nota adicionada
        // não consigo resolver, pois não existe metodos pra isso

        // 7- Exiba a menor nota
        System.out.println("Menor nota: " + Collections.min(notas));

        // 8- Exiba a maior nota
        System.out.println("Maior nota: " + Collections.max(notas));

        // 9- Exiba a soma dos valores:
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        // 10- Exiba a média das notas:
        System.out.println("Média das notas: " + (soma / notas.size()));

        // 11- Remova a nota 0.0
        notas.remove(0d);
        System.out.println(notas);

        // 12- Remova a nota da posição 0
        // não tem como trabalhar com indices

        // 13- Remova as notas menores que 7 e exiba a lista
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println("Nova lista: " + notas);

        // 14- Exiba todas as notas na ordem em que foram informadas
        // não tem como

        // 15- Exiba todas as notas na ordem crescente
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8. / 5, 9.3, 5d, 7d, 0d, 3.6));
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Notas em ordem crescente: " + notas3);

        // 16- Apague todo o conjunto
        notas.clear();
        System.out.println(notas);
    }
}
