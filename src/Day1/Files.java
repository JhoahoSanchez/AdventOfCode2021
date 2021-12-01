
package Day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public final class Files {
    
    //public static int max = 0;
    public static int [] data = new int [2000];
    public static int aux =0;
    
    public static void loadTXT(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        int i = 0;
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                data[i] = Integer.parseInt(lectura);
                lectura = entrada.readLine();
                i++;
                aux = aux+1;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
