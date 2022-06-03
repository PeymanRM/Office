package validators;

public class EmployeeInputException extends Exception {
    public EmployeeInputException(String msg) {
        super(msg);
    }

    public EmployeeInputException() {
    }
}