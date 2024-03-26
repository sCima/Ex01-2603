public class Main {
    public static void main(String[] args) {
        Usuario lucas = new Usuario(01, "Lucas", "123");
        Usuario fepile = new Usuario(02, "Fepile", "123");

        System.out.println(fepile.compareTo(fepile));
    }

}