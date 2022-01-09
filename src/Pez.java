public class Pez extends Animal{
    public Pez(String nombre, int peso, String habitat, Boolean peligroDeExtincion){
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    @Override
    public String comunicarse() {
        return "Glup glup";
    }

    @Override
    public String trasladarse() {
        return "Nadando";
    }
}
