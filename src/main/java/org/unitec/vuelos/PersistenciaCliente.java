/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.vuelos;
import java.io.*;
import  java.util.ArrayList;
/**
 *
 * @author T-107
 */
public class PersistenciaCliente {
    ArrayList<Cliente> Clientes=new ArrayList<Cliente>();
       public  ArrayList<Cliente> buscarTodos()throws Exception{
        
        File file=new File("aerolinea");
        FileInputStream fileInputStream =new FileInputStream(file);
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
       Clientes= (ArrayList<Cliente>) objectInputStream.readObject();
       return Clientes;
    }
    public void guardarUsuario(Cliente u)throws Exception{
        File file=new File("aerolinea");
        if(file.exists()){
        Clientes=    buscarTodos();
        }
        FileOutputStream fileOutputStream =new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        Clientes.add(u);
        objectOutputStream.writeObject(Clientes); 
        
    }

 
}
