package servlet;

import dao.ShopDao;
import model.Client;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("addclient")
public class AddClient extends HttpServlet
{
    @Inject
    ShopDao shopDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Client client = new Client();
        client.setFirstName(request.getParameter("firstName"));
        client.setLastName(request.getParameter("lastName"));
        client.setAddress(request.getParameter("address"));

        shopDao.addClient(client);

        String path = request.getServletContext().getContextPath();
        response.sendRedirect(path += "/index.jsp");
    }
}
