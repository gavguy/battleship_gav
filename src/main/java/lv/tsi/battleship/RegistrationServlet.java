package lv.tsi.battleship;

import lv.tsi.battleship.model.MyGame;
import lv.tsi.battleship.model.User;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(name = "RegistrationServlet", urlPatterns = "/registration")
public class RegistrationServlet extends javax.servlet.http.HttpServlet {
    @Inject
    private MyGame myGame;


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String un = request.getParameter("Username");
        User user = new User();
        user.setName(un);
        myGame.setUser(user);
        response.sendRedirect("/battleship/waitregistration");
        //otprovljame

    }
//my game v servere licnij
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/registration.jsp")
                .include(request, response);

    }
}
