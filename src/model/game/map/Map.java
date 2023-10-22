package model.game.map;

import java.util.ArrayList;
import java.util.List;

public class Map
{
    private static Map instance_map;

    private String [][] map;
    private final int max_fil;
    private final int max_col;

    public static Map get_map(int max_fil, int max_col)
    {
        if (instance_map == null)
            instance_map = new Map(max_fil, max_col);
        return (instance_map);
    }
    public Map(int max_fil, int max_col)
    {
        this.max_fil = max_fil;
        this.max_col = max_col;
        this.map = new String[max_fil][max_col];
    }

    public void set_map()
    {
        for (int i = 0; i < this.max_fil; i++)
        {
            for (int j = 0; j < this.max_col; j++)
                map[i][j] = "*";
        }
    }

    public void show_map()
    {
        for (int i = 0; i < this.max_fil; i++)
        {
            for (int j = 0; j < this.max_col; j++)
                System.out.print(this.map[i][j] + " ");
            System.out.println();
        }
    }
}
