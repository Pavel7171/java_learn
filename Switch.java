import java.util.Scanner;
public class Switch {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);  
      
    System.out.println("insert you age");
    int age = scanner.nextInt();    //String age=scanner.nextLine(if case:text)
    switch(age){
        case 0 :
        System.out.println("you are new people");
        break;
        case 7 :
        System.out.println("you school");
        break;
        case 18 :
        System.out.println("You are not in school");
        break;
        default:
        System.out.println("Ne podhodit nichego");
    }
    scanner.close();
        }
    }
