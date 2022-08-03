public class HufflepuffStudents extends HogwartsStudents{

    /// поле "трудолюбие"

    private int diligence;

    /// поле "верность"

    private int devotion;

    /// поле "честность"

    private int honesty;

    public HufflepuffStudents(String name, int magicPower, int distanceOfTransgression,
                              int diligence, int devotion, int honesty) {
        super(name, magicPower, distanceOfTransgression);
        this.diligence = diligence;
        this.devotion = devotion;
        this.honesty = honesty;
    }

    public int getMagicPowerOfStudent() {
        return getMagicPower() + getDistanceOfTransgression() + this.devotion + this.diligence + this.honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getDevotion() {
        return devotion;
    }

    public void setDevotion(int devotion) {
        this.devotion = devotion;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

}
