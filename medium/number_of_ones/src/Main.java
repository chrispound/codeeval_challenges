import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: p590032
 * Date: 5/8/14
 * Time: 10:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    private static String currentLine;
    private static String number;

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while ((currentLine = br.readLine()) != null) {
                System.out.println(recursiveOneCount(Integer.toBinaryString(Integer.parseInt(currentLine))));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static int recursiveOneCount(String data) {
        if (data.isEmpty()) {
            return 0;
        } else {

            if (data.charAt(0) == '1') {
                return recursiveOneCount(data.substring(1)) + 1;
            }

            return recursiveOneCount(data.substring(1));
        }
    }


}
