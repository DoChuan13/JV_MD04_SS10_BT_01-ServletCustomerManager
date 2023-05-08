package customer.controller;

import customer.model.Customer;
import customer.service.ServicesInstance;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@WebServlet(
        name = "helloServlet",
        value = "/")
public class CustomerController extends HttpServlet {
    ServicesInstance services = ServicesInstance.getInstance();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Do Get");
        showAllCustomer(request, response);
    }

    private void showAllCustomer(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        List<Customer> customerList = services.getCustomerService().findAll();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}