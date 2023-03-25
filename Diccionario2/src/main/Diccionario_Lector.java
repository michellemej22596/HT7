package main;
import java.io.*;
import model.AssociationFrenchToSpanish;
import model.BinaryTree;
//Codigo para leer archivo de texto obtfnido de https://chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java#:~:text=Podemos%20abrir%20un%20fichero%20de,y%20extraer%20campos%20de%20ella.

public class Diccionario_Lector {

	public static void main(String[] args) {
			
		 System.out.println("Bienvenido al diccionario Francés - Español");
		 BinaryTree btf = new BinaryTree();
		 String msg="";
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
	     
	     try {
	    	 
	         archivo = new File ("C:\\diccionario.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         System.out.println("Su archivo ha sido encontrado con éxito.");
	         System.out.println("***********************************************************************");
	         System.out.println("Contenido encontrado: ");
	         String linea;
	         
	         while((linea=br.readLine())!=null) {
	            System.out.println(linea);
	            msg = linea;
	            
	            String[] parts = msg.split(",");
	            
	            AssociationFrenchToSpanish  AssociationFrench = new AssociationFrenchToSpanish ();

	            AssociationFrench.setFrenchWord(parts[2]);
	            AssociationFrench.setSpanishMeaning(parts[1]);
	            btf.add(AssociationFrench);
	            
	         }
	         
			 System.out.println("***********************************************************************");
			 System.out.println("Colección de palabras encontradas en orden alfabético según el inglés: ");
			 btf.traverseInOrder(btf.getRoot());
			 System.out.println("");
			 System.out.println("***********************************************************************");
			 System.out.println("Leyendo texto a traducir...");
			 traducirArchivoIngles(btf);
			 
	         
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
	public static void traducirArchivoIngles(BinaryTree bt) {
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
	     String texto="";

	      try {
	         archivo = new File ("C:\\textoFrances.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         
	         String linea;
	         while((linea=br.readLine())!=null) {
	            System.out.println(linea);
	            texto = linea;
	            String[] palabras = texto.split(" ");
	            
	            for (int i=0;i<palabras.length;i++) {
	            	
	            	if(bt.containsNode(bt.getRoot(), palabras[i])) {
	            	
	            	}else {
	            		System.out.println("*" + palabras[i] + "*");
	            	}
	           }
	            
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
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

