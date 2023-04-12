package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp{
    public static void main(String[] args){

        System.out.println("Enter number of new students to enroll");
        Scanner in= new Scanner(System.in);
        int numofStudents = in.nextInt();
        Student[] students=new Student[numofStudents];
        for (int i=0;i<numofStudents;i++){
            students[i]=new Student();
            students[i].enroll();
            students[i].payTuition();

        }
        for(int i=0;i<numofStudents;i++){
            System.out.println(students[i].showInfo());
    }}
}



