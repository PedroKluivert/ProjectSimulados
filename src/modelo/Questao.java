package modelo;

public class Questao {
    
    private int id;
    private String texto;
    private String tipo;
    private String resposta;
    private int id_Assunto;
    private String cod_usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getId_Assunto() {
        return id_Assunto;
    }

    public void setId_Assunto(int id_Assunto) {
        this.id_Assunto = id_Assunto;
    }

    public String getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
    
}
