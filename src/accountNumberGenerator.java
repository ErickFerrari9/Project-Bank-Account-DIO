import java.security.SecureRandom;

public class accountNumberGenerator {

    private static final SecureRandom RAND = new SecureRandom();


      //Gera um código “NNNNN‑D”, onde D é o dígito verificador.

    public static String numberGenerator() {
        int[] digitos = new int[5];

        // 1. Gerar 5 dígitos aleatórios (0‑9)
        for (int i = 0; i < 5; i++) {
            digitos[i] = RAND.nextInt(10);
        }

        // 2. Calcular DV pelo algoritmo de Luhn
        int soma = 0;
        // percorrer da direita → esquerda
        for (int i = digitos.length - 1, pos = 1; i >= 0; i--, pos++) {
            int d = digitos[i];
            if (pos % 2 == 0) {      // posições pares (pos=2,4…)
                d *= 2;
                if (d > 9) d -= 9;
            }
            soma += d;
        }
        int dv = (10 - (soma % 10)) % 10;

        // 3. Montar a string
        StringBuilder sb = new StringBuilder(7);
        for (int d : digitos) sb.append(d);
        sb.append('-').append(dv);
        return sb.toString();
    }
}


