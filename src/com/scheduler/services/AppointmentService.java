package com.scheduler.services;

import com.scheduler.entities.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();

    public Appointment schedule(Client client, ServiceType service, LocalDateTime dateTime){

        // Verificar se o horário já está ocupado
        for (Appointment ap : appointments) {
            if (ap.getDateTime().equals(dateTime)) {
                return null; // horário já existe
            }
        }

        // Criar novo agendamento
        int id = appointments.size() + 1;
        Appointment appointment = new Appointment(id, client, service, dateTime);

        // ❗ AGORA SIM adicionamos o agendamento
        appointments.add(appointment);

        return appointment;
    }

    public List<Appointment> listAppointments() {
        return appointments;
    }
}
