
package cadastroCliente.model;

/**
 *
 * @author T-Gamer
 */
public class Cliente {
    
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private String aniverCliente;
    
    //Construtor
    public Cliente(){
    }
    
    public Cliente(String nomeCliente, String cpfCliente, String aniverCliente ){
        this.cpfCliente = cpfCliente;
        //this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.aniverCliente = aniverCliente;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public String getCPFCliente(){
        return cpfCliente;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public String getAniverCliente(){
        return aniverCliente;
    }
    
    public void setIdCliente(){
        this.idCliente = idCliente;
    }
    
    public void setCPFCliente(){
        this.cpfCliente = cpfCliente;
    }
    
    public void setNomeCliente(){
        this.nomeCliente = nomeCliente;
    }
    
    public void setAniverCliente(){
        this.aniverCliente = aniverCliente;
    }
}
