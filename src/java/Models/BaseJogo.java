/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Aluno
 */
public abstract class BaseJogo {
    
    protected String[] titulos;
    
    protected String retornaInformacao(int posicao){
        return titulos[posicao];
    }
    
}
