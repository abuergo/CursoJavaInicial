import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean codigoValido = false;

        Map<String, Pais> list = new HashMap<String, Pais>();
        list.put("VZ", new Pais("Venezuela", 58, "VZ"));
        list.put("AR", new Pais("Argentina", 54, "AR"));
        list.put("BR", new Pais("Brasil", 55, "BR"));
        list.put("CH", new Pais("Chile", 56, "CH"));

        System.out.println("Fecha => " + new Date());
        System.out.print("Ingrese el codigo del pais: ");
        int code = entrada.nextInt();

        for (Map.Entry<String, Pais> e : list.entrySet()){
            if(code == e.getValue().getCode()){
                System.out.println("Ingresaste el codigo del siguiente pais: " + e);
                codigoValido = true;
            }
        }
        if(!codigoValido){
            System.out.println("El codigo ingresado es invalido. No se encuentra ningun pais con dicho codigo.");
        }

        System.out.println("Terminado en fecha => " + new Date());
    }
}
