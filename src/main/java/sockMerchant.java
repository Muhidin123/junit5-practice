import java.util.Arrays;

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
        //OR A ONE LINER return n - 1;
        //mathematical induction.
    }




        public static void main(String[] args) {
            int[] tokens = {100,200,300,400};
            int P = 200;
            System.out.println(bagOfTokensScore(tokens, P));
        }



        public static int bagOfTokensScore(int[] tokens, int P) {

            Arrays.sort(tokens);

            if (tokens.length == 0 || P < tokens[0]) return 0;


            int left = 0, right = tokens.length - 1, points = 0;

            while (left <= right) {

                if (P >= tokens[left]) {

                    points++;

                    P -= tokens[left];

                    left++;

                } else {

                    if (right - left > 1) {

                        P += tokens[right];

                        right--;

                        points--;

                    } else break;

                }

            }

            return points;
        }

}



