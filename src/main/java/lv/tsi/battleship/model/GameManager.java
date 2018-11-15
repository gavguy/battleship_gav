package lv.tsi.battleship.model;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped  //odin dlja vse polzovatelej
public class GameManager {
    private  Game incompleteGame;

    public Game setupGame (User user) {
        if (incompleteGame == null ) {
            incompleteGame = new Game();
            incompleteGame.setPlayer1(user);
            return incompleteGame;
        } else {
            Game tmp = incompleteGame;  //polozili i za setili 2-ogo polzovatelja

            tmp.setPlayer2(user);
            incompleteGame = null;
            return tmp;
        }
    }
}
