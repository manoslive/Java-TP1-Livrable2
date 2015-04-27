/*
 package Clavardage;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.OutputStreamWriter;
 import java.io.PrintWriter;
 import java.net.Socket;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.swing.JTextArea;

 public class ResterConnecte implements Runnable {
 Panneau panneau = null;
 private final Socket socket;
 JTextArea Input = new JTextArea();

 public ResterConnecte(Socket socket, JTextArea textField, Panneau monPanneau) {
 this.socket = socket;
 Input = textField;
 panneau = monPanneau;
 }

 @Override
 public void run() {
 panneau.ResterConnecte();
 PrintWriter writer = null;
 try {
 writer = new PrintWriter(
 new OutputStreamWriter(
 socket.getOutputStream()));
 String space = " ";
 writer.println(space);
 Input.append(space + "\n");

 } catch (IOException ex) {
 Logger.getLogger(ResterConnecte.class.getName()).log(Level.SEVERE, null, ex);
 }
 try {
 writer.close();
 } catch (Exception e) {
 }
 try {
 socket.close();
 } catch (Exception e) {
 }
                
 }
 }
 */
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
