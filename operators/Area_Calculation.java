/ QUESTION:

Sheela has three things in her bag. She wants to compute the area of 3 things but 3 things are in different shapes. The three things are in square shape, rectangular shape, and circular shape respectively. 

Write a program to help Sheela to calculate the area of different shapes.

Input format:
First input: a side of a square in integer

Second input: length of a rectangle in integer

Third input: breadth of a rectangle in integer

Fourth input: radius of a circle in float

Output format:

The first output should be the area of a square in integer

The second output should be the area of a rectangle in integer

The third output should be the area of a circle in float with 2 decimal places

Sample Input:

5

5

4

2.0

Sample Output:

25

20

12.56 /
  import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
        //get vals of inputs from to find areas
        double e=3.14;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float d=sc.nextFloat();
        System.out.println(a*a);
        System.out.println(b*c);
        System.out.println(e*(d*d));
    }
}
