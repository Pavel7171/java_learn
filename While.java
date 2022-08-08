import java.util.Scanner;
public class While {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 5");
        int value = scanner.nextInt();
        while(value!=5){
        System.out.println("insert 5");
        value = scanner.nextInt();
        }
       System.out.println("you insert 5");
        scanner.close();
    }

}
