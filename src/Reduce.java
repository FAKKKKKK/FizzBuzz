public class Reduce {
    public static void main(String[] args) {
        int i = 0;
        int n = 100;
        while (n > 0)
         if (n % 2 == 0) {
            n /= 2;
            i++;
         }
         else {
            n -=1;
            i++;
            }
        System.out.println(i);
        }
    }
