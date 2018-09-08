package customClasses;
public class Berserk extends Beast {
    @Override
    public void kill(String target) {
        System.out.println("The berserk beast kills its enemies with its big sword.");

    }

    @Override
    public void hate(String target) {
        System.out.println("Guts doesn't give a $ about "+target+".");
    }
    public static void main(String[] args) {
        Beast beast = new Beast();
        beast.kill("Griffith");
        Berserk guts = new Berserk();
        guts.kill("Casca");
        guts.hate("Sarah");
    }
}

