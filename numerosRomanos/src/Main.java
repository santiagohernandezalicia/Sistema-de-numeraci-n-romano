public class Main {
    public static void main(String[] args) {
        numeracion numeracion = new numeracion();
        //Entrada de datos
        String[] numero = {"XIII", "XXX", "IX", "LVIII", "MCMXCIV"};
        int[] resultados = new int[numero.length];

        for (int i = 0; i < numero.length; i++) {
            resultados[i] = numeracion.valores(numero[i]);
            System.out.println("El valor de " + numero[i] + " es: " + resultados[i]);
        }
    }
}