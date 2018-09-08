package customClasses;
public class Beast implements Killer {
    @Override
    public void hate(String target) {
        System.out.println(target+", he's disgusting.");
    }
    public String name;
    public int damage;

public Beast() {

}

    public void kill (String target) {
        System.out.println("A soldier of type 'beast' kills "+ target+" with great fury.");

    }

    public static void main(String[] args) {
        Beast berserk = new Beast();
        berserk.damage = 100;
        berserk.name = "Guts";

        System.out.println("The black swordsman does damage rampage "+berserk.damage+" and his friends call him "+berserk.name+".");
        berserk.hate("Corcus");
    }
}
