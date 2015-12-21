package database;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Created by ES on 21.12.2015.
 */
public class ProductDAOXML implements ProductDAO {
    public static final String STRING = "c:\\products.xml";
    private List<Product> products;

    /* {
        products.add(new Product(1, "Mouse", "Computer", 20));
        products.add(new Product(2, "Keybord", "Computer", 25));

    }*/


    public ProductDAOXML() {
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(STRING)));
            products = (List<Product>) decoder.readObject();
            decoder.close();
        } catch (FileNotFoundException e) {
            products = new ArrayList<>();
            products.add(new Product(1, "Mouse", "Computer", 20));
            products.add(new Product(2, "Keybord", "Computer", 25));

        }
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    XMLEncoder encoder = new XMLEncoder(new FileOutputStream(STRING));
                    encoder.writeObject(products);
                    encoder.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }));

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


