public class StudentNode {
    String name;
    String course;
    int credit;
    double grade;
    double cgpa;
    StudentNode next;

    public StudentNode(String name, String course, int credit, double grade, double cgpa) {
        this.name = name;
        this.course = course;
        this.credit = credit;
        this.grade = grade;
        this.cgpa = cgpa;
        this.next = null;
    }
}
