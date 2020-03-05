package lecture.chapter8;

import java.util.Comparator;

public class StudentSortByAgeAndSigns implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getAge() - o2.getAge() != 0){
            return o1.getAge() - o2.getAge();
        }

        return o1.getFamilyName().length() - o2.getFamilyName().length();
    }
}
