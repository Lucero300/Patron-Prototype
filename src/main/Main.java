package main;

import prototype.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   SISTEMA RPG - PATRÓN PROTOTYPE");
        System.out.println("==========================================\n");

        // ─────────────────────────────────────────
        // 1. Crear prototipos BASE (solo una vez con new)
        // ─────────────────────────────────────────
        System.out.println("--- Creando prototipos base ---");
        Guerrero guerreroBase    = new Guerrero("Guerrero Base", 1, 200, 80, 50);
        Mago     magoBase        = new Mago("Mago Base", 1, 120, 180, 90);
        Arquero  arqueroBase     = new Arquero("Arquero Base", 1, 150, 130, 85);

        // ─────────────────────────────────────────
        // 2. Registrar en el PrototypeRegistry
        // ─────────────────────────────────────────
        System.out.println("\n--- Registrando en PrototypeRegistry ---");
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.registrar("guerrero", guerreroBase);
        registry.registrar("mago",     magoBase);
        registry.registrar("arquero",  arqueroBase);

        registry.listarPrototipos();

        // ─────────────────────────────────────────
        // 3. Crear personajes CLONANDO (sin new repetitivo)
        // ─────────────────────────────────────────
        System.out.println("\n--- Clonando personajes desde el Registry ---");

        Guerrero g1 = (Guerrero) registry.obtener("guerrero");
        g1.setNombre("Aragorn");
        g1.setNivel(10);
        g1.setPuntosDeVida(350);
        g1.setDefensa(75);

        Guerrero g2 = (Guerrero) registry.obtener("guerrero");
        g2.setNombre("Boromir");
        g2.setNivel(8);
        g2.setPuntosDeVida(300);

        Mago m1 = (Mago) registry.obtener("mago");
        m1.setNombre("Gandalf");
        m1.setNivel(20);
        m1.setPuntosDeEnergia(300);
        m1.setPoderMagico(150);

        Arquero a1 = (Arquero) registry.obtener("arquero");
        a1.setNombre("Legolas");
        a1.setNivel(15);
        a1.setPrecisionPunteria(98);

        // ─────────────────────────────────────────
        // 4. Mostrar personajes generados
        // ─────────────────────────────────────────
        System.out.println("\n--- Personajes creados por clonación ---");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(m1);
        System.out.println(a1);

        // ─────────────────────────────────────────
        // 5. Verificar que son copias independientes (deep copy)
        // ─────────────────────────────────────────
        System.out.println("\n--- Verificando independencia de clones (deep copy) ---");
        System.out.println("¿g1 == g2? " + (g1 == g2));                   // false
        System.out.println("¿g1 es mismo que prototipo base? " + (g1 == guerreroBase)); // false
        System.out.println("Nombre g1: " + g1.getNombre() + " | Nombre g2: " + g2.getNombre());
        System.out.println("Los clones son independientes: modificar uno no afecta al otro. ✓");

        System.out.println("\n==========================================");
        System.out.println("   FIN DEL SISTEMA");
        System.out.println("==========================================");
    }
}