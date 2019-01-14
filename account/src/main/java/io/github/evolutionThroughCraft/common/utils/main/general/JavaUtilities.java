/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.common.utils.main.general;

import java.util.List;
import java.util.Set;

/**
 *
 * @author dwin
 */
public class JavaUtilities {
    
    public <T> List<T> asList(T... elements) {
        return SetupUtil.asList(elements);
    }
    
    public <T> Set<T> asSet(T... elements) {
        return SetupUtil.asSet(elements);
    }
    

}
