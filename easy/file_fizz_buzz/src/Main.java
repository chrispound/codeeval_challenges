import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            while((currentLine = br.readLine()) != null){
                   String[] splitLine = currentLine.split("\\s+");
                evaluateFizzBuzz(splitLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

       private static void evaluateFizzBuzz(String[] data) {
           int A = Integer.parseInt(data[0]);
           int B = Integer.parseInt(data[1]);
           int N = Integer.parseInt(data[2]);
           for(int f =1; f <= N; f++){
               if(f % A == 0){
                   if  (f % B == 0){
                       System.out.print(" FB");
                   }
                   else{
                       System.out.print(" F");
                   }
               }
               else if  (f % B == 0){
                   System.out.print(" B");
               }
               else {
                   System.out.print(" " + f);
               }
           }
           System.out.println("");
       }
}
