import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Intersection {
    public static void intersection(int arr1[], int arr2[]){
        HashMap<Integer,Integer> map= new HashMap<>();
       int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                    map.put(count,arr1[i]);
                }
            }
        }

     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
         System.out.println(entry.getValue());
     }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array list length");
        int n= sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter array1 element");
        for (int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter array2 elements");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
       intersection(arr1,arr2);



    }
}
