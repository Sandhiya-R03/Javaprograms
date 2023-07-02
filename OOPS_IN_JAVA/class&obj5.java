/ Create a class named Innings with The following private member variables/attributes

Include a 2-argument Argument Constructor in This Class. The arguments passed To The constructor are in This order --- battingTeam, runs. Include a default, empty constructor. Include appropriate getters and setters.

[Naming Convention:
getters : getBattingTeam getRuns
setters : setBattingTeam, setRuns...]

Create another class named Main and include a main method To test The above class(print The Output in Main Class).

Use an array of objects To read innings details. It includes the first innings and second innings 

Input Format
The Input Consists of String and Long 

Output Format
The Output should display the Innings Details 

Sample 1 Input:
RCB
190
CSK
188 

Sample 1 Output:
Innings 1 Details
BattingTeam : RCB
Runs scored : 190
Innings 2 Details
BattingTeam : CSK
Runs scored : 188 

Sample 2 Input:
CSK
230
RR
145 

Sample 2 Output:
Innings 1 Details
BattingTeam : CSK
Runs scored : 230
Innings 2 Details
BattingTeam : RR
Runs scored : 145/
  import java.util.Scanner;

class Innings{
    String name;
    String runs;
    
    public void setBattingTeam(String n){
        this.name = n;
    }
    public void setRuns(String r){
        this.runs = r;
    }
    
    public String getBattingTeam(){
        return name;
    }
    public String getRuns(){
        return runs;
    }
    
    Innings(String n, String r){
        setBattingTeam(n);
        setRuns(r);
        System.out.println("BattingTeam : "+getBattingTeam());
        System.out.println("Runs scored : "+getRuns());
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String r1 = sc.nextLine();
        
        String n2 = sc.nextLine();
        String r2 = sc.nextLine();
        
        System.out.println("Innings 1 Details");
        Innings inn1 = new Innings(n1, r1);
        System.out.println("Innings 2 Details");
        Innings inn2 = new Innings(n2,r2);
        
    }
}
