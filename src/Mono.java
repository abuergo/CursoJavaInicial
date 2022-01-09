public class Mono extends Animal {
    public Mono(String nombre, int peso, String habitat, Boolean peligroDeExtincion){
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    @Override
    public String comunicarse() {
        return "Uh uh";
    }

    @Override
    public String trasladarse() {
        return "Cuadrupedo y bipedo";
    }
}
