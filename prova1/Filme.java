
package com.mycompany.prova1;

public class Filme {
    private int codigo;
    private String nome;
    private String sinopse;
    private String genero;
        
    //get e set
    public int getCodigo()
    {
        return this.codigo;
    }
    public void setCodigo(int cod)
    {
        this.codigo=cod;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nom)
    {
        this.nome=nom.toLowerCase();
    }
    
      public String getGenero()
    {
        return this.genero;
    }
    public void setGenero(String tipo)
    {
        this.genero=tipo.toLowerCase();
    }
    
    public String getSinopse()
    {
        return this.sinopse;
    }
    public void setSinopse(String descricao)
    {
        this.sinopse=descricao.toLowerCase();
    }
     Filme(int codigo,String nome,String genero,String sinopse)
    {
        this.codigo=codigo;
        this.nome=nome.toLowerCase();
        this.genero=genero.toLowerCase();
        this.sinopse=sinopse.toLowerCase();
    }

    @Override
    public String toString() {
        return  getNome(); 
    }

    String getGeneroe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getGeneroe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}