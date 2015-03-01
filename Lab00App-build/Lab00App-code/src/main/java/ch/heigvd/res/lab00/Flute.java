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
public class Flute implements IInstrument {

    @Override
    public int getSoundVolume() {
        return 5;
    }

    @Override
    public String play() {
        return "whistle";
    }

    @Override
    public String getColor() {
        return "brown";
    }
    
}
