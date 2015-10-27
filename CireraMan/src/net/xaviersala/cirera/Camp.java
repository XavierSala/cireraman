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
    cassaCirera(ella);

  }

  public void moureCassador(int x, int y) {


    // Mirar que no se'n va de la pantalla
    GRectangle pos = cassador.onAnira(x, y);

    if (pos.intersection(mida).equals(pos)) {
      cassador.mou(x, y);
    } else {
      System.out.println("bloc!");
    }

    // Mirar si xoca amb la cirera
    cassaCireres();
  }

  /**
   * 
   */
  private void cassaCireres() {
    for (Cirera cirera : cireres) {
      cassaCirera(cirera);
    }
  }

  /**
   * @param cirera
   */
  private void cassaCirera(Cirera cirera) {
    if (cassador.getPosicio().intersects(cirera.getPosicio())) {
      cirera.amaga();
    }
  }


}
