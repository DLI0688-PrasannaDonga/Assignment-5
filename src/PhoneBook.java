import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook{
    static int count=0;

    String name;
    String num;
    public PhoneBook(String name, String num){
        this.name=name;
        this.num=num;
    }
//add contact
    public static void addContact(TreeMap<Integer,PhoneBook> map, Scanner sc, int count ){
        System.out.println("Enter name : ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Enter contact number : ");
        String num=sc.nextLine();
        map.put(count,new PhoneBook(name, num));

    }

//remove contact
    public static void removeContact(TreeMap<Integer, PhoneBook> map,Scanner sc){
        System.out.println("Enter the name you want to remove");
        sc.nextLine();
        String removeName=sc.nextLine();
        for(Map.Entry<Integer, PhoneBook> re:map.entrySet()){
            int key=re.getKey();
            PhoneBook p=re.getValue();
            if(p.name.equals(removeName)){
                map.remove(key);

            }
        }
    }


//search contact

    public static void searchContact(TreeMap<Integer,PhoneBook>map,Scanner sc){
        System.out.println("Enter name to find contact : ");
        sc.nextLine();
        String searchName=sc.nextLine();
        for(Map.Entry<Integer, PhoneBook> en:map.entrySet()){
            int key=en.getKey();
            PhoneBook c=en.getValue();
            if(c.name.equals(searchName)){
                System.out.println(en.getKey()+" : " +c.name+" "+c.num);
            }
        }
    }


// display contacts

    public static void displayContacts(TreeMap<Integer,PhoneBook> map){
        System.out.println("displaying contacts");
        for(Map.Entry<Integer,PhoneBook> entry:map.entrySet()){
            PhoneBook b=entry.getValue();
            System.out.println(entry.getKey()+" : "+b.name+" "+b.num);

        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch;
        TreeMap<Integer,PhoneBook> map=new TreeMap<>();
        do{
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display Contacts");
            System.out.println("Enter your choice : ");
            int res=sc.nextInt();
            switch (res){
                case 1:
                    count++;
                    addContact(map,sc,count);
                    break;
                case 2:
                    removeContact(map,sc);
                    break;
                case 3:
                    searchContact(map,sc);
                    break;
                case 4:
                    displayContacts(map);
                    break;
            }
            System.out.println("You want to continue then Enter y");
            ch=sc.next().charAt(0);

        }

        while(ch=='y' || ch=='Y');

    }
}