package exerciciosCollection.list.OperacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List <Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if(!pessoaList.isEmpty()){
            Collection.sort(pessoasPorIdade);
            return pessoasPorIdade;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

}
