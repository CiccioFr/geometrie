package enricoagliotti.geometrie;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author WS2
 */
public class JformeComponentCustom extends JComponent{
    // ha il metodo paint che posso
    
    ArrayList<Forma> forme;
    void setForme(ArrayList<Forma> forme){
        this.forme = forme;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        for (Forma forma : forme) {
            forma.disegna(g);
        }
    };
    
}
