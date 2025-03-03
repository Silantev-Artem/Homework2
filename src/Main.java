public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\nЗадание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\nЗадание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\nЗадание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("\nЗадание 5");
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("\nЗадание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов " + sumBoxersWeight + " кг.");
        var diffBoxerWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между массами бойцов " + diffBoxerWeight + " кг.");

        System.out.println("\nЗадание 7");
        var moduloBoxerWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления между двумя весами равен " + moduloBoxerWeight);

        System.out.println("\nЗадание 8.1");
        var totalWorkHours = 640;
        var hoursPerWorker = 8;
        var totalWorkers = totalWorkHours / hoursPerWorker;
        System.out.println("Всего работников в компании — " + totalWorkers + " человек");

        System.out.println("\nЗадание 8.2");
        totalWorkers = totalWorkers + 94;
        totalWorkHours = totalWorkers * hoursPerWorker;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками");


    }
}