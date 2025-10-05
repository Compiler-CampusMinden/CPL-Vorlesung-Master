---
author: BC George, Carsten Gips (HSBI)
no_beamer: true
title: "Compiler-Projekt: DSL-gestützte Aufgaben- und Rätselbeschreibung mit
  Laufzeit-Interpretation im Dungeon-Framework (Java, 2D Roguelike, ECS)"
---

# Zusammenfassung

Im Rahmen dieses Projektes werden Sie sich mit der Analyse und Implementierung einer
Programmiersprache zu beschäftigen. Ziel ist es, sowohl die theoretischen als auch
die praktischen Aspekte des Compilerbaus zu vertiefen.

Es wird drei Vorträge geben, an denen Sie Ihre Arbeitsergebnisse präsentieren.

## Fristen

-   Vorstellung der Konzepte (intern): Di, 18.11. (Praktikumsslot)
-   Edmonton/Minden: Minden Presentations: Vorstellung DSL-Projekt: Mo, 01.12.,
    18:00 - 19:00 Uhr, englische Sprache
-   Abschlusspräsentation: Di, 20.01. (Vorlesungs- und Praktikumsslot)

## Teams

Das Projekt wird in 3er Teams bearbeitet.

# Projekt

## Kurzbeschreibung

Im Projekt entwickeln Sie eine domänenspezifische Sprache (DSL) für fachliche
Unterrichtsaufgaben und Escape-Room-Rätsel sowie einen Interpreter, der diese
Spezifikationen zur Laufzeit in das Java-basierte
[Dungeon-Framework](https://github.com/Dungeon-CampusMinden/Dungeon) integriert.

Die DSL ermöglicht Lehrenden, Aufgaben und Bewertungen deklarativ zu beschreiben,
ohne direkt mit der Dungeon-API zu arbeiten. Der Interpreter übernimmt sowohl die
initiale Konfiguration von Levels als auch die Beobachtung von Spielereignissen, die
Bewertung von Lösungen und die Interaktion mit Spieler:innen (REPL) während der
Laufzeit.

## Motivation

Didaktische Inhalte können in Serious-Games effizienter bereitgestellt werden, wenn
Lehrende über eine fachnahe, deklarative Sprache arbeiten. Das zugrundeliegende
Dungeon-Framework (ECS, Game-Loop) hat eine entsprechende API, die Nutzung erfordert
jedoch aktuell Java- und API-Kenntnisse. Eine DSL mit Interpreter schließt diese
Lücke und erlaubt Forschung zu Sprachdesign, Laufzeitintegration, Event-Verarbeitung
und Performanz in Game-Loops.

## Ziele

Projekt: DSL für Interaktion mit dem Dungeon. Interpreter oder VM mit Dungeon als besondere Laufzeitumgebung. Beschreibung und Auswerten von Aufgaben.

- Typen, Arbeiten und Auflösen mit/von Typen
- Dungeon API: Erreichbar über neue spezielle Sprachelemente? Erreichbar über Namensauflösung?
- Eigene Funktionen und Typen neu definieren
- Callback im Dungeon (Funktion im Hero setzen)
- Auswertung von Zuständen
- Synchronisation Dungeon - Interpreter
- LSP für die DSL
- (Graphisches Interface -> DSL als Schnittstelle/IR)


Bezug zur Forschung

- Compiler
- Gamification

### Fachliche Ziele

1.  Konzeption und formale Spezifikation einer DSL zur Beschreibung:
    -   fachlicher Aufgaben (Single Choice, Multiple Choice, Zuordnung),
    -   Escape-Room-Rätsel (Rätsel und Aufgaben, aber auch Elemente wie
        Schlösser/Schlüssel, Abhängigkeiten, Zeit-Constraints, Hinweise),
    -   Level- und Szenenkonfiguration (Geometrie, Entities, NPCs, Items,
        Fähigkeiten, Positionen),
    -   Bewertungslogik, Feedback, Hints, Scoring und Lernziele.

\smallskip

2.  Implementierung eines Interpreters, der:
    -   DSL-Artefakte in den Dungeon überführt und ein ausführbares Spiel
        konfiguriert,
    -   Spielereignisse zur Laufzeit beobachtet und regelbasiert reagiert,
    -   Bewertungen ausführt, sobald Bedingungen erfüllt sind,
    -   mit der Escape-Room-API interagiert,
    -   über eine REPL von außen erreichbar ist, um weitere Statements einzugeben
        und auszuwerten

Der Interpreter soll den laufenden Dungeon als eine Art erweitertes Environment
behandeln.

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
    -   optional REPL/Overlay für Debugging und Live-Inspektion.

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

**Hinweis**: Diese initialen Forschungsfragen basieren noch nicht auf aktueller
Literatur. Ihre Aufgabe ist es, diese Fragen basierend auf dem Stand der Forschung
neu zu formulieren.

## Scope und Nicht-Ziele

Im Scope: DSL-Design (Syntax, statische/operative Semantik), Interpreter,
Integration mit Dungeon/ECS, Aufgaben-UI, Bewertungslogik, Beispiellevels,
Dokumentation, Tests.

Nicht im Fokus: Vollständiger visueller Level-Editor, Multiplayer, umfangreiche
Rendering-/Physik-Neuentwicklungen, umfassende Analytics-Plattform.

## Erwartete Ergebnisse (Deliverables)

-   Sprachspezifikation: Grammatik, Lexikon, Typsystem, statische Analysen
    (Referenzprüfung), Semantikbeschreibung
-   Interpreter: Parser (z.B. ANTLR/Recursive Descent), AST/IR, Evaluator,
    Event-Engine, Runtime-Bibliothek für Dungeon-Operationen
-   Dungeon-Integration: Adapter zu ECS (Entity/Component/Systems),
    Event-Subscription, Name-Resolution- und State-Access-Schicht
-   Beispielartefakte: Katalog von Beispielaufgaben und mind. zwei vollständige
    Escape-Room-Szenarien
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
    -   Frontend: Lexer/Parser -\> AST -\> optionale IR
    -   Runtime: Environment/Scope, Name-Resolution (lokal -\> Dungeon),
        Event-Dispatch, Scheduler für kooperative Ausführung
        (Time-Slicing/Coroutines)
    -   Sicherheit/Isolation: kein unkontrollierter Zugriff außerhalb des Dungeons
        (Sandboxing)
-   ECS-Integration:
    -   Option A: Interpreter als ECS-System; erhält Events, erzeugt Commands;
        Commits im Engine-Takt
    -   Option B: Interpreter in separatem Thread; Kommunikation über thread-sichere
        Queues; Commit im Hauptthread
-   Laufzeitinteraktion:
    -   UI-Brücke für Aufgabenanzeige und Eingabe; Feedback-Kanäle;
        Logging/Telemetry für Auswertungen
-   Performanz und Stabilität:
    -   Pro-Frame-Budgetierung (z. B. \< 2 ms Interpreterarbeit), inkrementelle
        Auswertung, Backpressure bei Eventfluten
    -   Fehlerbehandlung mit klaren Diagnosen, Hot-Reload von DSL optional

## Vorgehen und Arbeitspakete

1.  Anforderungsanalyse und Domänenmodell:
    -   Stakeholder-Interviews (Lehrende, Dungeon-Entwickler:innen),
        Aufgaben-/Rätsel-Taxonomie, Use-Cases
2.  Sprachentwurf:
    -   Syntax-Entwurf, Minimalbeispiele, Semantikskizzen, statische Analysen
3.  Prototyp Parser/AST:
    -   Toolauswahl (ANTLR/...), erste End-to-End-Pipeline bis AST
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
    Event-Handling lauffähig.
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
    -   was soll der User über die DSL im Dungeon erreichen können?
    -   Syntax und Semantik und Konzepte der DSL
-   Domänenmodell: Geplante technische Anbindung der DSL an den Dungeon
    (Interpreter, Dungeon/Game-Loop, Abarbeitung und Interaktion)
-   Praktische Beispiele, um die Konzepte zu veranschaulichen

Betrachten Sie diesen Vortrag als einen ersten Meilenstein für Ihr Projekt und als
eine Art Generalprobe für den zwei Wochen später folgenden [Talk](talk.md) auf dem
Edmonton-/Minden-Meeting.

## Edmonton/Minden: Minden Presentations

Ergänzen Sie den Vortrag aus der internen Vorstellen (s.o.) um die in der
Zwischenzeit erreichten Arbeitsschritte und Teilergebnisse.

Halten Sie Ihre Präsentation auf dem ersten Edmonton-/Minden-Meeting (Mo, 01.12.,
18-19 Uhr, EN):

-   Dauer: ca. 40-45 Minuten pro Team, parallel in Breakout-Gruppen
-   Ziel: Vorstellung von Idee, Problemstellung, Architektur/Design,
    MVP/Prototyp-Status, Risiken und Evaluationsplan
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

Stimmen Sie alle Schritte und Ergebnisse mit Ihren Dozent:innen ab und holen Sie
sich aktiv Feedback.
