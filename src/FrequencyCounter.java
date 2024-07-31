import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void frequencyCounter(String str){
        HashMap<Character, Integer> map= new HashMap<Character,Integer>();
        char[] charArray=str.toCharArray();
        for(char c:charArray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
    for(Map.Entry entry :map.entrySet()){
        System.out.println(entry.getKey() +" : "+entry.getValue());
    }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String str=sc.nextLine();
        frequencyCounter(str);


    }
}