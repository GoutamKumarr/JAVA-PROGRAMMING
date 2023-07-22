import java.util.Scanner;

class Main {

    public static void main(String[] args) {

     
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      String name1 = sc.next();
      String name2 = sc.next(); 
      
      
      int sum = num1 +  num2 ;
      String  name = name1 + name2;

      System.out.println(sum);
      System.out.println(name);
    }
  }