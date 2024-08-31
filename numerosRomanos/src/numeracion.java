import java.util.HashMap;
import java.util.Map;
public class numeracion {
    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }
    public static int getValue(char romanChar) {
        return romanMap.getOrDefault(romanChar, 0);
    }

    public int valores(String roman) {
        int total = 0;
        int Valor = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int contador = getValue(roman.charAt(i));

            if (contador == 0) {
                return 0;
            }

            if (contador >= Valor) {
                total += contador;
            } else {
                total -= contador;
            }
            Valor = contador;
        }

        return total;
    }
}