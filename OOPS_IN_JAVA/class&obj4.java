/  Write a Java program to Create a class named Innings with the following public member variables / Attributes. Include a method in the class named displaylnningsDetails.In This method, display The details of The innings in The format shown in The sample output. This method does not accept any arguments and its return type is void.

Create another class named Main and write a main method to test the above class.

Input Format
The First line Consists of a String
The Second line consists of a String that represents battingTeam
The next Line consists of a Long that represents how many runs scored 

Output Format
The Output Should display the InningsDetails 

Sample 1 Input:
First Innings
CSK
190

Sample 1 Output:
Innings Details
Innings number: First Innings
Batting Team : CSK
Runs scored :190 

Sample 2 Input:
Second Innings
RCB
195 

Sample 2 Output:
Innings Details
Innings number: Second Innings
Batting Team : RCB
Runs scored :195

/
  import java.util.Scanner;
class Innings{
    public void displayInningsDetails(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int n=sc.nextInt();
        System.out.println("Innings Details");
        System.out.println("Innings number : "+s);
        System.out.println("Batting Team : "+s1);
        System.out.println("Runs scored : "+n);
    }
}
class Main
{
    public static void main(String[] args)
    {
        //write your code
        Innings i=new Innings();
        i.displayInningsDetails();
    }
}
