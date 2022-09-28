public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача №1_1");
        task1(20);
        System.out.println();
        System.out.println("Задача №1_2");
        task2(8);
        System.out.println();
        System.out.println("Задача №1_3");
        task3(240);
        System.out.println();
        System.out.println("Задача №2_1");
        task4(3);
        System.out.println();
        System.out.println("Задача №2_2");
        task5(30);
        System.out.println();
        System.out.println("Задача №2_3");
        task6(50);
        System.out.println();
        System.out.println("Задача №3_1");
        task7(30);
        System.out.println();
        System.out.println("Задача №3_2");
        task8(19);
        System.out.println();
        System.out.println("Задача №3_3");
        task9(4,15,8);
    }

    private static void task9(int one, int two, int three) {
        if (one > two) {
            if (one > three) {
                System.out.printf("Первое число самое больше %d ", one);
            }
            else { System.out.printf("Третье число самое больше %d ", three);
                            }
        }
        else if (two > three) {
            System.out.printf("Второе число самое больше %d \n", two);
        }
        else { System.out.printf("Третье число самое больше %d \n", three);
        }
    }

    private static void task8(int age) {
        if (age <5) {
            System.out.println("Малой, тебе нельзя");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Позови родителей, одному нельзя!");
        }
        else {
            System.out.println("Поздравляю, тебе можно все!");
        }
    }

    private static void task7(int age) {
        if (age >= 2 && age < 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в сад\n", age);
        }
        if (age >= 7 && age < 18) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу\n", age);
        }
        if (age >= 18 && age < 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет\n", age);
        }
        if (age >= 24) {
            System.out.printf("Если возраст человека равен %d, то , дружище, иди работай!\n", age);
        }
    }

    private static void task6(int age) {
        task3(age);
    }

    private static void task5(int age) {
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("Поздрвляю тывзрослый, тебе пора в университет!");
        }
        else {System.out.println("Пора найти работу!");
        }
    }

    private static void task4(int age) {
        if (age >= 18) {
            System.out.println("Поздравляю - ты совершеннолетний!");
        }
        else  { System.out.println("Тебе нет 18, не беда, все еще впереди!");
        }
    }

    private static void task3(int number) {
        int placesOneVan = 102;
        int sedentaryPlaces = 60;
        int standingPlaces = placesOneVan - sedentaryPlaces;
        if (number <= sedentaryPlaces) {
            System.out.println("Ваше место сидячее");
        }
            else if (number > sedentaryPlaces && number <= placesOneVan) {
                System.out.println("Ваше место стоячее");
        }
                else System.out.println("Мест нет!");

    }


    private static void task2(int age) {
       // int age = 20;
                if (age >= 7 && age < 18) {
                    System.out.println("Ребенок ходит в школу");
                }
                if (age >= 18 && age < 24) {
                     System.out.println("Поздрвляю тывзрослый, тебе пора в университет!");
                }
                if (age >= 24) {
                    System.out.println("Пора найти работу!");
                }

    }

    private static void task1(int age) {
        //int age = 15;
        if (age >= 18) {
           System.out.println("Поздравляю - ты совершеннолетний!");
        }
        if (age < 18) {
            System.out.println("Тебе нет 18, не беда, все еще впереди!");
        }
    }
}