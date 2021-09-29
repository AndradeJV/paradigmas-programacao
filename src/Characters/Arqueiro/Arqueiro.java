package Characters.Arqueiro;

import Characters.Characters;

public class Arqueiro extends Characters {

    @Override
    public void setName(String name) {
        super.setName("Arqueiro");
    }

    @Override
    public void setTypePower(String typePower) {
        super.setTypePower("Arco e flecha");
    }

    @Override
    public void setQuantityPower(float quantityPower) {
        super.setQuantityPower(60);
    }


    @Override
    public void setQuantityLife(float quantityLife) {
        super.setQuantityLife(100);
    }
}
