package com.meujogo.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

//imports para obstaculo
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import java.util.Iterator;

public class MeuJogo extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img, tObstacle;
	private Array<Rectangle> obstacles;
	private long frequenciaObstaculo;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("fundo.png");
		tObstacle = new Texture("bloco-obstaculo.png");
		obstacles = new Array<Rectangle>();
		frequenciaObstaculo = 0;
	}

	@Override
	public void render () {
		//chamando a função para spawnar obstáculos
		this.moveObstacles();
		
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		//loop para manter todas as 
		for (Rectangle obstacle : obstacles) {
			batch.draw(tObstacle, obstacle.x, obstacle.y);
		}
				
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
	private void spawnObstacle () {
		Rectangle obstacle = new Rectangle(Gdx.graphics.getWidth(), MathUtils.random(0, Gdx.graphics.getHeight() - tObstacle.getHeight()), tObstacle.getWidth(), tObstacle.getHeight());
		obstacles.add(obstacle);
		frequenciaObstaculo = TimeUtils.nanoTime();
	}
	
	private void moveObstacles() {
		if(TimeUtils.nanoTime() - frequenciaObstaculo > 777777777) {
			this.spawnObstacle();
		}
		
		
		for(Iterator<Rectangle> iter = obstacles.iterator(); iter.hasNext();) {
			Rectangle obstacle = iter.next();
			obstacle.x -= 10;
			if (obstacle.x < 0-obstacle.width) {
				iter.remove();
			}
		}
		
	}
}
