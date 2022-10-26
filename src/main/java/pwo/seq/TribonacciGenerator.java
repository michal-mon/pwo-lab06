package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa generatora ciągu Tribonacciego o wyrazach w zakresie od 0.
 * @author student
 */
public class TribonacciGenerator extends FibonacciGenerator {

    /**
     * Tworzenie instancji klasy (obiektu) <b>TribonacciGenerator</b>
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
    * Powoduje, że metoda {@link #nextTerm()}
    * rozpoczyna od 0.
    */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
    * Zwraca kolejny wyraz ciągu Tribonacciego.
    *
    * @return Wartość wyrazu ciągu Tribonacciego
    */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
