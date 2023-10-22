package model.game.position;

public class Position
{
    private final int fil;
    private final int col;

    public Position(int fil, int col)
    {
        this.fil = fil;
        this.col = col;
    }

    public boolean is_equal(Position position)
    {
        return (position.fil == this.fil && position.col == this.col);
    }

}
