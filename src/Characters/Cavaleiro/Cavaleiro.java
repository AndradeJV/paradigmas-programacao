package Characters.Cavaleiro;

import Characters.Characters;

public class Cavaleiro extends Characters {

    private String powerPlus;

    public Cavaleiro(){
        setName("Cavaleiro");
        setQuantityLife(100);
        setQuantityPower(75);
        setTypePower("Espada");
        setPowerPlus("Machado");
    }

    public String getPowerPlus() {
        return powerPlus;
    }

    public void setPowerPlus(String powerPlus) {
        this.powerPlus = powerPlus;
    }

    public void printOut(){
        System.out.println("Name: " + getName()
                + "\n Quantity of life: " + getQuantityLife()
                + "\n Quantity of power: " + getQuantityPower()
                + "\n Type of power: " + getTypePower()
                + "\n-------------------------------");
    }
}
