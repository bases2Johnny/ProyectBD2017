
package File;

public class Ejecutar {
    public void cargarBat(String comando){
        try{
            String linea = "C:\\oraclexe\\app\\oracle\\Bats\\"+comando+".bat";
            Runtime bat = Runtime.getRuntime();
            bat.exec("cmd.exe /K start "+linea);
          
        }
        catch(Exception e){}
    }
}
