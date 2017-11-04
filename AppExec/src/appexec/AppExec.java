package appexec;

import Controller.Controller;

public class AppExec {

    public static void main(String[] args) throws InterruptedException {
        Controller ct = new Controller();
        while (true) {
            ct.execute();
            System.out.print("1");
            Thread.sleep(60000);

        }
    }

}
