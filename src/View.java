import java.util.Scanner;

public class View {
     private final Scanner scanner;

    

    public View(){
        scanner = new Scanner(System.in);
        System.out.println("Metodos de Ordenamiento");
    }

    public void showMenu(){
        System.out.println("\n--Menu Metodos--");
        System.out.println("1-->Selection");
        System.out.println("2-->Insertion");
        System.out.println("3-->Burbuja Mejorado");
        System.out.println("4-->Salir");
        System.err.print("Seleccione la opcion: ");
    }
    public int inputOption(int max){
        int option = -1;
        while (true) {
            if( scanner.hasNextInt()){
                //Si ingreso un numero 
                option = scanner.nextInt();
                if( option >= 1 && option <= max)
                break;
            }else{
                scanner.next();
                

            }
            System.out.print("Opcion invalida, ingrese otra vez: ");

            
        }
        return option;

    }

    public void showOrder(){
        System.out.println("--Seleccione el Orden--");
        System.out.println("1--Asc");
        System.out.println("2--Desc");
        System.out.print("Seleccione la Opcion:");
        

    }

    public void showPasosMenu(){
        System.out.println("--Quiere ver los pasos--");
        System.out.println("1--Si");
        System.out.println("2--No");
        System.out.print("Seleccione la Opcion:");
        

    }


     public boolean inputBoolean(String mensaje) {
        System.out.print(mensaje);
        while (true) {
            if (scanner.hasNextBoolean()) {
                return scanner.nextBoolean();
            } else {
                scanner.next(); 
                System.out.print("Entrada inválida. Ingresar true o false: ");
            }
        }
    }

public boolean inputOrdenAD(String mensaje) {
    System.out.print(mensaje);
    while (true) {
        String input = scanner.next().trim().toUpperCase();
        if (input.equals("A")) return true;
        if (input.equals("D")) return false;
        System.out.print("Entrada inválida. Ingresar A o D: ");
    }
}

    
}
