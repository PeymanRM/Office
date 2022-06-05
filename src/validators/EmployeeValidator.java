package validators;

import models.entities.EmployeeEnti;

import java.util.regex.Pattern;

public class EmployeeValidator extends EmployeeEnti {

    private String sAge, sSalary;

    public String getSAge() {
        return sAge;
    }

    public EmployeeValidator setSAge(String sAge) {
        this.sAge = sAge;
        return this;
    }

    public String getSSalary() {
        return sSalary;
    }

    public EmployeeValidator setSSalary(String sSalary) {
        this.sSalary = sSalary;
        return this;
    }

    public void validateInputs() throws Exception {
        //Name
        if (getName().length() == 0) throw new EmployeeInputException("Name is required!");
        if (getName().length() < 3) throw new EmployeeInputException("Entered name is too short!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getName())) throw new EmployeeInputException("Invalid name!");

        //Father's Name
        if (getFatherName().length() == 0) throw new EmployeeInputException("Father's name is required!");
        if (getFatherName().length() < 3) throw new EmployeeInputException("Entered ّfather's name is too short!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getFatherName())) throw new EmployeeInputException("Invalid father's name!");

        //Age
        if (!Pattern.matches("^[0-9]+$", getSAge())) throw new EmployeeInputException("Age must be a positive number!");
        if (Integer.parseInt(getSAge()) < 18) throw new EmployeeInputException("Age should be 18 or above!");
        if (Integer.parseInt(getSAge()) > 66) throw new EmployeeInputException("Age should be 65 or below!");

        //Address
        if (getAddress().length() < 3) throw new EmployeeInputException("Address is required!");
        if (!Pattern.matches("^[a-zA-Z0-9 ,.'-]+$", getAddress())) throw new EmployeeInputException("Invalid address!");

        //Degree
        if (getDegree().length() < 3) throw new EmployeeInputException("Degree is required!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getDegree())) throw new EmployeeInputException("Invalid degree!");

        //Telephone
        if (!Pattern.matches("^[0-9]+$", getLandLine())) throw new EmployeeInputException("Landline must only contain digits!");
        if (getLandLine().length() != 11) throw new EmployeeInputException("Landline must be 11 digits!\n(don't forget typing city code at the beginning)");

        //Phone Number
        if (!Pattern.matches("^[0-9]+$", getPhone())) throw new EmployeeInputException("Phone number must only contain digits!");
        if (getPhone().length() != 11) throw new EmployeeInputException("Phone number must be 11 digits!");

        //Position
        if (getPosition().equals("")) throw new EmployeeInputException("Position is required!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getPosition())) throw new EmployeeInputException("Invalid position!");

        //Salary
        if (!Pattern.matches("^[0-9]+$", getSSalary())) throw new EmployeeInputException("Salary must be a positive number!");
    }

    public void setVerifiedIntVariables() {
        setAge(Integer.parseInt(getSAge()));
        setSalary(Integer.parseInt(getSSalary()));
    }
}
