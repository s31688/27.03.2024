public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("abc", "def", "s234234", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student2 = new Student("def", "ghi", "s234234", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student3 = new Student("ghi", "jkl", "s234234", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student4 = new Student("jkl", "mno", "s234234", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student5 = new Student("mno", "pqr", "s234234", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        StudentGroup studentGroup = new StudentGroup("group1", new Student[]{student1, student2, student3,
                student4});
        System.out.println(student1.countAGP());
        studentGroup.addStudent(student5);
        System.out.println(studentGroup.students.length);
        for(int i = 0; i < studentGroup.students.length; i++) {
            System.out.println(studentGroup.students[i]);
        }
    }
}