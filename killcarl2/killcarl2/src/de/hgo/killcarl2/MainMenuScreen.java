package de.hgo.killcarl2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class MainMenuScreen implements Screen {

	private GameKillCarl2 gkc2;

	private Sprite bg;
	private Music bgmusic;
	private Stage stage;
	private Table table;

	public MainMenuScreen(GameKillCarl2 gkc2) {
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
		gkc2.batch.end();
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// batch = new SpriteBatch();
		bg = new Sprite(new Texture(
				Gdx.files.internal("data/backgroundMainMenu.png")));
		bgmusic = Gdx.audio.newMusic(Gdx.files.internal("data/bgmusic.ogg"));
		bgmusic.setLooping(true);
		bgmusic.play();
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);

		table = new Table();
		table.setFillParent(true);
		stage.addActor(table);

		TextureRegion upRegion = new TextureRegion(new Texture(
				Gdx.files.internal("data/buttonUp.png")));
		TextureRegion downRegion = new TextureRegion(new Texture(
				Gdx.files.internal("data/buttonDown.png")));

		TextButtonStyle style = new TextButtonStyle();
		style.up = new TextureRegionDrawable(upRegion);
		style.down = new TextureRegionDrawable(downRegion);
		style.font = gkc2.font;

		TextButton startGameButton = new TextButton("Start Game", style);

		startGameButton.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				gkc2.setScreen(new GameScreen(gkc2));
				dispose();
			}
		});
		table.add(startGameButton);

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
		bgmusic.dispose();
		stage.dispose();
	}
}
