package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa generatora ciągu Fibonacciego o wyrazach w zakresie od 0.
 * @author student
 */
public class FibonacciGenerator extends Generator {
    
    /**
     * Tworzenie instancji klasy (obiektu) <b>TribonacciGenerator</b>
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
    * Powoduje, że metoda {@link #nextTerm()}
    * rozpoczyna od 0.
    */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
    * Zwraca kolejny wyraz ciągu Fibonacciego.
    *
    * @return Wartość wyrazu ciągu Fibonacciego
    */
    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
