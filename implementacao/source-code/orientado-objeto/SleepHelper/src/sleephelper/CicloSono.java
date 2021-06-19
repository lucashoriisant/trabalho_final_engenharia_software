package sleephelper;
public class CicloSono {
    
    private String confirmacao;
    private boolean execucao;
    private boolean status;    

    CicloSono() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void estadoAtual(){
        System.out.println("Deseja realmente iniciar o ciclo? " + this.getConfirmacao());
    
}
    
    public void iniciarCiclo(){
        
        if (getConfirmacao() == "S"){
            System.out.println("Ciclo iniciado!");
        }else
            System.out.println("O ciclo não foi iniciado!");
    }
    
    public void terminarCiclo(){
        
    }
    
    public String getConfirmacao() {
        return confirmacao;
    }

    public void setConfirmacao(String confirmacao) {
        this.confirmacao = confirmacao;
    }

    public boolean getExecucao() {
        return setExecucao();
    }
    
    public boolean setExecucao() {
        return execucao;
    }
        
    public void setExecucao(boolean execucao) {
        this.execucao = execucao;
    }
    
    public boolean getStatus() {
        return this.setStatus();
    }
    
      public boolean setStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    } 
    
    public CicloSono(String confirmacao, boolean status) { //Este é o método construtor
        this.setConfirmacao ("S");
        this.setStatus (false);
    }

   


   
  

  
    /*private void setConfirmacao(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    void estadoatual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
