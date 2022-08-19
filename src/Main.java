public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 45;
        if (a>=100 && b<= 50) {
            System.out.println("1 example: " + 1);
        }
        else {
            System.out.println("1 example: " + 0);
        }



        int A = 100;
        int B = 55;
        if ((A>=100 || B>=100) && (A<=50 || B<=50)) {
            System.out.println("2 example: " + 1);
        }
        else {
            System.out.println("2 example: " + 0);
        }
    }
}