package Clavardage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JTextArea;

public class GestionMessages implements Runnable {
        // Attributs de la classe
        private Socket socket;
        JTextArea Input = new JTextArea();
        
        // Constructeur paramétrique
        public GestionMessages(Socket socket, JTextArea textField) {
            this.socket = socket;
            Input = textField;
        }
        @Override
        public void run() {
            boolean commune = true;
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                while (commune) {
                    String text = reader.readLine();
                    Input.append(text + "\n");
                    // Pour quitter la boucle on écrit "bye" à la console
                    if (text.toLowerCase().equals("bye"))
                        commune = false;
                }
            } catch (Exception exp) {
            } finally {
                try {
                    reader.close();
                } catch (Exception e) {
                }
                try {
                    socket.close();
                } catch (Exception e) {
                }
            }
        }
        public static void main(String[] args)
        {
            
        }
    }
