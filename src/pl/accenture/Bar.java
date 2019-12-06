package pl.accenture;

import pl.accenture.model.Person;

public class Bar {

    public static void main(String[] args) {
Person nieletnia = new Person(10,false,false);
Person ciezarna = new Person(18,false,true);
Person kierowca = new Person(18,true,false);
Person student = new Person(18,true,false);
servDrink(nieletnia);
servDrink(ciezarna);
servDrink(kierowca);
servDrink(student);

    }
    static void servDrink(Person p){
        if(p.canDrink.test(p)){
            System.out.println("Miłej zabawy");

        }else {
            System.out.println("Bar po północy");

        }
    }
}
