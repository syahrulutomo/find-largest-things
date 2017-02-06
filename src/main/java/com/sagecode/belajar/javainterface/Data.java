/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagecode.belajar.javainterface;

import java.util.ArrayList;

public class Data {
    /**
     * Find the largest of the measures of the given objects.
     * @param objects an array of Measurable objects
     * @return the object with the largest measured
     */   
    public static Measurable max(ArrayList<Measurable> objects)
    {
        Measurable max = objects.get(0);
        for(Measurable obj : objects)
        {

            if(obj.getMeasure() < max.getMeasure()  )
            {
                max = max;
            }
            else
            {
                max = obj;
            }
                      
        }
         return max;
    }
    
}
