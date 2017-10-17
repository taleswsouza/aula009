package pacote.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pacote.modelo.Usuario;

public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luis Inácio Lula", "lula@gmail.com");
        Usuario usuario2 = new Usuario("Ferando Henrique Cardoso", "fhc@gmail.com");
        
        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);
        
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario: " + usuario.getNome());
        }
        
        Map<String, Usuario> mapaDeUsuarios = new HashMap<>();
        mapaDeUsuarios.put("lula", usuario1);
        mapaDeUsuarios.put("fhc", usuario2);
        
        System.out.println("Lula: " + mapaDeUsuarios.get("lula"));
        System.out.println("FHC: " + mapaDeUsuarios.get("fhc"));
    }

}
