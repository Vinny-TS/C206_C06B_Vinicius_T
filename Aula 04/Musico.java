public class Musico {
    private String nome;
    private Album[] albuns = new Album[10];

    public void listar(){
        for (int i = 0; i < albuns.length; i++){
            if (albuns[i] != null) {
                System.out.println(albuns[i].getNome());
                System.out.println(albuns[i].getNota());
            }
        }
    }

    public void adicionar(Album album){
        for (int i = 0; i < albuns.length; i++) {
            if (albuns[i] == null){
                albuns[i] = album;
                break;
            }
        }
    }

    public Album deletar(String nome){
        for (int i = 0; i < albuns.length; i++) {
            if (albuns[i] != null){
                if (albuns[i].getNome() == nome){
                    albuns[i] = null;
                    System.out.println("Deletado");
                }
                else{
                    System.out.println("Não encontrado");
                }
            }
        }
        return null;
    }

    public void buscar(Album album){
        for (int i = 0; i < albuns.length; i++) {
            if (albuns[i] != null){
                if (albuns[i].getNome() == nome){
                    System.out.println();
                }
                else{
                    System.out.println("Não encontrado");
                }
            }
        }
    }

}
