package excersises.chapter5.bahnhof;

public class Zugfuehrer {
    private Gueterzug zug;

    private String Name;
    private String Vorname;
    private int id;

    // wir vernachlässigen das Geburtsdatum!
    //private Date gebDate;

    public Zugfuehrer(String name, String vorname, int id){
        this.setName(vorname);
        this.setVorname(vorname);
        this.setId(id);
    }

    public Gueterzug getZug() {
        return zug;
    }

    public void setZug(Gueterzug zug) {
        if(zug != null){
            zug.setFahrer(null);
        }
        this.zug = zug;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
