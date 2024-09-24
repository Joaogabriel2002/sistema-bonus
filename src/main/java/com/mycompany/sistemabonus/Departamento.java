
package com.mycompany.sistemabonus;


public class Departamento {
        
    private int idDepartamento;
    private String nomedp;
    private double valorVendas;
    
    
    public Departamento(int idDepartamento,String nomedp, double valorVendas){
        
        this.idDepartamento = idDepartamento;
        this.nomedp = nomedp;
        this.valorVendas = valorVendas;
    }  
    
    
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento){
        this.idDepartamento = idDepartamento;
    }
    
    public String nomedp(){
        return nomedp;
    }
    
    public void nomedp(String nomedp){
        this.nomedp = nomedp;
    }
    
    public double getValorVendas(){
        return valorVendas;
    }
    
    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }
    

}
