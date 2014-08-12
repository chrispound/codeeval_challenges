import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: p590032
 * Date: 8/12/14
 * Time: 9:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        String input = "-10, 2, 3, -2, 0, 5, -15";
//        File file = new File(args[0]);

//            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
//            while ((line = in.readLine()) != null) {
//                largestContiguous(line);
//            }

//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(largestContiguous(input));
    }

    public static int largestContiguous(String input){
        String [] splitInput = input.split(",");
        List<String> stringList = new LinkedList<String>();
        for(String item: splitInput) {
            stringList.add(item.trim());
        }
        List<Integer> parsedItems = new LinkedList();
        for(String item: stringList) {
            parsedItems.add(Integer.valueOf(item));
        }
        //start with first and last.
        int max_ending_here = parsedItems.get(0);
        int max_so_far = parsedItems.get(0);
        //check current plus one until at the end.
        for(int i =1; i < parsedItems.size(); i++){
            if(max_ending_here < 0) {
                max_ending_here = parsedItems.get(i);
            }
            else {
                max_ending_here += parsedItems.get(i);
            }

            if(max_ending_here >= max_so_far) {
                max_so_far = max_ending_here;
            }
        }
        return max_so_far;
    }
}
