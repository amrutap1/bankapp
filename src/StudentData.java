import java.util.Arrays;

public class StudentData {

        public static void main(String[] args) {
            Student s1[] = new Student[]{
                    new Student(10, "Amruta", new int[]{10,20,30,40,50,60}),
                    new Student(11, "poonam", new int[]{45,22,30,40,34,78}),
                    new Student(12, "Dhanu", new int[]{34,20,20,40,80,60}),
                    new Student(13, "Deven", new int[]{40,10,30,50,34,30}),
                    new Student(14, "Nishad", new int[]{43,90,10,40,80,70})};

            for (int i=0;i<5;i++) {
                System.out.println(s1[i]);

            }

        }
    }

    class Student{
        int rollNo;
        String name;
        int[] marks;

        int total;

        Student(){

        }

        public Student(int rollNo, String name, int[] marks){
            this.rollNo = rollNo;
            this.name  = name;
            this.marks = marks;
        }

        public int getRollNo() {

            return rollNo;
        }

        public void setRollNo(int rollNo) {

            this.rollNo = rollNo;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int[] getMarks() {
            return marks;
        }


        public void setMarks(int[] marks) {

            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    ", marks=" + Arrays.toString(marks) +
                    '}';
        }


        void calculateTotal()
        {
            int sum=0;
            for (int i=0;i<5;i++){
                total=sum+marks[i];
            }
        }
    }
