import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File(args[0]);
        String line;
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            while ((line = in.readLine()) != null) {
                String[] splitInput = line.split(" ");
                if (splitInput.length > 0) {
                    List<String> data = new ArrayList<String>();
                    for (int f = 0; f < splitInput.length - 2; f++) {
                        data.add(splitInput[f]);
                    }
                    Integer m = Integer.parseInt(splitInput[splitInput.length - 1]);
                    if (m < data.size()) {
                        mthElement(data, m);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mthElement(List<String> data, int m) {
        System.out.println(m);
        for(String item: data){
            System.out.print(item + " ");
        }
        int pointer = 0;
        for (int i = data.size() -1; i >= 0 && m > 0; i--, m--) {
            pointer = i;
        }
        System.out.println(data.get(pointer));
    }
}