/*
 * IWritable.java
 *
 * Created on �����, 2010, ������� 26, 13:05
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package test1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author grade
 */
public interface IWritable {
    Product[] sort();
    void writeProducts(File filename) throws IOException;
    

}

