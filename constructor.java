package constructor:
class Result {

    int resultId;
    int studentId;
    String courseId;
    double internalMarks;
    double externalMarks;
    String grade;

    // Default constructor
    Result() {

        resultId = 0;
        studentId = 0;
        courseId = "Unknown";
        internalMarks = 0;
        externalMarks = 0;
        grade = "F";
    }

    // Parameterized constructor
    Result(int resultId, int studentId, String courseId,
           double internalMarks, double externalMarks) {

        this.resultId = resultId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;

        assignGrade();
    }

    double calculateTotal() {

        return internalMarks + externalMarks;
    }

    void assignGrade() {

        double total = calculateTotal();

        if (total >= 90) {
            grade = "A+";
        } else if (total >= 75) {
            grade = "A";
        } else if (total >= 60) {
            grade = "B";
        } else if (total >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }
    }

    void displayResult() {

        System.out.println("-------------------------");
        System.out.println("Result ID       : " + resultId);
        System.out.println("Student ID      : " + studentId);
        System.out.println("Course ID       : " + courseId);
        System.out.println("Internal Marks  : " + internalMarks);
        System.out.println("External Marks  : " + externalMarks);
        System.out.println("Total Marks     : " + calculateTotal());
        System.out.println("Grade           : " + grade);
        System.out.println("-------------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Result r1 = new Result();

        Result r2 = new Result(
                1,
                101,
                "CS301",
                35,
                55
        );

        r1.displayResult();

        r2.displayResult();
    }
}