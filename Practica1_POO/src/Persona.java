public class Persona {
    // atributos nombre,dni,telefono,edad
    public String nombre;
    public String dni;
    public String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //metodo toString
    public String toString(){
        return "Nombre: "+nombre+" DNI: "+dni+" Telefono: "+telefono;
    }
}