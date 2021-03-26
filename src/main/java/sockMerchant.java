import org.junit.Assert;

import java.util.HashMap;
import java.util.Scanner;

public class sockMerchant {

    public static void main(String[] args) {
        sockMerchant test = new sockMerchant();
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        HashMap<Integer, Integer> colors = new HashMap<>();
//
//        while(n-- > 0) {
//            int c = scan.nextInt();
//
//            // If new color, add to map
//            // Increment frequency of existing color
//            colors.merge(c, 1, Integer::sum);
//        }
//        scan.close();
//
//        // Count and print the number of pairs
//        int pairs = 0;
//        for(Integer frequency : colors.values()) {
//            pairs += frequency >> 1;
//        }
//
//        System.out.println(pairs);

        System.out.println(test.numberOfMatches(14));
    }



    public int numberOfMatches(int n) {
        int matches = 0;
        while (n > 0){
            if(n == 2) {
                matches += 1;
                break;
            } else if(evenOrOdd(n)){
                n = n / 2;
                matches += n;
            } else{
                n = ((n - 1) / 2) + 1;
                matches += n - 1;
            }
        }
        return matches;
    }

    public boolean evenOrOdd(int n) {
        boolean status = false;
        if (n % 2 == 0) {
            status = true;
        }
        return status;
    }


    //OR A ONE LINER return n - 1;
    //mathematical induction.
}
