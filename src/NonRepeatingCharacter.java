import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharacter {
    public  static void nonRepeatingCharacter(LinkedHashMap<Character, Integer> map,String str){
        char[] charArr=str.toCharArray();
        for(char c:charArr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);

            }
            else {
                map.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> e:map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey()+ " : "+e.getValue());
                break;
            }

        }

    }

    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        nonRepeatingCharacter(map, str);




    }
}
