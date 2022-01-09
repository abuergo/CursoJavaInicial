public class Gato extends Animal{
    public Gato(String nombre, int peso, String habitat, Boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    @Override
    public String comunicarse() {
        return "Miau";
    }

    @Override
    public String trasladarse() {
        return "Cuadrupedo";
    }
}
