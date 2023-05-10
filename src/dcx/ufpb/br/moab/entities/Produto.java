package dcx.ufpb.br.moab.entities;

import java.util.Objects;

public class Produto {

    private String codigoProduto;
    private double valor;
    private String nome;
    private int quantidade;

    public Produto(String nome, String codigoProduto, double valor, int quantidade) throws Exception {
        if(nome != null && codigoProduto != null && valor >= 0.0 && quantidade >= 0) {
            this.nome = nome;
            this.codigoProduto = codigoProduto;
            this.valor = valor;
            this.quantidade = quantidade;
        }
        else{
            throw new Exception("Erro, as informações passadas sobre o Produto não são válidas\nNome: " + nome + "\nSKU: " + codigoProduto + "\nValor: " + valor + "\nQuantidade: " + quantidade);
        }
    }

    public String codigoProduto(){
        return this.codigoProduto;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getValor(){
        return this.valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setcodigoProduto(String codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return ("\tProduto: "+nome+"\n\tSku: " + codigoProduto+"\n\tValor: "+valor+"\n\tQuantidade: "+quantidade+"\n\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigoProduto.equals(produto.codigoProduto) && getNome().equals(produto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProduto, getNome());
    }

}
