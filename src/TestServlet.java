import com.study.Cart;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/cart-servlet")
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //получаем объект Сессии для текущего пользователя
        HttpSession session= request.getSession();

        //пробуем получить объект Cart из сессии
        Cart cart = (Cart)session.getAttribute("cart");

        //допустим, что пользователь вводит параметры корзины из адресной строки. Считываем эти данные
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // и создаем корзину для первого вхождения на сервер.
        if (cart == null){
            cart = new Cart();

            cart.setName(name);
            cart.setQuanity(quantity);
        }

        //записываем в сессию корзину пользователя
        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
    }
}
