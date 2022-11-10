
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
    
    public Cliente(String nomeCliente, String cpfCliente){
        this.cpfCliente = cpfCliente;
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
    }
    
    public Cliente(int idCliente, String nomeCliente, String cpfCliente){
        this.idCliente = idCliente;
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
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
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public String getCPFCliente(){
        return cpfCliente;
    }
    
    public String getCelularCliente(){
        return celularCliente;
    }
    
    public String getEnderecoCliente(){
        return enderecoCliente;
    }
    
    public String getEmailCliente(){
        return emailCliente;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public String getAniverCliente(){
        return aniverCliente;
    }
    
    public String getSexoCliente(){
        return sexoCliente;
    }
    
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public void setCPFCliente(String cpfCliente){
        this.cpfCliente = cpfCliente;
    }
    
    public void setCelularCliente(String celularCliente){
        this.celularCliente = celularCliente;
    }
    
    public void setEnderecoCliente(String enderecoCliente){
        this.enderecoCliente = enderecoCliente;
    }
    
    public void setEmailCliente(String emailCliente){
        this.emailCliente = emailCliente;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    public void setAniverCliente(String aniverCliente){
        this.aniverCliente = aniverCliente;
    }
    
    public void setSexoCliente(String sexoCliente){
        this.sexoCliente = sexoCliente;
    }
    
}
