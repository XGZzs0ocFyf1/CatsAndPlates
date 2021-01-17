import java.util.Arrays;

//app
public class App {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 5);
        Plate plate = new Plate(15);
        plate.info();


        barsik.eat(plate);
        plate.info();


        //check
        Cat fluffy = new Cat("Fluffy", 20);
        fluffy.eat(plate);
        plate.info();


        //check that food can't be negative
        plate.decreaseFood(16);
        plate.info();


        /*
        5. Создать массив котов и тарелку с едой,
         попросить всех котов покушать из этой тарелки
         и потом вывести информацию о сытости котов в консоль
         */
        Cat[] cats = {
                new Cat("Red", 5),
                new Cat("White", 6),
                new Cat("RatHunter", 10),
                new Cat("Nyansus", 7),
                new Cat("Jonny", 5)
        };

        Plate bigPlate = new Plate(100);
        Arrays.stream(cats).forEach(x -> x.eat(bigPlate));

        bigPlate.info();


    }
}
