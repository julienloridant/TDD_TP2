package FacteursPremiers;
import org.junit.jupiter.api.Test;
import static FacteursPremiers.FacteursPremiers.generate;
import static org.assertj.core.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;


class FacteursPremiersTest {

    @Test
    void devrait_retourner_une_Liste_Vide(){

        //GIVEN
        int nb = 1;

        //WHEN
        Set<Integer> ArrayTest = FacteursPremiers.generate(1);

        //THEN
        assertThat(ArrayTest).containsExactlyInAnyOrder();


    }

}