package org.example.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        // Проверка базового функционала с использованием утверждений AssertJ:
        assertThat(Calculator.calculatingDiscount(100.5, 50)).isEqualTo(50.25);
        assertThat(Calculator.calculatingDiscount(140.5, 100)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(200.3, 0)).isEqualTo(200.3);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() -> Calculator.calculatingDiscount(500.9, 101))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(500.9, -1))
                .isInstanceOf(IllegalArgumentException.class);

        //Работа метода:
        System.out.println(Calculator.calculatingDiscount(400.1, 23));//должно быть 308.077

    }
}
