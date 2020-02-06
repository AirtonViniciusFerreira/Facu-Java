package models;

// @author VINICIUS
public class Machine {
    private String ribbon1;
    private String ribbon2;
    
    public Machine(){
        this.ribbon1 = new String();
        this.ribbon2 = new String();
    }
    
    public String getRibbon1() {
        return ribbon1;
    }

    public void setRibbon1(String ribbon1) {
        this.ribbon1 = ribbon1;
    }

    public String getRibbon2() {
        return ribbon2;
    }

    public void setRibbon2(String ribbon2) {
        this.ribbon2 = ribbon2;
    }
    
    
}
