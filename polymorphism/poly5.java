/ To Calculate the Perimeter of the Pool Pocket

Akhil has a pool table(8 ball-pool table) and it is rectangular in shape. Akhil wants to calculate the perimeter of the pool table and the perimeter of its pocket. Help him to find out. Create a class with the name PoolTable which has three Public instance variables length, width, and pocketSize which represent the dimensions of the pool table and the size of its pocket. Create a method "calculatePerimeter()" which calculates the perimeter of the pool table and "calculatePerimeter()" which calculates the Perimeter of the pocket.

Input Format
Input consists of 3 values
The first input represents the length of the pool table in meters
The second input represents the width of the pool table in meters
The third input represents the size of the pocket in meters

Output Format
The output consists of two double values
The first output represents the perimeter of the pool table with precision value '1'.
The second output represents the perimeter of the pocket with precision value '1'.

Sample Input
3
4
5
Sample Output
Perimeter of pool table: 14.0 meters
Perimeter of pocket: 34.0 meters
Sample Input
74
50
13
Sample Output
Perimeter of pool table: 248.0 meters
Perimeter of pocket: 300.0 meters/
  import java.util.Scanner;

class PoolTable{
    public static int calculatePerimeter(int l, int w){
        return 2 * (l + w);
    }
    
    public static int calculatePerimeter(int l, int w, int p){
        return 2 * (l+w) +  4 * p;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int p = sc.nextInt();
        
        PoolTable pt = new PoolTable();
        System.out.println("Perimeter of pool table: "+pt.calculatePerimeter(l , w) + ".0 meters");
        System.out.println("Perimeter of pocket: "+ pt.calculatePerimeter(l,w,p) + ".0 meters");
    }
}
