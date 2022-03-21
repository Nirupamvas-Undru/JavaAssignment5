package yourname.assignment.singleton;

public class SecondClass {
    //static
    String inputString;
    public SecondClass(String inputString){
        this.inputString = inputString;
    }
    public static SecondClass staticMethod(String initValue){
        //Static methods can only access static data
        //as our inputString is non-static variable
        //that's the reason we couldn't able to modify the data
        inputString = initValue;
        SecondClass sc = new SecondClass(initValue);
        return sc;
    }
    public void printString(){
        System.out.println("Value of inputString: "+ inputString);
    }

    public static void main(String[] args) {
        String input = "Nirupam";
        SecondClass object = new SecondClass(input);
        object.staticMethod(input);
        object.printString();
    }
}
