package enricoagliotti.geometrie;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author WS2
 */
public class Triangolo extends Forma {

    public Triangolo() {
    }

    public Triangolo(int x, int y) {
        super(x, y);
    }

    @Override
    public void disegna() {
        super.disegna();
        System.out.println("Triangolo");
    }

    @Override
    public void disegna(Graphics g) {
        //g.fillRect(this.size, this.size, this.x, this.y);
        Polygon triangle = new Polygon();
        triangle.addPoint(40, 125);
        triangle.addPoint(160, 155);
        triangle.addPoint(50, 185);

        g.setColor(Color.green);
        g.fillPolygon(triangle);
    }
}

class TriangoloEquilatero extends Triangolo {

    public TriangoloEquilatero() {
    }

    public TriangoloEquilatero(int x, int y) {
        super(x, y);
    }

    @Override
    public void disegna() {
        super.disegna();
        System.out.println("TriangoloEquilatero");
    }

    @Override
    public void disegna(Graphics g) {
        Polygon triangle = new Polygon();
        triangle.addPoint(140, 125);
        triangle.addPoint(60, 155);
        triangle.addPoint(250, 85);

        g.setColor(Color.green);
        g.fillPolygon(triangle);
    }
}
