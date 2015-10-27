package net.xaviersala.cirera;

import java.awt.event.KeyEvent;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {

  /**
   *
   */
  private static final long serialVersionUID = 5398421970612932362L;

  Camp camp;

  public void run() {

    // Obtenir coordenades de pantalla
    GRectangle mida = new GRectangle(0, 0, 600, 600);

    // Preparar el cassador
    GImage imatge = new GImage("cireraire.png");
    add(imatge);
    CassadorDeCireres cassador = new CassadorDeCireres(imatge);

    camp = new Camp(mida, cassador);

    clicaPerComencar();

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

  /**
   * Clica per començar.
   */
  private void clicaPerComencar() {
      GLabel label = new GLabel("Clica per començar");
      double x = (getWidth() - label.getWidth()) / 2;
      double y = (getHeight() + label.getAscent()) / 2;
      add(label, x, y);
      waitForClick();
      remove(label);
  }

}
