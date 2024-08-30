import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        numeracion numeracion = new numeracion();
        //Entrada de datos
        String[] numero = args;
        int[] resultados = new int[numero.length];
        

        try {
            File salidaCSV = new File("outNumRomanos.csv");
            if (!salidaCSV.createNewFile()) {
                System.out.println("el archivo de salida ya existe, sera sobreescrito");
            }
        } catch(IOException e) {
            System.out.println("Ha sucedido un error");
            e.printStackTrace();
        }

        try {
            FileWriter escritorCSV = new FileWriter("outNumRomanos.csv");
            for (int i = 0; i < numero.length; i++) {
                resultados[i] = numeracion.valores(numero[i]);
                
                if (resultados[i] == 0) {
                    System.out.println(numero[i].toUpperCase() + " no es un numero romano valido, sera omitido del archivo CSV");
                    continue;
                }

                System.out.println("El valor de " + numero[i].toUpperCase() + " es: " + resultados[i]);
                escritorCSV.write(numero[i].toUpperCase() + "," + resultados[i] + "\n");
            }
            escritorCSV.close();
        } catch(IOException e) {
            System.out.println("Ha sucedido un error");
            e.printStackTrace();
        }
        
    }
}