package de.hgo.killcarl2;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "killcarl2";
		cfg.useGL20 = true;
		cfg.width = 1280;
		cfg.height = 720;
		
		new LwjglApplication(new GameKillCarl2(), cfg);
	}
}
