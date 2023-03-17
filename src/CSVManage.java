import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class CSVManage {

    //Funcion para escribir en un archivo CSV, recibe un nombre de archivo y dos numeros enteros que seran almacenados
    void writeCSV(String file){
        Scanner dato = new Scanner(System.in);
        String equipo1;
        String equipo2;
        int goles1;
        int goles2;
        try {

            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println("id;nombre1;goles1;goles2;nombre2;");

            System.out.println("nombre del equipo 1");
            equipo1 = dato.nextLine();

            System.out.println("numero de goles equipo 1");
            goles1 = dato.nextInt();

            System.out.println("nombre del equipo 2");
            equipo2 = dato.nextLine();
            equipo2 = dato.nextLine();

            System.out.println("numero de goles equipo 2");
            goles2 = dato.nextInt();

            printWriter.println(  "1;" + equipo1 + ";" + goles1 + ";" + goles2 + ";" + equipo2 +  ";2");

            printWriter.flush();
            printWriter.close();

        } catch (IOException e){
            System.out.println(e);
        }
    }

    //Funcion para leer el archivo CSV y mostrar su contenido
    private String linea;
    private String[] partes = null;
    public void readFileCsv(String file) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((linea = bufferedReader.readLine()) != null){
                partes = linea.split(";");
                imprimirLinea();
                System.out.println();
            }

            bufferedReader.close();
            linea = null;
            partes = null;
        } catch (IOException e){
            System.out.println(e);
        }


    }

    public void imprimirLinea(){
        for (int i = 0; i < partes.length; i++){
            System.out.print(partes[i] + " | ");
        }
    }

    //Funcion para leer el archivo CSV y mostrar su contenido solo int

    /* int[] readCSV(String file, int n) throws IOException{
        int[] arr = new int[n];

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        int count = 0;

        while ((line = bufferedReader.readLine()) != null){
            String [] parts = line.split(",");
            int total_parts = parts.length;

            for (int i = 0; i <= total_parts; i++){
                int aux = 0;
                if (1%2 != 0){
                    arr[count] = Integer.parseInt(parts[i]);
                    count++;
                }
            }
        }
        return arr;
    } */

    //Funcion que genera numeros aleatorios
    int randomNumber(){
        Random n_random = new Random();
        int new_number = n_random.nextInt((5000 +1 ) + 1);
        return new_number;
    }
}
