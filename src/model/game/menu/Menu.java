package model.game.menu;

import java.io.IOException;

public class Menu
{
    public static final String WHITE_COLOR = "\u001B[37m";
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String GOLD_COLOR = "\u001B[33m";

    public void print_welcome_message()
    {
        //this.clear_console();
        System.out.println(GOLD_COLOR + " ╔════════════════════════════════════════════════════════════════════════════════════════════════════ ═╗");
        System.out.println(GOLD_COLOR + " ║               * BIENVENIDO FANÁTICO DE LOS OSOS AL JUEGO DE OSOS CONTRA EL RELOJ *                  ║");
        System.out.println(GOLD_COLOR + " ║" + WHITE_COLOR + " A continuación, se te harán 4 preguntas para determinar qué personalidad de oso escandaloso eres    " + GOLD_COLOR + "║");
        System.out.println(GOLD_COLOR + " ║" + WHITE_COLOR + " para poder afrontar la búsqueda de Chloe, que está desaparecida :c                                  " + GOLD_COLOR + "║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t                                                                                                  " + GOLD_COLOR + " ║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t° Polar (I): Reacción rápida, le encanta la limpieza, sabe yoga                                   " + GOLD_COLOR + " ║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t             artes marciales, patinar, tejer y LE ASUSTAN LOS PEPINOS.                            " + GOLD_COLOR + " ║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t                                                                                                  " + GOLD_COLOR + " ║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t° Panda (P): Inseguro, sensible, tierno, vegetariano, le gusta el anime                            " + GOLD_COLOR + "║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t             el celular es su alma rectangular y SE ENAMORA RÁPIDO.                                " + GOLD_COLOR + "║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t                                                                                                  " + GOLD_COLOR + " ║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t° Pardo (G): Líder, hiperactivo, ruidoso, charlatán, ama el cine, la cultura pop                   " + GOLD_COLOR + "║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + "\t             y HACE TODO LO POSIBLE PARA HACER LO CORRECTO.                                        " + GOLD_COLOR + "║");
        System.out.println(GOLD_COLOR + " ║ " + WHITE_COLOR + " Dicho todo eso, ¡empecemos!                                                                        " + GOLD_COLOR + "║");
        System.out.println(GOLD_COLOR + " ╚═════════════════════════════════════════════════════════════════════════════════════════════════════╝" + WHITE_COLOR);
    }

    public void clear_console()
    {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("We coud not clear the screem");
        }
    }

    public Menu(){}

}
