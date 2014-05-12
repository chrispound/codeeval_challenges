import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: p590032
 * Date: 5/12/14
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    private static int[] ONE_DIGIT_PRIMES = {2, 3, 5, 7};
    private static HashMap<ArrayList<String>, ArrayList<String>> permutationsOfUgly;

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[1]));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (Math.pow(3, currentLine.length() - 1) >= 1) {
                    ArrayList<ArrayList<String>> stringPermutations = new ArrayList<ArrayList<String>>();
                    new ArrayList<String>().add(currentLine);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void generatePermutations(String point, ArrayList<String> str) {
        for(String currentString: str){
            //check all permutations and if it is an ugly number
        }
//        int n = str.length();
//         if(str.length() == 0){
//             ArrayList<String> individual = new ArrayList();
//             for(int i = 0; i < prefix.length(); i++){
//                individual.add(String.valueOf(prefix.charAt(i)));
//             }
//             permutations.put(individual, individual);
//         }
//        else{
//
//            for (int i = 0; i < n; i++) {
//                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
//            }
//         }

    }

      private static int generateAllPermutationsOfEquation(ArrayList<String> nums){
            return 0;
      }

    private static boolean isNumberUgly(int num) {
        for (int div : ONE_DIGIT_PRIMES) {
            if (num % div == 0) {
                return true;
            }
        }
        return false;
    }
}
