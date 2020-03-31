package dao;

import model.Client;
import model.Order;
import model.Product;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

public class ShopDaoImpl implements ShopDao
{
    @PersistenceUnit(name = "jpa-mtm-pers-unit")
    EntityManagerFactory emf;

    @Override
    public void addClient(Client client)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(client);
        tx.commit();
        em.close();
    }

    @Override
    public void addOrder(Order order)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(order);
        tx.commit();
        em.close();
    }

    @Override
    public void addProduct(Product product)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(product);
        tx.commit();
        em.close();
    }

    @Override
    public void addProductToOrder(Long orderId, Long productId)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Order order = em.find(Order.class, orderId);
        Product product = em.find(Product.class, productId);
        tx.begin();
        order.getProducts().add(product);
        tx.commit();
        em.close();
    }

    @Override
    public Client getClient(Long id)
    {
        EntityManager em = emf.createEntityManager();
        Client clientFromDB = em.find(Client.class, id);
        clientFromDB.getOrders().size();
        String orderDesc = clientFromDB.toString();
        em.close();
        return clientFromDB;
    }

    @Override
    public Order getOrder(Long id)
    {
        EntityManager em = emf.createEntityManager();
        Order orderFromDB = em.find(Order.class, id);
        orderFromDB.getProducts().size();
        String orderDesc = orderFromDB.toString();
        em.close();
        return orderFromDB;
    }

    @Override
    public Product getProduct(Long id)
    {
        EntityManager em = emf.createEntityManager();
        Product product = em.find(Product.class, id);
        product.getOrders().size();
        em.close();
        return product;
    }
}