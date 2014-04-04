package com.me.mygdxgame;


import com.badlogic.gdx.Game;

import com.badlogic.gdx.math.Rectangle;

public class MyGdxGame extends Game {


	     Rectangle nav;
	     boolean debug;
	     PlayScreen pJuego;
	   
	 
		float w,h;
		AssetsManager assets;
	
	
	
	@Override
	public void create() {	
		
		w=512;
		h=512;
		
		
        assets = new AssetsManager();
        assets.cargarAssets();
	
		
		  pJuego = new PlayScreen(this);
	        this.setScreen(pJuego);

	}

	@Override
	public void dispose() {
		assets.disposeAssets();
		pJuego.dispose();
		
	}


}
