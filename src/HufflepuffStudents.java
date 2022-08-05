public class HufflepuffStudents extends HogwartsStudents{
    private int diligence;
    private int devotion;
    private int honesty;

    public HufflepuffStudents(String name, int magicPower, int distanceOfTransgression,
                              int diligence, int devotion, int honesty) {
        super(name, magicPower, distanceOfTransgression);
        if (diligence >= 0 && diligence <= 100) {
            this.diligence = diligence;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (devotion >= 0 && devotion <= 100) {
            this.devotion = devotion;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (honesty >= 0 && honesty <= 100) {
            this.honesty = honesty;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
    }

    public void comparisonStudentsOfHufflepuff(HufflepuffStudents student) {
        int powerFirstStudent = student.getMagicPower() + student.getDistanceOfTransgression() + student.diligence + student.devotion + student.honesty;
        int powerSecondStudent = this.getMagicPower() + this.getDistanceOfTransgression() + this.diligence + this.devotion + this.honesty;
        if (powerFirstStudent > powerSecondStudent) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else if (powerFirstStudent < powerSecondStudent) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else {
            System.out.println("Студенты равны по магической силе!");
        }
    }

    @Override
    public int getMagicPowerOfStudent() {
        return super.getMagicPowerOfStudent() + this.devotion + this.diligence + this.honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if (diligence >= 0 && diligence <= 100) {
            this.diligence = diligence;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public int getDevotion() {
        return devotion;
    }

    public void setDevotion(int devotion) {
        if (devotion >= 0 && devotion <= 100) {
            this.devotion = devotion;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty >= 0 && honesty <= 100) {
            this.honesty = honesty;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "; Diligence = " + getDiligence() + "; Devotion = " + getDevotion() + "; Honesty = " + getHonesty();
    }

}
