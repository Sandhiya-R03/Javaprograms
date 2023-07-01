/ QUESTION:
Rita, a class mentor brought a new book to the class. She decided to gift this book to the student who finds the number of pages in the book. Help the students to complete this task. Assume that every page in a book is numbered sequentially and that the first page is numbered 1.
A 10-page book puzzle can be solved as, Pages 1 to 9 would require 1 digit each (total 9), and page 10 would require 2 digits. This makes 11 digits. Similarly, a book of 34 pages would require 59 digits.
Each line in the input represents the number of digits used in numbering a book. Output is the number of pages the book has. If the number supplied cannot possibly be valid, display "Impossible!" 
 
INPUT & OUTPUT FORMAT:
Input contains a single integer, between 1 and 2,000,000,000, representing a number of digits used in numbering the pages of a book.
If the input value is valid, output the number of pages in the book. Otherwise, output "Impossible!"
Refer to the sample input and output for formatting specifications.
SAMPLE INPUT & OUTPUT 1:
11 
10  
SAMPLE INPUT & OUTPUT 2:
13 
11  
SAMPLE INPUT & OUTPUT 3:
60 
Impossible! 
/
  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of digits used in numbering the pages: ");
        int digits = scanner.nextInt();
        int pages = findBookPages(digits);
        if (pages == -1) {
            System.out.println("Impossible!");
        } else {
            System.out.println("The book has " + pages + " page(s).");}}
            public static int findBookPages(int digits) {
        int totalPages = 0;
        int currentPage = 1;
        int currentDigits = 0;
        while (currentDigits < digits) {
            int pageDigits = countDigits(currentPage);
            if (currentDigits + pageDigits <= digits) {
                currentDigits += pageDigits;
                totalPages++;
                currentPage++;
            } else {
                return -1;}}
                return totalPages;}
                public static int countDigits(int number) {
        if (number == 0) {
            return 1;}
            int count = 0;
        while (number != 0) {
            count++;
            number /= 10;}
            return count;}}
