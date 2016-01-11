package database;

/**
 * Created by ES on 21.12.2015.
 */
public class ProductDAOFactory {
    public static ProductDAO createDAO(String daoType) {
        ProductDAO productDAO;
        switch (daoType) {
            case "db":
                productDAO = new ProductdbDAO();
                break;
            case "memory":
                productDAO = new ProductMemoryDAO();
                break;
            case "xml":
                productDAO = new ProductDAOXML();
                break;
            default:
                throw  new RuntimeException("Wrong enter");

        }
        return productDAO;
    }
}
