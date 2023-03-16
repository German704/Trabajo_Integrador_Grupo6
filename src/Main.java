import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main{
    public static void main(String[] arg) throws IOException {

        CSVManage csvManage = new CSVManage();

        Partido partido1 = partido()[0];
        //csvManage.readFileCsv("primeros_dos_partidos.csv");

        //Creamos el archivo csv y le pasamos los datos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el nombre del archivo");
        String fileName = scanner.nextLine();

        if (!Files.exists(Paths.get(fileName))){
            csvManage.writeCSV(fileName, partido1.getNombreEquipo(1), partido1.getNombreEquipo(2), partido1.getGoles_equipo1(), partido1.getGoles_equipo2(), partido1.getEquipoId(1), partido1.getEquipoId(2));
        }
        csvManage.readFileCsv(fileName);


    }
    public static Partido[] partido(){

        Equipo argentina = new Equipo(
                1,
                "Argentina",
                "Seleccionado"

        );
        Equipo arabiaS = new Equipo(
                2,
                "Arabia Saudita",
                "Seleccionado"

        );
        Equipo polonia = new Equipo(
                3,
                "Polonia",
                "Seleccionado"

        );
        Equipo mexico = new Equipo(
                4,
                "Mexico",
                "Seleccionado"
        );

        Partido partido1 = new Partido(
                1,
                argentina,
                arabiaS,
                1,
                2
        );
        Partido partido2 = new Partido(
                2,
                polonia,
                mexico,
                0,
                0
        );


        Pronostico mariana = new Pronostico(
                1,
                "Mariana",
                partido1,
                argentina.id,
                "GANADOR",
                + 1
        );


        Partido[] partidos = new Partido[2];
        partidos[0] = partido1;
        partidos[1] = partido2;

        return partidos;
    }

}