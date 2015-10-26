package net.xaviersala.cirera;

import java.util.ArrayList;
import java.util.List;

import acm.graphics.GRectangle;

public class Camp {
  GRectangle mida;
  CassadorDeCireres cassador;
  List<Cirera> cireres = new ArrayList<Cirera>();
  
  
  public Camp(GRectangle g, CassadorDeCireres ell) {
    cassador = ell;
    mida = g;
  }
  
  public void afegirCirera(Cirera ella) {
    cireres.add(ella);    
  }
  
  public void moureCassador(int x, int y) {
        
    GRectangle pos = cassador.getPosicio();
    pos.setLocation(pos.getX() + x, pos.getY()+ y);

    if (pos.intersects(mida)) {
      cassador.mou(x, y);
    }
   
  }

}
