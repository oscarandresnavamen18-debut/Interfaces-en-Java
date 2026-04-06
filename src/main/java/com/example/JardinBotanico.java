package com.example;

public class JardinBotanico implements EspacioCultural {
    @Override
    public void mostrarHorario() {
        System.out.println("El horario del Jardín Botánico es de 9:00 a.m. a 5:00 p.m. de lunes a domingo.");
    }

    @Override
    public String ObtenerRequisitoEntrada() {
        return "La entrada al Jardín Botánico es gratuita para niños menores de 12 años y estudiantes con identificación válida.";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("En el Jardín Botánico, puedes disfrutar de paseos por los senderos, observar la diversidad de plantas y participar en talleres de jardinería.");
    }
}
