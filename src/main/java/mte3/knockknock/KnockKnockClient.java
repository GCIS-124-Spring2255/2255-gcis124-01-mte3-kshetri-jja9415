// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 2
// Filename: KnockKnockClient.java (inside knockknock package)

package mte3.knockknock;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class KnockKnockClient {
    public static int PORT = 54322;
    public static String SERVER = "localhost";

    public static void sendAndReceive(PrintWriter writer, String message, Scanner scanner) {
        
        writer.println(message);
        writer.flush();

        String response = scanner.nextLine();
        System.out.println("Server: " + response);

    } // sendAndReceive() method closed
    

    public static void joke(String who,String punchLine) throws IOException {
    
        Socket socket = new Socket(SERVER, PORT);

        Scanner scanner = new Scanner(socket.getInputStream());
        PrintWriter writer = new PrintWriter(socket.getOutputStream());

        // Receive "Knock knock"
        System.out.println("Server: " + scanner.nextLine());

        // Send "who"
        sendAndReceive(writer, who, scanner);

        // Send punchline
        sendAndReceive(writer, punchLine, scanner);

        socket.close();

    } // joke() method closed

    public static void main(String[] args) throws IOException {

        String[][] jokes = {{"Tank","You're welcome!"},
                            {"Nobel","Nobel...that's why I knocked!"},
                            {"Says","Says me!"},
                            {"Hawaii","I'm good. Hawaii you?"},
                            {"Lettuce","Lettuce in, it's cold out here!"},
                            {"Cow says","No, a cow says moooooo!"},
                            {"Otto","Otto know. I forgot."}
                        };
        int i = new Random().nextInt(jokes.length);
        joke(jokes[i][0],jokes[i][1]);

    } // main() method closed

    // hint: please run KnockKnockServer first and then run KnockKnockClient

} // KnockKnockClient { } class closed
