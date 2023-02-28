import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
    System.out.println("Hi, "+ username+ "!");
   
sc.close();
    }

}
