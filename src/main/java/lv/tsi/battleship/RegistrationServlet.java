package lv.tsi.battleship;

import lv.tsi.battleship.model.*;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(name = "RegistrationServlet", urlPatterns = "/registration")
public class RegistrationServlet extends javax.servlet.http.HttpServlet {
    @Inject
    private MyGame myGame;
    @Inject
    private ErrorHolder errorholder;
    //    private String hello dlja licnostji
    @Inject
    private GameManager gameManager;


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String un = request.getParameter("Username");
        if (un == null || un.isBlank()) {
            errorholder.setMessage("User name is required");  //kratkozivushij
            doGet(request, response);
            return;
        }
        User user = new User();
        user.setName(un);
        myGame.setUser(user);

        Game game = gameManager.setupGame(user); // polucili igru
        myGame.setGame(game);
        if (game.iscompleted()) {
            response.sendRedirect("/battleship/shipPlacces");
        } else {
            response.sendRedirect("/battleship/waitregistration");
        }
        response.sendRedirect("/battleship/waitregistration");
        //otprovljame

    }

    //my game v servere licnij
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/registration.jsp")
                .include(request, response);

    }
}
