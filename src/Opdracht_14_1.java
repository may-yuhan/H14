import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_14_1 extends Applet {
    int kleurenIndex, kaartenIndex;
    String kleuren[] = {"Schoppen", "Harten", "Ruiten", "Klaveren"};
    String[] kaarten = {"Lahire (boer)", "Hector (boer)", "Ogier (boer)", "Lancelot (boer)", "Judith (vrouw)", "Rachel (vrouw)", "Pallas (vrouw)", "Argine", "Charles (heer)", "César (heer)", "David (heer)", "Alexandre (heer)", "Aas (schoppen)","Aas (harten)", "Aas (ruiten)", "Aas (klaveren)", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien"};
    public void init() {

        setSize(400, 400);

        Button button = new Button("Random kaart");
        add(button);
        button.addActionListener(new aButtonListener());
    }


    class aButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){

//        int kleurKeuze = new Random().nextInt(kleuren.length);
//        int kaartenIndex = new Random().nextInt(kaarten.length);

            kleurenIndex = (int) (Math.random() * kleuren.length);
            kaartenIndex = (int) (Math.random() * kaarten.length);
            repaint();
        }
    }

    public void paint (Graphics g){

        g.drawString(kleuren[kleurenIndex] + " | " + kaarten[kaartenIndex],30,60);
    }
}
