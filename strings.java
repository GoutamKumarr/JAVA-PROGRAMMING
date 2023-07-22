import java.util.*;
public class strings {
    public static void main(String[]args){
        
       // Scanner sc= new Scanner(System.in);
        //String name= sc.nextLine();
        //System.out.println(name);
/* 
         String firstName ="Goutam";
         String lastName ="kumar";
         String fullName=firstName + " " +lastName;
         //System.out.println(fullName.length());

         //charAt
         for(int i=0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
         }*/
         //SUBSTRING
         /* 
         String sentence=("My name is goutam ");
         //String name= sentence.substring(10,sentence.length());
          String name= sentence.substring(0,4);
         System.out.println(name);
*/
//StringBuilder
/*StringBuilder sb= new StringBuilder("Goutam");
System.out.println(sb);

//char at index 0
System.out.println(sb.charAt(0));
    
//set char at index 0
sb.setCharAt(0,'p');
System.out.println(sb);

sb.insert(2,'p');
System.out.println(sb);

*/

Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
StringBuilder sb=new StringBuilder(name);
for( int i=0;i<sb.length()/2;i++){
    int front=i;
    int back=sb.length()-1-i;
     char frontchar=sb.charAt(front);
     char backchar=sb.charAt(back);

     sb.setCharAt(front,backchar);
     sb.setCharAt(back,frontchar);   
}
System.out.println(sb); 
    }
}




