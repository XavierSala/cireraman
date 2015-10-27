package net.xaviersala.cirera;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Cirera {

  GImage imatge;

  public Cirera(GImage image, int x, int y) {
    imatge = image;
    imatge.setLocation(x, y);
  }

  public GRectangle getPosicio() {
    return imatge.getBounds();
  }

  public void recollida() {
    imatge.setVisible(false);
    imatge.setLocation(22000,11000);
  }


}
