package Ejercicio5;

public class Circulo extends Figura {

    private float radio;

    public Circulo() {
		super();
    }

    public Circulo(Coordenadas origen, float radio) {
        super();
		this.origen = origen;
        this.radio = radio;
    }

    public Coordenadas getOrigen() {
        return origen;
    }

    public void setOrigen(Coordenadas origen) {
        this.origen = origen;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}

