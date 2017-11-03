package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static javax.script.ScriptEngine.FILENAME;
import model.Servidor;

public class TNSNames {

    public static void appendConexion(Servidor sc) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String data = " This is new content";

            File file = new File(PATH);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("Done");
        } catch (IOException e) {
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static String PATH = "C:\\oraclexe\\app"
            + "\\oracle\\product\\11.2.0\\server\\"
            + "network\\ADMIN\\tnsnames.ora";
}
