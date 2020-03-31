package servlet;

import dao.ShopDao;
import model.Client;
import model.Order;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("addorder")
public class AddOrder extends HttpServlet
{
    @Inject
    ShopDao shopDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Long clientId = Long.valueOf(request.getParameter("clientId"));
        Client client = shopDao.getClient(clientId);

        Order order = new Order();
        order.setClient(client);
        order.setOrderDetails(request.getParameter("orderDetails"));

        shopDao.addOrder(order);

        String path = request.getServletContext().getContextPath();
        response.sendRedirect(path += "/index.jsp");
    }
}
