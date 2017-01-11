package com.gameco.tictactoe;

class Player
{
    private String name ;
    private int player_type ;  // X or O
    private int player_order ;
    private MoveMethod move_strategy ;

    public Player(String pname, int type, int order, MoveMethod move_s )
    {
        name = pname ;
        player_type = type ;
        player_order = order ;
        move_strategy = move_s ;
    }

    public String getName() {
        return name ;
    }

    public int getPlayerType() {
        return player_type ;
    }

    public int getMove() {
        return move_strategy.move();
    }
}
