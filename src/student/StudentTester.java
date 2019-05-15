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
public class StudentTester {
    public static void main(String[] args) {
    Student s1 = new Student();
    //s1.name="mantesh";//will work only if name is public.(1 step)
   // System.out.println(s1.name);
  s1.setName("PRINCE");//(2 step)
   System.out.println(s1.getName());//3
    Student s2 = new Student("priya");//4
     Student s3 = new Student("aesh");//5
     Student [] list = new Student[3];
     list[0]=s1;
     list[1]=s2;
     list[2]=s3;
    for(int i=0; i<list.length; i++){
      System.out.println(list[i].getName());    
    }
     
    } 
}
