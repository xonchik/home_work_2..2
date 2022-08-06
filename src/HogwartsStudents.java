public class HogwartsStudents {
    private String name;
    private int magicPower;
    private int distanceOfTransgression;

    public HogwartsStudents(String name, int magicPower, int distanceOfTransgression) {
        if (name != null) {
            this.name = name;
        } else if (name == null) {
            throw new RuntimeException("Имя не может быть null!");
        }

        if (magicPower >= 0 && magicPower <= 100) {
            this.magicPower = magicPower;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (distanceOfTransgression >= 0 && distanceOfTransgression <= 100) {
            this.distanceOfTransgression = distanceOfTransgression;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
    }

    public void comparisonStudentsOfHogwarts(HogwartsStudents student) {
        int powerFirstStudent = student.getMagicPower() + student.getDistanceOfTransgression();
        int powerSecondStudent = this.getMagicPower() + this.getDistanceOfTransgression();
        if (powerFirstStudent > powerSecondStudent) {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else if (powerFirstStudent < powerSecondStudent) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else {
            System.out.println("Студенты равны по магической силе!");

        }
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
        if (magicPower >= 0 && magicPower <= 100) {
            this.magicPower = magicPower;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
    }

    public void setDistanceOfTransgression(int transgression) {
        if (transgression >= 0 && transgression <= 100) {
            this.distanceOfTransgression = transgression;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
    }

    public String toString() {
        return "Name : " + getName() + ";  Magic Power = " + getMagicPower() + ";  Transgression = " + getDistanceOfTransgression();
    }
}
