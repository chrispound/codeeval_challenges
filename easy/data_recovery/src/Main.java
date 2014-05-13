import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: p590032
 * Date: 5/13/14
 * Time: 9:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            StringBuilder rebuiltData = new StringBuilder();
            while ((currentLine = reader.readLine()) != null) {
                String[] splitHintAndData = currentLine.split(";");
                ArrayList<String> splitData = new ArrayList(Arrays.asList(splitHintAndData[0].split(" ")));
                ArrayList<String> splitHint = new ArrayList(Arrays.asList(splitHintAndData[1].split(" ")));
                ArrayList<String> holder = new ArrayList<String>();
                for (int f = 0; f < splitData.size(); f++) {
                    holder.add(f, splitData.get(f));
                }
                for (int f = 1; f <= splitHint.size(); f++) {
                    if (!splitHint.contains(String.valueOf(f))) {
                        splitHint.add(String.valueOf(f));
                    }
                }
                for (int f = 0; f < splitHint.size(); f++) {
                    int pos = Integer.parseInt(splitHint.get(f));
                    holder.set(pos - 1, splitData.get(f));
                }
                for (int f = 0; f < holder.size(); f++) {
                    rebuiltData.append(holder.get(f)).append(" ");
                }
                System.out.println(rebuiltData.toString());
                rebuiltData = new StringBuilder();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
