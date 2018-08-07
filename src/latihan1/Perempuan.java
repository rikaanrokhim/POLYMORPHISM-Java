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
class Perempuan extends Manusia {
//    constructor
    public Perempuan(double TB) {
        super(TB);
    }
    
//    merupakan method overriding dari super
    public double HtgBBI() {
        return(super.getTB() - 100) * 0.8;
    }
}
