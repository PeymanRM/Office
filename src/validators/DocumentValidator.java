package validators;

import models.entities.DocumentEnti;

import java.util.regex.Pattern;

public class DocumentValidator extends DocumentEnti {

    public void validateInputs() throws Exception {
        //Name
        if (getName().length() == 0) throw new DocumentInputException("Name is required!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getName())) throw new DocumentInputException("Invalid name!");

        //Subject
        if (getSubject().length() == 0) throw new DocumentInputException("Subject is required!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getSubject())) throw new DocumentInputException("Invalid subject!");

        //Name of sender
        if (getNameOfSender().length() == 0) throw new DocumentInputException("Name of sender is required!");
        if (getNameOfSender().length() < 3) throw new DocumentInputException("Entered name of sender is too short!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getNameOfSender())) throw new DocumentInputException("Invalid name of sender!");

        //Name of receiver
        if (getNameOfReceiver().length() == 0) throw new DocumentInputException("Name of receiver is required!");
        if (getNameOfReceiver().length() < 3) throw new DocumentInputException("Entered name of receiver is too short!");
        if (!Pattern.matches("^[a-zA-Z ,.'-]+$", getNameOfReceiver())) throw new DocumentInputException("Invalid name of receiver!");
    }
}
