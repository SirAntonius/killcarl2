package de.hgo.killcarl2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class scoreText {

	Typen typ;
	Sprite sprite;
	float startY;
	float startX;
	float y;
	boolean finished;

	public scoreText(float _x, float _y, Typen t) {
		startX = _x;
		startY = _y;
		y = _y;
		typ = t;
			switch (typ) {
			case CARL:
				sprite = new Sprite(new Texture(Gdx.files.internal("data/20.png")));
				break;
			case ZOMBIE:
				sprite = new Sprite(new Texture(Gdx.files.internal("data/10.png")));
				break;
			case RICK:
				sprite = new Sprite(new Texture(Gdx.files.internal("data/50.png")));
				break;
			}
		finished = false;
	}

	public void update() {
		if (y >= startY - 150) {
			y -= 0.1f;
		}else{
			finished = true;
		}
	}

	public Sprite getSprite() {
		return sprite;
	}

	public float getStartX() {
		return startX;
	}

	public float getY() {
		return y;
	}

	public boolean isFinished() {
		return finished;
	}
	

}
