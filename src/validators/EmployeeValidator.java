package validators;

import models.entities.EmployeeEnti;

import java.util.regex.Pattern;

public class EmployeeValidator extends EmployeeEnti {

    public void validateInputs() throws Exception {
        //Name
        if (getName().length() < 3) throw new EmployeeInputException("Entered name is too short!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getName())) throw new EmployeeInputException("Invalid name!");

        //Father's Name
        if (getFatherName().length() < 3) throw new EmployeeInputException("Entered ّfather's name is too short!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getFatherName())) throw new EmployeeInputException("Invalid father's name!");

        //Age
        if (getAge() < 0) throw new EmployeeInputException("Invalid age!");
        if (getAge() < 18) throw new EmployeeInputException("You're age should be above 18!");

        //Address
        if (!Pattern.matches("^[a-zA-Z0-9 ,.'-]+$", getAddress())) throw new EmployeeInputException("Invalid address!");

        //Degree
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getDegree())) throw new EmployeeInputException("Invalid degree!");

        //Phone Number
        if (getPhone().length() != 11) throw new EmployeeInputException("Phone number must be 11 digits!");
        if (!Pattern.matches("^[0-9]+$", getPhone())) throw new EmployeeInputException("Phone number must only contain digits!");

        //Telephone
        if (getLandLine().length() != 11) throw new EmployeeInputException("Landline must be 11 digits! (don't forget typing city code at the beginning)");
        if (!Pattern.matches("^[0-9]+$", getLandLine())) throw new EmployeeInputException("Landline must only contain digits!");

        //Position
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getPosition())) throw new EmployeeInputException("Invalid position!");

        //Salary
        if (getSalary() < 0) throw new EmployeeInputException("Salary should not be negative");
    }
}
