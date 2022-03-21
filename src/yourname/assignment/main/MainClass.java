package yourname.assignment.main;

import yourname.assignment.data.FirstClass;
import yourname.assignment.singleton.SecondClass;

import static yourname.assignment.singleton.SecondClass.staticMethod;

public class MainClass {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        //This method prints the data of global variables
        //so by default they are assigned with default values
        firstClass.display();

        //This method prints the data of local variables so bt default
        //they are not assigned with any default vaulues
        firstClass.show();

        SecondClass secondClass = new SecondClass("Nirupam");
        //Static methods can only access static data
        staticMethod("Nirupam");
        secondClass.printString();
    }
}
