package stringBuilder;

public class Main
{
    public static void main(String[] args) {
        String name = "Loki";
        name = name+" , Odin's son";
        System.out.println(name);

        String name_2 = "Thor";


        StringBuilder builder = new StringBuilder();
        builder.insert(0, " , Odin's son ");
        builder.append("Thanos");
        System.out.println(builder);
    }
}
