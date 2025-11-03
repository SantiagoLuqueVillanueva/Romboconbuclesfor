public class U {
    public static void main(String[] args) throws Exception {
        double altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la U: "));

        for (int i = 1; i < altura; i++) {
            System.out.print("* ");
            for (int j = 2; j < altura; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        System.out.print("  ");
        for (int i = 2; i < altura; i++) {
            System.out.print("* ");
        }
    }
}