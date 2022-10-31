package enricoagliotti.geometrie;

import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author WS2
 */
public class Geometrie {

    public static void main(String[] args) {
        ArrayList<Forma> forme = new ArrayList();
        forme.add(new Cerchio(33,22));
        forme.add(new Triangolo(0,3));
        forme.add(new TriangoloEquilatero(66,2));
        forme.add(new Quadrato(4, 28));
        forme.add(new Rettangolo(4, 88));

        for (Forma forma : forme) {
            forma.disegna();
        }

        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JformeComponentCustom jf = new JformeComponentCustom();
        jf.setForme(forme);
        
        frame.add(jf);  // dentro la finestra metto un JComponent
        
        frame.setVisible(true);
    }
}
