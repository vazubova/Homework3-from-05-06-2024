public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var howMuchMore = 4;
        dog = dog + howMuchMore;
        cat = cat + howMuchMore;
        paper = paper + howMuchMore;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var lessDogs = 3.5;
        var lessCats = 1.6;
        var lessPaper = 7639;
        dog = dog - lessDogs;
        cat = cat - lessCats;
        paper = paper - lessPaper;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;

        System.out.println(friend);

        var howMuchMoreFriends = 2;
        friend = friend + howMuchMoreFriends;

        System.out.println(friend);

        var howMuchLess = 7;
        friend = friend - howMuchLess;

        System.out.println(friend);

        var frog = 3.5;

        System.out.println(frog);

        var moreFrogs = 10;
        frog = frog * moreFrogs;

        System.out.println(frog);

        var lessFrogs = 3.5;
        frog = frog / lessFrogs;

        System.out.println(frog);

        var plusNumber = 4;
        frog = plusNumber + frog;

        System.out.println(frog);

        var massOfFirstBoxer = 78.2;
        var massOfSecondBoxer = 82.7;

        var massOfBothBoxers = massOfFirstBoxer + massOfSecondBoxer;
        var differenceBetweenBothBoxers = massOfSecondBoxer - massOfFirstBoxer;

        System.out.println("Общая масса двух боксёров состовляет " + massOfBothBoxers + "кг");
        System.out.println("Разница в весе между двумя боксёрами составляет " + differenceBetweenBothBoxers + "кг");

        var firstWeight = 38;
        var secondWeight = 5;
        var remainder = firstWeight % secondWeight;

        System.out.println(remainder);

        var hoursAtAll = 640;
        var horsForEveryWorker = 8;
        var howMuchMoreWorkers = 94;

        var howMuchWorkers = hoursAtAll / horsForEveryWorker;
        var hoursWithMoreWorkers = hoursAtAll / (howMuchWorkers + howMuchMoreWorkers);

        System.out.println("Всего работников в компании — " + howMuchWorkers + " человек");
        System.out.println("Если в компании работает " + howMuchMoreWorkers + " человек, то всего " + hoursWithMoreWorkers + " часа работы может быть поделено между сотрудниками");


    }
}