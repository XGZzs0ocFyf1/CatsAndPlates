//plate
public class Plate {

    //amount of food
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public int getFood() {
        return food;
    }

    /*
    6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
     */
    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (appetite < food) food -= appetite;
    }
}
