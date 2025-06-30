import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstname=input.nextLine();
        System.out.print("Enter your last name:");
        String lastname=input.nextLine();
        System.out.print("Enter your birthyear");
        int birthyear=input.nextInt();
        String yearshort=String.valueOf(birthyear).substring(2);
        Random rand=new Random();
        int randomnum=rand.nextInt(900) + 100;
        //System.out.println(randomnum);
        System.out.println("\nGenerated Usernames:");
        System.out.println("1."+firstname + lastname + birthyear);
        System.out.println("2."+lastname + firstname + yearshort);
        System.out.println("3."+firstname+"_"+lastname.charAt(0)+yearshort);
        System.out.println("4."+firstname.charAt(0) + lastname.charAt(0)+birthyear);
        System.out.println("5."+capitalize(firstname)+capitalize(lastname)+"_"+randomnum);
        
       
        
        
    }
    public static String capitalize(String str){
        if(str==null||str.isEmpty())return str;
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}