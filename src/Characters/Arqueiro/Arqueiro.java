package Characters.Arqueiro;

import Characters.Characters;

public class Arqueiro extends Characters {
    public Arqueiro(){
        setName("Arqueiro");
        setQuantityLife(100);
        setQuantityPower(60);
        setTypePower("Arco e flecha");
    }


    public void printOut(){
        System.out.println("Name: " + getName()
                + "\n Quantity of life: " + getQuantityLife()
                + "\n Quantity of power: " + getQuantityPower()
                + "\n Type of power: " + getTypePower()
                + "\n-------------------------------");
    }
}
