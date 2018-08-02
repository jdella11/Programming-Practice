public class Perfect_Number {
    public static void main(String[] args) {
        System.out.println(isPerfectNum(33550336));
    }

    public static boolean isPerfectNum(int x){
        if (x<1){
            return false;
        } else {
            int c = 0;

            for (int i = 1; i <= x; i++) {
                if ((x % i == 0) && (i != x)) {
                    c += i;
                } else if ((i == x) && (c == x)) {
                    return true;
                }
            }
        }
        return false;
    }
}
