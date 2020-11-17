import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    // greeting
    System.out.println(
        "Hello and welcome everyone! I'm Marcos and I will be your homeroom teacher for the year. Come in, I will assigning you to your seats in just a moment.");
    // starting the scanner
    Scanner scan = new Scanner(System.in);

    String[] studentNames = new String[15];
    int seatNumbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15 };
    for (int a = 0; a <= 14; a++) {
      System.out.println("What is your student's name?");
      studentNames[a]  = scan.next();
     //System.out.println(studentNames[] );
    }
    int count = 0;
    // loop that prints out student names and numbers
    while (count <= 14) {
      System.out.println(studentNames[count] + " is going to sit in sit in seat #" + seatNumbers[count]);
      count++;
    }
  }
}
