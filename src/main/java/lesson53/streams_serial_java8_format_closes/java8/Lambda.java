package lesson53.streams_serial_java8_format_closes.java8;

import java.util.function.Supplier;

public class Lambda {

    public static void main (String[] args) {
        Soldat s1 = new Soldat();
        Soldat s2 = new Soldat();
        Soldat s3 = new Soldat();
        Soldat s4 = new Soldat();
        Soldat s5 = new Soldat();
        Soldat2 s6 = new Soldat2();
        Soldat2 s7 = new Soldat2();

        // approach 1
        s1.executeOrder(new Order() {

            @Override
            public String execute () {
                return "order for soldier #1";
            }
        });
        // approach 2
        Order o2 = new Order() {
            @SuppressWarnings ("unused")
            int orderResult = 0;

            @Override
            public String execute () {
                orderResult = 1;
                return "order for soldier #2";
            }
        };
        s2.executeOrder(o2);
        /* o2.orderResult - не прокатит */

        // approach 3
        s3.executeOrder(new InnerOrderImpl());

        // approach 4 java 8? lambda expression;
        s4.executeOrder( () -> {
            return "Lambda order result";
        });

        s4.executeOrder( () -> "Lambda2 order result");
        Order o4 = () -> "Lambda2 order result";
        s4.executeOrder(o4);

        // approach 5 Lamdba с параметрами
        int result = s5.heloOfficerSom( (a) -> a + a, 3);
        System.out.println(result);

        // approach 6 method reference
        System.out.println(s5.heloOfficerSom(Math::sqrt, 9));

        // Double someDobject;
        // ss5.heloOfficerSom(someDobject::doubleValue, 5);
        s6.executeOrder( () -> "Lambda2 order result");

        s7.executeOrder(new Supplier<String>() {

            @Override
            public String get () {
                return "Order to soldier 7";
            }
        });
    }

    private static class InnerOrderImpl implements Order {

        @Override
        public String execute () {
            return "order as inner class";
        }
    }
}
/*
 * 1. лямбда-выражения 1.1. функциональные интерфейсы 1.2. method raference
 * 
 * 2. Stream (расширение коллекций) 3. Реализация метода интерфейса по умолчанию
 * 4. Прочие мелкие дополнения к библиотеке
 */
