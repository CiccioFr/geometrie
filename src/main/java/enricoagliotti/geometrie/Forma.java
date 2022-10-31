package enricoagliotti.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Francesco
 */
public abstract class Forma {

    static int count = 0;
    static int size = 200;
    protected int x, y;
    protected int serial;
    protected Color color;

    Forma() {
        serial = count++;
        color = Color.RED;
        this.x = (int) (Math.random() * 10);
        this.y = (int) (Math.random() * 10);
    }

    public Forma(int x, int y) {
        this.x = x;
        this.y = y;
//        this.serial = count++;
        this.color = color.BLUE;
    }

    public void disegna() {
        System.out.print("Forma con count: " + count + " e seriale: " + serial + "  - ");
    }

    public abstract void disegna(Graphics g);
}

class Cerchio extends Forma {

    public Cerchio() {
    }

    public Cerchio(int x, int y) {
        super(x, y);
    }

    @Override
    public void disegna() {
        super.disegna();
        System.out.println("Cerchio");
    }

    @Override
    public void disegna(Graphics g) {
        g.fillOval(this.size, this.size, this.x, this.y);
    }
}

class Rettangolo extends Forma {

    public Rettangolo() {
    }

    public Rettangolo(int x, int y) {
        super(x, y);
    }

    @Override
    public void disegna() {
        super.disegna();
        System.out.println("Rettangolo");
    }

    @Override
    public void disegna(Graphics g) {
        g.fillRect(this.size, this.size, this.x, this.y);
    }
}
