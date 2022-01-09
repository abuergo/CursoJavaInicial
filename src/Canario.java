public class Canario extends Animal{
    public Canario(String nombre, int peso, String habitat, Boolean peligroDeExtincion){
        super(nombre, peso, habitat, peligroDeExtincion);
    }


    @Override
    public String comunicarse() {
        return "Silbido";
    }

    @Override
    public String trasladarse() {
        return "Aereo";
    }
}
