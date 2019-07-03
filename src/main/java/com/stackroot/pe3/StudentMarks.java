package main.java.com.stackroot.pe3;

public class StudentMarks {
    //To check for the students grade
        public static String checkingTheStudentGrades(int numOfStudents,int[] grades)
        {
            int count=0;
            for(int i=0;i<numOfStudents;i++)
            {
                if(grades[i]>=0 && grades[i]<=100)
                    count++;
            }
            if(count==numOfStudents)
                return "grades are checked with no errors";
            else
                return "grades should be between 0 and 100";
        }

    }
