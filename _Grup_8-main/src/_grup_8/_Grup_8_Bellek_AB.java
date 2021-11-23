package _grup_8;

import java.util.ArrayList;

public class _Grup_8_Bellek_AB {
    int line;
    String label;
    String commander;
    String adresse;
    boolean _Ibiti;
    ArrayList<String> comment;

    public _Grup_8_Bellek_AB(int line,String label, String commander, String adresse, boolean _Ibiti, ArrayList<String> comment) {
        this.line = line;
        this.label = label;
        this.commander = commander;
        this.adresse = adresse;
        this._Ibiti = _Ibiti;
        this.comment = comment;
    }
    public _Grup_8_Bellek_AB(int line,String label, String commander, String adresse, boolean _Ibiti) {
        this.line = line;
        this.label = label;
        this.commander = commander;
        this.adresse = adresse;
        this._Ibiti = _Ibiti;
    }
    
    public void goster()
    {
        System.out.println(line+" "+label+" "+commander+" "+adresse+" "+_Ibiti+" "+comment);
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public _Grup_8_Bellek_AB() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCommander() {
        return commander;
    }

    public void setCommander(String commander) {
        this.commander = commander;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean getIbiti() {
        return _Ibiti;
    }

    public void setIbiti(boolean _Ibiti) {
        this._Ibiti = _Ibiti;
    }

    public ArrayList getComment() {
        return comment;
    }

    public void setComment(ArrayList comment) {
        this.comment = comment;
    }
    public void setComment2(String a) {
        comment.add(a);
    }
    
    
    
    
}
