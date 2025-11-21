# Scheduler — Sistema de Agendamentos (Java)

> Projeto console em Java para cadastrar clientes, listar serviços e criar agendamentos simples.

---

## Visão geral

Um sistema leve e didático de agendamentos pensado para aprendizado e portfólio. Código organizado por pacotes: `entities`, `services` e `application`. Persistência simples em memória (pode ser facilmente expandida para arquivos ou banco de dados).


---

## Tecnologias

* Java 11+
* Console/Terminal
* (Opcional) IDE: IntelliJ IDEA, VSCode

---

## Estrutura do projeto

```
src/
└─ com.scheduler
   ├─ application
   │   └─ Main.java
   ├─ entities
   │   ├─ Client.java
   │   ├─ ServiceType.java
   │   └─ Appointment.java
   └─ services
       ├─ ClientService.java
       ├─ ServiceCatalog.java
       └─ AppointmentService.java
```

---

## Funcionalidades

* Cadastrar clientes (nome, telefone)
* Listar clientes cadastrados
* Listar serviços pré-definidos
* Criar agendamentos (validando conflitos de horário)
* Listar agendamentos criados

---

## Como compilar e executar

1. Clone ou baixe o projeto e mantenha a estrutura de pacotes (`com/scheduler/...`).
2. No diretório raiz (onde está a pasta `src`), compile:

```bash
javac src/com/scheduler/**/*.java -d out
```

3. Execute:

```bash
java -cp out com.scheduler.application.Main
```

> Se preferir, crie um projeto na sua IDE e adicione `src` como fonte.

---

## Exemplos de uso (menu)

Ao executar, siga o menu para:

* 1 — Cadastrar cliente
* 2 — Listar clientes
* 3 — Listar serviços
* 4 — Criar agendamento
* 5 — Listar agendamentos
* 0 — Sair

Durante criação de agendamento, informe: `ID do cliente`, `ID do serviço`, `Ano`, `Mês`, `Dia`, `Hora`, `Minuto`.

---

## Salvamento / Extensões sugeridas

Atualmente o projeto usa listas em memória. Sugestões para evoluir:

* Persistir em CSV (simples) ou SQLite / MySQL
* Implementar interface gráfica (JavaFX)
* Transformar em API REST com Spring Boot
* Adicionar buscas por cliente/data e relatórios

---

## Contribuição

Pull requests são bem-vindos. Para pequenas correções, siga o padrão:

* Branch: `feat/<descrição>` ou `fix/<descrição>`
* Commit curtos e claros (ex.: `fix: corrigir nome de método`)

---

## Licença

Projetos de exemplo — sinta-se livre para usar e adaptar. (Sem garantias.)

