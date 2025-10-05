---
author: BC George, Carsten Gips (HSBI)
no_beamer: true
title: "CPL: Vorträge"
---

# Seminaristischer Unterricht: Vorträge zu Programmiersprachen und Compilerbau

In diesem Semester sind mehrere Vorträge Teil der Prüfungsleistung. Pro Team sind zu
halten:

-   ein Kurzvortrag (ca. 20 Minuten) zu einem Thema aus dem Bereich
    Programmiersprachen/-konzepte,
-   ein Fachvortrag (ca. 60 Minuten) zu einem Compiler-Thema,
-   zwei Projektvorträge (einmal im Edmonton-/Minden-Meeting, einmal zum
    Semesterende).

Alle Vorträge richten sich an Master-Studierende und sollen fachlich fundiert, klar
strukturiert und mit nachvollziehbaren Beispielen unterlegt sein. Bitte planen Sie
aktivierende Elemente (Diskussionsfragen, kurze Demos) ein.

Die zeitliche Verteilung entnehmen Sie bitte dem [Fahrplan](../readme.md).

## Kurzvortrag "PL Feature" (ca. 20 Minuten, DE)

Ziel ist die Einführung in ein ausgewähltes Programmiersprachen-Thema. Das
vortragende Team arbeitet die Kernideen heraus und demonstriert zentrale Konzepte
anhand kleiner, prägnanter Beispiele und leitet die anschließende Diskussion.

Verfügbare Themen:

1.  Object-Oriented Paradigm (OOP) ([@Gabbrielli2023], Kap. 10)
2.  Functional Programming Paradigm (FP) ([@Gabbrielli2023], Kap. 11)
3.  Logic Programming Paradigm (LP) ([@Gabbrielli2023], Kap. 12)
4.  Constraint Programming Paradigm (CP) ([@Gabbrielli2023], Kap. 13)
5.  Borrow Checking und Lifetimes am Beispiel [Rust](https://www.rust-lang.org/)
6.  Dependent Type Systems am Beispiel [Idris](https://www.idris-lang.org/)
    -   [Why Dependent Types
        Matter](https://people.cs.nott.ac.uk/psztxa/publ/ydtm.pdf)
    -   [IDRIS ---: systems programming meets full dependent
        types](https://dl.acm.org/doi/10.1145/1929529.1929536)

<!--
Weitere mögliche Themen:

-   Algebraische Effekte und Effekt-Systeme (z. B. Koka), Exceptions vs. Effekte
-   Pattern Matching und Algebraische Datentypen (OCaml/F#/Scala)
-   Metaprogrammierung und Makros (Lisp/Clojure, Rust macro_rules! und proc-macros)
-   Gradual Typing (TypeScript, Sorbet), Typklassen und Traits (Haskell/Rust)
-->

Hinweise:

-   *Jede Person* bereitet sich vorab vor; das präsentierende Team moderiert die
    Diskussion
-   Ziel ist Transferfähigkeit: Nach dem Vortrag sollen Zuhörende weiterführende
    Literatur verstehen und Ideen praktisch erproben können
-   Empfohlen: Zwei bis drei gut kuratierte Codebeispiele (live oder als Snippets),
    Vorbereitung von einigen Diskussionsfragen
-   Vortragssprache ist Deutsch

Empfohlene weitere Referenzen (allgemein):

-   @Gabbrielli2023
-   @PLAI2025
-   @Thain2020

## Fachvortrag "Compiler" (ca. 60 Minuten + 10 Minuten Q&A, DE)

Ziel ist die systematische Einführung in ein Compiler/VM-Thema mit genügend
fachlicher Tiefe, so dass die Zuhörenden danach relevante Literatur lesen und das
Thema praktisch anwenden können.

Verfügbare Themen:

1.  Parsergeneratoren ([ANTLR](https://www.antlr.org/),
    [Tree-Sitter](http://tree-sitter.github.io/tree-sitter/), Flex & Bison, ...)
2.  Fortgeschrittene Parsertechniken: LALR, PEG, Pratt, Parser-Combinators
3.  Typen, Typsysteme, Type Checking
    -   [Hindley-Milner-Typsystem](https://en.wikipedia.org/wiki/Hindley%E2%80%93Milner_type_system)
    -   [Propositions as Types (Wadler)](https://dl.acm.org/doi/abs/10.1145/2699407)
    -   [Typechecker Zoo (Diehl)](https://sdiehl.github.io/typechecker-zoo/)
    -   [On Understanding Types, Data Abstraction, and Polymorphism
        (Cardelli/Wegner)](https://dl.acm.org/doi/pdf/10.1145/6041.6042)
4.  VM & Bytecode
    -   [AST vs. Bytecode: Interpreters in the Age of
        Meta-Compilation](https://dl.acm.org/doi/abs/10.1145/3622808)
    -   [An Introduction to Interpreters and JIT
        Compilation](https://stefan-marr.de/2023/09/pliss-summer-school/)
    -   [Optimizing the Order of Bytecode Handlers in Interpreters using a Genetic
        Algorithm](https://dl.acm.org/doi/abs/10.1145/3555776.3577712)
    -   Beispiele: JVM oder WASM
5.  Garbage Collection
    -   [@Nystrom2021], Kap. 26
    -   [Unified Theory of Garbage
        Collection](https://dl.acm.org/doi/10.1145/1035292.1028982)
    -   [Fast Conservative Garbage
        Collection](https://dl.acm.org/doi/10.1145/2660193.2660198)
    -   [GC vs. explicit memory
        management](https://dl.acm.org/doi/10.1145/1103845.1094836)
6.  Just-in-Time Compilation (JIT)
    -   [An Introduction to Interpreters and JIT
        Compilation](https://stefan-marr.de/2023/09/pliss-summer-school/)
    -   [AST vs. Bytecode: Interpreters in the Age of
        Meta-Compilation](https://dl.acm.org/doi/abs/10.1145/3622808)

<!--
Weitere mögliche Themen:

-   Fehlertolerantes Parsen und Diagnosequalität (Error Recovery, präzise
    Fehlermeldungen)
-   Inkrementelle/Interaktive Compiler (IDE-Services, Language Server Protocol)
-   Testen von Compilern
    -   [Finding and Understanding Bugs in C
        Compilers](https://users.cs.utah.edu/~regehr/papers/pldi11-preprint.pdf)
    -   [Validating JIT Compilers via Compilation Space
        Exploration](https://connglli.github.io/pdfs/artemis_sosp23.pdf)
    -   [A Survey of Compiler
        Testing](https://software-lab.org/publications/csur2019_compiler_testing.pdf)
    -   [An empirical comparison of compiler testing
        techniques](https://xiongyingfei.github.io/papers/ICSE16.pdf)
    -   [Compiler Testing: A Systematic Literature
        Analysis](https://arxiv.org/abs/1810.02718)
    -   [Snapshot Testing for
        Compilers](https://www.cs.cornell.edu/~asampson/blog/turnt.html)
    -   [Tiny Unified Runner N' Tester (Turnt)](https://github.com/cucapra/turnt)
    -   [Testing Language
        Implementations](https://youtu.be/ZJUk8_k1HbY?si=Mis0l6M07vbI8Rqx)
-->

Empfohlene weitere Referenzen (allgemein):

-   @Nystrom2021
-   @Torczon2012
-   @Thain2020
-   @Pierce2002

Planen Sie im Anschluss an den 60-minütigen Vortrag ca. 10 Minuten Q&A und
Diskussion ein.

## Zwei Vorträge zum Projekt

1.  Edmonton-/Minden-Meeting (Mo, 01.12., 18-19 Uhr, EN)
    -   Dauer: ca. 40-45 Minuten pro Team, parallel in Breakout-Gruppen
    -   Ziel: Vorstellung von Idee, Problemstellung, Architektur/Design,
        MVP/Prototyp-Status, Risiken und Evaluationsplan
    -   Publikum: Kanadische Studierende; bitte auf klare
        "Problem-Ansatz-Nutzen"-Struktur achten
    -   Sprache: Englisch

\smallskip

2.  Abschlusspräsentation (Di, 20.01., DE)
    -   Dauer: ca. 30 Minuten pro Team (Vorlesungs- und Praktikumsslot).
    -   Ziel: Ergebnisse, Demos, Evaluation, Lessons Learned, Ausblick.

# Erwartungshorizont und Qualitätssicherung

-   Inhaltliche Tiefe: Präzise Begriffsbildung, Einordnung in den Stand der
    Forschung/Praxis
-   Nachvollziehbarkeit: Klare Beispiele, ggf. kurze Demos; Code sollte lauffähig
    und kommentiert sein
-   Literaturarbeit: 3-6 belastbare Quellen (Primärliteratur bevorzugt), saubere
    Zitate
-   Visualisierung: Aussagekräftige Abbildungen/Diagramme; Folien sind barrierearm
    (Kontrast, Schriftgröße)
-   Diskurs: 2-4 gezielte Diskussionsfragen zur Aktivierung der Zuhörenden
-   Zeitmanagement: Bitte Proben durchführen; Puffer für Q&A einplanen
-   Teamarbeit: Klare Rollen, abgestimmter Vortrag; alle Teammitglieder präsentieren

# Organisatorisches

Die Themen für den Kurzvortrag und den Fachvortrag werden in der zweiten Vorlesung
(14.10.) vergeben.
