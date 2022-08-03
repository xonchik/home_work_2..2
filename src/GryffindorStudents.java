public class GryffindorStudents extends HogwartsStudents {

    /// поле "благородство"

    private int nobility;

    /// поле "честь"

    private int honor;

    /// поле "храбрость"

    private int bravery;

    public GryffindorStudents(String name, int magicPower, int distanceOfTransgression,
                              int nobility, int honor, int bravery) {
        super(name, magicPower, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getBravery() {
        return this.bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getMagicPowerOfStudent() {
        return getMagicPower() + getDistanceOfTransgression() + this.nobility + this.honor + this.bravery;
    }

    public String toString() {
        return "Name : " + getName() + ";  Magic Power : " + getMagicPower() + ";  Transgression : " + getDistanceOfTransgression() +
                ";  Nobility : " + getNobility() + ";  Honor : " + getHonor() + ";  Bravery : " + getBravery();
    }
}
