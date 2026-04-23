package prototype;

public class Mago extends Personaje {

    private int poderMagico;

    public Mago(String nombre, int nivel, int puntosDeVida, int puntosDeEnergia, int poderMagico) {
        super(nombre, "Mago", nivel, puntosDeVida, puntosDeEnergia);
        this.poderMagico = poderMagico;
    }

    // Constructor de copia (deep copy)
    private Mago(Mago otro) {
        super(otro);
        this.poderMagico = otro.poderMagico;
    }

    @Override
    public Prototype clone() {
        return new Mago(this);
    }

    public int getPoderMagico() { return poderMagico; }
    public void setPoderMagico(int poderMagico) { this.poderMagico = poderMagico; }

    @Override
    public String toString() {
        return super.toString() + " | Poder Mágico: " + poderMagico;
    }
}