package ra.entityrelationship.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ra.entityrelationship.model.Product;

import java.util.List;

@Repository
public class ProductDaoImpl {
    @PersistenceContext // quanr lis cac entity
    private EntityManager entityManager;

    public List<Product> findAll(){
        TypedQuery<Product> typedQuery = entityManager.createQuery("select P from Product P",Product.class);
        return typedQuery.getResultList();
    }
    public Product findById(Integer id){
        TypedQuery<Product> typedQuery = entityManager.createQuery("select P from Product P where P.id =:id",Product.class);
      typedQuery.setParameter("id",id);
        return typedQuery.getSingleResult();
    }
    @Transactional
    public void delete(Integer id){
        entityManager.remove(findById(id));
    }

}
