

class Student {
    private int studentID;
    private String studentName;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(int studentID, String studentName, double grade1, double grade2, double grade3) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double getAverage() {
        return (grade1 * 0.4 + grade2  * 0.4 + grade3 * 0.2) / 3;
    }

    public void printStudent() {
        System.out.println("ID do estudante: " + studentID);
        System.out.println("Nome do estudante: " + studentName);
        System.out.println("Nota 1: " + grade1);
        System.out.println("Nota 2: " + grade2);
        System.out.println("Nota 3: " + grade3);
        System.out.println("Média: " + getAverage());
    }

}
