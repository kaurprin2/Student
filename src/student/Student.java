/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Mundi
 */
public class Student {

    
  // public String name;need this ti be private so not everyone can access it for good programming
    private String name;//this is known encapsulation// now we have to create method or constructor for this error to print name in main class.because now s1.name will show error.
  public Student(){
      //empty construtor
   }
  public Student(String n){
      this.name=n;
  }
//this two methods(getName and setName) come from doing these steps :- first right click on name then click on refactor then encapsulation fields and click on refactor.
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
   
    
}
