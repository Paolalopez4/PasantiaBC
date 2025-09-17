import model.Vuelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Vuelo> vuelos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", sdf.parse("29/08/2021 05:39"), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", sdf.parse("31/08/2021 04:45"), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiero", "Santiago", sdf.parse("30/08/2021 16:00"), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", sdf.parse("29/08/2021 13:22"), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", sdf.parse("31/08/2021 14:05"), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", sdf.parse("31/08/2021 05:20"), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", sdf.parse("30/08/2021 08:45"), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", sdf.parse("29/08/2021 07:41"), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", sdf.parse("30/08/2021 10:35"), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Angeles", "Santiago", sdf.parse("29/08/2021 09:14"), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", sdf.parse("31/08/2021 08:33"), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", sdf.parse("31/08/2021 15:15"), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", sdf.parse("30/08/2021 08:14"), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", sdf.parse("29/08/2021 22:53"), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", sdf.parse("31/08/2021 09:57"), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancun", "Santiago", sdf.parse("31/08/2021 04:00"), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", sdf.parse("29/08/2021 07:45"), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", sdf.parse("30/08/2021 07:12"), 58));
        vuelos.add(new Vuelo("LAT 501", "Paris", "Santiago", sdf.parse("29/08/2021 18:29"), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", sdf.parse("30/08/2021 15:45"), 39));

        //Forma ascendente
        vuelos.sort(Comparator.comparing(Vuelo::getFecha));
        System.out.println("...listado ordenado por fecha llegada ascendente...");
        vuelos.forEach(vuelo -> System.out.println(vuelo.toString()));

        //Ultimo vuelo
        Vuelo ultimo = vuelos.get(vuelos.size() - 1);
        System.out.println("\n\nEl ultimo vuelo en llegar es " + ultimo.getNombre() + ": " + ultimo.getOrigen() + ", aterriza el " + ultimo.getFecha());

        //Vuelo con menor numero de pasajeros
        Vuelo menor = Collections.min(vuelos, Comparator.comparing(Vuelo::getCantidadPasajeros));;
        System.out.println("\n\nEl vuelo con menor numero de pasajeros es " + menor.getNombre() + ": " + menor.getOrigen() + ", con " + menor.getCantidadPasajeros() + " pasajeros");
    }
}