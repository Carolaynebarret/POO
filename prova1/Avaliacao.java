
package com.mycompany.prova1;

public class Avaliacao{
    private int codigo;
    private String nome;
    private int nota;
    private String comentario;
    
    ///get e set codigo 
    public int getCodigo()
    {
        return this.codigo;
    }
    public void setCodigo(int cod)
    {
        this.codigo=cod;
    }
    
    //get e set nome do filme
    public void setNome(String nome)
    {
        this.nome=nome.toLowerCase();
    }
    public String getNome()
    {
        return this.nome;                       
    }
    
    //get set nota do filme 
    
    
    public void setNota(int nota)
    {
        this.nota=nota;
    }
    public int getNota()
    {
        return this.nota;
    }
    
    //get e set comentario 
    public String getComentario()
    {
        return this.comentario;
    }
    public void setComentario(String comentario)
    {
        this.comentario=comentario.toLowerCase();
    } 
    
    Avaliacaoenome(int codigo,String nome,int nota,String comentario)
    {
        this.codigo=codigo;
        this.nome=nome.toLowerCase();
        this.nota=nota;
        this.comentario=comentario.toLowerCase();
    }
}

