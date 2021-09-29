package Characters;

public class Characters {
    private String name;
    private float quantityLife;
    private float quantityPower;
    private String typePower;

    public  Characters(){

    }

    public String getTypePower() { return typePower; }

    public void setTypePower(String typePower) { this.typePower = typePower; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQuantityLife() {
        return quantityLife;
    }

    public void setQuantityLife(float quantityLife) {
        this.quantityLife = quantityLife;
    }

    public float getQuantityPower() {
        return quantityPower;
    }

    public void setQuantityPower(float quantityPower) {
        this.quantityPower = quantityPower;
    }

    public void printOut(){
        System.out.println(
                "Name: " + getName()
                + " Quantity of power: " + getQuantityPower()
                + " Quantity of life: " + getQuantityLife()
                + " Type of power " + getTypePower());
    }
}
