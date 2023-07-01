/ Keshab Ranjan Banerjee, a senior sports teacher at Dhoni's Jawahar Vidhya Mandhir School, spotted Dhoni when he was goal keeping for a football match.

He got impressed by Dhoni's saves and thought of trying him out behind the stumps for the school's cricket team. In his first meet with Dhoni, Banerjee asked him his name and the game that Dhoni loves to play. Write a program to display Dhoni's reply.

Input and Output Format:
Refer the sample input and output for formatting specifications.
All the text in bold corresponds to input and rest corresponds to output.

Sample Input and Output:
Name:
Dhoni
Game:
Football
My name is Dhoni and I love to play Football

/

  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        //get inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Game:");
        String game = sc.nextLine();
        System.out.println("My name is " + name +" and I love to play "+ game);
        
        
    }
}
