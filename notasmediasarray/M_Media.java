/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasmediasarray;

/**
 *
 * @author Adria
 */
class M_Media {
    private String nombre;
    private double nota_media;
    private String nombre_Alumno;
    private double mediatotal;

    public M_Media() {
    }

    public M_Media(String nombre, double mediatotal) {
        this.nombre = nombre;
        this.mediatotal = mediatotal;
    }



    public M_Media(String nombre, double nota_media, String nombre_Alumno) {
        this.nombre = nombre;
        this.nota_media = nota_media;
        this.nombre_Alumno = nombre_Alumno;
    }
    

    public M_Media(String nombre, double nota_media, String nombre_Alumno, double mediatotal) {
        this.nombre = nombre;
        this.nota_media = nota_media;
        this.nombre_Alumno = nombre_Alumno;
        this.mediatotal = mediatotal;
    }


    public double getMediatotal() {
        return mediatotal;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getNota_media() {
        return nota_media;
    }

    public String getNombre_Alumno() {
        return nombre_Alumno;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

    public void setNombre_Alumno(String nombre_Alumno) {
        this.nombre_Alumno = nombre_Alumno;
    }
    
}
