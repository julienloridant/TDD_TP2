package FacteursPremiers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FacteursPremiers {
    static Set<Integer> generate(int nb) {
        if (nb > 0) {
            HashSet<Integer> listFP = new HashSet<Integer>();

            // Diviser le nombre par 2 tant qu'il est pair
            while (nb % 2 == 0) {
                listFP.add(2);
                nb /= 2;
            }

            // Diviser le nombre par les nombres impairs à partir de 3
            for (int i = 3; i <= Math.sqrt(nb); i += 2) {
                while (nb % i == 0) {
                    listFP.add(i);
                    nb /= i;
                }
            }

            // Si le nombre est un facteur premier supérieur à 2
            if (nb > 2) {
                listFP.add(nb);
            }

            return listFP;
        }
        else {
            throw new RuntimeException("Le nombre doit être supérieur à 0");
        }
    }
}
