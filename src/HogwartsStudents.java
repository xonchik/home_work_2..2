public class HogwartsStudents {
    private String name;


    /// поле "Сила магии"

    private int magicPower;

    /// поле "Расстояние трансгрессии"

    private int distanceOfTransgression;

    public HogwartsStudents(String name, int magicPower, int distanceOfTransgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getMagicPowerOfStudent() {
        return this.magicPower + this.distanceOfTransgression;
    }

    public String getName() {
        return this.name;
    }


    public int getMagicPower() {
        return this.magicPower;
    }

    public int getDistanceOfTransgression() {
        return this.distanceOfTransgression;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgression(int transgression) {
        this.distanceOfTransgression = transgression;
    }

    public String toString() {
        return "Name : " + getName() + ";  Magic Power : " + getMagicPower() + ";  Transgression : " + getDistanceOfTransgression();
    }
}
