/ A magic square is an arrangement of numbers (usually integers) in a square grid, where the numbers in each row, and in each column, and the numbers in the forward and backward main diagonals, all add up to the same number.

Write a program to find whether a given matrix is a magic square or not.

Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5. 

Output Format:
Print yes if it is a magic square. Print no if it is not a magic square. 

Sample Input 1:
2
4 5
5 4

Sample Output 1:
no

/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int x=0,y=0;
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    x=x+arr[i][j];}}
                    for(int j=0;j<n;j++){
                        if(i==j){
                            y=y+arr[i][j];}}
        }
        if(x==y){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }}}
