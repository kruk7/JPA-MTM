package servlet;

import dao.ShopDao;
import model.Order;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("getorder")
public class GetOrder extends HttpServlet
{
    @Inject
    ShopDao shopDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Long idOrder = Long.valueOf(request.getParameter("orderId"));
        Order order = shopDao.getOrder(idOrder);
        response.getWriter().println(order.toString());
    }
}
