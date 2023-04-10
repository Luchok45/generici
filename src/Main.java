public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox= new MagicBox<String>(4);

        stringMagicBox.add("qwe");
        stringMagicBox.add("sfg");
        stringMagicBox.add("tertr");
        stringMagicBox.add("dhjytj6");
        String pick = stringMagicBox.pick();
        System.out.println(pick);

    }
}