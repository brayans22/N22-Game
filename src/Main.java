import model.game.map.Map;
import model.game.Game;
//import javafx.application.Application;

public class Main
{
    public static void main(String[] args)
    {
        Game game = Game.get_instance();
        game.start();
    }
}