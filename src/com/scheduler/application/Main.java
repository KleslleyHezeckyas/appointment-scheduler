package com.scheduler.application;

import com.scheduler.entities.*;
import com.scheduler.services.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ClientService clientService = new ClientService();
        ServiceCatalog serviceCatalog = new ServiceCatalog();
        AppointmentService appointmentService = new AppointmentService();

        while (true) {
            System.out.println("\n=== SISTEMA DE AGENDAMENTO ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Listar serviços");
            System.out.println("4 - Criar agendamento");
            System.out.println("5 - Listar agendamentos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Telefone: ");
                    String phone = sc.nextLine();

                    Client c = clientService.addClient(name, phone);
                    System.out.println("Cliente cadastrado: " + c);
                    break;

                case 2:
                    System.out.println("\n--- CLIENTES ---");
                    for (Client cl : clientService.listClient()) {

                        System.out.println(cl);
                    }
                    break;

                case 3:
                    System.out.println("\n--- SERVIÇOS ---");
                    for (ServiceType st : serviceCatalog.listServices()) {
                        System.out.println(st);
                    }
                    break;

                case 4:
                    System.out.print("ID do cliente: ");
                    int clientId = sc.nextInt();
                    Client cli = clientService.findById(clientId);
                    if (cli == null) {
                        System.out.println("Cliente não encontrado!");
                        break;
                    }

                    System.out.print("ID do serviço: ");
                    int serviceId = sc.nextInt();
                    ServiceType srv = serviceCatalog.findById(serviceId);
                    if (srv == null) {
                        System.out.println("Serviço não encontrado!");
                        break;
                    }

                    System.out.print("Ano: ");
                    int year = sc.nextInt();
                    System.out.print("Mês: ");
                    int month = sc.nextInt();
                    System.out.print("Dia: ");
                    int day = sc.nextInt();
                    System.out.print("Hora: ");
                    int hour = sc.nextInt();
                    System.out.print("Minuto: ");
                    int minute = sc.nextInt();

                    LocalDateTime dt = LocalDateTime.of(year, month, day, hour, minute);

                    Appointment ap = appointmentService.schedule(cli, srv, dt);
                    if (ap == null) {
                        System.out.println("Horário ocupado!");
                    } else {
                        System.out.println("Agendado com sucesso:\n" + ap);
                    }
                    break;

                case 5:
                    System.out.println("\n--- AGENDAMENTOS ---");
                    for (Appointment appt : appointmentService.listAppointments()) {
                        System.out.println(appt);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
