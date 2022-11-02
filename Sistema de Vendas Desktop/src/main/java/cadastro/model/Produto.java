package cadastro.model;

/**
 *
 * @author T-Gamer
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

    public String getNomeProd() {
        return nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public String getTamanhoProd() {
        return tamanhoProd;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public int getQuantidadeProd() {
        return quantidadeProd;
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public void setIdProd() {
        this.idProd = idProd;
    }

    public void setNomeProd() {
        this.nomeProd = nomeProd;
    }

    public void setPrecoProd() {
        this.precoProd = precoProd;
    }

    public void setTipoProd() {
        this.tipoProd = tipoProd;
    }

    public void setTamanhoProd() {
        this.tamanhoProd = tamanhoProd;
    }

    public void setMarcaProd() {
        this.marcaProd = marcaProd;
    }

    public void setQuantidadeProd() {
        this.quantidadeProd = quantidadeProd;
    }

    public void setDescricaoProd() {
        this.descricaoProd = descricaoProd;
    }

}
