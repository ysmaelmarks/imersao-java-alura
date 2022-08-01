package com.example;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class StickerFactory {
    
    //ler a imagem
    //cria uma nova imagem com transparencia e tamanho novo
    //copiar a imagem original para a nova imagem
    //desenhar o sticker na nova imagem

    public void create(InputStream inputStream, String name) throws Exception{
        BufferedImage original = ImageIO.read(inputStream);

        int height = original.getHeight();
        int width = original.getWidth();
        int newHeight = height + 200;

        BufferedImage newImage = new BufferedImage (width, newHeight, BufferedImage.TRANSLUCENT);

        Graphics2D g = (Graphics2D) newImage.getGraphics();
        g.drawImage(original, 0, 0, null);

        //fonte
        Font font = new Font(Font.SERIF, Font.BOLD, 50);
        g.setColor(java.awt.Color.YELLOW);
        g.setFont(font);
        g.drawString("like a wind in the meadow", 80, newHeight - 100);

        ImageIO.write(newImage, "png", new File(name));
    }
}
