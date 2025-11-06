---
author: BC George, Carsten Gips (HSBI)
no_beamer: true
title: "MIF 1.5 Kurs-Projekt: Sprachen und Compiler"
---

# Ziel und Rahmen

In diesem Projekt beschäftigen Sie sich mit fortgeschrittenen Inhalten im Bereich
Programmiersprachen und Compilerbau. Sie können eigenständige Ideen einbringen oder
einen der nachfolgend genannten Vorschläge aufgreifen und verfeinern. Neben der
praktischen Beschäftigung mit den Kurs-Themen recherchieren Sie selbstständig nach
relevanter Fachliteratur und reflektieren Ihre Designentscheidungen.

::: center
Für das MIF‑1.5‑Kursprojekt können Sie jede[^1] Idee wählen, die einen Bezug zum
Compilerbau hat.
:::

# Passende Themen (nicht abschließend)

Umfang und geeignete Themen (Beispiele, nicht abschließend)

-   Sprachdesign (DSLs), Scanner/Parser (ANTLR, tree-sitter), Typ-/Effekt-Systeme
-   IR-Design und -Transformation (Intermediate Representation), z.B.
    [Bril](https://github.com/sampsyo/bril), SSA, Dataflow-Analysen
-   MLIR (Multi-Level IR): Dialektentwurf, Lowerings, Pass-Pipelines,
    Canonicalization
-   Interpreter, VM/JIT, Codegenerierung (z.B. LLVM), Linken/Laden
-   Statische Analysen, Verifikation, Symbolik/SMT, Transformationspipelines
-   E-Graphs und Equality Saturation (z.B. egg/egglog) für optimierende Umformungen
-   Tooling: Incremental Build/Hot-Reload, Profiling/Tracing, Debug-Infos,
    Fehlermeldungen

Bitte wählen Sie einen klar abgegrenzten Scope, der in Tiefe und Breite zum Semester
passt.

Potentiell interessante Literatur im Bereich DSL:

-   @Fowler2010
-   @Voelter2013 (*Anmerkung*: Das Buch ist recht alt, aber die ersten drei Kapitel
    könnten hilfreich sein.)
-   @mernik2005

# Projektanregungen

-   DSL und IR: Entwerfen Sie eine DSL zur Beschreibung von Quests/Übungsaufgaben
    und transformieren Sie diese in eine geeignete IR (z.B. Bril). Fokus: Grammatik,
    statische Checks, saubere IR-Übersetzung.

    ::: details
    Didaktische Inhalte können in Serious-Games effizienter bereitgestellt werden,
    wenn Lehrende über eine fachnahe, deklarative Sprache arbeiten. Spiele wie
    beispielsweise das Dungeon-Framework (ECS, Game-Loop) haben eine entsprechende
    API, die Nutzung erfordert jedoch aktuell dedizierte Kenntnisse der API und der
    jeweiligen Programmiersprache. Eine DSL mit Interpreter schließt diese Lücke und
    eröffnet Raum für Forschung zu Sprachdesign, Laufzeitintegration,
    Event-Verarbeitung und Performanz in Game-Loops.

    Sie entwickeln eine domänenspezifische Sprache (DSL) zur Beschreibung fachlicher
    Unterrichtsaufgaben und Escape-Room-Rätsel sowie die Übersetzung in ein
    geeignetes Zwischencode-Format.

    *Anmerkung*: Die IR könnte auch MiniJava aus dem nachfolgenden Projektvorschlag
    sein ...
    :::

-   Visualisierung von Programmabläufen in einem interaktiven Interpreter im
    [Dungeon](https://github.com/Dungeon-CampusMinden/Dungeon): Behandeln Sie den
    laufenden Dungeon als Environment des Interpreters. Variablen könnten z.b. als
    Komponenten an NPC/Entities abgelegt werden. Berechnungen werden damit über
    Dungeon-Objekte sichtbar (z.B. Datenfluss als Bewegungen/Effekte). Fokus:
    Semantik/Runtime-Mapping, Ereignisverarbeitung.

    ::: details
    Sie entwickeln einen Interpreter, der z.B. einen Sub-Dialekt von Python zur
    Laufzeit in ein Computer-Spiel wie das Java-basierte
    [Dungeon-Framework](https://github.com/Dungeon-CampusMinden/Dungeon) oder das
    von Ihnen parallel im Wahlmodul "Computer Games" entwickelte Spiel integriert.

    Der Interpreter übernimmt die initiale Levelkonfiguration, beobachtet
    Spielereignisse, bewertet Lösungen und interagiert zur Laufzeit mit
    Spieler:innen (REPL).
    :::

-   Blockly -\> Dungeon: Parsen und Interpretieren von Blockly-Code im
    [Dungeon](https://github.com/Dungeon-CampusMinden/Dungeon)

    ::: details
    Im [Dungeon-Projekt](https://github.com/Dungeon-CampusMinden/Dungeon) wurde eine
    Blockly-Anbindung realisiert. Dabei werden vordefinierte Rätsel im Dungeon
    gestartet und parallel ein Blockly-Fenster, und durch Zusammenklicken der
    passenden Blöcke kann man das Rätsel im Dungeon lösen. Man sieht dabei live die
    Auswirkungen des Blockly-Codes auf den Dungeon. Das Blockly-Projekt im Dungeon
    richtet sich an Programmier-Einsteiger:innen (ca. 5./6. Klasse).

    In der vorliegenden Implementierung wurde zu jedem Block in Blockly der
    zugehörige Java-Code aus der Dungeon-API als Konfiguration hinterlegt. Blockly
    sendet diesen Code als Text über eine Remote-Schnittstelle an den laufenden
    Dungeon, wo der komplette Code in eine temporäre Datei gespeichert und zusammen
    mit der Dungeon-API und dem `javac` übersetzt wird und per Hot-Reloading in das
    laufende Spiel geladen wird. Das ist nicht nur sehr umständlich, sondern die
    Dungeon-API wird fest in den Textschnipseln von Blockly verdrahtet und ist damit
    anfällig für Refactoring.

    Ziel dieses Projekt-Vorschlags ist die Entkopplung von Blockly und der
    Dungeon-API durch eine geeignete DSL. Für die Blöcke in Blockly soll eine
    einfache, vom Dungeon unabhängige DSL definiert werden. Der DSL-Code soll in
    einem Interpreter, der im Dungeon als "System" in der ECS-Architektur mitläuft,
    empfangen und verarbeitet werden und in die entsprechenden Aktionen im Dungeon
    umgesetzt werden.

    Dieses Projekt kann auch mit der nachfolgenden Projekt-Anregung kombiniert
    werden: Der Blockly-Code wird in einem von Ihnen entwickelten Transpiler nach
    MiniJava übersetzt (und dann von dem im anderen Projekt entwickelten Interpreter
    im Dungeon interpretiert).
    :::

-   MiniJava als einfache OOP-Sprache mit FP-Features für Spiel mit VSCode Extension

    ::: details
    Im [Dungeon-Projekt](https://github.com/Dungeon-CampusMinden/Dungeon) wurde eine
    VSCode-Extension realisiert. In diesem Plugin kann vereinfachter Java-Code mit
    direkter Anbindung an die Dungeon-API geschrieben werden, der im Dungeon
    ausgeführt wird (über den im Blockly-Projekt beschriebenen Mechanismus
    "Speichern \> Javac \> Hot-Reloading) und so die vorgegebenen Rätsel löst. Das
    VSCode-Projekt im Dungeon richtet sich an fortgeschrittene
    Programmier-Einsteiger:innen (ca. 10./11. Klasse). Letztlich sind dieser
    vereinfachte Java-Code und die Konfiguration der Blockly-Blöcke nur eine andere
    Art der Schnittstelle für die selbe Verarbeitung im Dungeon, beide können
    relativ frei gegeneinander ausgetauscht werden.

    Ziel dieses Projekt-Vorschlags ist die Definition einer einfachen
    objektorientierten Sprache ("MiniJava") mit Features aus der funktionalen
    Programmieren, die sich für Programmier-Einsteiger leicht verstehen lässt und an
    der man wichtige Programmierkonzepte einfach erlernen kann. Diese Sprache soll
    unabhängig von der Dungeon-API sein, aber trotzdem typische Möglichkeiten für
    die Interaktion in Spielen aufweisen. Für diese Sprache soll ein Interpreter
    entwickelt werden, der im Dungeon als "System" in der ECS-Architektur mitläuft,
    empfangen und verarbeitet werden und in die entsprechenden Aktionen im Dungeon
    umgesetzt werden. Zusätzlich soll eine VSCode-Extension realisiert werden, die
    Syntax-Highlighting und Autocompletion unterstützt und per Tool-Tip die
    jeweilige Dokumentation anzeigen kann.

    Dieses Projekt lässt sich im Verarbeitungsteil in zwei Projekte aufteilen: Ein
    Projekt bearbeitet die VSCode-Extension für MiniJava, das andere Projekt
    realisiert den Interpreter für MiniJava im Dungeon.
    :::

-   LaTeX Equation Language: Parsen und übersetzen eines LaTeX-Teilgrammatik
    (Arithmetik, cases, Funktionsdefinition) in ausführbaren LLVM-IR-Code oder
    Java-Bytecode o.ä. Ziel: Brücke von symbolischer Notation zu maschinennahem
    Code.

-   MLIR/E-Graphs-Pipeline: Entwurf eines kleinen MLIR-Dialekts (z.B. arithmetische
    Ausdrücke) mit Lowering nach LLVM; alternativ/ergänzend Optimierung via E-Graphs
    (Equality Saturation) und anschließendes Lowering.

# Exposé (pro Team, Kurs-GitHub)

-   Umfang: 150--400 Wörter
-   Struktur:
    1.  Was wollt ihr machen?
    2.  Warum ist das spannend?
    3.  Wie werdet ihr das umsetzen?
    4.  Wie könnt ihr euren Erfolg empirisch bewerten?
    5.  Wer ist alles im Team?

Bitte beschreiben Sie die einzelnen Punkte so ausführlich wie nötig, um
nachvollziehbar zu sein.

Abgabe als Beitrag in unserem [Forum im
Kurs-GitHub](https://github.com/Compiler-CampusMinden/CPL-Vorlesung-Master-W25/discussions/categories/projekt-exposé),
spätestens einen Tag vor der internen Projektvorstellung.

# Organisation

**Teams**: Die Bearbeitung erfolgt in 3er-Teams.

**Fristen**

-   **Vorstellung der Konzepte** (intern): Di, 18.11. (Praktikumsslot, pro Team eine
    Präsentation von ca. 20 Minuten; das Exposé soll mind. einen Tag vorher im Forum
    eingestellt sein) =\> Generalprobe für den [Talk](talk.md) im
    Edmonton-/Minden-Meeting
-   **Edmonton/Minden**: Vorstellung Ihres Projekts: Mo, 01.12., 18:00 - 19:00 Uhr
    (pro Team eine (**englisch-sprachige**) Präsentation von ca. 40-45 Minuten plus
    Diskussion in Breakout-Gruppen)
-   **Abschlusspräsentation**: Di, 20.01. (Vorlesungs- und Praktikumsslot, pro Team
    eine Präsentation von ca. 30 Minuten)

------------------------------------------------------------------------------------

Wir freuen uns darauf, Sie in diesem herausfordernden und spannenden Projekt zu
begleiten und wünschen Ihnen viel Erfolg!

[^1]: ... for a given value of "jede" :) ... Die Idee muss zum Thema passen und vom
    Anspruch und Umfang her einem 10 ECTS Master-Modul angemessen sein.
