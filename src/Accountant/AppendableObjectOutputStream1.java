/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accountant;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class AppendableObjectOutputStream1 extends ObjectOutputStream {
    public AppendableObjectOutputStream1(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException { 
        
    }
} 
