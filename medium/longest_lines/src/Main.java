import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Chris Pound
 * Date: 5/14/14
 * Time: 4:07 PM
 */
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            Integer number = null;
            ArrayList<String> data = new ArrayList<String>();
            while ((currentLine = reader.readLine()) != null) {
                if (number == null) {
                    number = Integer.valueOf(currentLine);
                } else {
                    data.add(currentLine);

                }

            }

            java.util.Collections.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length();
                }
            });

            for (int i = 0; i < number; i++) {
                System.out.println(data.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
