public class SlytherinStudents extends HogwartsStudents{

    /// поле "хитрость"

    private int ruse;

    /// поле "решительность"

    private int decisiveness;

    /// поле "амбициозность"

    private int ambition;

    /// поле "находчивость"

    private int resourcefulness;

    /// поле "жажда власти"

    private int lustForPower;

    public SlytherinStudents(String name, int magicPower, int distanceOfTransgression,
                             int ruse, int decisiveness, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, distanceOfTransgression);
        this.ruse = ruse;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getMagicPowerOfStudent() {
        return getMagicPower() + getDistanceOfTransgression() + this.ruse + this.decisiveness + this.ambition +
                this.resourcefulness + this.lustForPower;
    }

    public int getRuse() {
        return ruse;
    }

    public void setRuse(int ruse) {
        this.ruse = ruse;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
