package cglib2d.utils;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Utils {
	//para caregager imagem para a memoria 
	public static BufferedImage readImage(Object obj, String imageFileName) {
		BufferedImage bi = null;
		URL imageSrc = null;
		
		imageSrc = obj.getClass().getClassLoader().getResource(imageFileName);
		try {
			bi = ImageIO.read(imageSrc);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Image could not be read");
		}
		
		return bi;
	}
	public static void drawAxis(Graphics2D g2, Color c, int l, int w) {
		g2.setColor(c);
		g2.setStroke(new BasicTroke(w));
		g2.drawLine(-400, 0, 400, 0);
		g2.drawLine(0, -400, 0, 400);
	}
}
