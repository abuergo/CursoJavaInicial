public class Vaca extends Animal{
    public Vaca(String nombre, int peso, String habitat, Boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    @Override
    public String comunicarse() {
        return "Muu";
    }

    @Override
    public String trasladarse() {
        return "Cuadrupedo";
    }
}
