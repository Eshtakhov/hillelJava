package java8Edition;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by ES on 14.01.2016.
 */
public class Java8MAin {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList();
        apples.add(new Apple("Red", 200));
        apples.add(new Apple("Green", 160));
        apples.add(new Apple("Red", 180));
        apples.add(new Apple("Yellow", 150));
        apples.add(new Apple("Green", 225));
        List<Apple> redApples1 = fiter(apples, Java8MAin::colorFilter);
        List<Apple> redAndHeavyAplles = fiter(redApples1, apple -> apple.getWeight()>170);


        List<Apple> heavyApple=apples.stream().filter(apple -> apple.getColor().equals("Green")).collect(Collectors.toList());
        System.out.println(heavyApple);

    }

    private static boolean colorFilter(Apple apple) {
        if (apple.getColor().equals("Red"))
            return true;

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

        integers.sort(( o1, o2)-> o1.compareTo(o2));
        System.out.println(integers);
    }
    public static int sot(Integer o1,Integer o2){
        return o1.compareTo(o2);
    }
}
