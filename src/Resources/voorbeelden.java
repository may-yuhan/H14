package Resources;

import java.awt.*;

public class voorbeelden {

    // VOORBEELD 14.3
//    private Image afbeelding;
//    private URL resourcesLocatie;

    //VOORBEELD 14.4
//          private URL resourcesLocatie;
//          private AudioClip geluid;

    public void init() {

// VOORBEELD 14.3
//        resourcesLocatie = Opdracht_14_1.class.getResource("Resources/");
//        afbeelding = getImage(resourcesLocatie, "afbeelding1.jpg");

        // VOORBEELD 14.4
//              resourcesLocatie = Opdracht_14_1.class.getResource("Resources/");
//              geluid = getAudioClip(resourcesLocatie, "applaus.wav");
    }

    public void paint(Graphics g) {

// VOORBEELD 14.3
//        g.drawString(resourcesLocatie.toString(), 20, 20);
//        g.drawImage(afbeelding, 30, 20, 250, 250, this);

        // VOORBEELD 14.4
//              geluid.play();
    }

}
