package lecture.chapter8;

public class Student implements Comparable<Student>{
    private int studentId;
    private String name;
    private String familyName;
    private int age;

    public Student(int studentId, String name, String familyName, int age) {
        this.studentId = studentId;
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.studentId  + ": " + this.familyName + ", "
                + this.name + "; " + this.age
                + " (" + super.toString() + ")";
    }

    @Override
    public int compareTo(Student student) {

        if(this.studentId - student.studentId != 0){
            return this.studentId - student.studentId;
        }

        if(this.familyName.compareTo(student.familyName) != 0){
           return this.familyName.compareTo(student.familyName);
        }

        return this.name.compareTo(student.name);

    }
}
