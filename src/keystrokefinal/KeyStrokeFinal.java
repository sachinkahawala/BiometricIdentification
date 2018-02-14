/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystrokefinal;

/**
 *
 * @author Sachin
 */
public class KeyStrokeFinal {
    static SignUpForm s;
    static LogInForm l;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       s= new SignUpForm();
       l=new LogInForm();
       s.setVisible(true);
       l.setVisible(false);
    }
    public static void setSignUpForm(){
        s.setVisible(true);
       l.setVisible(false);
    }
    public static void setLogInForm(){
        s.setVisible(false);
       l.setVisible(true);
    }
    
    
}
