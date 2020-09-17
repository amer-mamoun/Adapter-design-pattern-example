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
public class Student1 implements Student {

    @Override
    public void getName() {
         System.out.println("Amer"); 
    }

    @Override
    public void getNeptun() {
         System.out.println("FVMQ41"); 
    }

    @Override
    public void getStudyFeild() {
         System.out.println("IT"); 
    }

    @Override
    public void Teaching() {
         System.out.println("Teaching Cisco"); 
    }
    
}
