package RedesSociais;

import Exceptions.NumAmigosInvalidoException;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        if(numAmigos>=0){
            this.numAmigos = numAmigos;
        }
        else{
            throw new NumAmigosInvalidoException("Quantidade de amigos inválida!");
        }
    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação!");
    }
}
