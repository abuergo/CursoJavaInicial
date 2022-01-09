public class Perro extends Animal{
    public Perro(String nombre, int peso, String habitat, Boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }


    @Override
    public String comunicarse(){
        return "Guau";
    }

    @Override
    public String trasladarse(){
        return "Cuadrupedo";
    }






}
