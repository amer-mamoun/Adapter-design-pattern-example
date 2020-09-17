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
public class TechingAdapter implements Student{

    Teacher teacher;
    public TechingAdapter(Teacher teacher){
        this.teacher = teacher;
    }
   
    @Override
    public void Teaching() {
         teacher.teaching = teching;
    }

    @Override
    public void getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getNeptun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getStudyFeild() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
