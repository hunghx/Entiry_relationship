package ra.entityrelationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.entityrelationship.dao.ProductDaoImpl;
import ra.entityrelationship.model.Product;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private ProductDaoImpl productDao;
    @RequestMapping
    public String home(){
        productDao.delete(1);
        List<Product> list =  productDao.findAll();
        return "home";
    }

}
