package sleephelper;
public class CicloSono {
    
    private String confirmacao;
    private boolean execucao;
    
    
    public void estadoAtual(){
        System.out.println("Deseja realmente iniciar o ciclo? " + getConfirmacao());
    
}
    
    public void iniciarCiclo(){
        
        if (getConfirmacao() == "S"){
            System.out.println("Ciclo iniciado!");
        }else
            System.out.println("O ciclo não foi iniciado!");
        
    }
    
    public void terminarCiclo(){
        
    }
    
    public void status (){
        if (this.getStatus() == false){
            System.out.println("Pode abrir a conta");
        } else{
            System.out.println("A conta já está aberta");
        }  
        
    }

    /**
     * @return the confirmacao
     */
    public String getConfirmacao() {
        return confirmacao;
    }

    /**
     * @param confirmacao the confirmacao to set
     */
    public void setConfirmacao(String confirmacao) {
        this.confirmacao = confirmacao;
    }

    /**
     * @return the execucao
     */
    public boolean isExecucao() {
        return execucao;
    }

    /**
     * @param execucao the execucao to set
     */
    public void setExecucao(boolean execucao) {
        this.execucao = execucao;
    }
}
