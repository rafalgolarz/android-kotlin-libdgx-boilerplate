package com.example.kotlinlibgdxboilerplate


import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch

/*
 * @author: rafalgolarz.com
 */


class LibGdxDemo : ApplicationAdapter() {
    private lateinit var batch: SpriteBatch
    private lateinit var img: Texture
    private lateinit var font: BitmapFont

    override fun create() {
        batch = SpriteBatch()
        font = BitmapFont()
    }

    override fun render() {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        if (font.scaleX < 30) {
            font.data.scale(1.1f)
        }

        font.draw(batch, "Hello", 50f, 400f)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
    }
}