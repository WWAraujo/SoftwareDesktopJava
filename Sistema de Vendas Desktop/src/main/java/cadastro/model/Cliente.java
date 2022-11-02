
package cadastro.model;

/**
 *
 * @author T-Gamer
 */
public class Cliente {
    
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private String aniverCliente;
    private String celularCliente;
    private String estadoCivil;
    private String sexoCliente;
    private String enderecoCliente;
    private String emailCliente;
    
    //Construtor
    public Cliente(){
    }
    
    public Cliente(String nomeCliente, String cpfCliente, String aniverCliente ){
        this.cpfCliente = cpfCliente;
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.aniverCliente = aniverCliente;
    }
    
    
    public Cliente(String nomeCliente, String cpfCliente, String aniverCliente, String celularCliente, 
            String estadoCivil, String sexoCliente, String enderecoCliente, String emailCliente ){
        this.cpfCliente = cpfCliente;
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.aniverCliente = aniverCliente;
        this.celularCliente = celularCliente;
        this.estadoCivil = estadoCivil;
        this.sexoCliente = sexoCliente;
        this.enderecoCliente = enderecoCliente;
        this.emailCliente = emailCliente;
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
    
    public String getCelularCliente(){
        return celularCliente;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public String getSexoCliente(){
        return sexoCliente;
    }
    
    public String getEnderecoCliente(){
        return enderecoCliente;
    }
    
    public String getEmailCliente(){
        return emailCliente;
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
    
    public void setCelularCliente(){
        this.celularCliente = celularCliente;
    }
    
    public void setEstadoCivil(){
        this.estadoCivil = estadoCivil;
    }
    
    public void setSexoCliente(){
        this.sexoCliente = sexoCliente;
    }
    
    public void setEnderecoCliente(){
        this.enderecoCliente = enderecoCliente;
    }
    
    public void setEmailCliente(){
        this.emailCliente = emailCliente;
    }
    
}
