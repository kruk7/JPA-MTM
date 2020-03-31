package servlet;

import dao.ShopDao;
import model.Order;
import model.Product;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("add-product-order")
public class AddProductOrder extends HttpServlet
{
    @Inject
    ShopDao shopDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Long orderId = Long.valueOf(request.getParameter("orderId"));
        Long productId = Long.valueOf(request.getParameter("productId"));

        shopDao.addProductToOrder(orderId, productId);

        response.sendRedirect("index.jsp");
    }
}
