package Characters.Cavaleiro;

import Characters.Characters;

public class Cavaleiro extends Characters {

    @Override
    public void setName(String name) {
        super.setName("Cavaleiro");
    }

    @Override
    public void setTypePower(String typePower) {
        super.setTypePower("Espada");
    }

    @Override
    public void setQuantityPower(float quantityPower) {
        super.setQuantityPower(75);
    }

    @Override
    public void setQuantityLife(float quantityLife) {
        super.setQuantityLife(100);
    }
}
