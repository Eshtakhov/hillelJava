package java8Edition;

import java.security.PublicKey;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;


public class Java8MAin {
    public static void main(String[] args) {


    }

    private static void lamdaExample() {
        List<Apple> apples=createAplle(10, (Supplier) Apple::new);
        consumerAplle(apples,System.out::println);
        System.out.println(mapToString(apples,(apple -> apple.getColor())));
    }

    public static void consumerAplle(List<Apple>  apples, Consumer<Apple> appleConsumer){
        for (Apple apple: apples) {
            appleConsumer.accept(apple);
        }

    }

    private static void streamEXemple() {
        List<Apple> apples = new ArrayList();
        apples.add(new Apple("Red", 200));
        apples.add(new Apple("Green", 160));
        apples.add(new Apple("Red", 180));
        apples.add(new Apple("Yellow", 150));
        apples.add(new Apple("Green", 225));
        List<Apple> redApples1 = fiter(apples, Java8MAin::colorFilter);
        List<Apple> redAndHeavyAplles = fiter(redApples1, apple -> apple.getWeight() > 170);


        List<Apple> heavyApple = apples.stream().filter(apple ->
                apple.getColor().equals("Green")).collect(Collectors.toList());
        System.out.println(heavyApple);

        Predicate<Apple> isHeavy = Java8MAin::isHeavy;
        Predicate<Apple> isGreen = apple -> apple.getColor().equals("red");
        Predicate<Apple> isHeavyandisGreen = isGreen.and(isHeavy);



        List<Apple> redandheavyapple;
        redandheavyapple = apples
                .stream()
                .filter(isHeavyandisGreen)
                .collect(Collectors.toList());

        List<String> colors = apples.stream()
                .map(Apple::getColor)
                .collect(Collectors.toList());
        List<String> color=apples.stream().map(Apple::getColor).collect(Collectors.toList());

    }

    private static boolean colorFilter(Apple apple) {
        if (apple.getColor().equals("Red")) {
            return true;
        }
        return false;
    }


    private static List<Apple> fiter(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<String> mapToString(List<Apple> apples, Function<Apple,String> function){
        List<String> strings=new ArrayList<>();
        for(Apple apple: apples){
            strings.add(function.apply(apple));
        }
        return strings;

    }

    private static boolean isHeavy(Apple apple) {
        return apple.getWeight() > 170;
    }


    private static void defaultMethodExample() {
        Fruit fruit = new Apple();
        System.out.println(fruit.chop());

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(3);
        integers.add(2);

        Collections.sort(integers);

        integers.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(integers);
    }

    public static int sort(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

    public static List<Apple> createAplle(int counts, BiFunction<String, Integer, Apple> appleSupplier) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < counts; i++) {
            apples.add(appleSupplier.apply("Yellow", 150));
        }
        return apples;
    }

    public static List<Apple> createAplle(int counts, Supplier<Apple> appleSupplier) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < counts; i++) {
            apples.add(appleSupplier.get());
        }
        return apples;
    }


}
