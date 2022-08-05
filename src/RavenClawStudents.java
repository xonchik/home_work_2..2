public class RavenClawStudents extends HogwartsStudents{
    private int intellect;
    private int wisdom;
    private int wit;
    private int creative;

    public RavenClawStudents(String name, int magicPower, int distanceOfTransgression,
                             int intellect, int wisdom, int wit, int creative) {
        super(name, magicPower, distanceOfTransgression);
        if (intellect >= 0 && intellect <= 100) {
            this.intellect = intellect;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (wisdom >= 0 && wisdom <= 100) {
            this.wisdom = wisdom;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (wit >= 0 && wit <= 100) {
            this.wit = wit;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (creative >= 0 && creative <= 100) {
            this.creative = creative;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
    }

    public void comparisonStudentsOfRavenClaw(RavenClawStudents student) {
        int powerFirstStudent = student.getMagicPower() + student.getDistanceOfTransgression() + student.intellect + student.wisdom + student.wit + student.creative;
        int powerSecondStudent = this.getMagicPower() + this.getDistanceOfTransgression() + this.intellect + this.wisdom + this.wit + this.creative;
        if (powerFirstStudent > powerSecondStudent) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());
        } else if (powerFirstStudent < powerSecondStudent) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());
        } else {
            System.out.println("Студенты равны по магической силе!");
        }
    }

    @Override
    public int getMagicPowerOfStudent() {
        return super.getMagicPowerOfStudent() + this.intellect + this.wisdom + this.wit + this.creative;
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
        if (intellect >= 0 && intellect <= 100) {
            this.intellect = intellect;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public void setWisdom(int wisdom) {
        if (wisdom >= 0 && wisdom <= 100) {
            this.wisdom = wisdom;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public void setWit(int wit) {
        if (wit >= 0 && wit <= 100) {
            this.wit = wit;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public void setCreative(int creative) {
        if (creative >= 0 && creative <= 100) {
            this.creative = creative;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "; Intellect = " + getIntellect() + "; Wisdom = " + getWisdom() + "; Wit = " + getWit() +
                "; Creative = " + getCreative();
    }

}
