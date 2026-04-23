package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    // Mapa que almacena los prototipos base por nombre de clave
    private Map<String, Personaje> prototipos = new HashMap<>();

    /**
     * Registra un personaje prototipo bajo una clave.
     */
    public void registrar(String clave, Personaje personaje) {
        prototipos.put(clave, personaje);
        System.out.println("[REGISTRY] Prototipo registrado: " + clave);
    }

    /**
     * Devuelve un CLON del prototipo registrado bajo esa clave.
     * No se usa new directamente — se clona la instancia existente.
     */
    public Personaje obtener(String clave) {
        Personaje prototipo = prototipos.get(clave);
        if (prototipo == null) {
            throw new IllegalArgumentException("No existe prototipo con clave: " + clave);
        }
        return (Personaje) prototipo.clone();
    }

    /**
     * Elimina un prototipo del registro.
     */
    public void eliminar(String clave) {
        prototipos.remove(clave);
    }

    /**
     * Lista las claves registradas.
     */
    public void listarPrototipos() {
        System.out.println("\n[REGISTRY] Prototipos registrados:");
        for (String clave : prototipos.keySet()) {
            System.out.println("  - " + clave + ": " + prototipos.get(clave));
        }
    }
}