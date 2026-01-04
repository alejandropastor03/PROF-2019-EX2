package es.upm.grise;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

    public static List<Integer> primos(int n) throws EntradaInvalida {
        if (n <= 1) {
            throw new EntradaInvalida();
        }

        List<Integer> res = new ArrayList<>();
        int num = n;
        int d = 2;

        while (num > 1) {
            while (num % d == 0) {
                res.add(d);
                num = num / d;
            }
            d++;
        }

        return res;
    }
}
