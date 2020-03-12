package excersises.chapter8;

public class AutoSitz {

    private boolean ledersitz;
    private String farbe;

    public AutoSitz(boolean ledersitz, String farbe) throws FalscheParameter {

        if(ledersitz && !(farbe.equals("weiss") || farbe.equals("schwarz"))){
            throw new FalscheParameter(ledersitz, farbe);
        }

        this.setFarbe(farbe);
        this.setLedersitz(ledersitz);
    }

    public boolean isLedersitz() {
        return ledersitz;
    }

    public void setLedersitz(boolean ledersitz) {
        this.ledersitz = ledersitz;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}