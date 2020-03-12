package lecture.chapter8;

import java.util.*;

public class StudentsInContainers {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        Student student1 = new Student(6728, "Franz", "Schmidt", 22);
        Student gabi1 = new Student(4711, "Gabi", "Müller", 23);
        Student gabi2 = new Student(4711, "Gabi", "Müller", 23);

        studentList.add(gabi1);
        studentList.add(student1);
        studentList.add(new Student(8723, "Helena", "Mayer", 23));
        studentList.add(new Student(9182, "Michael", "Franz", 23));
        studentList.add(gabi2);
        studentList.add(student1);

        System.out.println("Studierenden Liste:");
        for(Student student : studentList){
            System.out.println(student);
        }

        Set<Student> setOfStudents = new TreeSet<Student>();

        setOfStudents.addAll(studentList);
        Student heino = new Student(9182, "Heinz", "Heino", 33);
        setOfStudents.add(heino);

        System.out.println("Studierenden Menge:");
        for(Student student : setOfStudents){
            System.out.println(student);
        }


        System.out.println("Gabi1 comparoTo Gabi2 " + gabi1.compareTo(gabi2));
        System.out.println("Gabi1 equals Gabi2 " + gabi1.equals(gabi2));


        Set<Student> setOfStudentsDifferentSort = new TreeSet<Student>(new StudentSortByAgeAndSigns());

        setOfStudentsDifferentSort.addAll(setOfStudents);

        System.out.println("Studierenden Menge (nach Alter):");
        for(Student student : setOfStudentsDifferentSort){
            System.out.println(student);
        }


        System.out.println("Studierenden Liste (sortiert - natürliche Ordnung):");
        Collections.sort(studentList);
        for(Student student : studentList){
            System.out.println(student);
        }

        System.out.println("Studierenden Liste (sortiert - nach Alter):");
        Collections.sort(studentList, new StudentSortByAgeAndSigns());
        for(Student student : studentList){
            System.out.println(student);
        }


        System.out.println("Studierenden Liste (sortiert - Länge der Namen) via innere anonyme Klasse:");

        // innere anonyme Klasse zur Sortierung
        Comparator<Student> sortByNameLength = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getFamilyName() + o1.getName()).length() - (o2.getFamilyName() + o2.getName()).length();
            }
        };

        Collections.sort(studentList, sortByNameLength);

        for(Student student : studentList){
            System.out.println(student);
        }




        System.out.println("Studierenden Liste (sortiert - Länge der Namen) via Lambda:");

        Collections.sort(studentList, (Student o1, Student o2) -> {
            return (o1.getFamilyName() + o1.getName()).length() - (o2.getFamilyName() + o2.getName()).length();
        });

        for(Student student : studentList){
            System.out.println(student);
        }

    }


}
