package net.xaviersala.cirera;

import java.awt.event.KeyEvent;

import acm.graphics.GImage;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {

  Camp camp;

  public void run() {

    // Obtenir coordenades de pantalla
    GRectangle mida = new GRectangle(0, 0, 800, 800);

    // Preparar el cassador
    GImage imatge = new GImage("cireraire.png");
    add(imatge);
    CassadorDeCireres cassador = new CassadorDeCireres(imatge);

    camp = new Camp(mida, cassador);

  }

  @Override
  public final void keyPressed(final KeyEvent e) {

      switch(e.getKeyCode()) {
      case KeyEvent.VK_UP:
          camp.moureCassador(0, -1);
          break;
      case KeyEvent.VK_DOWN:
        camp.moureCassador(0, 1);
          break;
      case KeyEvent.VK_LEFT:
        camp.moureCassador(-1, 0);
          break;
      case KeyEvent.VK_RIGHT:
        camp.moureCassador(1, 0);
      default:
          break;
      }
  }


  public void init() {
    setSize(800, 800);
    addKeyListeners(this);
  }


}
