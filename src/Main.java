public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age;
        age = 32;
        if (age >= 18) {
            System.out.println("Вы достигли совершеннолетия.");
        }
        age = 15;
        if (age < 18) {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать.");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperatura;
        temperatura = 25;
        if (temperatura < 5) {
            System.out.println("На улице " + temperatura + " градусов - холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло " + temperatura + " градусов, можно идти без шапки.");
        }
        temperatura = -7;

        if (temperatura < 5) {
            System.out.println("На улице " + temperatura + " градусов - холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло " + temperatura + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed;
        speed = 54;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Скорость " + speed + ", можно ездить спокойно.");
        }
        speed = 87;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Скорость " + speed + ", можно ездить спокойно.");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int age;
        age = 5;
        boolean baby = age < 2;
        boolean children = age >= 2 && age <= 6;
        boolean teenager = age >= 7 && age <= 18;
        boolean youngMan = age > 18 && age < 24;
        boolean adult = age >= 24 && age <= 60;
        boolean oldMan = age > 60;
        if (baby) {
            System.out.println("Если возраст человека меньше двух лет, то ему пора спать.");
        } else if (children) {
                System.out.println("Если возраст человека равен " + age + " годам, то ему нужно ходить " +
                        "в детский сад.");
        } else if (teenager) {
                System.out.println("Если возраст человека равен " + age + " годам, то ему нужно ходить в школу.");
        } else if (youngMan) {
                System.out.println("Если возраст человека равен " + age + " годам, то ему нужно ходить в университет.");
        } else if (adult) {
                 System.out.println("Если возраст человека равен " + age + " годам, то ему нужно ходить на работу.");
        } else {
                 System.out.println("Если возраст человека равен " + age + " годам, то он может отдохнуть.");
                        }
                    }


    public static void task5() {
        System.out.println("Задача 5");
        int age;
        age = 4;
        boolean baby = age < 5;
        boolean children = age >= 5 && age < 14;
        boolean teenager = age >= 14;
        if (baby) {
            System.out.println("Если возраст ребенка равен " + age + " годам, то ребенок не может " +
                    "кататься на аттракционе.");
        }
        else if (children) {
            System.out.println("Если возраст ребенка равен " + age + " годам, то ребенок может кататься на аттракционе только в сопровождении взрослого.");


        } else {
                System.out.println("Если возраст ребенка равен " + age + " годам, то ребенок может кататься на аттракционе без сопровождения взрослого");
            }
        }


    public static void task6() {
        System.out.println("Задача 6");

        int passenger;
        passenger = 76;
        if (passenger <= 60) {
            System.out.println("В вагоне осталось " + (60 - passenger) + " сидячих мест и 42 стоячих.");
        } else {
            if (passenger > 60 && passenger <= 102) {
                System.out.println("В вагоне не осталось сидячих мест, осталось " + (102 - passenger) + " стоячих мест.");
            } else {
                System.out.println("В вагоне нет свободных мест.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        //
        int one, two, three;
        one = 19;
        two = 67;
        three = 123;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее из заданных чисел " + one + ".");
        } ;

            if (two >= one && two >= three) {
                System.out.println("Наибольшее из заданных чисел " + two + ".");
            }
                   else {
                System.out.println("Наибольшее из заданных чисел " + three + ".");
            } ;
        }
    }










