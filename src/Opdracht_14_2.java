import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Opdracht_14_2 extends Applet {

    int random;
    String kaart;
    String[] kleuren = {"Schoppen", "Harten", "Ruiten", "Klaveren"};
    String[] kaarten = {"Boer", "Vrouw", "Heer", "Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien"};
    String[] deck;
    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;
    Button button = new Button("SHUFFLE");

    public void init() {

        setSize(700, 350);
        add(button);
        button.addActionListener(new ButtonListener());
        deck = new String[52];
        int deckindex = 0;

        createFullDeck();

        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        dealCards();

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            deck = new String[52];

            createFullDeck();
            dealCards();
            repaint();
        }
    }

    public void paint(Graphics g) {

        int x1 = 50;
        int x2 = 200;
        int x3 = 350;
        int x4 = 500;
        int y = 50;

        g.drawString("SPELER 1", x1, y - 25);
        g.drawString("SPELER 2", x2, y - 25);
        g.drawString("SPELER 3", x3, y - 25);
        g.drawString("SPELER 4", x4, y - 25);
        button.setLocation(300, 300);

        for (int i = 0; i < 13; i++) {
            g.drawString(speler1[i], x1, y);
            g.drawString(speler2[i], x2, y);
            g.drawString(speler3[i], x3, y);
            g.drawString(speler4[i], x4, y);
            y += 20;
        }
    }

    public void createFullDeck() {
        int deckindex = 0;
        for (int i = 0; i < kleuren.length; i++) {
            String kleur = kleuren[i];
            for (int j = 0; j < kaarten.length; j++) {
                String kaart = kaarten[j];
                deck[deckindex] = kleur + " " + kaart;
                deckindex++;
            }
        }
    }

    public void dealCards() {
        for (int i = 0; i < 13; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
    }

    private String deelKaart() {

        random = new Random().nextInt(deck.length);
        kaart = deck[random];
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}
