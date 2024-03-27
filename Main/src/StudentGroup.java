public class StudentGroup {
    public String name;
    public Student[] students;

    public StudentGroup(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public boolean isInGroup(Student student) {
        for (Student i : students) {
            if (i == student) {
                return true;
            }
        }
        return false;
    }

    public Student[] addStudent(Student student) {
        Student[] studentsNew = new Student[students.length];
        try {
            if(students.length < 15 && !isInGroup(student)) {
                studentsNew = new Student[students.length + 1];
                for(int i = 0; i < students.length; i++) {
                    studentsNew[i] = students[i];
                }
                studentsNew[students.length-1] = student;
                students = studentsNew;
            }
        } catch (IllegalStateException e) {
            if (students.length >= 15) {
                System.out.println("To many students in that group. Student can't be added");
            }
            if(isInGroup(student)) {
                System.out.println("Student already added");
            }
            e.printStackTrace();
        }
        return studentsNew;
    }
}