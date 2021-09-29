package Characters.Mago;

import Characters.Characters;

public class Mago extends Characters {
    public Mago(){
        setName("Mago");
        setQuantityLife(100);
        setQuantityPower(50);
        setTypePower("Magia");
    }

    public void printOut(){
        System.out.println("Name: " + getName()
                + "\n Quantity of life: " + getQuantityLife()
                + "\n Quantity of power: " + getQuantityPower()
                + "\n Type of power: " + getTypePower()
                + "\n-------------------------------");
    }

}