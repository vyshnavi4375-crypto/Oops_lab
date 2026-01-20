import java.util.Scanner;

public class StudentAttendanceDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalStudents;
        int present = 0;
        int absent = 0;
        int i = 1;

        System.out.print("Enter total number of students: ");
        totalStudents = sc.nextInt();

        do {
            System.out.print("Is student " + i + " present? (1 = Present, 0 = Absent): ");
            int status = sc.nextInt();

            if (status == 1) {
                present++;
                i++;
            } else if (status == 0) {
                absent++;
                i++;
            } else {
                System.out.println("Invalid input! Enter only 1 or 0.");
            }

        } while (i <= totalStudents);

        System.out.println("\n--- Attendance Report ---");
        System.out.println("Total Students : " + totalStudents);
        System.out.println("Present        : " + present);
        System.out.println("Absent         : " + absent);

        sc.close();
    }
}
