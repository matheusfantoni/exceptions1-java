
package model.entities.model.exceptions;

public class DomainException extends Exception{
    
    //RunTimeException o compilador não obriga a tratar.
    // Exception o compilador obriga vc a tratar o erro.
    
    private static final long serialVersionUID = 1L;
    
    public DomainException(String msg){
        super(msg);
    }
}
