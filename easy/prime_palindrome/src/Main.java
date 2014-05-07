/**
 * Created with IntelliJ IDEA.
 * User: p590032
 * Date: 5/6/14
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    private static int highestPrimePal;
    public static void main(String[] args) {
               for (int f = 0; f< 1000; f ++){
                   if(isNumberPrime(f)){
                       if(isNumberPalindrome(f)) {
                             highestPrimePal = f;
                       }
                   }
               }
        System.out.println(highestPrimePal);
    }

    private static boolean isNumberPalindrome(int f) {
        String num = String.valueOf(f);
        return (new StringBuffer(num).reverse().toString().equalsIgnoreCase(num));
          //To change body of created methods use File | Settings | File Templates.
    }

    private static boolean isNumberPrime(int f) {
        if(f % 2 == 0) return false;

        for(int i=3;i*i<=f;i+=2) {
            if(f%i==0)
                return false;
        }
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
