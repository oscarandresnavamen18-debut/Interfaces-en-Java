package com.example;

public class ParqueExplora implements EspacioCultural {
    @Override
    public void mostrarHorario() {
        System.out.println("El horario del Parque Explora es de 9:00 a.m. a 5:00 p.m. de lunes a domingo.");
    }

    @Override
    public String ObtenerRequisitoEntrada() {
        return "La entrada al Parque Explora es gratuita para niños menores de 12 años y estudiantes con identificación válida.";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("En el Parque Explora, puedes disfrutar de exhibiciones interactivas, participar en talleres científicos y explorar el acuario.");
    }
}
