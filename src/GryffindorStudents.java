public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudents(String name, int magicPower, int distanceOfTransgression,
                              int nobility, int honor, int bravery) {
        super(name, magicPower, distanceOfTransgression);
        if (nobility >= 0 && nobility <= 100) {
            this.nobility = nobility;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (honor >= 0 && honor <= 100) {
            this.honor = honor;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
        if (bravery >= 0 && bravery <= 100) {
            this.bravery = bravery;
        } else {
            throw  new RuntimeException("Задано не верное число!");
        }
    }


    public void comparisonStudentsOfGryffindor(GryffindorStudents student) {
        int powerFirstStudent = student.getMagicPower() + student.getDistanceOfTransgression() + student.bravery + student.honor + student.nobility;
        int powerSecondStudent = this.getMagicPower() + this.getDistanceOfTransgression() + this.bravery + this.honor + this.nobility;
        if (powerFirstStudent > powerSecondStudent) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else if (powerFirstStudent < powerSecondStudent) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else {
            System.out.println("Студенты равны по магической силе!");

        }
    }

        public int getNobility () {
            return this.nobility;
        }

        public int getHonor () {
            return this.honor;
        }

        public int getBravery () {
            return this.bravery;
        }

        public void setNobility ( int nobility){
            if (nobility >= 0 && nobility <= 100) {
                this.nobility = nobility;
            } else {
                throw new RuntimeException("Задано не верное число!");
            }

        }

        public void setHonor ( int honor){

            if (honor >= 0 && honor <= 100) {
                this.honor = honor;
            } else {
                throw new RuntimeException("Задано не верное число!");
            }
        }

        public void setBravery ( int bravery){

            if (bravery >= 0 && bravery <= 100) {
                this.bravery = bravery;
            } else {
                throw new RuntimeException("Задано не верное число!");
            }
        }

        @Override
        public int getMagicPowerOfStudent () {
            return super.getMagicPowerOfStudent() + this.nobility + this.honor + this.bravery;
        }

        @Override
        public String toString () {
            return super.toString() + ";  Nobility = " + getNobility() + ";  Honor = " + getHonor() + ";  Bravery = " + getBravery();
        }
    }
