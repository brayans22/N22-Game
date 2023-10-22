package model.game;
import model.game.map.Map;
import model.game.menu.Menu;
public class Game
{
    private static Map map;
    private static Game instance_game;

    public static Game get_instance()
    {
        if (instance_game == null)
            instance_game = new Game();
        return (instance_game);
    }

    private Game() { map = null; }

    public void start()
    {
        Menu menu = new Menu();
        menu.print_welcome_message();
        map = Map.get_map(10, 10);
        map.set_map();
        map.show_map();
    }
}
