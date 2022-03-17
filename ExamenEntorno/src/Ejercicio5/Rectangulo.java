package Ejercicio5;

public class Rectangulo {
	private Coordenadas origen;
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(Coordenadas origen, int base, int altura) {
        this.origen = origen;
        this.base = base;
        this.altura = altura;
    }

    public Coordenadas getOrigen() {
        return origen;
    }

    public void setOrigen(Coordenadas origen) {
        this.origen = origen;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}


