package src.Command;

public class DeleteCommand implements Command{
    private StudentReceiver studentReceiver;
    private Student student;

    public DeleteCommand(StudentReceiver studentReceiver, Student student) {
        this.studentReceiver = studentReceiver;
        this.student = student;
    }
    @Override
    public void execute() {
        this.studentReceiver.removeStudent(student);
    }

    @Override
    public void undo() {
        this.studentReceiver.addStudent(student);
    }
}
