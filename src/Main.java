import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Usuario lucas = new Usuario(01, "Lucas", "123");
        Usuario fepile = new Usuario(03, "Fepile", "123");

        System.out.println(lucas.compareTo(fepile));
        System.out.println(fepile.compareTo(lucas));
        System.out.println(fepile.compareTo(fepile));

        Map mapa = new HashMap();

        mapa.put("Lucas", lucas);

        Object objeto = mapa.get("Lucas");

        Usuario usuario = (Usuario) objeto;
        System.out.println(usuario.getNome());
    }

}