public class App {
    public static void main(String[] args) throws Exception {

        View view = new View();
        int[] numeros = { 19, 24, -19, -28, 5, 30, -12, 34, -9, 52, 0, 45 };
       

        while (true) {
            view.showMenu();
            int opcion =  view.inputOption(4);

            view.showOrder();
            int orden = view.inputOption(2);
            Boolean ordenOpt = orden == 1;
            view.showPasosMenu();
            int pasos = view.inputOption(2);
            

            switch (opcion) {
                case 1:
                    System.out.println("Metodo Selection");
                    view.showOrder();
                    SortSelection sortSelection = new SortSelection();
                    sortSelection.sort(numeros, ordenOpt, pasos==1);
                    
                    break;
                case 2:
                    System.out.println("Metodo Insertion");
                    view.showOrder();
                    SortInsertion sortInsertion = new SortInsertion();
                    sortInsertion.sort(numeros, ordenOpt, pasos ==1);
                   
                    break;

                case 3:
                    System.out.println("Metodo Burbuja Mejorada");
                    view.showOrder();
                    SortBubbleMejorada sortBubbleMejorada = new SortBubbleMejorada();
                    sortBubbleMejorada.sort(numeros, ordenOpt, pasos == 1);
                    break;

                case 4:
                    System.out.println("Adios");
                    System.exit(opcion);
                     break;
            
                default:

                    break;
            }

            
        }

       
    }
}
