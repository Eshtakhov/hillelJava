package database;

import org.junit.runner.Computer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Created by ES on 14.12.2015.
 */
public class ProductMemoryDAO implements ProductDAO {
    private List<Product> products = new ArrayList<>();

    {
        products.add(new Product(1, "Mouse", "Computer", 20));
        products.add(new Product(2, "Keybord", "Computer", 25));

    }


    @Override
    public Optional<Product> findById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    @Override
    public List<Product> findALl() {
        return products;
    }

    @Override
    public void deleteById(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                return;
            }
        }
       /* products.remove(products.stream()
                .filter(product -> product.getId()==id)
                .findFirst();
*/
    }

    @Override
    public void update(Product product) {
        deleteById(product.getId());
        products.add(product);


    }

    @Override
    public void create(Product product) {
        products.add(product);
    }
}
