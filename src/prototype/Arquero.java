package prototype;

public class Arquero extends Personaje {

    private int precisionPunteria;

    public Arquero(String nombre, int nivel, int puntosDeVida, int puntosDeEnergia, int precisionPunteria) {
        super(nombre, "Arquero", nivel, puntosDeVida, puntosDeEnergia);
        this.precisionPunteria = precisionPunteria;
    }

    // Constructor de copia (deep copy)
    private Arquero(Arquero otro) {
        super(otro);
        this.precisionPunteria = otro.precisionPunteria;
    }

    @Override
    public Prototype clone() {
        return new Arquero(this);
    }

    public int getPrecisionPunteria() { return precisionPunteria; }
    public void setPrecisionPunteria(int precisionPunteria) { this.precisionPunteria = precisionPunteria; }

    @Override
    public String toString() {
        return super.toString() + " | Precisión: " + precisionPunteria;
    }
}