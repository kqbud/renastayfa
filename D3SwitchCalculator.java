package PracticeWithClassMate;

import java.util.Scanner;

public class D3SwitchCalculator {
    public static void main(String[]aq){
        Scanner mahmut = new Scanner(System.in);
        char ch ='y';
        while(ch == 'y'){

        System.out.println("Enter 2 Double Value");
        System.out.println("Give an option \n 1 for addition \n 2 for subtraction \n 3 for multiplication \n"+
                "4 for division \n 5 for modulus ");
        double a, b;
        a = mahmut.nextDouble();
        b = mahmut.nextDouble();
        System.out.println("Numbers are a=" + a + "\tb=" +b);


        int option;
        option = mahmut.nextInt();

        switch(option) {
            case 1:
                System.out.println("this is case 1");
                System.out.println("a+b=" + (a + b));
                break;
            case 2:
                System.out.println("this is case 2");
                System.out.println("a-b=" + (a - b));
                break;
            case 3:
                System.out.println("this is case 3");
                System.out.println("a*b=" + (a * b));
                break;
            case 4:
                System.out.println("this is case 4");
                System.out.println("a/b=" + (a / b));
                break;
            case 5:
                System.out.println("this is case 5");
                System.out.println("a%b=" + (a % b));
                break;
            default:
                System.out.println("invalid entry");

        }
            System.out.println("Do you wish to continue moruk? y/n");
            ch = mahmut.next().charAt(0);

        }
        System.out.println("O kadar kod yazdik kullancan tabi lalalalelele");
    }
}
