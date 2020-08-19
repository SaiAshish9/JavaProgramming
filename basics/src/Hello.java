import java.util.Scanner;

public class Hello {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        boolean hasNextInt=scanner.hasNextInt();
        if(hasNextInt){
            System.out.println("Enter int");
            int year=scanner.nextInt();
            System.out.println(year);
            scanner.nextLine();
            System.out.println("Enter your name:");
            String name=scanner.nextLine();
//        scanner.close();
            System.out.println(name);
            String s="1235";
            System.out.println(Integer.parseInt(s));
            System.out.println("hello world");
            int a= 5;
            int b=8;
            System.out.println(a+b);

        }else{
            System.out.println("error");
        }

        scanner.close();


    }
}
