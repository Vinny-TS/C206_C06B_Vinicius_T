package RedesSociais;

import Exceptions.EmailInvalidoException;

import java.util.Map;

public class Usuario {
    private String nome;
    private String email;
    private Map<String,RedeSocial> redesSociais;

    public Usuario(Map<String, RedeSocial> redesSociais) {
        this.redesSociais = redesSociais;
    }
    public Usuario(String nome, String email, Map<String, RedeSocial> redesSociais) throws EmailInvalidoException {
        this.nome = nome;
        if(email.matches("\\w+\\@\\w+\\.\\w+")){
            this.email = email;
        }
        else{
            throw new EmailInvalidoException("Email inválido!");
        }
        this.redesSociais = redesSociais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailInvalidoException {
        if(email.matches("\\w+\\@\\w+\\.\\w+")){
            this.email = email;
        }
        else{
            throw new EmailInvalidoException("Email inválido!");
        }
    }

    public Map<String, RedeSocial> getRedesSociais() {
        return redesSociais;
    }
}
