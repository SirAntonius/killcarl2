package de.hgo.killcarl2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class FlyingHershal extends Head {

	public FlyingHershal(float _x, float _y, int _index, GameScreen gs) {
		super(_x, _y, Typen.HERSHAL, _index, -1, gs);
	}

}