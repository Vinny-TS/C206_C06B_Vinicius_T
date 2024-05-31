import Exceptions.EmailInvalidoException;
import Exceptions.NumAmigosInvalidoException;
import RedesSociais.*;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String,RedeSocial> redesSociais = new HashMap<>();
        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("Vinicius Silva");

        usuario.getRedesSociais().put("Facebook", new Facebook("senhaFacebook", 55));
        usuario.getRedesSociais().put("Instagram", new Instagram("senhaInstagram", 45));

        try {
            usuario.setEmail("vinicius.silva@inatel.br");
        } catch (EmailInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            usuario.getRedesSociais().put("Twitter", new Instagram("senhaTesteInvalido", -45));
        } catch (NumAmigosInvalidoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nInformações do usuário:");
        System.out.println("Nome: "+usuario.getNome());
        System.out.println("E-mail: "+usuario.getEmail());

        System.out.println("Instagram do(a) "+usuario.getNome());
        usuario.getRedesSociais().get("Instagram").postarFoto();
        usuario.getRedesSociais().get("Instagram").postarVideo();
        usuario.getRedesSociais().get("Instagram").curtirPublicacao();

        System.out.println("Facebook do(a) "+usuario.getNome());
        if(usuario.getRedesSociais().get("Facebook") instanceof Facebook){
            Facebook facebookAux = (Facebook) usuario.getRedesSociais().get("Facebook");
            facebookAux.postarComentario();
            facebookAux.fazStreaming();
            facebookAux.compartilhar();
        }
    }
}