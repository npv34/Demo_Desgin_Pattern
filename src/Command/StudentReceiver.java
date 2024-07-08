package src.Command;

import java.util.ArrayList;
import java.util.List;

public class StudentReceiver {
    protected List<Student> students;

    public StudentReceiver() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeStudent(int index) {
        students.remove(index);
    }

    public Student findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(Student student, int id) {
        Student oldStudent = this.findStudent(id);
        if (oldStudent != null) {
            oldStudent.setName(student.getName());
        }
    }


}
