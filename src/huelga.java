public class huelga {
    public static void main(String[] args) {
        double numeroIntroducido1 = Integer.parseInt(System.console().readLine("Introduzca el primer número: "));
        double numeroIntroducido2 = Integer.parseInt(System.console().readLine("Introduzca el segundo número: "));
        double numeroIntroducido3 = Integer.parseInt(System.console().readLine("Introduzca el tercer número: "));

        int numeroGrande = (int)Math.max(numeroIntroducido1, Math.max(numeroIntroducido2,numeroIntroducido3));
        int numeroPequeño = (int)Math.min(numeroIntroducido1, Math.min(numeroIntroducido2,numeroIntroducido3));
        int numeroMedio = (int)(numeroIntroducido1 + numeroIntroducido2 + numeroIntroducido3) - numeroGrande - numeroPequeño;

        System.out.println();
        System.out.print(numeroGrande+": ");

        for (int i = 0; i < numeroGrande; i++) {
            System.out.print("█");
        }
        System.out.println();
        System.out.println();
        System.out.print(numeroMedio+": ");
        for (int i = 0; i < numeroMedio; i++) {
            System.out.print("█");
        }
        System.out.println();
        System.out.println();
        System.out.print(numeroPequeño+": ");
        for (int i = 0; i < numeroPequeño; i++) {
            System.out.print("█");
        }
    }
}
