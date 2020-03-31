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

@WebServlet("addproduct")
public class AddProduct extends HttpServlet
{
    @Inject
    ShopDao shopDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Product product = new Product();
        product.setName(request.getParameter("productName"));
        product.setPrice(Double.valueOf(request.getParameter("productPrice")));
        product.setDetails(request.getParameter("productDetails"));

        shopDao.addProduct(product);

        String path = request.getServletContext().getContextPath();
        response.sendRedirect(path += "/index.jsp");
    }
}
