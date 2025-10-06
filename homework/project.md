---
author: BC George, Carsten Gips (HSBI)
no_beamer: true
title: Compiler-Projekt
---

# Zusammenfassung

In diesem Projekt beschäftigen Sie sich mit der Analyse, dem Entwurf und der
Implementierung einer domänenspezifischen Sprache (DSL) einschließlich eines
Interpreters. Ziel ist es, theoretische Grundlagen des Compilerbaus mit praktischer
Laufzeitintegration in eine bestehende Spiele-Engine zu verbinden.

Ihre Arbeitsergebnisse präsentieren Sie in drei Terminen über den Verlauf des
Semesters.

## Fristen

-   Vorstellung der Konzepte (intern): Di, 18.11. (Praktikumsslot)
-   Edmonton/Minden: Vorstellung DSL-Projekt (englisch): Mo, 01.12., 18:00 - 19:00
    Uhr
-   Abschlusspräsentation: Di, 20.01. (Vorlesungs- und Praktikumsslot)

## Teams

Die Bearbeitung erfolgt in 3er-Teams.

# Projekt: DSL-gestützte Aufgaben- und Rätselbeschreibung mit Laufzeit-Interpretation im Dungeon-Framework (Java, 2D Roguelike, ECS)

## Kurzbeschreibung

Sie entwickeln eine domänenspezifische Sprache (DSL) zur Beschreibung fachlicher
Unterrichtsaufgaben und Escape-Room-Rätsel sowie einen Interpreter, der diese
Spezifikationen zur Laufzeit in das Java-basierte
[Dungeon-Framework](https://github.com/Dungeon-CampusMinden/Dungeon) integriert.

Die DSL ermöglicht Lehrenden, Aufgaben, Bewertungen und Interaktionen deklarativ zu
beschreiben, ohne direkt die Dungeon-API zu nutzen.

Der Interpreter übernimmt die initiale Levelkonfiguration, beobachtet
Spielereignisse, bewertet Lösungen und interagiert zur Laufzeit mit Spieler:innen
(REPL).

## Motivation

Didaktische Inhalte können in Serious-Games effizienter bereitgestellt werden, wenn
Lehrende über eine fachnahe, deklarative Sprache arbeiten. Das zugrundeliegende
Dungeon-Framework (ECS, Game-Loop) hat eine entsprechende API, die Nutzung erfordert
jedoch aktuell Java- und API-Kenntnisse. Eine DSL mit Interpreter schließt diese
Lücke und eröffnet Raum für Forschung zu Sprachdesign, Laufzeitintegration,
Event-Verarbeitung und Performanz in Game-Loops.

## Ziele

### Fachliche Ziele

1.  Konzeption und formale Spezifikation einer DSL für die Interaktion mit dem
    Dungeon
    -   Beschreibung von fachliche Aufgaben (Single Choice, Multiple Choice,
        Zuordnung)
    -   Beschreibung von Escape-Room-Rätsel (Rätsel und Aufgaben, aber auch Elemente
        wie Schlösser/Schlüssel, Abhängigkeiten, Zeit-Constraints, Hinweise)
    -   Beschreibung von Level- und Szenenkonfiguration (Geometrie, Entities, NPCs,
        Items, Fähigkeiten, Positionen)
    -   Beschreibung von Bewertungslogik, Feedback, Hints, Scoring und Lernziele
    -   Interaktion mit einem laufenden Spiel (Bewegen des Helden o.ä.)

\smallskip

2.  Implementierung eines Interpreters mit dem Dungeon als spezieller
    Laufzeitumgebung
    -   Überführung von DSL-Artefakten in den Dungeon und Konfiguration eines
        ausführbares Spiels
    -   Beobachtung von und Reaktion auf Spielereignisse zur Laufzeit
    -   Durchführung von Bewertungen, sobald Bedingungen erfüllt sind
    -   Interaktion mit der Escape-Room-API
    -   Erreichbarkeit über eine REPL von außen (Eingabe/Auswertung weiterer
        Statements zur Laufzeit)

Der Interpreter behandelt den laufenden Dungeon als eine Art erweitertes
Environment.

### Technische Ziele

1.  Einbindung in ein ECS-basiertes System:
    -   als eigenes System in der Game-Loop, oder
    -   als separater Thread mit synchronisierter Schnittstelle
        (Message-Queue/Command-Buffer).
2.  Namens- und Umgebungsauflösung:
    -   zuerst lokaler DSL-Scope, dann Auflösung im Dungeon (Entities, Komponenten,
        Ressourcen).
    -   Lese-/Schreibzugriffe wirken konsistent auf den Dungeon-Zustand.
3.  Laufzeitinteraktion:
    -   Anzeige von Informationen, Dialogen, Aufgaben-UI (SC/MC/Zuordnung),
    -   Eingabe/Antworterfassung und Feedback,
    -   REPL für Debugging und Live-Inspektion.

## Initiale Forschungsfragen

-   Wie gestaltet man eine DSL, die didaktische Intentionen, Aufgabenlogik und
    Escape-Room-Mechaniken klar, knapp und überprüfbar ausdrückt?
-   Welche Einbettungsvariante des Interpreters ist bzgl. Korrektheit, Performanz
    und Wartbarkeit vorzuziehen (ECS-System vs. Parallel-Thread)?
-   Wie viel Interpreterlogik darf pro Frame ausgeführt werden, um Spielbarkeit und
    Responsiveness zu garantieren (Budgetierung, inkrementelle Auswertung)?
-   Wie lassen sich Ereignisse (Input, Kollisionen, Zustandswechsel) robust in
    Regeln, Auslöser und Bewertungen abbilden?
-   Wie kann deterministisches Verhalten (für reproduzierbare Tests) trotz
    Zufall/Prozeduralität erzielt werden?

**Hinweis**: Diese initialen Forschungsfragen sind vorläufig und basieren noch nicht
auf aktueller Literatur. Reformulieren und schärfen Sie sie anhand aktueller
Literatur (State of the Art) und belegen Sie Ihre Entscheidungen.

Das Projekt verbindet damit verschiedene Forschungsgebiete:
Programmiersprachen/Compilerbau, Gamification und Serious Games sowie
Softwarearchitektur in Echtzeit-/Game-Loop-Umgebungen.

## Scope und Nicht-Ziele

Im Scope: DSL-Design (Syntax, statische/operative Semantik), Interpreter,
Integration mit Dungeon/ECS, Aufgaben-UI, Bewertungslogik, Beispiellevel, Tests.

Nicht im Fokus: Vollständiger visueller Level-Editor, Multiplayer, umfangreiche
Rendering-/Physik-Neuentwicklungen, umfassende Analytics-Plattform.

## Erwartete Ergebnisse (Deliverables)

-   Sprachspezifikation: Grammatik, Typsystem, statische Analysen,
    Semantikbeschreibung
-   Interpreter: Parser (z.B. ANTLR oder Recursive Descent), AST/IR, Evaluator,
    Event-Engine, Runtime-Bibliothek für Dungeon-Operationen
-   Dungeon-Integration: Adapter zu ECS (Entity/Component/Systems),
    Event-Subscription, Name-Resolution- und State-Access-Schicht
-   Beispielartefakte: Katalog von Beispielaufgaben und mind. ein vollständiges
    Escape-Room-Szenario
-   Demo: Live-Demonstration im Dungeon, Screencast, reproduzierbares Setup
    (Build-Skripte, ggf. Container)

## Technisches Konzept (Überblick)

-   DSL-Design:
    -   Deklarativer Kern (Level, Entities, Aufgaben, Ziele, Bewertungen) plus
        reaktive/regelbasierte Blöcke (`on event ... do ...`)
    -   Didaktische Metadaten (Lernziele, Schwierigkeitsgrad, Tags), Randomisierung
        mit Seeds, Hints/Feedback
    -   Statische Analysen: Typ-/Referenzprüfung, Verbot ungültiger
        Dungeon-Zugriffe, optionale Effektsysteme
-   Interpreter-Architektur:
    -   Frontend: Lexer/Parser -\> AST -\> IR
    -   Runtime: Environment/Scope, Name-Resolution (lokal -\> Dungeon),
        Event-Dispatch, Scheduler für kooperative Ausführung
    -   Sicherheit/Isolation: kein unkontrollierter Zugriff außerhalb des Dungeons
-   ECS-Integration:
    -   Option A: Interpreter als ECS-System und Ausführung im Engine-Takt
    -   Option B: Interpreter in separatem Thread und Kommunikation über
        thread-sichere Queues
-   Laufzeitinteraktion:
    -   REPL für Ein- und Ausgabe; Logging/Telemetry für Auswertungen
-   Performanz und Stabilität:
    -   Pro-Frame-Budgetierung (z. B. \< 2 ms Interpreterarbeit), inkrementelle
        Auswertung, Backpressure bei Eventfluten
    -   Fehlerbehandlung mit klaren Diagnosen, Hot-Reload von DSL optional

## Vorgehen und Arbeitspakete

1.  Anforderungsanalyse und Domänenmodell:
    -   Stakeholder-Interviews (Lehrende, Dungeon-Entwickler:innen),
        Aufgaben-/Rätsel-Taxonomie, Use-Cases
2.  Sprachentwurf:
    -   Syntax-Entwurf, Minimalbeispiele, Semantik-Skizzen, statische Analysen
3.  Prototyp Parser/AST:
    -   Toolauswahl (ANTLR/...), erste Pipeline Lexer bis AST
4.  Prototyp Interpreter:
    -   IR/Runtime-Umgebung, einfache Events, Konfiguration eines minimalen
        Levels/Rätselraums
5.  ECS-Integration:
    -   Entscheidung Einbettungsvariante; Implementierung
        Adapter/Command-Buffer/Event-Bus
6.  Aufgaben- und Bewertungslogik:
    -   SC/MC/Zuordnung, Bewertungsregeln, Erfolgsbedingungen, Feedback
7.  Escape-Room-API-Integration:
    -   Modellierung von Rätseln/Locks, Sequenzen, Timer,
        Fehlversuche/Hinweismechaniken
8.  Laufzeitinteraktion und Debugging:
    -   Logging, REPL

## Meilensteine

-   Woche 7: Domänenmodell, DSL-Skizze, Tooling-Entscheidungen (**interne
    Projektvorstellung**)
-   Woche 9: Parser/AST funktionsfähig, erste Konfigurationen im Dungeon
    (**Edmonton-Meeting**)
-   Woche 11: Interpreter als ECS-System oder via Thread-Synchronisation integriert;
    Event-Handling lauffähig
-   Woche 13: erster Escape-Room end-to-end
-   Woche 14: Projektvorstellung, Demo, Erfahrungsbericht
    (**Abschlusspräsentation**)

# Geplante Projektpräsentationen

## Vorstellung der Konzepte (intern)

Bereiten Sie pro Team eine Präsentation (ca. 20 Minuten, Di, 18.11., Praktikumsslot,
Deutsch) vor, in der Sie den aktuellen Stand der Diskussion zu den zentralen
Konzepten und Ideen in Ihrem Projekt vorstellen. Folgende Punkte sollten Sie
abdecken:

-   DSL-Skizze:
    -   Zielbild, was Nutzer:innen im Dungeon mit der DSL erreichen können
    -   Syntax und Semantik und Konzepte der DSL
-   Domänenmodell: technische Anbindung der DSL an den Dungeon (Interpreter,
    Dungeon/Game-Loop, Abarbeitung und Interaktion)
-   Konkrete Minimalbeispiele zur Veranschaulichung der Konzepte

Betrachten Sie diesen Vortrag als einen ersten Meilenstein für Ihr Projekt und als
eine Art Generalprobe für den zwei Wochen später folgenden [Talk](talk.md) auf dem
Edmonton-/Minden-Meeting.

## Edmonton/Minden: Minden Presentations

Ergänzen Sie den Vortrag aus der internen Vorstellen (s.o.) um die in der
Zwischenzeit erreichten Arbeitsschritte und Teilergebnisse.

Halten Sie Ihre Präsentation auf dem ersten Edmonton-/Minden-Meeting (Mo, 01.12.,
18-19 Uhr, EN):

-   Dauer: ca. 40-45 Minuten pro Team, parallel in Breakout-Gruppen
-   Ziel: Vorstellung von Idee, Problemstellung, Architektur/Design, MVP/Prototyp
-   Publikum: Kanadische Studierende; bitte auf klare
    "Problem-Ansatz-Nutzen"-Struktur achten
-   Sprache: Englisch

## Abschlusspräsentation

Die Abschlusspräsentation findet im Rahmen der Vorlesungs- und Praktikumszeit in der
letzten Vorlesungswoche (Di, 20.01.) statt.

Es gelten folgende Randbedingungen:

-   Dauer: ca. 30 Minuten pro Team (Vorlesungs- und Praktikumsslot)
-   Ziel: Ergebnisse, Demos, Evaluation, Lessons Learned, Ausblick
-   Sprache: Deutsch

------------------------------------------------------------------------------------

Wir freuen uns darauf, Sie in diesem herausfordernden und spannenden Projekt zu
begleiten und wünschen Ihnen viel Erfolg!

Bitte stimmen Sie alle Schritte und Ergebnisse mit Ihren Dozent:innen ab und holen
Sie sich aktiv Feedback.
