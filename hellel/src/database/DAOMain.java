package database;

/**
 * Created by ES on 14.12.2015.
 */
public class DAOMain {
    public static void main(String[] args) {
        String daoType = args[0];
        ProductDAO productDAO;
        productDAO = ProductDAOFactory.createDAO(daoType);
        //ProductDAO productDAO =new ProductDAOXML();
        System.out.println(productDAO.findALl());
        productDAO.create(new Product(5, "Pen", "Accertiment", 10));
        System.out.println(productDAO.findById(5));
        //productDAO.deleteById(5);
    }


}
