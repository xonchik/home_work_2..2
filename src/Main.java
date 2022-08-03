public class Main {
    public static void main(String[] args) {
        comparisonStudentsOfHogwarts("Harry Potter", "Draco Malfoy");
    }


    public static HogwartsStudents[] hogwartsStudents = {
            new HogwartsStudents("Harry Potter", 100, 100),
            new HogwartsStudents("Hermione Granger", 90, 90),
            new HogwartsStudents("Ron Weasley", 60, 40),
            new HogwartsStudents("Draco Malfoy", 80, 60),
            new HogwartsStudents("Graham Montague", 45, 30),
            new HogwartsStudents("Gregory Goyle", 65, 42),
            new HogwartsStudents("Zachariah Smith", 78, 65),
            new HogwartsStudents("Cedric Diggory", 48, 32),
            new HogwartsStudents("Justin Finch-Fletchley", 56, 72),
            new HogwartsStudents("Zhou Chang", 69, 57),
            new HogwartsStudents("Padma Patil", 87, 34),
            new HogwartsStudents("Marcus Belby", 44, 56),

    };

    public static GryffindorStudents[] gryffindorStudents = {
            new GryffindorStudents("Harry Potter", 100, 100, 100, 100, 100),
            new GryffindorStudents("Hermione Granger", 90, 90, 90, 90, 90),
            new GryffindorStudents("Ron Weasley", 60, 40, 50, 45, 67),
    };

    public static SlytherinStudents[] slytherinStudents = {
            new SlytherinStudents("Draco Malfoy", 80, 60, 74, 67, 58, 88, 58),
            new SlytherinStudents("Graham Montague", 45, 30, 48, 55, 43, 61, 54),
            new SlytherinStudents("Gregory Goyle", 65, 42, 34, 59, 63, 27, 44),
    };

    public static RavenClawStudents[] ravenClawStudents = {
            new RavenClawStudents("Zhou Chang", 69, 57, 44, 28, 67, 49),
            new RavenClawStudents("Padma Patil", 87, 34, 58, 67, 89, 75),
            new RavenClawStudents("Marcus Belby", 44, 56, 49, 42, 67, 55),
    };

    public static HufflepuffStudents[] hufflepuffStudents = {
            new HufflepuffStudents("Zachariah Smith", 78, 65, 84, 54, 65),
            new HufflepuffStudents("Cedric Diggory", 48, 32, 59, 57, 78),
            new HufflepuffStudents("Justin Finch-Fletchley", 56, 72, 35, 48, 77),
    };

    ///Сделайте метод, который выводит на экран описание студента. В описание надо включать качества,
    //которые присущи всем студентам, плюс качества, которые присущи студенту,
    //потому что он учится на конкретном факультете.

    public static void getDescriptionOfStudent(String name) {
        for (int i = 0; i < gryffindorStudents.length; i++) {
            if (gryffindorStudents[i] == null) continue;
            if (name == gryffindorStudents[i].getName()) {
                System.out.println(gryffindorStudents[i].getName() + "(Gryffindor): Magic power : " + gryffindorStudents[i].getMagicPower() +
                        "; Distance of transgression : " + gryffindorStudents[i].getDistanceOfTransgression() + "; Nobility : " + gryffindorStudents[i].getNobility() +
                        "; Honor : " + gryffindorStudents[i].getHonor() + "; Bravery : " + gryffindorStudents[i].getBravery());
            }
        }
        for (int i = 0; i < slytherinStudents.length; i++) {
            if (slytherinStudents[i] == null) continue;
            if (name == slytherinStudents[i].getName()) {
                System.out.println(slytherinStudents[i].getName() + "(Slytherin): Magic power : " + slytherinStudents[i].getMagicPower() +
                        "; Distance of transgression : " + slytherinStudents[i].getDistanceOfTransgression() + "; Ruse  : " + slytherinStudents[i].getRuse() +
                        "; Decisiveness : " + slytherinStudents[i].getDecisiveness() + "; Ambition : " + slytherinStudents[i].getAmbition() +
                        "; Resourcefulness : " + slytherinStudents[i].getResourcefulness() + "; lust For Power : " + slytherinStudents[i].getLustForPower());
            }
        }
        for (int i = 0; i < ravenClawStudents.length; i++) {
            if (ravenClawStudents[i] == null) continue;
            if (name == ravenClawStudents[i].getName()) {
                System.out.println(ravenClawStudents[i].getName() + "(RavenClaw): Magic power : " + ravenClawStudents[i].getMagicPower() +
                        "; Distance of transgression : " + ravenClawStudents[i].getDistanceOfTransgression() + "; Intellect : " + ravenClawStudents[i].getIntellect() +
                        "; Wisdom : " + ravenClawStudents[i].getWisdom() + "; Wit : " + ravenClawStudents[i].getWit() + "; Creative : " + ravenClawStudents[i].getCreative());
            }
        }
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            if (hufflepuffStudents[i] == null) continue;
            if (name == hufflepuffStudents[i].getName()) {
                System.out.println(hufflepuffStudents[i].getName() + "(Hufflepuff): Magic power : " + hufflepuffStudents[i].getMagicPower() +
                        "; Distance of transgression : " + hufflepuffStudents[i].getDistanceOfTransgression() + "; Diligence : " + hufflepuffStudents[i].getDiligence() +
                        "; Devotion : " + hufflepuffStudents[i].getDevotion() + "; Honesty : " + hufflepuffStudents[i].getHonesty());
            }
        }
    }

    ///Сравнение двух студентов Гриффиндора.

    public static void comparisonStudentsOfGryffindor(String name1, String name2) {
        int magicPowerOfStudent1 = gryffindorStudents[0].getMagicPower();
        int magicPowerOfStudent2 = gryffindorStudents[0].getMagicPower();
        for (int i = 0; i < gryffindorStudents.length; i++) {
            if (gryffindorStudents[i] == null) continue;
            if (name1 == gryffindorStudents[i].getName()) {
                magicPowerOfStudent1 = gryffindorStudents[i].getMagicPowerOfStudent();
            }
            if (name2 == gryffindorStudents[i].getName()) {
                magicPowerOfStudent2 = gryffindorStudents[i].getMagicPowerOfStudent();
            }
        }
        if (magicPowerOfStudent1 > magicPowerOfStudent2) {
            System.out.println(name1 + " лучший Гриффиндорец, чем " + name2);
        } else if (magicPowerOfStudent1 < magicPowerOfStudent2) {
            System.out.println(name2 + " лучший Гриффиндорец, чем " + name1);
        } else {
            System.out.println("Студенты равны по силе.");
        }
    }

    ///Сравнение двух студентов Слизерин.

    public static void comparisonStudentsOfSlytherin(String name1, String name2) {
        int magicPowerOfStudent1 = slytherinStudents[0].getMagicPower();
        int magicPowerOfStudent2 = slytherinStudents[0].getMagicPower();
        for (int i = 0; i < slytherinStudents.length; i++) {
            if (slytherinStudents[i] == null) continue;
            if (name1 == slytherinStudents[i].getName()) {
                magicPowerOfStudent1 = slytherinStudents[i].getMagicPowerOfStudent();
            }
            if (name2 == slytherinStudents[i].getName()) {
                magicPowerOfStudent2 = slytherinStudents[i].getMagicPowerOfStudent();
            }
        }
        if (magicPowerOfStudent1 > magicPowerOfStudent2) {
            System.out.println(name1 + " лучший Слизеринец, чем " + name2);
        } else if (magicPowerOfStudent1 < magicPowerOfStudent2) {
            System.out.println(name2 + " лучший Слизеринец, чем " + name1);
        } else {
            System.out.println("Студенты равны по силе.");
        }
    }

    ///Сравнение двух студентов Когтевран.

    public static void comparisonStudentsOfRavenClaw(String name1, String name2) {
        int magicPowerOfStudent1 = ravenClawStudents[0].getMagicPower();
        int magicPowerOfStudent2 = ravenClawStudents[0].getMagicPower();
        for (int i = 0; i < ravenClawStudents.length; i++) {
            if (ravenClawStudents[i] == null) continue;
            if (name1 == ravenClawStudents[i].getName()) {
                magicPowerOfStudent1 = ravenClawStudents[i].getMagicPowerOfStudent();
            }
            if (name2 == ravenClawStudents[i].getName()) {
                magicPowerOfStudent2 = ravenClawStudents[i].getMagicPowerOfStudent();
            }
        }
        if (magicPowerOfStudent1 > magicPowerOfStudent2) {
            System.out.println(name1 + " лучший Когтевранец, чем " + name2);
        } else if (magicPowerOfStudent1 < magicPowerOfStudent2) {
            System.out.println(name2 + " лучший Когтевранец, чем " + name1);
        } else {
            System.out.println("Студенты равны по силе.");
        }

    }

    ///Сравнение двух студентов Пуффендуй.

    public static void comparisonStudentsOfHufflepuff(String name1, String name2) {
        int magicPowerOfStudent1 = hufflepuffStudents[0].getMagicPower();
        int magicPowerOfStudent2 = hufflepuffStudents[0].getMagicPower();
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            if (hufflepuffStudents[i] == null) continue;
            if (name1 == hufflepuffStudents[i].getName()) {
                magicPowerOfStudent1 = hufflepuffStudents[i].getMagicPowerOfStudent();
            }
            if (name2 == hufflepuffStudents[i].getName()) {
                magicPowerOfStudent2 = hufflepuffStudents[i].getMagicPowerOfStudent();
            }
        }
        if (magicPowerOfStudent1 > magicPowerOfStudent2) {
            System.out.println(name1 + " лучший Пуффендуец, чем " + name2);
        } else if (magicPowerOfStudent1 < magicPowerOfStudent2) {
            System.out.println(name2 + " лучший Пуффендуец, чем " + name1);
        } else {
            System.out.println("Студенты равны по силе.");
        }

    }

    ///Сравнение двух студентов Хогвартс.

    public static void comparisonStudentsOfHogwarts(String name1, String name2) {
        int magicPowerOfStudent1 = hogwartsStudents[0].getMagicPower();
        int magicPowerOfStudent2 = hogwartsStudents[0].getMagicPower();
        for (int i = 0; i < hogwartsStudents.length; i++) {
            if (hogwartsStudents[i] == null) continue;
            if (name1 == hogwartsStudents[i].getName()) {
                magicPowerOfStudent1 = hogwartsStudents[i].getMagicPowerOfStudent();
            }
            if (name2 == hogwartsStudents[i].getName()) {
                magicPowerOfStudent2 = hogwartsStudents[i].getMagicPowerOfStudent();
            }
        }
        if (magicPowerOfStudent1 > magicPowerOfStudent2) {
            System.out.println(name1 + " обладает большей мощностью магии, чем " + name2);
        } else if (magicPowerOfStudent1 < magicPowerOfStudent2) {
            System.out.println(name2 + " обладает большей мощностью магии, чем " + name1);
        } else {
            System.out.println("Студенты равны по силе.");
        }
    }
}