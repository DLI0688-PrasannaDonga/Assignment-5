import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class DuplicateElements {
    public static void duplicateElements(int arr[]){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int m:arr){
            if(map.containsKey(m)){
                map.put(m,map.get(m)+1);
            }
            else{
                map.put(m,1);
            }
        }

           for(Map.Entry entry:map.entrySet()){
               System.out.println(entry.getKey()+" : "+entry.getValue());


        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n= sc.nextInt();
         int[] arr= new int[n];
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();

         }
         duplicateElements(arr);


    }

}
