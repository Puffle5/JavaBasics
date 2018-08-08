package methods;

public class Frog {
    private String name;

    public Frog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jump(String lovelyGirl) {
        System.out.println("The frog( "+this.name+" ) is jumping and enjoys "+lovelyGirl+" company.");
    }
    public static void typeOfAnimal () {
        System.out.println("The frog is amphibian.");
    }
}
