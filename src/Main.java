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
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 5;
        System.out.println("Если возраст человека равен " + age);
        if (age < 18)  {
                System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать ");
            } else {
                System.out.println("Возраст совершеннолетия ");

            }


    }

    public static void task2 () {
        System.out.println("Задача 2");
         int airTemperature = 3;
        System.out.println("На улице " + airTemperature + " градусов");
        if (airTemperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");

        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int carSpeed = 10;
        System.out.println("Если скорость " + carSpeed);
        if (carSpeed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить свободно");

        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 27;
        System.out.println("Если возраст человека равен " + age );
        if (age > 2 && age < 6) {
            System.out.println("ему нужно ходить в детский сад");
        }
        else if (age > 7 && age < 18) {
            System.out.println("ему нужно ходить в ходить в школу");
        }
        else if (age > 18 && age < 24) {
            System.out.println("его то его место в университете");
        }
        else if (age > 24 ) {
            System.out.println("то ему пора на работу");
        }



    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 2;
        System.out.println("Если возраст ребенка равен " + age );
        if (age < 5 ) {
            System.out.println("он не может кататься на аттракционе");
        }
        else if (age > 5 && age < 7) {
            System.out.println("он может кататься только в сопровождении взрослого. Если взрослого нет, кататься нельзя");
        }
        else if (age > 14 ) {
            System.out.println("он может кататься без сопровождения взрослого.");
        }



    }
    public static void task6 () {
        System.out.println("Задача 6");
        int wagonСapacity = 102;
        int seatPlace = 60;
        int ofherPlace = wagonСapacity-seatPlace;

        int useSeat = 60;
        int useOther = 76;
        if (useOther < seatPlace) {
            System.out.println("Есть еще " + ofherPlace + " сидячих мест");
        }
        if (seatPlace ==useSeat){
            System.out.println( "Сидячих мест нет! ");
        }
        if (useOther < ofherPlace) {
            System.out.println("Есть еще " + (ofherPlace - useOther) + " стоячих мест");
        }
        if (useOther ==ofherPlace)
        {
            System.out.println("Стоячих мест нет");
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 57;
        int two = 67;
        int there = 54;
        if (one > two) {
            if (one > there) {
                System.out.println("Максимальное число " + one);

            } else if (there > one) {
                System.out.println("Максимальное число " + there);

            } else {
                System.out.println("Числа " + one + "и" + there + " равны");
            }

            } else if (two > one) {
            if (two > there) {
                System.out.println("Максимальное число " + two);

            } else if (there > two) {
                System.out.println("Максимальное число " + there);

            } else {
                System.out.println("Числа " + two + "и" + there + " равны");

            }
        } else {
            if (one > there) {
                System.out.println("Максимальное число " + one);

            } else if (there > one) {
                System.out.println("Максимальное число " + there);

            } else {
                System.out.println("Все числа равны ");

            }
        }
    }

    }
