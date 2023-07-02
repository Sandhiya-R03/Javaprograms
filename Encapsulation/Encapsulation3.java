/ Player Details:
Create a class ‘Player’ in which all the fields are declared private.

Attributes are as follows:
String pName; 
int pAge; 
String gameType; 

Note: Use public setter and getter methods to set and read the value of the attributes.

Input Format
The first input (string) represents the player's name.
The second input (integer) represents the player's age.
The third input (string) represents the game type of a player.

Output Format
Refer sample output.

Sample Input
Dhoni
40
Cricket
Sample Output
Player's Name: Dhoni
Player's Age: 40
Player's Gametype: Cricket
/
  //Enter your code
import java.util.Scanner;

class Player{
    private String name, game;
    private int age;
    
    public void set(String a, int b, String c){
        name = a; age = b; game = c;
    }
    public void get(){
        System.out.printf("Player's Name: %s\nPlayer's Age: %d\nPlayer's Gametype: %s",name,age,game);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player p = new Player();
        
        String a = sc.nextLine();
        int b = sc.nextInt();
        String c = sc.next();
        
        p.set(a,b,c);
        p.get();
    }
}
