package com.exceptions;


/*throws: potential Exception will be managed by
      a class, often a customized exception, but may be managed by eception itself. Keyword followed by name of the class that will handle the exception.
      throw: This allows to instantiate an object in the class follwing the instruction throws. */
public class AgeAnimalException extends Exception {

    //Parameterized Constructor
    public AgeAnimalException(String message) {
        super(message);
    }


}
