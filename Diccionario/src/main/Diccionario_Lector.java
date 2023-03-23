package main;
import java.io.*;

import model.BinaryTree;
//Codigo para leer archivo de texto obtenido de https://chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java#:~:text=Podemos%20abrir%20un%20fichero%20de,y%20extraer%20campos%20de%20ella.

public class Diccionario_Lector {

	public static void main(String[] args) {
		
		 BinaryTree bt = new BinaryTree();
		 String msg="";
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
	     
	     try {
	    	 
	         archivo = new File ("C:\\diccionario.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         System.out.println("Su archivo ha sido encontrado con éxito.");
	         System.out.println("Contenido encontrado: ");
	         String linea;
	         
	         while((linea=br.readLine())!=null) {
	            System.out.println(linea);
	            msg = linea;
	            
	            String[] parts = msg.split(",");
	            System.out.println(parts[0]);
	            System.out.println(parts[1]);
	            System.out.println(parts[2]);
	            bt.add("Hola");
	            
	         
	         }
	     }
	     
	      catch(Exception e){
	    	  
	         e.printStackTrace();
	         System.out.println("No se ha encontrado el archivo de texto");
			 System.out.println("Asegúrese de llamarlo diccionario.txt en su disco C");
	      
	      }finally{
	    	  
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		

	}

}

