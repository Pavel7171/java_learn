import java.util.Scanner;
public class Input {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("insert text or number");
    //    String string = s.nextLine(); //text
 //   System.out.println("you insert "+string); //text
        int x = s.nextInt();
        System.out.println("you insert "+x);
        s.close();
        }
}
