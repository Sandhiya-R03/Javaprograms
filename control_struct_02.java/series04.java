/ QUESTION:
Write a program to generate the first n terms in the series.

1,2.0,3.0,6.0,9.0,18.0,27.0,.../
  import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
//creating an object for Scanner class
Scanner sc = new Scanner(System.in);
int first = 1;
int n = sc.nextInt();
int gap = 1;
double res = first;
System.out.print(first);
for (int i = 1 ; i < n ; i++){ 
   
   if (i % 2 == 0){
       res+=gap;
       System.out.print(" "+res);
       gap *= 3;
   }
   else{
       res+=gap;
       System.out.print(" "+res);
       
   }
}
}
}
