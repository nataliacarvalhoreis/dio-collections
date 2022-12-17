package naty.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioList {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Informe uma temperatura: ");
            double aux = entrada.nextDouble();
            temperaturas.add(aux);
        }

        System.out.println("--\tTemperaturas Informadas:\t--");
        System.out.println(temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma / 6d;

        System.out.printf("Média das temperaturas: %.2f \n", media);

        Iterator<Double> iterator1 = temperaturas.iterator();
        int count = 0;
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", next);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", next);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", next);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", next);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", next);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", next);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}
