package net.ausiasmarch.servlet;

public class MotoClass implements VehiculoInterface {
    String matricula;
    boolean arrancado = false;

    // Método para verificar si el vehículo está arrancado
    @Override
    public Boolean isArrancado() {
        return arrancado;
    }

    // Método para arrancar el vehículo
    @Override
    public void arrancar() {
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
