//Cat
public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        //если коту мало еды он ее не трогает
        if (plate.getFood() < appetite){
            System.out.print("There isn't enough food in the plate. ");
            System.out.println(name + " is hungry");
            return;
        }

        System.out.print(name + " is eating. ");
        plate.decreaseFood(appetite);
        appetite = 0;
        satiety = true;
        System.out.println(name + " is full");
    }


}
