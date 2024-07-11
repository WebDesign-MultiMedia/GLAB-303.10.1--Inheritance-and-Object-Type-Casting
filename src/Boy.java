public class Boy extends Person{
    static double ageFactor = 1.1;

    public String talk(){
        return (super.talk() + " ... but i love Java class.");
    }

    public String walk(){
        return ("T am now walking");
    }
}
