import java.util.Scanner;
public class Student {
   // private members
    private int prn;
    private String name;
    private int[] marks;

    // Setter methods
    public void setPRN(int prn) { // set prn
        this.prn = prn;
    }
    public void setName(String name) {  // set name
        this.name = name;
    }
    public void setMarks(int[] marks) {    // set marks
        this.marks = marks;
    }
    // Calculate average marks
    public double calculateAverage() {    
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    // Pass or not pass
    public boolean isPassed() {
        double avg = calculateAverage();

        for (int mark : marks) {
            if (mark <= 40)
                return false;
        }
        return avg > 40;
    }
    
    public void displayResult() {        // Display result
        System.out.println("PRN: " + prn);
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + calculateAverage());

        String result;
        if (isPassed())
            result = "Pass";
        else
            result = "Fail";

        System.out.println("Status: " + result) }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
       
        System.out.print("Enter PRN: ");
        s.setPRN(sc.nextInt());

        sc.nextLine(); 
        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            m[i] = sc.nextInt();
        }

        s.setMarks(m);
        s.displayResult();

    }
}
