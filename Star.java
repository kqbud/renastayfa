package ArifZuhal;

public class Star {
    public static void main(String[] args) {

        for (int r =1; r <= 5; r++) {

            for (int i = 5; i >=r; i--) {

                System.out.print(" ");

            }

            for (int c = 1; c <= r; c++) {

                System.out.print(" *");

            }

            System.out.println();
        }
    }

}