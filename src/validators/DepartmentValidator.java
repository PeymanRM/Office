package validators;

import models.entities.DepartmentEnti;

import java.util.regex.Pattern;

public class DepartmentValidator extends DepartmentEnti {

    public void validateInputs() throws Exception {
        //Name
        if (getName().length() < 3) throw new DepartmentInputException("Entered name is too short!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getName())) throw new DepartmentInputException("Invalid name!");
    }
}
