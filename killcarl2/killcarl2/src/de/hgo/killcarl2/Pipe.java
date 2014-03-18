package de.hgo.killcarl2;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;



public class Pipe {

	/*private class SpawnHeadTask extends Task {
		@Override
		public void run() {
			spawnRandomHead();
		}
	}*/
	
	
	private Vector2 position;
	private int pipeID;
	private GameScreen gs;

	public Vector2 getPosition() {
		return position;
	}

	private Sprite sprite;

	public Pipe(Vector2 pos, int pipeID, GameScreen gs) {
		this.gs = gs;
		this.pipeID = pipeID;
		this.position = pos;
		sprite = new Sprite(new Texture(Gdx.files.internal("data/pipe.png")));
		spawnRandomHead();
	}

	public void render(SpriteBatch batch) {
		batch.draw(sprite, position.x, position.y);	
		//font.draw(batch, "Timer", position.x, position.y + sprite.getHeight() + 30);
	}

	public void spawnRandomHead() {

		Random tempRng = new Random();

		int i = tempRng.nextInt(12);
		if (i >= 0 && i <= 5) {
			spawnHead(Typen.CARL);
		} else if (i >= 6 && i <= 9) {
			spawnHead(Typen.ZOMBIE);
		} else if (i >= 10 && i <= 12) {
			spawnHead(Typen.RICK);
		}

	}

	public void spawnHead(Typen typ) {
		for(int i = 0; i < GameScreen.HEAD_ARRAY_SIZE; i++){
			if(gs.heads[i] == null){
				gs.heads[i] = new Head(position.x, position.y + sprite.getHeight() - 20, typ, i, pipeID, gs);
				break;
			}
		}
	}
}
