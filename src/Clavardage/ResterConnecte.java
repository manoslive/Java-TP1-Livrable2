package Clavardage;

import java.io.PrintWriter;

public class ResterConnecte implements Runnable {

    PrintWriter out = null;

    public ResterConnecte(PrintWriter writerFromPanneau) {
        out = writerFromPanneau;
    }

    @Override
    public synchronized void run() {
        boolean flag = false;
        while (!Thread.interrupted() && !flag) {
            try {
                out.println(" ");
                out.flush();
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                flag = true;
            }
            catch(Exception e)
            {
                
            }
        }
    }
}
