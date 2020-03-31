package servlet;

import dao.ShopDao;
import model.Product;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("getproduct")
public class GetProduct extends HttpServlet
{
    @Inject
    ShopDao shopDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Long productId = Long.valueOf(request.getParameter("productId"));
        Product product = shopDao.getProduct(productId);
        response.getWriter().println(product.toString());
    }
}
