/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodsample;
public interface Trace {
    public void setdebug(boolean debug);
    public void debug(String message);
    public void error(String message);
}
