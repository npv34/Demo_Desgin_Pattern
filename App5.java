import src.Command.*;

public class App5 {
    public static void main(String[] args) {

        StudentReceiver studentReceiver = new StudentReceiver();
        Student student1 = new Student("John Doe");
        StudentInvoker studentInvoker = new StudentInvoker();

        AddStudentCommand addStudentCommand = new AddStudentCommand(studentReceiver, student1);
        studentInvoker.setCommand(addStudentCommand);
        studentInvoker.executeCommand();

        DeleteCommand deleteCommand = new DeleteCommand(studentReceiver, student1);
        studentInvoker.setCommand(deleteCommand);
        studentInvoker.executeCommand();

    }
}
