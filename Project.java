import java.util.HashMap;
import java.util.Scanner;

public class Project {
    public static class student{
        public String name;
        public int rollno;
        public int age;
        public int marks;
        public student(String name,int rollno,int age,int marks){
            this.name=name;
            this.rollno=rollno;
            this.age=age;
            this.marks=marks;

        }
        public int display(){return rollno;}
        public void viewStudent(){
            System.out.println("Name: " + name);
            System.out.println("Rollno: " + rollno);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        }
    }
    public class studentData{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            HashMap <Integer,student> map=new HashMap<>();
            while (true){
                System.out.println("1: Add Student");
                System.out.println("2:View Students");
                System.out.println("3:Search student");
                System.out.println("4:Calculate Average Marks");
                System.out.println("5:Exit");
                int Choice = sc.nextInt();
                switch (Choice){
                    case 1:
                            System.out.println("enter your name");
                            String Name= sc.nextLine();
                            System.out.println("enter your rollno");
                            int Roll_No=sc.nextInt();
                            System.out.println("enter your age");
                            int Age= sc.nextInt();
                            System.out.println("enter your marks");
                            int Marks=sc.nextInt();

                            student newStudent = new student(Name, Roll_No, Age, Marks);
                            map.put(Roll_No, newStudent);
                        System.out.println("Student added Successfully.");
                        break;
                    case 2:
                        for(student st: map.values()) {
                            st.viewStudent();
                            System.out.println("-------------------------------");
                        }
                        break;
                    case 3:
                        int roll=sc.nextInt();
                        student data= map.get(roll);
                        if(data != null){
                            data.viewStudent();
                        }else{
                            System.out.println("Student not found");
                        }

                        System.out.println("$%#@!*(&%0");
                        break;
                    case 4:
                        int totalStudent=map.size();
                        int totalMarks=0;
                        for (student j:map.values()){
                            totalMarks=totalMarks+ j.marks;
                        }
                        double avg=(double) totalMarks/totalStudent;
                        System.out.println("Average marks: "+" "+avg);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid error");
                }
            }
        }
    }

}
