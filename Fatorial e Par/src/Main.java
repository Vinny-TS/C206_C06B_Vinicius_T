public class Main {
        public static void main(String[] args) {
            int n = 5;

            System.out.println(fatorial(n));
            mostraPares(n);
        }
        public static int fatorial(int n){
            if (n == 0 || n == 1)
                return 1;
            else
                return n * fatorial(n - 1);
        };

        public static void mostraPares(int n) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
