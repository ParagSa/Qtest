/**
 * parag
 */
import java.util.*;
public class parag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("1 option");
            System.out.println("2 option");
            System.out.println("3 option");
            System.out.println("4 option");
            System.out.println("5 to exit ");
            choice = sc.nextInt();
            switch(choice)
            { 
                case 1:
                System.out.println("1 called");
                break;
                case 2:
                System.out.println("2 called");
                break;
                case 3:
                System.out.println("3 called");
                break;
                case 4:
                System.out.println("4 called");
                break;
                case 5:
                break;

            }
        }while(choice != 5);
    }
}