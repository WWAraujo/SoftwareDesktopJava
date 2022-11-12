/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.model;

/**
 *
 * @author T-Gamer
 */
public class Venda {
    
    private int idNota;
    private int valorNota;
    private int idCliente;
    private String cpfCliente;
    private int idProd;
    private String nomeProd;
    private double precoProd;
    private String tipoProd;
    private String tamanhoProd;
    private String marcaProd;
    private int quantidadeProd;
    private String descricaoProd;
    
    public Venda(){
        
    }

    public Venda(int idNota, int valorNota, String cpfCliente, double precoProd, int quantidadeProd) {
        this.idNota = idNota;
        this.valorNota = valorNota;
        this.cpfCliente = cpfCliente;
        this.precoProd = precoProd;
        this.quantidadeProd = quantidadeProd;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getValorNota() {
        return valorNota;
    }

    public void setValorNota(int valorNota) {
        this.valorNota = valorNota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
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
