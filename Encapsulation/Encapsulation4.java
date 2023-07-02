/ Hall Equality:
The same halls cannot be booked on the same date for two different events. So get the halls booked by two different people and check whether it is the same or not. Use equals method to check all attributes of the hall are equal including the booking date.

Create Hall class with the following private attributes

Attributes              Datatype
name                     String
contactNumber     String
costPerDay            Double
ownerName          String


Include appropriate getters and setters. Create Default and Parameterized Constructor as Hall(String name, String contactNumber, Double costPerDay, String ownerName) for the class. Override equals method that compares all the fields of the class.

Create a driver class named Main to test the above class.

Input Format
Input consists of two sets of hall booking details.
Refer sample input.

Output Format
Output prints whether the booked halls are the same or not.

Sample Input
Benny
9089078654
1000
Dayal
Samir
9789432346
2000
Dev
Sample Output
Halls are different
Sample Input
Benny
9089078654
1000
Dayal
Benny
9089078654
1000
Dayal
Sample Output
Halls are same
/
  //Enter your code
import java.util.Scanner;

class Hall{
    private String name, no, owner;
    private double cost;
    
    Hall(String a, String b, double c, String d){
        name = a;
        no = b;
        cost = c;
        owner = d;
    }
    
    public boolean equals(Object obj){
        if( this == obj){
            return true;
        }

        if (obj instanceof Hall) {
            Hall h = (Hall) obj;
            return (this.cost == h.cost);
        }

        return false;
    }
    
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String b1 = sc.next();
        double c1 = sc.nextDouble();
        String d1 = sc.next();
        
        String a2 = sc.next();
        String b2 = sc.next();
        double c2 = sc.nextDouble();
        String d2 = sc.next();
        
        Hall a = new Hall(a1,b1,c1,d1);
        Hall b = new Hall(a2,b2,c2,d2);
        if(a.equals(b)){
            System.out.println("Halls are same");
        }else{
            System.out.println("Halls are different");
        }
    }
}
