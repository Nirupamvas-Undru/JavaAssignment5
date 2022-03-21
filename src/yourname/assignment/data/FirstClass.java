package yourname.assignment.data;

public class FirstClass {
    private int intVariable;
    private char charVariable;

    public void display(){
        System.out.println("The value of intVariable: " + intVariable);
        System.out.println("The value of charVariable: " +  charVariable);
    }
    public void show(){
        //We can't print the local variables without been initialized
        int intVariableShow;
        char charVariableShow;

        //System.out.println("The value of intVariable: " + intVariableShow);
        //System.out.println("The value of charVariable: " +  charVariableShow);
    }
}
