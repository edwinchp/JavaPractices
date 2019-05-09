package ExternalPractices;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BRReadLines {

    public static void main(String args[]) throws Exception{

        readLines("HA");
        readLines("STOP");

    }

    private static void readLines(String wordToStop) throws Exception{
        InputStream inputStream = System.in;
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        String inputText;

        System.out.println("Enter \"" + wordToStop + "\" to stop the loop :)");
        do{
            inputText = bufferedReader.readLine();
            if(!wordToStop.equals(inputText)){
                System.out.println("You entered: \"" + inputText + "\" and it's wrong, try again:");
            }

        }while (!inputText.equals(wordToStop));

        System.out.println("Finally :D");
    }
}
