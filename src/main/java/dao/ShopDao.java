package dao;

import model.Client;
import model.Order;
import model.Product;

public interface ShopDao
{
    public void addClient(Client client);
    public void addOrder(Order order);
    public void addProduct(Product product);
    public void addProductToOrder(Long orderId, Long productId);
    public Client getClient(Long id);
    public Order getOrder(Long id);
    public Product getProduct(Long id);
}
