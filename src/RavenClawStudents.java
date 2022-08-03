public class RavenClawStudents extends HogwartsStudents{

    /// поле "ум"

    private int intellect;

    /// поле "мудрость"

    private int wisdom;

    /// поле "остроумие"

    private int wit;

    /// поле "креатив"

    private int creative;

    public RavenClawStudents(String name, int magicPower, int distanceOfTransgression,
                             int intellect, int wisdom, int wit, int creative) {
        super(name, magicPower, distanceOfTransgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getMagicPowerOfStudent() {
        return getMagicPower() + getDistanceOfTransgression() + this.intellect + this.wisdom + this.wit + this.creative;
    }

    public int getIntellect() {
        return this.intellect;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public int getWit() {
        return this.wit;
    }

    public int getCreative() {
        return this.creative;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

}
