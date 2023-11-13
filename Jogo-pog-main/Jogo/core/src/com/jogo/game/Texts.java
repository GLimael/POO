package com.jogo.game;

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Classe que representa textos no jogo.
 */
public class Texts {

    /** Gerador de fontes FreeType. */
    private FreeTypeFontGenerator generator;

    /** Parâmetros da fonte FreeType. */
    private FreeTypeFontGenerator.FreeTypeFontParameter param;

    /** Fonte Bitmap utilizada para exibir os textos. */
    private BitmapFont bitmap;
    
    /**
     * Construtor da classe Texts.
     * @param generator Gerador de fontes FreeType.
     * @param param Parâmetros da fonte FreeType.
     * @param bitmap Fonte Bitmap utilizada para exibir os textos.
     */
    public Texts(FreeTypeFontGenerator generator, FreeTypeFontParameter param, BitmapFont bitmap) {
        this.generator = generator;
        this.param = param;
        this.bitmap = bitmap;
    }
    
    /**
     * Construtor padrão da classe Texts.
     */
    public Texts() {
        
    }

    /**
     * Obtém o gerador de fontes FreeType.
     * @return Gerador de fontes FreeType.
     */
    public FreeTypeFontGenerator getGenerator() {
        return generator;
    }

    /**
     * Define o gerador de fontes FreeType.
     * @param generator Novo gerador de fontes FreeType.
     */
    public void setGenerator(FreeTypeFontGenerator generator) {
        this.generator = generator;
    }

    /**
     * Obtém os parâmetros da fonte FreeType.
     * @return Parâmetros da fonte FreeType.
     */
    public FreeTypeFontGenerator.FreeTypeFontParameter getParam() {
        return param;
    }

    /**
     * Define os parâmetros da fonte FreeType.
     * @param param Novos parâmetros da fonte FreeType.
     */
    public void setParam(FreeTypeFontGenerator.FreeTypeFontParameter param) {
        this.param = param;
    }

    /**
     * Obtém a fonte Bitmap utilizada para exibir os textos.
     * @return Fonte Bitmap.
     */
    public BitmapFont getBitmap() {
        return bitmap;
    }

    /**
     * Define a fonte Bitmap utilizada para exibir os textos.
     * @param bitmap Nova fonte Bitmap.
     */
    public void setBitmap(BitmapFont bitmap) {
        this.bitmap = bitmap;
    }
}