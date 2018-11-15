package lv.tsi.battleship.model;

import jdk.jfr.Name;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MyGame implements Serializable {
        private  User user;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    private Game game;
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


//hronit inf o sesiji