import java.util.Scanner;

public class MyCondition {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a score btw 0 and 100:");
        String number = scan.nextLine();

            /*btw 90 - 100 = A
             *btw 80 - 89 = B
             *btw 70 - 79 = C
             *btw 60 - 69 = D
             *btw 0 -59 = F */

        if(number.equals("21")){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }


     /*   if (number >= 90 && number <= 100) {
            System.out.println("A");
        }
        else if(number >= 80 && number <90){
            System.out.println("B");
        }
        else if(number >= 70 && number <80){
            System.out.println("C");
        }
        else if(number >= 60 && number <70){
            System.out.println("B");
        }
        else{
            System.out.println("F");}*/

        System.out.println("Finished");
    }


}
