package net.ausiasmarch.servlet;

public abstract class VehiculoAbstractClass {
    String matricula;
    boolean arrancado = false;
    // Método para verificar si el vehículo está arrancado
    public Boolean isArrancado(){
        return arrancado;
    }
    // Método para arrancar el vehículo
    public void arrancar(){
        this.arrancado = true;
    }
    // set y get matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}