package javagame;

//Imports from slick
import java.awt.DisplayMode;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {
	
	public static final String gamename = "Ham Blaster 2.0!";
	public static final int menu = 0;
	public static final int play = 1;

	public static void main(String[] args){
		
	}
	
	public Game(){
		super (gamename);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
		
	}

	public void initStatesList(GameContainer arg0) throws SlickException {
		
		
	}
	
}
 