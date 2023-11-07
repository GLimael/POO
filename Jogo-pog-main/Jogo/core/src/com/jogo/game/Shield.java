package com.jogo.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Shield {
	private int contadorSh = 0;
	private boolean shieldAct = false;
	private long tempoAuxilioSh = -5010;
	private Texture tCharacter;
	
	public Shield(Texture tCharacter) {
		this.tCharacter = tCharacter;
	}

	public Shield () {
		
	}

	public void shield (long tempo) {
		if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) || tempo - tempoAuxilioSh >= -5 && tempo - tempoAuxilioSh <= 0) {
			if (contadorSh == 0) {
				tCharacter = new Texture("escudo.png");
				tempoAuxilioSh = tempo + 5;
				contadorSh++;
				shieldAct = true;
				System.out.println("Passou aqui");
			}
	
		}else {
			tCharacter = new Texture("personagem.png");
			shieldAct = false;
			if (tempo - tempoAuxilioSh >= 30) {
				contadorSh = 0;
			}
			System.out.println("Passei por aqui no else");
		}
	}
	
	public boolean isShieldAct() {
		return shieldAct;
	}

	public void setShieldAct(boolean shieldAct) {
		this.shieldAct = shieldAct;
	}
}
