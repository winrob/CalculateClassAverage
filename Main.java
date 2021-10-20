/*Ask the user to input 10 grades (using 1 input in the while-loop), calculate the total and
average, and output them.*/


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int total = 0, grade_counter = 1, num_students;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        num_students = input.nextInt();

        while(grade_counter <= num_students){
            System.out.print("Enter a grade: ");
            int grade = input.nextInt();
            total = total += grade;
            grade_counter = grade_counter + 1;
        }
        int average = total / num_students;
        System.out.print("Class average is: " + average + " and the grade total is " + total);
    }
}