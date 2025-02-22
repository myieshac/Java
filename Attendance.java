import java.util.Scanner;

class Eligible {
    private int classesHeld;
    private int classesAttended;

    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of classes held: ");
        classesHeld = sc.nextInt();
        
        System.out.print("Enter the number of classes attended: ");
        classesAttended = sc.nextInt();
    }

    public void compute() {
        if (classesHeld == 0) {
            System.out.println("No classes held. Cannot compute attendance.");
            return;
        }

        double percentage = ((double) classesAttended / classesHeld) * 100;

        if (percentage >= 80) {
            System.out.println("Student permitted to appear in the exam.");
        } else {
            System.out.println("Student not permitted to appear in the exam.");
        }
    }
}

public class Attendance {
    public static void main(String[] args) {
        Eligible student = new Eligible();
        
        student.input();
        student.compute();
    }
}