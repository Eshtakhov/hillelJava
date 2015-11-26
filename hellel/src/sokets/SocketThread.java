package sokets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by ES on 26.11.2015.
 */
public class SocketThread implements Runnable {
    private Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Socket localSocet = socket) {
            try {


                while (true) {
                    String message = reader.readLine();
                    System.out.println(message);
                }
            } catch (IOException e) {
                System.out.println("disconnect");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
