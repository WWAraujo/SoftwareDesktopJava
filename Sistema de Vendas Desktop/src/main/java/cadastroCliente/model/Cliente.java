
package cadastroCliente.model;

/**
 *
 * @author T-Gamer
 */
public class Cliente {
    
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    
    //Construtor
    public Cliente(){
    }
    
    public Cliente(String nomeCliente, String cpfCliente ){
        this.cpfCliente = cpfCliente;
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public void setIdCliente(){
        this.idCliente = idCliente;
    }
    
    public String getCPFCliente(){
        return cpfCliente;
    }
    
    public void setCPFCliente(){
        this.cpfCliente = cpfCliente;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public void setNomeCliente(){
        this.nomeCliente = nomeCliente;
    }
}
