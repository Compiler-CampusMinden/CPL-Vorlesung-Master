---
author: BC George, Carsten Gips (HSBI)
no_beamer: true
title: "Compiler-Projekt: DSL-gestützte Aufgaben- und Rätselbeschreibung mit
  Laufzeit-Interpretation in einem Spiel"
---

::: tldr
**Zusammenfassung**

In diesem Projekt beschäftigen Sie sich mit der Analyse, dem Entwurf und der
Implementierung einer domänenspezifischen Sprache (DSL) einschließlich eines
Interpreters. Ziel ist es, theoretische Grundlagen des Compilerbaus mit praktischer
Laufzeitintegration in eine bestehende Spiele-Engine zu verbinden.

Ihre Arbeitsergebnisse präsentieren Sie in drei Terminen über den Verlauf des
Semesters.

**Fristen**

-   Vorstellung der Konzepte (intern): Di, 18.11. (Praktikumsslot)
-   Edmonton/Minden: Vorstellung DSL-Projekt (englisch): Mo, 01.12., 18:00 - 19:00
    Uhr
-   Abschlusspräsentation: Di, 20.01. (Vorlesungs- und Praktikumsslot)

***Teams***

Die Bearbeitung erfolgt in 3er-Teams.
:::

# Kurzbeschreibung

Didaktische Inhalte können in Serious-Games effizienter bereitgestellt werden, wenn
Lehrende über eine fachnahe, deklarative Sprache arbeiten. Spiele wie beispielsweise
das Dungeon-Framework (ECS, Game-Loop) haben eine entsprechende API, die Nutzung
erfordert jedoch aktuell dedizierte Kenntnisse der API und der jeweiligen
Programmiersprache. Eine DSL mit Interpreter schließt diese Lücke und eröffnet Raum
für Forschung zu Sprachdesign, Laufzeitintegration, Event-Verarbeitung und
Performanz in Game-Loops.

Sie entwickeln im Projekt eine domänenspezifische Sprache (DSL) zur Beschreibung
fachlicher Unterrichtsaufgaben und Escape-Room-Rätsel sowie einen Interpreter, der
diese Spezifikationen zur Laufzeit in ein Computer-Spiel wie das Java-basierte
[Dungeon-Framework](https://github.com/Dungeon-CampusMinden/Dungeon) oder das von
Ihnen parallel im Wahlmodul "Computer Games" entwickelte Spiel integriert.

Die DSL ermöglicht Lehrenden, Aufgaben, Bewertungen und Interaktionen deklarativ zu
beschreiben, ohne direkt die Spiele-API zu nutzen.

Der Interpreter übernimmt die initiale Levelkonfiguration, beobachtet
Spielereignisse, bewertet Lösungen und interagiert zur Laufzeit mit Spieler:innen
(REPL).

Das Projekt verfolgt zwei zentrale Fragen:

-   Wie gestaltet man eine DSL, mit der didaktische Intentionen, Aufgabenlogik und
    Escape-Room-Mechaniken klar, knapp und überprüfbar ausdrückbar sind?
-   Wie bettet man den Interpreter technisch in ein Spiel ein (z.B. ECS-System
    vs. Parallel-Thread), um Spielbarkeit und Responsiveness zu garantieren und um
    im Interpreter auf Ereignisse (Input, Kollisionen, Zustandswechsel) reagieren zu
    können?

Das Projekt verbindet damit verschiedene Forschungsgebiete:
Programmiersprachen/Compilerbau, Gamification und Serious Games sowie
Softwarearchitektur in Echtzeit-/Game-Loop-Umgebungen.

Potentiell interessante Literatur:

-   @Fowler2010
-   @Voelter2013 (*Anmerkung*: Das Buch ist recht alt, aber die ersten drei Kapitel könnten hilfreich sein.)


# Ziele

## Fachliche Ziele

1.  Konzeption und formale Spezifikation einer DSL für die Interaktion mit dem Spiel
    -   Beschreibung von fachliche Aufgaben (Single Choice, Multiple Choice,
        Zuordnung, ...)
    -   Beschreibung von Escape-Room-Rätsel (Rätsel und Aufgaben, aber auch Elemente
        wie Schlösser/Schlüssel, Abhängigkeiten, Zeit-Constraints, Hinweise)
    -   Didaktische Metadaten (Lernziele, Schwierigkeitsgrad, Tags), Randomisierung
        mit Seeds, Hints/Feedback
    -   Beschreibung von Level- und Szenenkonfiguration (Geometrie, Entities, NPCs,
        Items, Fähigkeiten, Positionen)
    -   Beschreibung von Bewertungslogik, Feedback, Hints, Scoring und Lernziele
    -   Interaktion mit einem laufenden Spiel (Bewegen des Helden o.ä.)

\smallskip

2.  Implementierung eines Interpreters für die DSL und Nutzung des laufenden Spiel
    als spezielle Laufzeitumgebung
    -   Überführung von DSL-Artefakten in das Spiel und Konfiguration eines
        ausführbares Spiels
    -   Beobachtung von und Reaktion auf Spielereignisse zur Laufzeit
    -   Durchführung von Bewertungen, sobald Bedingungen erfüllt sind
    -   Interaktion mit der Escape-Room-API
    -   Erreichbarkeit über eine REPL von außen (Eingabe/Auswertung weiterer
        Statements zur Laufzeit)

Der Interpreter behandelt das laufende Spiel als eine Art erweitertes Environment.

## Technische Ziele

1.  Einbindung in ein ECS-basiertes System:
    -   als eigenes System in der Game-Loop, oder
    -   als separater Thread mit synchronisierter Schnittstelle
        (Message-Queue/Command-Buffer).
2.  Namens- und Umgebungsauflösung:
    -   zuerst lokaler DSL-Scope, dann Auflösung im Spiel (Entities, Komponenten,
        Ressourcen).
    -   Lese-/Schreibzugriffe wirken konsistent auf den Spiel-Zustand.
3.  Laufzeitinteraktion:
    -   Anzeige von Informationen, Dialogen, Aufgaben-UI (SC/MC/Zuordnung),
    -   Eingabe/Antworterfassung und Feedback,
    -   REPL für Debugging und Live-Inspektion.

# Erwartete Ergebnisse (Deliverables)

-   Sprachspezifikation: Grammatik, Typsystem, statische Analysen,
    Semantikbeschreibung
-   Interpreter: Parser (z.B. ANTLR oder Recursive Descent), AST/IR, Evaluator,
    Event-Engine, Runtime-Bibliothek für Spiel-Operationen, REPL
-   Integration ins Spiel: Adapter zu ECS (Dungeon: Entity/Component/Systems),
    Event-Subscription, Name-Resolution- und State-Access-Schicht
-   Beispielartefakte: Katalog von Beispielaufgaben bzw. ein Escape-Room-Szenario
-   Demo: Live-Demonstration im Spiel, Screencast, reproduzierbares Setup
    (Build-Skripte, ggf. Container)

# Geplante Projektpräsentationen

## Vorstellung der Konzepte (intern)

Bereiten Sie pro Team eine Präsentation (ca. 20 Minuten, Di, 18.11., Praktikumsslot,
Deutsch) vor, in der Sie den aktuellen Stand der Diskussion zu den zentralen
Konzepten und Ideen in Ihrem Projekt vorstellen. Folgende Punkte sollten Sie
abdecken:

-   DSL-Skizze:
    -   Zielbild, was Nutzer:innen im Spiel bzw. Dungeon mit der DSL erreichen
        können
    -   Syntax und Semantik und Konzepte der DSL
-   Domänenmodell: technische Anbindung der DSL an das Spiel bzw. den Dungeon
    (Interpreter, Dungeon/Game-Loop, Abarbeitung und Interaktion)
-   Konkrete Minimalbeispiele zur Veranschaulichung der Konzepte

Betrachten Sie diesen Vortrag als einen ersten Meilenstein für Ihr Projekt und als
eine Art Generalprobe für den zwei Wochen später folgenden [Talk](talk.md) auf dem
Edmonton-/Minden-Meeting.

## Edmonton/Minden: Minden Presentations

Ergänzen Sie den Vortrag aus der internen Vorstellen (s.o.) um die in der
Zwischenzeit erreichten Arbeitsschritte und Teilergebnisse, beispielsweise den
funktionierenden Parser/AST sowie eine erste Konfigurationen im Dungeon oder Spiel
("Prototyp").

Halten Sie Ihre Präsentation auf dem ersten Edmonton-/Minden-Meeting (Mo, 01.12.,
18-19 Uhr, EN):

-   Dauer: ca. 40-45 Minuten pro Team, parallel in Breakout-Gruppen
-   Ziel: Vorstellung von Idee, Problemstellung, Architektur/Design, Prototyp
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
