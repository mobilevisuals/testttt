/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
@Named(value = "palCOntroller")
@SessionScoped
public class PalCOntroller implements Serializable {

    private String palin;

    public String getPalin() {
        return palin;
    }

    public void setPalin(String palin) {
        this.palin = palin;
    }
    
    
    /**
     * Creates a new instance of PalCOntroller
     */
    public PalCOntroller() {
    }
    
}
