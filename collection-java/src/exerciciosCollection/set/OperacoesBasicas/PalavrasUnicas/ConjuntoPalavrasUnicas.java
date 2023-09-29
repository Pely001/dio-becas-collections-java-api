package exerciciosCollection.set.OperacoesBasicas.PalavrasUnicas;

import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributos
    private Set<String> palavrasSet;

    //Construtor
    public ConjuntoPalavrasUnicas(Set<String> palavrasSet) {
        this.palavrasSet = palavrasSet;
    }

    //Getter
    public Set<String> getPalavrasSet() {
        return palavrasSet;
    }

    //Métodos
    public void adcionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            }else{
                throw new RuntimeException("Palavra não localizada");
            }
        }else{
            throw new RuntimeException("Conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }
    public void exibirPalavras(){
        if(!palavrasSet.isEmpty()){
            System.out.println(palavrasSet);
        }else{
            throw new RuntimeException("Conjunto está vazio");
        }
    }
}
