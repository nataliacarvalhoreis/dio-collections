package naty.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça
        // 1- Crie uma lista e adicione as sete notas
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        // 2- Exiba a posição da nota 5.0
        System.out.println("Posição da nota 5.0: " + notas.indexOf(5.0));

        // 3- Adicione na lista a nota 8.0 na posição 4
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        // 4- Substitua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        // 5- Confira se a nota 5.0 está na lista
        System.out.println("Nota 5.0 esta na lista? " + notas.contains(5.0));

        // 6- Exiba todas as notas na ordem em que foram informadas
        for (Double nota : notas) {
            System.out.println(nota);
        }

        // 7- Exiba a terceira nota adicionada
        System.out.println("Terceira nota adicionada: " + notas.get(2));

        // 8- Exiba a menor nota
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // 9- Exiba a maior nota
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // 10- Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        // 11- Exiba a média das notas
        System.out.println("Média das notas: " + soma / notas.size());

        // 12- Remova a nota 0
        notas.remove(0d);
        System.out.println(notas);

        // 13- Remova a nota da posição 0
        notas.remove(0);
        System.out.println(notas);

        // 14- Remova as notas menores que 7 e exiba a lista:
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7.0)
                iterator1.remove();
        }
        System.out.println(notas);

        // 15- Apague toda a lista
        notas.clear();

        // 16- Confira se a lista está vazia
        System.out.println("Lista vazia? " + notas.isEmpty());
    }
}
