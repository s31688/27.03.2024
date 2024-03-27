public class Student {
    public String fName;
    public String lName;
    public String indexNumber;
    public String email;
    public String address;
    public double[] grades;

    public Student(String fName, String lName, String indexNumber, String email, String address, double[] grades) {
        this.fName = fName;
        this.lName = lName;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public double countAGP() {
        double sum = 0.0;
        try {
            for (double i : grades) {
                sum += i;
            }
            sum /= grades.length;
        } catch (IllegalArgumentException e) {
            System.out.println("No marks found. Invalid student");
            e.printStackTrace();
        }
        return Math.round(sum*100)/100.0;
    }
}