import java.util.*;


public class revision {
    //public static void main (String[]args){
      //  Scanner sc= new Scanner(System.in);
        //int n=sc.nextInt();
        
        /*int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;

        }
        System.out.println(sum);*/

    

    
    /*int mult=0;
    for(int i=0;i<=10;i++){
     System.out.println(n*i);
    }*/


    /*for(int i=1; i<=n;i++){
        for(int j=1;j<=n;j++){
         System.out.print("*");   
        }
        System.out.println("*");
    }*/

    /*int m=sc.nextInt();
        
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(i==1||j==1||i==n||j==m){
                System.out.print("*");    

            }else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }*/


    /*for(int i=n; i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }*/

    /*for(int i=1; i<=n;i++){
        
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}*/

/*for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
    }
    System.out.println();
}*/
/*int number=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(number+" ");
        number++;
    }
    System.out.println();
}*/

/*for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        int sum=i+j;
        if(sum%2==0){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }
        
    }
    System.out.println();
    
    }*/
    /* 
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=(2*(n-i));j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=(2*(n-i));j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    
    }*/


    /*for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    
    }*/

    /*for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }   
        System.out.println();
    }*/

    /*for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }   
        System.out.println();
    }*/
    /*for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    
    }*/


    /*public static int sumOfTwo(int a, int b){
        int sum=a+b;
        return sum;

        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum= sumOfTwo(a,b);
            System.out.println(sum);
        }*/

//ARRAYS
        /*public static void main(String[]args){
            //int marks[]={97,93,95};
            int marks[]=new int[3];
            marks[0]=97;
            marks[1]=93;
            marks[2]=95;
            for(int i=0;i<3;i++){
                System.out.println(marks[i]);
            }
        }*/
        /*public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int numbers[]=new int[size];
            for(int i=0;i<size;i++){
                numbers[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            // for(int i=0;i<size;i++){ ************size==numbers.length
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==x){
                    System.out.println("x found at index:"+ i);
                }
            }


        */

       /* public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int rows=sc.nextInt();
            int cols=sc.nextInt();
            int numbers[][]=new int[rows][cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    numbers[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }
    }*/


    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int rows=sc.nextInt();
            int cols=sc.nextInt();
            int numbers[][]=new int[rows][cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    numbers[i][j]=sc.nextInt();
                }
            }
            int x=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(numbers[i][j]==x){
                    System.out.print("x found at:"+"("+ i +"," + j +")" );
                }
                System.out.println();
            }
    }

}
}

