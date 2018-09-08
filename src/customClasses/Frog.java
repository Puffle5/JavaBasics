package customClasses;
public class Frog implements Animal{
    public void eat() {
        System.out.println("Frogs eat flies.");

    }
    public void move() {
        System.out.println("Frogs move by jumping.");

    }
    public void sound(){
        System.out.println("Croak.");

    }

    public static void main(String[] args) {
        Animal frog = new Frog();
        Animal turtle = new Turtle();

        frog.eat();
        turtle.eat();

        Animal[] animals = new Animal[2];
        animals[0] = frog;
        animals[1] = turtle;


        for (int i = 0; i<animals.length; i++)
        {
            animals[i].eat();
        }
    }
}
