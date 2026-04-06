package com.example;

public class MuseoDeAntioquia implements EspacioCultural {
    @Override
    public void mostrarHorario() {
        System.out.println("El horario del Museo de Antioquia es de 10:00 a.m. a 6:00 p.m. de martes a domingo.");
    }

    @Override
    public String ObtenerRequisitoEntrada() {
        return "La entrada al Museo de Antioquia es gratuita para niños menores de 12 años y estudiantes con identificación válida.";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("En el Museo de Antioquia, puedes explorar exposiciones de arte, aprender sobre la historia de la región y participar en actividades culturales.");
    }
}