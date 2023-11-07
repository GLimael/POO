package com.jogo.game;

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Texts {
	private FreeTypeFontGenerator generator;
	private FreeTypeFontGenerator.FreeTypeFontParameter param;
	private BitmapFont bitmap;
	
	
	public Texts(FreeTypeFontGenerator generator, FreeTypeFontParameter param, BitmapFont bitmap) {
		this.generator = generator;
		this.param = param;
		this.bitmap = bitmap;
	}
	
	
	public Texts() {
		
	}


	public FreeTypeFontGenerator getGenerator() {
		return generator;
	}


	public void setGenerator(FreeTypeFontGenerator generator) {
		this.generator = generator;
	}


	public FreeTypeFontGenerator.FreeTypeFontParameter getParam() {
		return param;
	}


	public void setParam(FreeTypeFontGenerator.FreeTypeFontParameter param) {
		this.param = param;
	}


	public BitmapFont getBitmap() {
		return bitmap;
	}


	public void setBitmap(BitmapFont bitmap) {
		this.bitmap = bitmap;
	}
	
	
	
	
}
