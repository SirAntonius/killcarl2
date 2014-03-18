package de.hgo.killcarl2;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

public class GameKillCarl2 extends Game {

	//public GameScreen gameScreen;
	//public MainMenuScreen mainMenuScreen;
	public SpriteBatch batch;
	public BitmapFont font;
	public static boolean DEBUG = true;

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
