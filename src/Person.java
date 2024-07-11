
 // Class definition
public class Person{

    // Fields
    String name;
    static int lifeSpan = 60;
    static double ageFactor = 1.0;

    //Constructors
    public Person(){
        name = "";
    }
    public Person(String aName){
        name = aName;
    }

    // Getter and Setter Methods
    public String getName(){ return name;}
    public void setName(String aName) {name = aName;}

     // toString method
    public String toString(){
        return ("Yerrr, my name is " + name);
    }

    // Talk method
    public String talk(){
        return ("I have nothing to say");
    }

    // walk method
    public String walk(){
        return ("I have nowhere to go.");
    }

    // static Method for Life Span
    public static double lifeSpan(){
        return (lifeSpan * ageFactor);
    }



}
