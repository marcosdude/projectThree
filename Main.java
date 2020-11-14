import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    // greeting
    System.out.println(
        "Hello and welcome everyone! I'm Marcos and I will be your homeroom teacher for the year. Come in, I will assigning you to your seats in just a moment.");
    // starting the scanner
    Scanner scan = new Scanner(System.in);
    {
      // asking the user for the name
      System.out.println("Who is the 1st student on your list?");
      String student1 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 2nd student on your list?");
      String student2 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 3rd student on your list?");
      String student3 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 4th student on your list?");
      String student4 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 5th student on your list?");
      String student5 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 6th student on your list?");
      String student6 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 7th student on your list?");
      String student7 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 8th student on your list?");
      String student8 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 9th student on your list?");
      String student9 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 10th student on your list?");
      String student10 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 11th student on your list?");
      String student11 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 12th student on your list?");
      String student12 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 13th student on your list?");
      String student13 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 14th student on your list?");
      String student14 = scan.next();
      // asking the user for the name
      System.out.println("Who is the 15th student on your list?");
      String student15 = scan.next();
//string array
      String students[] = { student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14, student15 };
//array for seat numbers
     int seatNumbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15 };
     for(int a = 0; a < 1; a++){
       
         int count = 0;
      //loop that prints ouut student names and numbers   
         while(count <= 14) {
           System.out.println(students[count] + " is going to sit in sit in seat # " + seatNumbers[count]);
         count++;
         
     }
   }
 }
}
}
