package mx.unam.aragon.ico.te.universomvc.modelos;

import java.util.Objects;

public class Planeta {
    private int id;
    private String nombre;
    private String tipo;
    private String tamaño;
    private String imagen;
    private String distancia;
    private int lunas;

    public Planeta() {
    }

    public Planeta(int id, String nombre, String tipo, String tamaño, String imagen, String distancia, int lunas) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.imagen = imagen;
        this.distancia = distancia;
        this.lunas = lunas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getLunas() {
        return lunas;
    }

    public void setLunas(int lunas) {
        this.lunas = lunas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Planeta planeta = (Planeta) o;
        return id == planeta.id && lunas == planeta.lunas && Objects.equals(nombre, planeta.nombre) && Objects.equals(tipo, planeta.tipo) && Objects.equals(tamaño, planeta.tamaño) && Objects.equals(imagen, planeta.imagen) && Objects.equals(distancia, planeta.distancia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, tipo, tamaño, imagen, distancia, lunas);
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", imagen='" + imagen + '\'' +
                ", distancia='" + distancia + '\'' +
                ", lunas=" + lunas +
                '}';
    }
}