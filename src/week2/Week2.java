/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

/** distributed vcs = configure Local rep
 * s1: initialize versioning, gitconfig,gitignore, commit
 */
/**
 *
 * @author komal kaur
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Student [] list = new Student[3] ;  
      
      //array of object decalration
      //define 3 students  by creating object of student class

        Student s1 = new Student();
        // s1 - object
        s1.setName("peter");
        s1.setAge(21);
         Student s2 = new Student(); 
         // s2 - object
        s2.setName("kumar");
        s2.setAge(21);
         Student s3 = new Student(); 
         // s3 - object
        s3.setName("simran");
        s3.setAge(20);
        //store object in array
          list[0] = s1;       
            list[1] = s2;   
            list[2] = s3;   
            for(int i=0;i<list.length;i++)
            //read the array 
            {
                System.out.println(list[i].getName() + " "+list[i].getAge());
            }
                  
    }

    }
    
