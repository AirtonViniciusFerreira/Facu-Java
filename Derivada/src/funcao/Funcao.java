package funcao;

// @author VINICIUS
import java.util.ArrayList;

public class Funcao {

    private String funcao;
    private ArrayList<String> separado;
    private ArrayList<String> simbolos;
    private ArrayList<String> simbolosQuociente;

    public Funcao() {
        this.funcao = new String();
        this.separado = new ArrayList<>();
        this.simbolos = new ArrayList<>();
        this.simbolosQuociente = new ArrayList<>();
    }

    public Funcao(String funcao) {
        this.funcao = funcao;
        this.separado = new ArrayList<>();
        this.simbolos = new ArrayList<>();
        this.simbolosQuociente = new ArrayList<>();
    }

    public void tiraPonto() {
        String sep[] = this.getFuncao().split(";");
        this.setFuncao(sep[0]);

    }

    public void pegarSimbolos() {
        String aux = new String();
        char aux2;
        String converte = new String();
        this.setFuncao(this.getFuncao() + ";");
        for (int i = 0; i < this.getFuncao().length(); i++) {
            aux2 = this.getFuncao().charAt(i);
            if (aux2 != '+' && aux2 != '-' && aux2 != ';') {
                aux += aux2;
            } else if (aux2 == '+' || aux2 == '-') {
                converte += aux2;
                this.getSimbolos().add(converte);
                this.getSeparado().add(aux);
                aux = new String();
                converte = new String();
            } else if (aux2 == ';') {
                this.getSeparado().add(aux);
            }
        }
        this.tiraPonto();
    }

    public String juntar() {
        String junta = new String();
        if (this.getSeparado().size() == this.getSimbolos().size()) {
            for (int i = 0; i < this.getSeparado().size(); i++) {
                junta += this.getSimbolos().get(i) + this.getSeparado().get(i);
            }
        } else {
            int j = 0;
            for (int i = 0; i < this.getSeparado().size(); i++) {
                junta += this.getSeparado().get(i);
                if (j < this.getSimbolos().size()) {
                    junta += this.getSimbolos().get(j);
                    j++;
                }
            }
        }
        return junta;
    }

    public void separaQuociente() {
        String aux = new String();
        char aux2;
        String converte = new String();
        this.setFuncao(this.getFuncao() + ".");
        for (int i = 0; i < this.getFuncao().length(); i++) {
            aux2 = this.getFuncao().charAt(i);
            if (aux2 != '/' && aux2 != '.') {
                aux += aux2;
            } else if (aux2 == '/') {
                converte += aux2;
                this.getSimbolosQuociente().add(converte);
                this.getSeparado().add(aux);
                aux = new String();
                converte = new String();
            } else if (aux2 == '.') {
                this.getSeparado().add(aux);
            }
        }
    }

    public ArrayList<String> getSimbolosQuociente() {
        return simbolosQuociente;
    }

    public void setSimbolosQuociente(ArrayList<String> simbolosQuociente) {
        this.simbolosQuociente = simbolosQuociente;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public ArrayList<String> getSeparado() {
        return separado;
    }

    public void setSeparado(ArrayList<String> separado) {
        this.separado = separado;
    }

    public ArrayList<String> getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(ArrayList<String> simbolos) {
        this.simbolos = simbolos;
    }
}
