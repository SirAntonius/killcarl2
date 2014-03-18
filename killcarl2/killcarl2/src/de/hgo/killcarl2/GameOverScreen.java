package de.hgo.killcarl2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class GameOverScreen implements Screen {

	private int score;
	private String deathMsg;
	private Sprite bg;
	private GameKillCarl2 gkc2;
	private Stage stage;
	
	public GameOverScreen(int score, String deathMsg, GameKillCarl2 gkc2) {
		this.score = score;
		this.deathMsg = deathMsg;
		this.gkc2 = gkc2;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		gkc2.batch.begin();
		gkc2.batch.draw(bg, bg.getX(), bg.getY(), w, h);
		gkc2.font.draw(gkc2.batch, "Score: " + score, w / 2 - 40, h / 2);
		gkc2.font.draw(gkc2.batch, deathMsg, w / 2 - 80,
				h / 2 - gkc2.font.getCapHeight() - 3);
		gkc2.batch.end();
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		bg = new Sprite(new Texture(Gdx.files.internal("data/gameover.png")));
		
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		

		TextureRegion upRegion = new TextureRegion(new Texture(
				Gdx.files.internal("data/buttonUp.png")));
		TextureRegion downRegion = new TextureRegion(new Texture(
				Gdx.files.internal("data/buttonDown.png")));

		TextButtonStyle style = new TextButtonStyle();
		style.up = new TextureRegionDrawable(upRegion);
		style.down = new TextureRegionDrawable(downRegion);
		style.font = gkc2.font;

		TextButton backToMain = new TextButton("Back to Main Menu", style);

		backToMain.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				gkc2.setScreen(new MainMenuScreen(gkc2));
				dispose();
			}
		});
		backToMain.setX(w/2 - 200);
		backToMain.setY(h/2 - 180);
		stage.addActor(backToMain);

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
