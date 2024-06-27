
package Control;

import Modelo.Persona;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivos {
    boolean comprobar = false;
    ArrayList<Persona>lista=new ArrayList();
    String path="C:\\Users\\yepes\\OneDrive\\Escritorio\\datos";
    int docId;
    
    
    public void carpeta(){
        File directorio = new File(path);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
            } else {
            }
        }
    }
    
    public void crearArchivo() throws IOException{
        carpeta();
        File archivo = new File(path+"/data.txt");
        if(!archivo.exists()){
                archivo.createNewFile();
            }
    }
    
    public void listaTexto(ArrayList<Persona> list) throws IOException{    
        crearArchivo();
        try{
            File archivo = new File(path+"/data.txt");          
            FileWriter fw=new FileWriter(archivo);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                for (int i=0; i<list.size(); i++) {
                    bw.write(list.get(i).getCedula()+"\n");
                    bw.write(list.get(i).getNombre()+"\n");
                    bw.write(list.get(i).getCelular()+"\n");
                    bw.write(list.get(i).getFechaRegistro()+"\n");
                    bw.write(list.get(i).getPlaca()+"\n");
                    bw.write(list.get(i).getModelo()+"\n");
                    bw.write(list.get(i).getColor()+"\n");
                }
                bw.close();
            }
            
        }catch (IOException e){
         
        }
    }
    
    
    public ArrayList<Persona> subirContenido() throws FileNotFoundException, IOException { 
        ArrayList<Persona>lista2=new ArrayList();
	ArrayList<String> aux=new ArrayList();
        crearArchivo();
        String cadena;
	FileReader f = new FileReader(path+"/data.txt"); 
        try (BufferedReader b = new BufferedReader(f)) {
            while((cadena = b.readLine())!=null) {
                aux.add(cadena);
            }
            for(int i=0; i<aux.size(); i+=7){
                Persona persona=new Persona();
                persona.setCedula(Integer.parseInt(aux.get(i)));
                persona.setNombre(aux.get(i+1));
                persona.setCelular(aux.get(i+2));
                persona.setFechaRegistro(aux.get(i+3));
                persona.setPlaca(aux.get(i+4));
                persona.setModelo(aux.get(i+5));
                persona.setColor(aux.get(i+6));
                lista2.add(persona);
            }
            b.close();
            return lista2;          
        } 
    }
    
    public void limpiarDatos() throws IOException{
        crearArchivo();
        File archivo = new File(path+"/data.txt");
        FileWriter fw=new FileWriter(archivo);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("");
            bw.close();
        }
    }
    
    public boolean Agregar(Persona nuevo, int id) throws IOException{
          recorrido(id);
         if(docId!=id || lista.isEmpty()) { 
            lista.add(nuevo);
            limpiarDatos();
            listaTexto(lista);
            return true;
        }           
        return false;
    }
    
    public int recorrido(int cedula) throws IOException{
        lista.clear();
        lista.addAll(subirContenido());
        int indice=0;  
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getCedula()==cedula){
                indice=i;
                docId=lista.get(i).getCedula();
                comprobar=true;
                break;
            }
        }
        return indice;
    }
    
    public Persona Buscar(int id) throws IOException{
        recorrido(id);
        if(comprobar){
            Persona persona=lista.get(recorrido(id));
            return  persona;
        }
        return null;
    }
    
    public boolean BuscarInfo(int id) throws IOException{
        recorrido(id);
        return comprobar;     
    }
    
    public boolean Eliminar(String id) throws IOException{
        recorrido2(id);
        if(comprobar){
            lista.remove(recorrido2(id));
            limpiarDatos();
            listaTexto(lista);
        return true;
        }
        return false;
    }
    
     public int recorrido2(String placa) throws IOException{
        lista.clear();
        lista.addAll(subirContenido());
        int indice=0;  
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getPlaca());
            if(lista.get(i).getPlaca().equals(placa)){
                
                indice=i;
                comprobar=true;
                break;
            }
        }
        return indice;
    }
}
