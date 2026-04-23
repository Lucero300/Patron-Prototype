package prototype;

public class Guerrero extends Personaje {

    private int defensa;

    public Guerrero(String nombre, int nivel, int puntosDeVida, int puntosDeEnergia, int defensa) {
        super(nombre, "Guerrero", nivel, puntosDeVida, puntosDeEnergia);
        this.defensa = defensa;
    }

    // Constructor de copia (deep copy)
    private Guerrero(Guerrero otro) {
        super(otro);
        this.defensa = otro.defensa;
    }

    @Override
    public Prototype clone() {
        return new Guerrero(this);
    }

    public int getDefensa() { return defensa; }
    public void setDefensa(int defensa) { this.defensa = defensa; }

    @Override
    public String toString() {
        return super.toString() + " | Defensa: " + defensa;
    }
}