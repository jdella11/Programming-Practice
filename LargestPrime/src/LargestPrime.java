public class LargestPrime {
    public static void main (String[] args){
        System.out.println(getLargestPrime(35498747));
    }

    public static int getLargestPrime(int x){
        int c=1;
        if (x>=1) {
            // In order to find largest prime of x we
            // need to start with x-1 as our counter
            // Note: This is by no means the most optimal solution
            for (int i=x-1; i>0; i--) {
                if (x%i==0){
                    return i;
                }
            }
        }

        return x;
    }
}
