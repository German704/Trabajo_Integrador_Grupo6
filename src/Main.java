import java.io.IOException;

public class Main{
    public static void main(String[] arg) throws IOException {
        //equipos();

        //Funcion para main
        CSVManage csvManage = new CSVManage();


        csvManage.writeCSV("file.csv");


        //csvManage.readFileCsv("primeros_dos_partidos.csv");
        csvManage.readFileCsv("file.csv");

    }
    public static void equipos(){
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

        /* argentina.getData();
        arabiaS.getData();
        polonia.getData();
        mexico.getData(); */

        Partido partido1 = new Partido(
                1,
                argentina.id,
                arabiaS.id,
                1,
                2
                );
        Partido partido2 = new Partido(
                2,
                polonia.id,
                mexico.id,
                0,
                0
        );

        //partido1.getData();
        //partido2.getData();

        Pronostico mariana = new Pronostico(
                1,
                "Mariana",
                partido1,
                argentina.id,
                "GANADOR",
                + 1
        );

        mariana.getData();
    }
}