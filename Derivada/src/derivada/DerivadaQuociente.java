package derivada;

// @author VINICIUS
import funcao.Funcao;

public class DerivadaQuociente  extends DerivadaSoma{
    private Funcao fOriginal;
    private Funcao fLinhaOriginal;
    private Funcao gx;
    private Funcao gLinhax;
    
    public DerivadaQuociente(){
        super();
        this.fOriginal = new Funcao();
        this.fLinhaOriginal = new Funcao();
        this.gx = new Funcao();
        this.gLinhax = new Funcao();
    }
    
    public void dividir(){
        this.getfOriginal().separaQuociente();
        this.getFx().setFuncao(this.getfOriginal().getSeparado().get(0));
        this.getFx().setSimbolosQuociente(this.getfOriginal().getSimbolosQuociente());
        this.getGx().setFuncao(this.getfOriginal().getSeparado().get(1));
        this.getGx().setSimbolosQuociente(this.getfOriginal().getSimbolosQuociente());
        this.derivar();
        this.derivarG();
        this.juntar();
    }
    
    public void derivarG(){
        char posicao;
        String derivada = new String();
        this.getGx().pegarSimbolos();
        this.getgLinhax().setSimbolos(this.getGx().getSimbolos());

        for (int j = 0; j < this.getGx().getSeparado().size(); j++) {
            for (int i = 0; i < this.getGx().getSeparado().get(j).length(); i++) {

                posicao = this.getGx().getSeparado().get(j).charAt(i);

                if (posicao == 'x') {
                    if (i == 0) {
                        derivada = this.xPrimeiroG(i, j, posicao);
                    } else if (i + 1 < this.getGx().getSeparado().get(j).length()) {
                        derivada = this.numeroPrimeiroG(i, j, posicao);
                    } else {
                        derivada = this.xSemElevadoG(i, j, posicao);
                    }
                    this.getgLinhax().getSeparado().add(derivada);
                    derivada = new String();
                } else if (!this.getGx().getSeparado().get(j).contains("x")) {
                    derivada = "0";
                    this.getgLinhax().getSeparado().add(derivada);
                    derivada = new String();
                }
            }
        }
        this.getgLinhax().setFuncao(this.getgLinhax().juntar());

    }
    
    public String xPrimeiroG(int i, int j, char posicao) {
        String derivada = new String();
        if (i + 1 < this.getGx().getSeparado().get(j).length()) {
            char simboloE = this.getGx().getSeparado().get(j).charAt(i + 1);
            char elevado = this.getGx().getSeparado().get(j).charAt(i + 2);
            double numElevado;
            if (i + 3 < this.getGx().getSeparado().get(j).length()) {
                char elevado2 = this.getGx().getSeparado().get(j).charAt(i + 3);
                numElevado = Double.parseDouble("" + elevado + elevado2);
            } else {
                numElevado = Double.parseDouble("" + elevado);
            }

            if (numElevado == 1.0) {
                derivada = "1";
            } else {

                numElevado--;
                derivada += "" + elevado + posicao + simboloE + numElevado;
            }
        } else {
            double numfrente = 1;
            derivada += "" + numfrente;
        }
        return derivada;
    }

    public String numeroPrimeiroG(int i, int j, char posicao) {
        String derivada = new String();
        char simboloE = this.getGx().getSeparado().get(j).charAt(i + 1);
        char elevado = this.getGx().getSeparado().get(j).charAt(i + 2);
        String frente = new String();
        for(int k = 0; k < i; k++){
             frente += this.getGx().getSeparado().get(j).charAt(k);
        }
        double numElevado;
        if (i + 3 < this.getGx().getSeparado().get(j).length()) {
            char elevado2 = this.getGx().getSeparado().get(j).charAt(i + 3);
            numElevado = Double.parseDouble("" + elevado + elevado2);
        } else {
            numElevado = Double.parseDouble("" + elevado);
        }
        double numfrente = Double.parseDouble(frente);

        numfrente = (numElevado * numfrente);
        if (numElevado == 1.0) {
            derivada = "" + numfrente;
        } else {

            numElevado--;
            derivada += "" + numfrente + posicao + simboloE + numElevado;
        }
        return derivada;
    }

    public String xSemElevadoG(int i, int j, char posicao) {
        String derivada = new String();
        char simboloE = '^';
        String frente = new String();
        for(int k = 0; k < i; k++){
             frente += this.getFx().getSeparado().get(j).charAt(k);
        }

        derivada += "" + frente;
        return derivada;
    }
    
    public void juntar(){
        String f = this.getFx().juntar();
        String g = this.getGx().juntar();
        String fL = this.getfLinhax().juntar();
        String gL = this.getgLinhax().juntar();
        String paren = "(";
        String parenf = ")";
        String pronta = paren + fL + parenf + paren + g + parenf + "-"
                + paren + f + parenf + paren + gL + parenf + "/" + paren + g + parenf+ "^2"; 
        this.getfLinhaOriginal().setFuncao(pronta);
    }

    public Funcao getfOriginal() {
        return fOriginal;
    }

    public void setfOriginal(Funcao fOriginal) {
        this.fOriginal = fOriginal;
    }

    public Funcao getfLinhaOriginal() {
        return fLinhaOriginal;
    }

    public void setfLinhaOriginal(Funcao fLinhaOriginal) {
        this.fLinhaOriginal = fLinhaOriginal;
    }

    public Funcao getGx() {
        return gx;
    }

    public void setGx(Funcao gx) {
        this.gx = gx;
    }

    public Funcao getgLinhax() {
        return gLinhax;
    }

    public void setgLinhax(Funcao gLinhax) {
        this.gLinhax = gLinhax;
    }
}
