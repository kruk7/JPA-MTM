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

@WebServlet("getclient")
public class GetClient extends HttpServlet
{
    @Inject
    ShopDao shopDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Long clientId = Long.valueOf(request.getParameter("clientId"));
        Client client = shopDao.getClient(clientId);
        response.getWriter().println(client.toString());
    }
}
