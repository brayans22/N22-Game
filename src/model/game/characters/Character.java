package model.game.characters;
import model.game.position.Position;
import java.util.ArrayList;
import java.util.List;

public class Character
{
    private static Character instance_character;
    protected String emoji_code;
    protected Position position;
    protected List<Tool> tools;
    public static Character get_character(String emoji_code, Position position)
    {
        if (instance_character == null)
            instance_character = new Character();
        return (instance_character);
    }
    protected Character ()
    {
        this.position = new Position(0, 0);
        this.tools = new ArrayList<Tool>();
    }
}
