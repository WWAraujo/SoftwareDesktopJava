/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.model;

import java.util.ArrayList;

/**
 *@author Wallace Wagner, Rafael de Souza, Semaías de Oliveira
 * 
 */

public class Venda {
    
    private int idNota;
    private int idCliente;
    private int idProd;
    private int qtdProd;
    private double valorTotalNota;
    private double valorUnid;
    private String cpfCliente;
    private String formaPagamento;
    
    private ArrayList<Venda> listaItens = null;

    public Venda(){
    }

    public Venda(int idNota, double valorTotalNota, String cpfCliente, int quantidadeProd) {
        this.idNota = idNota;
        this.valorTotalNota = valorTotalNota;
        this.cpfCliente = cpfCliente;
        this.qtdProd = quantidadeProd;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }

    public double getValorTotalNota() {
        return valorTotalNota;
    }

    public void setValorTotalNota(double valorTotalNota) {
        this.valorTotalNota = valorTotalNota;
    }

    public double getValorUnid() {
        return valorUnid;
    }

    public void setValorUnid(double valorUnid) {
        this.valorUnid = valorUnid;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<Venda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Venda> listaItens) {
        this.listaItens = listaItens;
    }
    
}
