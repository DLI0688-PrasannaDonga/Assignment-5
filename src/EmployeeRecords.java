import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeRecords {
    static int count=0;
    String name;
    int id;
    String department;

    public EmployeeRecords(String name, int id, String department){
       this.name=name;
       this.id=id;
       this.department=department;
    }

    public static void addEmployee(HashMap<Integer, EmployeeRecords> map, Scanner sc, int count){
        System.out.println("Enter employee details : ");
        sc.nextLine();
        System.out.println("Enter name : ");
        String name=sc.nextLine();
        System.out.println("Enter id : ");
        int id=sc.nextInt();
        System.out.println("Enter department : ");
        sc.nextLine();
        String department=sc.nextLine();
        map.put(count, new EmployeeRecords(name, id, department ));
    }


//Searching employee
   public static void searchEmployee(HashMap<Integer, EmployeeRecords> map, Scanner sc){
       System.out.println("Enter the Id of the employee you want to search ");
       sc.nextLine();
       int searchId=sc.nextInt();
       for(Map.Entry<Integer, EmployeeRecords> en:map.entrySet()){
           int key=en.getKey();
           EmployeeRecords d=en.getValue();
           if(d.id==searchId){
               System.out.println(en.getKey()+" : "+d.name+" "+d.id+" "+d.department);
           }


       }
   }


// displaying details
   public static void displayDetails(HashMap<Integer,EmployeeRecords> map){
       System.out.println("Displaying employee details");
       for (Map.Entry<Integer,EmployeeRecords> entry:map.entrySet()){
           EmployeeRecords e=entry.getValue();
           System.out.println(entry.getKey()+" : "+e.name+" "+e.id+" "+e.department);
       }

   }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        HashMap<Integer,EmployeeRecords> map= new HashMap<>();

        do{
            System.out.println("1. Add employee");
            System.out.println("2. Search for employee");
            System.out.println("3. Display details");
            System.out.println("Enter your choice : ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    count++;
                    addEmployee(map,sc,count);
                    break;
                case 2:
                    searchEmployee(map,sc);
                    break;
                case  3:
                    displayDetails(map);
                    break;

            }
            System.out.println("If you want to continue enter y");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
    }
}
