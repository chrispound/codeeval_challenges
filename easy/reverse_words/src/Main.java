import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.isEmpty()) {
                    System.out.println("");
                } else {
                    String[] splitSentence = currentLine.split(" ");
                    for (int f = 0; f < (splitSentence.length / 2); f++) {
                        String lastItemTemp = splitSentence[splitSentence.length - (f+1)];
                        splitSentence[splitSentence.length - (f+1)] = splitSentence[f];
                        splitSentence[f] = lastItemTemp;
                    }
                    for (String aSplitSentence : splitSentence) {
                        System.out.print(aSplitSentence + " ");
                    }
                    System.out.println("");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


