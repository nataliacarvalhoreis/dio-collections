package naty.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {

    public static void main(String[] args) {
        // 1- Crie um dicionário que relacione os modelos de carro com seus respectivos
        // consumos
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);

            }
        };
        System.out.println(carrosPopulares.toString());

        // 2- Substitua o consumo do gol por 15,2 km/l
        carrosPopulares.put("gol", 15.2);
        System.out.println("Consumo do gol substituído: ");
        System.out.println(carrosPopulares.toString());

        // 3- Confira se o modelo Tucson está no dicionário
        System.out.println("Tucson está no dicionário? " + carrosPopulares.containsKey("tucson"));

        // 4- Exiba o consumo do uno
        System.out.println("Consumo do Uno: " + carrosPopulares.get("uno"));

        // 5- Exiba o terceiro modelo adicionado
        // não tem como fazer

        // 6- Exiba os modelos
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("Modelos \n" + modelos);

        // 7- Exiba os consumos dos carros
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("Consumos: " + consumos);

        // 8- Exiba o modelo mais ecônimo e seu consumo
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - Consumo:" + consumoMaisEficiente);

        // 9- Exiba o modelo menos eficiente e seu consumo
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

    }
}
