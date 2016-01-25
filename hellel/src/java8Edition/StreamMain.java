package java8Edition;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamMain {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();

        menu.add(new Dish("Boarch", 500, true, DishType.OTHER));
        menu.add(new Dish("Pork", 500, false, DishType.MEAT));
        menu.add(new Dish("Salad", 100, true, DishType.OTHER));
        menu.add(new Dish("Shark", 450, true, DishType.FISH));
        menu.add(new Dish("Burger", 900, false, DishType.OTHER));
        menu.add(new Dish("Potato", 300, true, DishType.OTHER));
        Dish whisky = new Dish("Whisky", 0, true, DishType.OTHER);
        menu.add(whisky);
        menu.add(new Dish("Mandarin", 120, true, DishType.OTHER));

        Predicate<Dish> lowCalories = dish -> dish.getCalories() < 500;

        Stream<Dish> lowCaloriesStream = menu.stream().filter(lowCalories);
        System.out.println(lowCaloriesStream.collect(toList()));
        Consumer<Dish> printer = System.out::println;
        lowCaloriesStream = menu.stream().limit(2).filter(lowCalories);
        lowCaloriesStream.forEach(printer);
        long veguCount = menu.stream().filter(Dish::isVegearians).count();
        System.out.println(veguCount + " Vegetarian's dishes");
        menu.stream().filter(Dish::isVegearians).filter(dish -> dish.getCalories() > 100)
                .map(Dish::getName).forEach(System.out::println);
        Predicate<Dish> heavy = dish1 -> dish1.getCalories() > 100;
        Predicate<Dish> meat = dish -> dish.getType() == DishType.MEAT;
        Predicate<Dish> meatAndHeavy = meat.and(heavy);

        boolean meatAndHeavyPresent = menu.stream().anyMatch(meatAndHeavy);
        System.out.println("meat and heavy present in list " + meatAndHeavyPresent);

        Predicate<Dish> nameIsNotNull = dish -> dish.getName() != null;
        boolean namesAreOk = menu.stream().allMatch(nameIsNotNull);
        System.out.println("All names are not null " + nameIsNotNull);
        Predicate<Dish> isNotMeat = meat.negate();
        Predicate<Dish> isHealthy = isNotMeat.and(dish -> dish.getName().equals("healthy"));
        Optional<Dish> firstDish = menu.stream().filter(isHealthy).findFirst();
        if (firstDish.isPresent()) {
            System.out.println(firstDish.get().getName());
        } else {
            System.out.println("There is no healthy food");
        }

        System.out.println("Healthy dish is " + firstDish.orElse(whisky));
        System.out.println("Healthy dish is " + firstDish.orElseGet(Dish::new));
        //FLATMAP OPTIONAL

        Optional<String> reduce=menu.parallelStream().map(Dish::getName)
                .reduce((accomulator,dishName)->accomulator +", "+dishName);
        System.out.println(reduce);

    }
}
