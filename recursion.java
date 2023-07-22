import java.util.*;
public class recursion {
    //print numbers from 5 to 1**********************************************************8
    /*public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String[]args){
        int n=5;
        printNumber(n);
    }
}*/
//print numbers from 1to 5*********************************************************
/*public static void printNumber(int n){
    if(n==6){
        return;
    }
    System.out.println(n);
    printNumber(n+1);
}
public static void main(String[]args){
    int n=1;
    printNumber(n);
}
}*/
//print sum of first n natural number**********************************************
/*public static void printNumber(int i, int n ,int sum){
    if(i==n){
        sum +=i;
        System.out.println(sum);
        return;
    }
    sum += i;
    printNumber(i+1, n ,sum);
    //System.out.println(i);
   
}
public static void main(String[]args){

    printNumber(1,5,0);
}
}*/
//print factorial of number*************************************************************
/*public static int factorial(int n){
    if(n==1||n==0){
        return 1;
    }
    int factorialn=factorial(n-1);
    int factorialm=n*factorialn;
    return factorialm;

} 
public static void main(String args[]){
    int n=5;
    System.out.println(factorial(n));

    }
}*/

//print the fibonacci sequence till nth term*******************************************
/*public static void fibonacci(int a,int b,int n){
    if(n==0){
        return;
    }
    int c=a+b;
    System.out.print(c);
    fibonacci(b,c,n-1);
}
public static void main (String args[]){
    int a=0;
    int b=1;
    System.out.print(a);
    System.out.print(b);
    int n=7;
    fibonacci(a,b,n-2);

    }
}*/

//print x power of n(stack height =n)

/*public static int calcpower(int x,int n){
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
    int powerm=calcpower(x,n-1);
    int power_m=x*powerm;
    return power_m;
}
public static void main (String args[]){
    int x=2;
    int n=5;
    System.out.println(calcpower(x,n));
     
    }
}*/

//print x to the power n(stack height =logn)

public static int calcpower(int x,int n){
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
    if(n%2==0){
        return calcpower(x,n/2)*calcpower(x,n/2);
    }
    else{
        return calcpower(x,n/2) * calcpower(x,n/2) * x;
    }
}
public static void main (String args[]){
    int x=2;
    int n=5;
    System.out.println(calcpower(x,n));
     
    }
}
