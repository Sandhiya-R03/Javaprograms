/ Write a Java program to create a class named "Birds" that contains a constructor that prints "Birds : ". Create a class named Parrot, it extends the class Birds. It contains a constructor that prints "Grey Parrot."

Create class named Cocktail, it extends class Parrot. It contains a constructor that prints "Grey Cocktail". Create class named Kiwi, it extends class Cocktail. It contains constructor which prints "Grey Kiwi"..

If the input is "Parrot" call the class Parrot.
If the input is "Cocktail" call the class Cocktail.
If the input is "Kiwi" call the class Kiwi.

Input Format
Input consists of a string.

Output Format
Output consists of a string.
Refer to the sample output for your reference.

Sample Input
Kiwi
Sample Output
Birds : Grey Kiwi
Sample Input
Cocktail
Sample Output
Birds : Grey Cocoktail
/
  import java.util.Scanner;

class Birds{
    Birds(){
        System.out.print("Birds : ");
    }
}

class Parrot extends Birds{
    Parrot(){
        System.out.print("Grey Parrot");
    }
}
class Kiwi extends Birds{
    Kiwi(){
        System.out.print("Grey Kiwi");
    }
}

class Cocktail extends Birds{
    Cocktail(){
        System.out.print("Grey Cocoktail");
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("Kiwi")){
            Kiwi k = new Kiwi();
        }else if(s.equals("Parrot")){
            Parrot p = new Parrot();
        }else{
            Cocktail c = new Cocktail();
        }
    }
}
