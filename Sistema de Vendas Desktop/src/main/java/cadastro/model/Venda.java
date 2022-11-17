/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.model;

import java.util.ArrayList;

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
    
    private ArrayList<Venda> listaItens = null;

    public Venda(){
    }

    public Venda(int idNota, int valorNota, String cpfCliente, double precoProd, int quantidadeProd) {
        this.idNota = idNota;
        this.valorNota = valorNota;
        this.cpfCliente = cpfCliente;
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

    public ArrayList<Venda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Venda> listaItens) {
        this.listaItens = listaItens;
    }
    
}
