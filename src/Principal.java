import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        char rta;
        Scanner entrada = new Scanner(System.in);

        do {
        System.out.println("Defina los atributos del animal a crear: ");
        System.out.print("Nombre: ");
        String nombreAnimal = entrada.next();
        System.out.print("Peso: ");
        int pesoAnimal = entrada.nextInt();
        System.out.print("Habitat: ");
        String habitatAnimal = entrada.next();
        System.out.print("Peligro de extincion (Booleano): ");
        Boolean peligroDeExtincionAnimal = entrada.nextBoolean();

        System.out.println("\nIngrese el animal a crear: ");
        System.out.println("Opciones: \n1-Perro \n2-Gato \n3-Canario \n4-Vaca \n5-Pez");
        System.out.print("\nIngrese la opcion (del 1 al 5): ");
        int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    Perro perro = new Perro(nombreAnimal, pesoAnimal, habitatAnimal, peligroDeExtincionAnimal);
                    System.out.println("El animal creado dice: " + perro.comunicarse());
                    break;
                case 2:
                    Gato gato = new Gato(nombreAnimal, pesoAnimal, habitatAnimal, peligroDeExtincionAnimal);
                    System.out.println("El animal creado dice: " + gato.comunicarse());
                    break;
                case 3:
                    Canario canario = new Canario(nombreAnimal, pesoAnimal, habitatAnimal, peligroDeExtincionAnimal);
                    System.out.println("El animal creado dice: " + canario.comunicarse());
                    break;
                case 4:
                    Vaca vaca = new Vaca(nombreAnimal, pesoAnimal, habitatAnimal, peligroDeExtincionAnimal);
                    System.out.println("El animal creado dice: " + vaca.comunicarse());
                    break;
                case 5:
                    Pez pez = new Pez(nombreAnimal, pesoAnimal, habitatAnimal, peligroDeExtincionAnimal);
                    System.out.println("El animal creado dice: " + pez.comunicarse());
                    break;
                default:
                    throw new InputMismatchException("El animal no fue creado porque la opcion ingresada fue incorrecta");
            }
            System.out.println("¿Desea crear otro animal? (s/n)");
            rta = entrada.next().charAt(0);

        } while (rta == 's');

    }
}
