package excersises.chapter8;

public class FalscheParameter extends Exception{

    public FalscheParameter(boolean ledersitz, String farbe){
        super("Die Parameterkombination Ledersitz und Farbe "+farbe+" ist ungültig!");
    }
}