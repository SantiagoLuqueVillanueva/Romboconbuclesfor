public class rombo {
    public static void main(String[] args) {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura del rombo: "));

        for (int i = 0; i < altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (altura - i)) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}