package Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;
    //construtor já chama um array list vazio
    public CatalogoLivros(){
        this.livroList=new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();//cria uma lista vazia
        if (!livroList.isEmpty()) {//se estiver vazia nem passa pelo if
            for(Livro l:livroList){ //para cada Livro l em livroList
                if (l.getAutor().equalsIgnoreCase(autor)) {//se o get autor for igual ao autor passado no método
                    livrosPorAutor.add(l);//adiciona esse livro nessa lista de livrosPorAutor
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao() <=anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }return livrosPorIntervaloAnos;        
    }
    public Livro pesquisarPorTitulo(String titulo){
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    return l;
                }
            }
        }return null;//se não tiver livros retorna nulo
    }

}
