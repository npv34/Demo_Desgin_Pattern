package src.Command;

public class AddStudentCommand implements Command{
    private StudentReceiver studentReceiver;
    private Student student;

    public AddStudentCommand(StudentReceiver studentReceiver, Student student) {
        this.studentReceiver = studentReceiver;
        this.student = student;
    }

    @Override
    public void execute() {
        this.studentReceiver.addStudent(student);
    }

    @Override
    public void undo() {
        this.studentReceiver.removeStudent(student);
    }
}
