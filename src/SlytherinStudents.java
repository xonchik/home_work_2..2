public class SlytherinStudents extends HogwartsStudents{
    private int ruse;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudents(String name, int magicPower, int distanceOfTransgression,
                             int ruse, int decisiveness, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, distanceOfTransgression);
        if (ruse >= 0 && ruse <= 100) {
            this.ruse = ruse;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (decisiveness >= 0 && decisiveness <= 100) {
            this.decisiveness = decisiveness;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (ambition >= 0 && ambition <= 100) {
            this.ambition = ambition;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (resourcefulness >= 0 && resourcefulness <= 100) {
            this.resourcefulness = resourcefulness;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (lustForPower >= 0 && lustForPower <= 100) {
            this.lustForPower = lustForPower;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }


    }

    public void comparisonStudentsOfSlytherin(SlytherinStudents student) {
        int powerFirstStudent = student.getMagicPower() + student.getDistanceOfTransgression() + student.ruse + student.decisiveness + student.ambition + student.resourcefulness + student.lustForPower;
        int powerSecondStudent = this.getMagicPower() + this.getDistanceOfTransgression() + this.ruse + this.decisiveness + this.ambition + this.resourcefulness + this.lustForPower;
        if (powerFirstStudent > powerSecondStudent) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());
        } else if (powerFirstStudent < powerSecondStudent) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else {
            System.out.println("Студенты равны по магической силе!");
        }
    }

    @Override
    public int getMagicPowerOfStudent() {
        return super.getMagicPowerOfStudent() + this.ruse + this.decisiveness + this.ambition +
                this.resourcefulness + this.lustForPower;
    }

    public int getRuse() {
        return ruse;
    }

    public void setRuse(int ruse) {
        if (ruse >= 0 && ruse <= 100) {
            this.ruse = ruse;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        if (decisiveness >= 0 && decisiveness <= 100) {
            this.decisiveness = decisiveness;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition >= 0 && ambition <= 100) {
            this.ambition = ambition;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness >= 0 && resourcefulness <= 100) {
            this.resourcefulness = resourcefulness;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {

        if (lustForPower >= 0 && lustForPower <= 100) {
            this.lustForPower = lustForPower;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; Ruse = " + getRuse() + "; Decisiveness = " + getDecisiveness() + "; Ambition = " + getAmbition() +
                "; Resourcefulness = " + getResourcefulness() + "; lustForPower = " + getLustForPower();
    }
}
