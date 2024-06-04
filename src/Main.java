public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var howMuchMore = 4;
        dog = dog+howMuchMore;
        cat = cat+howMuchMore;
        paper = paper+howMuchMore;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var lessDogs = 3.5;
        var lessCats = 1.6;
        var lessPaper = 7639;
        dog = dog-lessDogs;
        cat = cat-lessCats;
        paper = paper-lessPaper;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        var howMuchMoreFriends = 2;
        friend = friend+howMuchMoreFriends;
        System.out.println(friend);

        var howMuchLess = 7;
        friend = friend-howMuchLess;
        System.out.println(friend);



    }
}