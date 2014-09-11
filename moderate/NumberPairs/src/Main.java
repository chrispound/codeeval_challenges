import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: p590032
 * Date: 9/10/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main (String[] args) {
        File file = new File(args[0]);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineArray = line.split(";");
                String[] data = lineArray[0].split(",");
                List<Integer> dataList = new ArrayList<Integer>();
                for(String item: data){
                      dataList.add(Integer.valueOf(item));
                }
                System.out.println(new Main().findSum(dataList, Integer.parseInt(lineArray[1])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String findSum(List<Integer> data, int total) {
        if (data.size() > 0 && total > 0) {
            HashMap<Integer, Integer> hashData = new HashMap<Integer, Integer>();
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer number : data) {
                hashData.put(number, number);
            }
            for (int i = data.size() - 1; i >= 0; i--) {
                int high = hashData.get(data.get(i));
                int low = total - high;

                if (low > 0) {
                    if (low < high && hashData.containsKey(low)) {
                        stringBuilder.append(low).append(",").append(high).append(";");
                    }
                }

            }
            if (stringBuilder.toString().isEmpty()) {
                return "NULL";
            } else {
                stringBuilder.setLength(stringBuilder.length() - 1);
                return stringBuilder.toString();
            }
        } else {
            return "NULL";
        }

    }
}
