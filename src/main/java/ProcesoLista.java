public class ProcesoLista {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Faltan argumentos");
            System.exit(1);

        }
        int suma =0;
        int media=0;
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String arg : args) {
            int x = 0;

            try {
                x = Integer.parseInt(arg);

            } catch (NumberFormatException ex) {
                System.out.println("Error en formato de numeros");
                System.exit(2);
            }
            min = Math.min(min, x);
            max = Math.max(max, x);

            suma = suma + x;

        }
        System.out.println("Suma es: " + suma);
        System.out.println("Media es: " + (suma/args.length));
        System.out.println("Max es: " + min);
        System.out.println("Min es: " + max);

    }
}
