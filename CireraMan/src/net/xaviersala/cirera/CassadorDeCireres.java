package net.xaviersala.cirera;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class CassadorDeCireres {
  private static final int VELOCITATCASSADOR = 5;

  GImage imatge;

  public CassadorDeCireres(GImage image) {
    imatge = image;
  }

  public GRectangle getPosicio() {
    return imatge.getBounds();
  }

  public void mou(int x, int y) {
    imatge.move(x * VELOCITATCASSADOR, y * VELOCITATCASSADOR);
  }

  public GRectangle onAnira(int x, int y) {
    GRectangle pos = imatge.getBounds();
    pos.setLocation(pos.getX() + x * VELOCITATCASSADOR, pos.getY()+ y * VELOCITATCASSADOR);
    return pos;
  }



}
