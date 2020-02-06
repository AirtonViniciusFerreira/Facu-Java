package controllers;

// @author VINICIUS

import models.Machine;

public class MachinesController {
    private Machine machine;
    private int cont1;
    private int  cont2;
    
    public MachinesController(){
        this.machine = new Machine();
        this.cont1 = 0;
        this.cont2 = 0;
    }
    
    public void format(){
        while( (this.getCont1() < this.machine.getRibbon1().length()) ) {
            if( (this.machine.getRibbon1().charAt(getCont1()) == '+') ){
                this.sum();
            }
            else if( (this.machine.getRibbon1().charAt(getCont1()) == '-') ){
                this.subtraction();
            }
            else if( (this.machine.getRibbon1().charAt(getCont1()) == '*') ){
                this.multiplication();
            }
            else if( (this.machine.getRibbon1().charAt(getCont1()) == '/') ){
                this.division();
            }
            else {
                this.character();
            }
            this.setCont1(this.getCont1() + 1);
        }
    }
    
    public void sum(){
        this.setCont1(this.getCont1() + 1);
        this.character();
        this.setCont1(this.getCont1() + 1);
        if(this.getCont1() < this.machine.getRibbon1().length()){
            if( (this.machine.getRibbon1().charAt(getCont1()) == '*') ){
                this.setCont1(this.getCont1() + 1);
                this.character();
                this.machine.setRibbon2(this.machine.getRibbon2()+ "*");
            }
            else if( (this.machine.getRibbon1().charAt(getCont1()) == '/') ){
                this.setCont1(this.getCont1() + 1);
                this.character();
                this.machine.setRibbon2(this.machine.getRibbon2()+ "/");
            }
            else{
                this.setCont1(this.getCont1() - 1);     
            }
        }
        this.machine.setRibbon2(this.machine.getRibbon2() + "+");
    }
    
    public void subtraction(){
        this.setCont1(this.getCont1() + 1);
        this.character();
        this.setCont1(this.getCont1() + 1);
        if(this.getCont1() < this.machine.getRibbon1().length()){
            if( (this.machine.getRibbon1().charAt(getCont1()) == '*') ){
                this.setCont1(this.getCont1() + 1);
                this.character();
                this.machine.setRibbon2(this.machine.getRibbon2()+ "*");
            }
            else if( (this.machine.getRibbon1().charAt(getCont1()) == '/') ){
                this.setCont1(this.getCont1() + 1);
                this.character();
                this.machine.setRibbon2(this.machine.getRibbon2()+ "/");
            }
            else{
                this.setCont1(this.getCont1() - 1);     
            }
        }
        this.machine.setRibbon2(this.machine.getRibbon2() + "-");
    }
    
    public void multiplication(){
        this.setCont1(this.getCont1() + 1);
        this.character();
        this.setCont1(this.getCont1() + 1);
        if(this.getCont1() < this.machine.getRibbon1().length()){
            if( (this.machine.getRibbon1().charAt(getCont1()) == '/') ){
                this.setCont1(this.getCont1() + 1);
                this.character();
                this.machine.setRibbon2(this.machine.getRibbon2()+ "/");
            }
            else{
                this.setCont1(this.getCont1() - 1);     
            }
        }
        this.machine.setRibbon2(this.machine.getRibbon2() + "*");
    }
    
    public void division(){
        this.setCont1(this.getCont1() + 1);
        this.character();
        this.machine.setRibbon2(this.machine.getRibbon2() + "/");
    }
    
    public void character(){
        this.machine.setRibbon2(this.machine.getRibbon2()+this.machine.getRibbon1().charAt(getCont1()));
    }
    
    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public int getCont1() {
        return cont1;
    }

    public void setCont1(int cont1) {
        this.cont1 = cont1;
    }

    public int getCont2() {
        return cont2;
    }

    public void setCont2(int cont2) {
        this.cont2 = cont2;
    }
}
