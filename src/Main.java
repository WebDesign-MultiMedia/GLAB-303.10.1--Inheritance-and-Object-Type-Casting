//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person aPerson;
        Boy Julio;
        Girl Marisol;
        aPerson = new Person("Pablo");
        Julio = new Boy();
        Marisol = new Girl("Betty");

        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(Julio);
        System.out.println(Julio.talk());
        System.out.println(Julio.walk());
        System.out.println();

        System.out.println(Marisol);
        System.out.println(Marisol.talk());
        System.out.println(Marisol.walk());
        System.out.println();

        System.out.println((Person)Julio);
        System.out.println(((Person)Julio).talk());
        System.out.println(((Person)Julio).walk());
        System.out.println();

        System.out.println((Person)Marisol);
        System.out.println(((Person)Marisol).talk());
        System.out.println(((Person)Marisol).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        System.out.println(((Boy)aPerson).talk());

    }
}

