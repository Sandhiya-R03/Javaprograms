/ QUESTION:

Dr. Dexter is now in the gas bunk. He has filled fuel with your help and now is about to take an air check. He wants Xinyou to fill air. Dr. Dexter owns a Honda Civic and Xinyou gets to know that the air pressure to be filled in the front tyres is 33 PSI and rear tyres is 32 PSI. 
Write a C program to check if the tyres already have enough air and print whether the tyres have to be deflated, inflated or left untouched. 
  
INPUT FORMAT:
Input consists of 4 lines of floating point numbers, each corresponding to the air pressure in each of the tyres. 
The first line corresponds to the front-left tyre. 
The second line corresponds to the rear-left tyre. 
The third line corresponds to the rear-right tyre. 
The fourth line corresponds to the front-right tyre. 
OUTPUT FORMAT:
Output consists of 4 lines.  
Refer to the sample input and output for formatting specifications.  
SAMPLE INPUT & OUTPUT: 
33 
35 
40 
31 
Front-left : Untouched 
Rear-left : Deflate 
Rear-right : Deflate 
Front-right : Inflate 
/
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		//get vals from user
		Scanner sc=new Scanner(System.in);
		float fl=sc.nextFloat();
		float rl=sc.nextFloat();
		float rr=sc.nextFloat();
		float fr=sc.nextFloat();
		if(fl==33){
		    System.out.println("Front-left : Untouched" );}
		else if(fl>33){
		    System.out.println("Front-left : Deflate");}
		else {
		    System.out.println("Front-left : Inflate");}
//	if(fr==33){
	 //   System.out.println("Front-right : Untouched");}
	  //  else if(fr>33){
	 //       System.out.println("Front-right : Deflate");}
	    //    else{
	    //        System.out.println("Front-right : Inflate");}
	if(rl==32){
	      System.out.println("Rear-left : Untouched");}
	   else if(rl>32){
	          System.out.println("Rear-left : Deflate");}
	          else{
	              System.out.println("Rear-left : Inflate");
	              }
	    
	 if(rr==32){
	     System.out.println("Rear-right : Untouched");}
	     else if(rr>32){
	         System.out.println("Rear-right : Deflate");}
	         else{
	             System.out.println("Rear-right : Inflate");
	         }
	  if(fr==33){
	      System.out.println("Front-right : Untouched");}
	      else if(fr>33){
	          System.out.println("Front-right : Deflate");}
	          else{
	              System.out.println("Front-right : Inflate");}
	          }}
