package de.hgo.killcarl2;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameKillCarl2 extends Game {

	//public GameScreen gameScreen;
	//public MainMenuScreen mainMenuScreen;
	public SpriteBatch batch;
	public BitmapFont font;
	public static boolean DEBUG = false;

	@Override
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		//gameScreen = new GameScreen(this);
		//mainMenuScreen = new MainMenuScreen(this);
		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render(); // important!
	}
	
    public void dispose() {
        batch.dispose();
        font.dispose();
    }

}
