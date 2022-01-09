public abstract class Animal {
    private String nombre;
    private int peso;
    private String habitat;
    private Boolean peligroDeExtincion;

    public Animal() {
    }

    public Animal(String nombre, int peso, String habitat, Boolean peligroDeExtincion) {
        this.nombre = nombre;
        this.peso = peso;
        this.habitat = habitat;
        this.peligroDeExtincion = peligroDeExtincion;
    }

    public abstract String comunicarse();
    public abstract String trasladarse();




}
