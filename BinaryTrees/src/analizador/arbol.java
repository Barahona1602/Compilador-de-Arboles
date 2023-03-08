/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

/**
 *
 * @author pbara
 */
public class arbol {
    private String dato;
    private arbol hijoI;
    private arbol hijoD;

    public arbol(String dato) {
        this.dato = dato;
    }

    public arbol getHijoI() {
        return hijoI;
    }

    public void setHijoI(arbol hijoI) {
        this.hijoI = hijoI;
    }

    public arbol getHijoD() {
        return hijoD;
    }

    public void setHijoD(arbol hijoD) {
        this.hijoD = hijoD;
    }
    
}
