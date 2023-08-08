import java.util.*;
public class bubblesort {
    //BUBBLE SORTING*******************************************************
    /*public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[] = {7,8,3,1,2};
        //bubble sort
        for(int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    //SWAP
                    int temp  =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }
            }
        }
    printArray(arr);
    }
    
}*/
//SELECTION SORTING*********************************************************
/*
public static void main(String[]args){
    int arr[] = {7,8,3,1,2};
    for(int i=0; i<arr.length;i++){
        int current=arr[i];
        int j=i-1;
        while(j>=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;        
        }
        //placement
        arr[j+1] = current;
        }
        printArray(arr);
    }
@Override
public String toString() {
    return "bubblesort []";
}

}
