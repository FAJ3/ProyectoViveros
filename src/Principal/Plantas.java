package Principal;

public class Plantas {
    
    private String nombre;
    private String nombre_cientifico;
    private String maceta;
    private String riego;
    private String epoca;
    private String descripcion;
    private String precio;
            
            
    public Plantas(String nombre, String nombre_cientifico, String maceta, String riego, String epoca, String descripcion, String precio){
        this.nombre=nombre;
        this.nombre_cientifico=nombre_cientifico;
        this.maceta=maceta;
        this.riego=riego;
        this.epoca=epoca;
        this.descripcion=descripcion;
        this.precio=precio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombreCientifico(){
        return this.nombre_cientifico;
    }
    public void setNombreCientifico(String nombre_cientifico){
        this.nombre_cientifico=nombre_cientifico;
    }
    
    public String getMaceta(){
        return this.maceta;
    }
    public void setMaceta(String maceta){
        this.maceta=maceta;
    }
    
    public String getRiego(){
        return this.riego;
    }
    public void setRiego(String riego){
        this.riego=riego;
    }
    
    public String getEpoca(){
        return this.nombre;
    }
    public void setEpoca(String epoca){
        this.epoca=epoca;
    }
    
    public String getDescripcion(){
        return this.nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getPrecio(){
        return this.precio;
    }
    public void setPrecio(String Precio){
        this.precio=precio;
    }
    
}
