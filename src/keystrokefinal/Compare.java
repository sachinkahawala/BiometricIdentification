/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystrokefinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Sachin
 */
public class Compare {
    static String   key ;
    static HashMap<String,ArrayList<ArrayList<Long>>> newUsers;
    public static boolean checkForSimilarity(String name,ArrayList<Long> inputArray,ArrayList<Long> inputArray1){
        newUsers=SignUpForm.returnUserList();
        Iterator<String> keySetIterator = newUsers.keySet().iterator(); 
        while (keySetIterator.hasNext())
        {     key = keySetIterator.next();
            if(key.equals(name) && inputArray.size()==newUsers.get(key).get(0).size() && inputArray1.size()==newUsers.get(key).get(1).size()){
                float count=0;
                float count1=0;
                System.out.println(Arrays.toString(inputArray.toArray()));
                System.out.println(Arrays.toString(inputArray1.toArray()));
                System.out.println(Arrays.toString(newUsers.get(key).get(0).toArray())+" "+Arrays.toString(newUsers.get(key).get(1).toArray()));
                for (int i = 0; i < inputArray.size(); i++) {
                    if(inputArray.get(i)<newUsers.get(key).get(0).get(i)+40 && inputArray.get(i)>newUsers.get(key).get(0).get(i)-40){
                        count+=1;
                    }	
		}
                for (int i = 1; i < inputArray1.size(); i++) {
                    //System.out.println(inputArray1.get(i)+" "+newUsers.get(key).get(1).get(i));
                    if(inputArray1.get(i)<newUsers.get(key).get(1).get(i)+40 && inputArray1.get(i)>newUsers.get(key).get(1).get(i)-40){
                        count1+=1;
                    }	
		}
                System.out.println(count*100/inputArray.size()+" "+count1*100/(inputArray.size()-1));
                if(count/inputArray.size()>=0.7 && count1/(inputArray.size()-1)>=0.6 ){
                    return true;
                }
            }
             
        }
        
            return false;
    }
    
    
}
