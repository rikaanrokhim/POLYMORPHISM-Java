/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author lenovo
 */
class Laki_Laki extends Manusia {
//    constructor
    public Laki_Laki(double TB) {
        super(TB);
    }
    
//    method htgbbi() merupakan method overriding dari superclassnya
    public double HtgBBI() {
        return(super.getTB() - 100) * 0.9;
    }
}
