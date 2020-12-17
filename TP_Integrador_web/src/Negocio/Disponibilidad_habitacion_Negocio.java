package Negocio;

import java.util.ArrayList;

import Entidades.Disponibilidad_de_habitacion;

public interface Disponibilidad_habitacion_Negocio {
    public int insert(Disponibilidad_de_habitacion disponibilidad_de_habitacion);
    public ArrayList<Disponibilidad_de_habitacion>MisRes(String usu);
}