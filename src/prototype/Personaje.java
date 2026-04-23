package prototype;

public abstract class Personaje implements Prototype {

    protected String nombre;
    protected String clase;
    protected int nivel;
    protected int puntosDeVida;
    protected int puntosDeEnergia;

    // Constructor completo
    public Personaje(String nombre, String clase, int nivel, int puntosDeVida, int puntosDeEnergia) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeEnergia = puntosDeEnergia;
    }

    // Constructor de copia (deep copy) — usado por clone()
    protected Personaje(Personaje otro) {
        this.nombre = otro.nombre;
        this.clase = otro.clase;
        this.nivel = otro.nivel;
        this.puntosDeVida = otro.puntosDeVida;
        this.puntosDeEnergia = otro.puntosDeEnergia;
    }

    // Cada subclase implementa su propio clone()
    @Override
    public abstract Prototype clone();

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClase() { return clase; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getPuntosDeVida() { return puntosDeVida; }
    public void setPuntosDeVida(int puntosDeVida) { this.puntosDeVida = puntosDeVida; }

    public int getPuntosDeEnergia() { return puntosDeEnergia; }
    public void setPuntosDeEnergia(int puntosDeEnergia) { this.puntosDeEnergia = puntosDeEnergia; }

    @Override
    public String toString() {
        return "[" + clase + "] " + nombre +
               " | Nivel: " + nivel +
               " | HP: " + puntosDeVida +
               " | EP: " + puntosDeEnergia;
    }
}