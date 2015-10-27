package net.xaviersala.cirera;

import java.awt.event.KeyEvent;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {

  private static final int MIDAPANTALLA = 600;

  /**
   *
   */
  private static final long serialVersionUID = 5398421970612932362L;

  Camp camp;
  Random aleatori = new Random();

  public void run() {

    // Obtenir coordenades de pantalla
    GRectangle mida = new GRectangle(0, 0, MIDAPANTALLA, MIDAPANTALLA);

    // Preparar el cassador
    GImage imatge = new GImage("cireraire.png");
    add(imatge);
    CassadorDeCireres cassador = new CassadorDeCireres(imatge);

    camp = new Camp(mida, cassador);

    for(int i=0; i<10; i++) {   
      camp.afegirCirera(generaCirera());
    }

    clicaPerComencar();

  }

  /**
   * @return
   */
  private Cirera generaCirera() {
    GImage imatgeCirera = new GImage("cirera.png");
    add(imatgeCirera);
    Cirera cirera = new Cirera(imatgeCirera, 
        aleatori.nextInt((int)(MIDAPANTALLA-imatgeCirera.getWidth())), 
        aleatori.nextInt((int)(MIDAPANTALLA-imatgeCirera.getHeight())));
    return cirera;
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
