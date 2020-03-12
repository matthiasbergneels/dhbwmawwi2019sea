package lecture.chapter8;

import java.util.Comparator;

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

    /*
    @Override
    public boolean equals(Object o){
        // alias check
        if(this == o){
            return true;
        }

        // not null
        if(o == null){
            return false;
        }

        // typ check
        if(this.getClass() != o.getClass()){
            return false;
        }

        // compare attributes
        Student s = (Student)o;

        if(this.getStudentId() != s.getStudentId()){
            return false;
        }

        if(!this.getFamilyName().equals(s.getFamilyName())){
            return false;
        }

        return this.getName().equals(s.getName());
    }

    public int hashCode(){
        return this.getStudentId() ^ this.getFamilyName().hashCode() ^ this.getName().hashCode();
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (!name.equals(student.name)) return false;
        return familyName.equals(student.familyName);
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + name.hashCode();
        result = 31 * result + familyName.hashCode();
        return result;
    }
}
