package derivada;

// @author VINICIUS
import funcao.Funcao;
import java.util.ArrayList;

public class DerivadaSoma {

    private Funcao fx;
    private Funcao fLinhax;
    private ArrayList<DerivadaSoma> prontas;

    public DerivadaSoma() {
        this.fx = new Funcao();
        this.fLinhax = new Funcao();
        this.prontas = new ArrayList<>();
    }

    public DerivadaSoma(String fx) {
        this.fx = new Funcao(fx);
        this.fLinhax = new Funcao();
        this.prontas = new ArrayList<>();
    }

    public void derivar() {
        char posicao;
        String derivada = new String();
        this.getFx().pegarSimbolos();
        this.getfLinhax().setSimbolos(this.getFx().getSimbolos());

        for (int j = 0; j < this.getFx().getSeparado().size(); j++) {
            for (int i = 0; i < this.getFx().getSeparado().get(j).length(); i++) {

                posicao = this.getFx().getSeparado().get(j).charAt(i);

                if (posicao == 'x') {
                    if (i == 0) {
                        derivada = this.xPrimeiro(i, j, posicao);
                    } else if (i + 1 < this.getFx().getSeparado().get(j).length()) {
                        derivada = this.numeroPrimeiro(i, j, posicao);
                    } else {
                        derivada = this.xSemElevado(i, j, posicao);
                    }
                    this.getfLinhax().getSeparado().add(derivada);
                    derivada = new String();
                } else if (!this.getFx().getSeparado().get(j).contains("x")) {
                    derivada = "0";
                    this.getfLinhax().getSeparado().add(derivada);
                    derivada = new String();
                }
            }
        }
        this.getfLinhax().setFuncao(this.getfLinhax().juntar());

    }

    public String xPrimeiro(int i, int j, char posicao) {
        String derivada = new String();
        if (i + 1 < this.getFx().getSeparado().get(j).length()) {
            char simboloE = this.getFx().getSeparado().get(j).charAt(i + 1);
            String elevado = new String();
            double numElevado;
            for (int k = i + 2; k < this.getFx().getSeparado().get(j).length(); k++) {
                elevado += this.getFx().getSeparado().get(j).charAt(k);
            }
            numElevado = Double.parseDouble(elevado);

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

    public String numeroPrimeiro(int i, int j, char posicao) {
        String derivada = new String();
        char simboloE = this.getFx().getSeparado().get(j).charAt(i + 1);
        String elevado = new String();
        String frente = new String();
        for (int k = 0; k < i; k++) {
            frente += this.getFx().getSeparado().get(j).charAt(k);
        }
        double numElevado;
        for (int k = i + 2; k < this.getFx().getSeparado().get(j).length(); k++) {
            elevado += this.getFx().getSeparado().get(j).charAt(k);
        }
        numElevado = Double.parseDouble(elevado);
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

    public String xSemElevado(int i, int j, char posicao) {
        String derivada = new String();
        char simboloE = '^';
        String frente = new String();
        for (int k = 0; k < i; k++) {
            frente += this.getFx().getSeparado().get(j).charAt(k);
        }
        derivada += "" + frente;
        return derivada;
    }

    public Funcao getFx() {
        return fx;
    }

    public void setFx(Funcao fx) {
        this.fx = fx;
    }

    public Funcao getfLinhax() {
        return fLinhax;
    }

    public void setfLinhax(Funcao fLinhax) {
        this.fLinhax = fLinhax;
    }

    /**
     * @return the prontas
     */
    public ArrayList<DerivadaSoma> getProntas() {
        return prontas;
    }

    /**
     * @param prontas the prontas to set
     */
    public void setProntas(ArrayList<DerivadaSoma> prontas) {
        this.prontas = prontas;
    }

}
