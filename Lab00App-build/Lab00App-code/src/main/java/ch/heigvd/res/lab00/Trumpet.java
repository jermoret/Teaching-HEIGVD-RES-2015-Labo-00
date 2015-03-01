/*
 * Moret Jérôme 
 * 1 mars 2015
 * 
 * 
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Jérôme
 */
public class Trumpet implements IInstrument {

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public int getSoundVolume() {
        return 10;
    }
    
}
