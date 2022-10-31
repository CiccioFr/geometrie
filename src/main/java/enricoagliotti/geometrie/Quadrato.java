package enricoagliotti.geometrie;

import java.awt.Graphics;

/**
 *
 * @author WS2
 */
public class Quadrato extends Forma {

    int x;
    int y;

    public Quadrato(int x, int y) {
        super(x, y);
    }

    @Override
    public void disegna() {
        super.disegna();
        System.out.println("Quadrato");
    }

    @Override
    public void disegna(Graphics g) {
        g.fillRect(this.size, this.size, this.x, this.y);
    }
}
