package de.javadevblog.box2dtutorial;

import com.badlogic.gdx.Game;
import de.javadevblog.box2dtutorial.views.*;

public class Box2DTutorial extends Game {

	public static final int MENU = 0;
	public static final int PREFERENCES = 1;
	public static final int APPLICATION = 2;
	public static final int ENDGAME = 3;

	private LoadingScreen loadingScreen;
	private PreferencesScreen preferencesScreen;
	private MenuScreen menuScreen;
	private MainScreen mainScreen;
	private EndScreen endScreen;

	private AppPreferences appPreferences;

	public Box2DTutorial(){
		appPreferences = new AppPreferences();
	}

	public void changeScreen(int screen){
		switch (screen){
			case MENU:
				if (menuScreen == null){
					menuScreen = new MenuScreen(this);
				}
				this.setScreen(menuScreen);
				break;
			case PREFERENCES:
				if (preferencesScreen == null){
					preferencesScreen = new PreferencesScreen(this);
				}
				this.setScreen(preferencesScreen);
				break;
			case APPLICATION:
				if (mainScreen == null){
					mainScreen = new MainScreen(this);
				}
				this.setScreen(mainScreen);
				break;
			case ENDGAME:
				if (endScreen == null){
					endScreen = new EndScreen(this);
				}
				this.setScreen(endScreen);
				break;
		}
	}

	@Override
	public void create() {
		loadingScreen = new LoadingScreen(this);
		setScreen(loadingScreen);
	}

	public AppPreferences getPreferences() {
		return appPreferences;
	}
}
