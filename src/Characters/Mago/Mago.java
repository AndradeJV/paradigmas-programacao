package Characters.Mago;

import Characters.Characters;

public class Mago extends Characters {

    @Override
    public void setName(String name) {
        super.setName("Mago");
    }

    @Override
    public void setTypePower(String typePower) {
        super.setTypePower("Magia");
    }

    @Override
    public void setQuantityPower(float quantityPower) {
        super.setQuantityPower(50);
    }

    @Override
    public void setQuantityLife(float quantityLife) {
        super.setQuantityLife(100);
    }

    public void printOut(){
        System.out.println("Name: ");
        System.out.println("Type of power: ");
        System.out.println("Quantity of power: ");
        System.out.println("Quantity of life: ");
    }
}
