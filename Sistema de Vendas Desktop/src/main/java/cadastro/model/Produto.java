package cadastro.model;

/**
 *@author Wallace Wagner, Rafael de Souza, Semaías de Oliveira
 * 
 */

public class Produto {

    private int idProd;
    private String nomeProd;
    private double precoProd;
    private String tipoProd;
    private String tamanhoProd;
    private String marcaProd;
    private int quantidadeProd;
    private String descricaoProd;

    //Construtor
    public Produto() {
    }

    
    public Produto(String nomeProd, double precoProd, String tipoProd,
            String tamanhoProd, String marcaProd, int quantidadeProd, String descricaoProd) {
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
        this.tipoProd = tipoProd;
        this.tamanhoProd = tamanhoProd;
        this.marcaProd = marcaProd;
        this.quantidadeProd = quantidadeProd;
        this.descricaoProd = descricaoProd;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public String getTamanhoProd() {
        return tamanhoProd;
    }

    public void setTamanhoProd(String tamanhoProd) {
        this.tamanhoProd = tamanhoProd;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }

    public int getQuantidadeProd() {
        return quantidadeProd;
    }

    public void setQuantidadeProd(int quantidadeProd) {
        this.quantidadeProd = quantidadeProd;
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public void setDescricaoProd(String descricaoProd) {
        this.descricaoProd = descricaoProd;
    }



}
