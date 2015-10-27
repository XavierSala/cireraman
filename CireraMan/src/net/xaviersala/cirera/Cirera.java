package net.xaviersala.cirera;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Cirera {

  GImage imatge;

  public Cirera(GImage image, int x, int y) {
    imatge = image;
    imatge.setLocation(x, y);
  }

  public void setPosicio(int x, int y) {
    imatge.setLocation(x, y);
  }

  public GRectangle getPosicio() {
    return imatge.getBounds();
  }

  public int getAmplada() {
    return (int) imatge.getWidth();
  }

  public int getAltura() {
    return (int) imatge.getHeight();
  }

  public void amaga() {
    imatge.setVisible(false);
  }

}
