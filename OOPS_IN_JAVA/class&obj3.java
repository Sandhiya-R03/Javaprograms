/ Write a Java Program to Create a Class named Player with the following member variables/attributes. Create another Class called Main and write a main method to get the player details in a string separated by a comma. Use String. Split() function to display the details.

Sample 1 Input:
MS Dhoni,India,Wicket Keeper 

Sample 1 Output:
Player Details
Player Name: MS Dhoni
Country Name: India
Skill: Wicket Keeper 

Sample 2 Input:
Virat Kholi,India,Batsman 

Sample 2 Output:
Player Details
Player Name: Virat Kholi
Country Name: India
Skill: Batsman

/
  import java.util.Scanner;

    
public class Main
{
    public static void main(String[] args)
    {
        //write your code
        Player p=new Player();
        // p.Player();
        System.out.println("Player Details");
        System.out.println("Player Name : "+p.s0);
        System.out.println("Country Name : "+p.s1);
        System.out.println("Skill : "+p.s2);
    }}
    class Player{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //String s1=sc.nextLine();
        //String s2=sc.nextLine();
        String s0=s.split(",")[0]; 
       String s1=s.split(",")[1];
       String s2=s.split(",")[2];
        
    }
