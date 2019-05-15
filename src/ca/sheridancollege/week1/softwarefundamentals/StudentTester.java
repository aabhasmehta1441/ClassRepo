/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author mehta
 */
public class StudentTester {
    public static void main(String[] args)
    {
        //Array of Objects
        Student[] studentList=new Student[3];
        
        //Object of Student class
        Student s1=new Student("Harpreet",347);
        
        //Populating array with Object
        studentList[0]=s1;
        
        studentList[1]=new Student("Leo",123);
        studentList[2]=new Student("Sheetal",111);
        
        for(int i=0;i<studentList.length;i++)
        {
            System.out.println(studentList[i].getName());
        }
        
    }
}
