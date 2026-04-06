// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 2
// Filename: KnockKnockServer.java (inside knockknock package)

package mte3.knockknock;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class KnockKnockServer {
    public static int PORT = 54322;

    public static void receiveAndSend(Scanner scanner,String message,PrintWriter writer,boolean concat) {
    String received = scanner.nextLine();
        System.out.println("Client: " + received);

        if(concat) {
            writer.println(message + received);
        } else {
            writer.println(message);
        }
        writer.flush();

    } // receiveAndSend() method closed
    
    public static void main(String args[]) throws IOException {
    ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server running on " + InetAddress.getLocalHost());

        Socket socket = serverSocket.accept();

        Scanner scanner = new Scanner(socket.getInputStream());
        PrintWriter writer = new PrintWriter(socket.getOutputStream());

        // Knock knock flow
        writer.println("Knock knock");
        writer.flush();

        receiveAndSend(scanner, "Who's there? ", writer, true);
        receiveAndSend(scanner, "", writer, false);
        receiveAndSend(scanner, "", writer, false);

        socket.close();
        serverSocket.close();
    
    } // main() method closed
}
