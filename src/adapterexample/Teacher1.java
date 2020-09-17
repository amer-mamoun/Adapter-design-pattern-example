/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterexample;

/**
 *
 * @author amerm
 */
public class Teacher1 implements Teacher {

    @Override
    public void getName() {
         System.out.println("John"); 
    }

    @Override
    public void teching() {
         System.out.println("Tech Networking"); 
    }

    @Override
    public void getNeptun() {
         System.out.println("FLIMN3"); 
    }
    
}
