package File;

import java.io.*;

public class File {

    public void write(String texto,String name,String dir) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("C:\\oraclexe\\app\\oracle\\"+dir+"\\"+name);
            pw = new PrintWriter(fichero);
                pw.println(texto);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
