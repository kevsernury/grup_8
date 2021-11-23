package _grup_8;

public class _Grup_8_Yazac_AB {
    int line;
    String label;
    String commander;
    String [] comment;

    public _Grup_8_Yazac_AB(int line,String label, String commander, String[] comment) {
        this.line = line;
        this.label = label;
        this.commander = commander;
        this.comment = comment;
    }
    public _Grup_8_Yazac_AB(int line,String label, String commander) {
        this.line = line;
        this.label = label;
        this.commander = commander;
    }
    
    public void goster()
    {
        System.out.println(line+" "+label+" "+commander);
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
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

    public String[] getComment() {
        return comment;
    }

    public void setComment(String[] comment) {
        this.comment = comment;
    }
    
}
