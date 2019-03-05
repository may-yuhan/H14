import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdracht extends Applet {

    Button button;
    TextField tekstvak;
    Image afbeelding;
    URL locatie;

    public void init() {
        setSize(400, 400);
        button = new Button("");
        add(button);

        tekstvak = new TextField(20);
        add(tekstvak);
    }


    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("De knop werkt!");
        }
    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

        }
    }
}

