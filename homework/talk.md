# Seminaristischer Unterricht: Vorträge zu Programmiersprachen und Compilerbau

> [!IMPORTANT]
>
> <details open>
>
> <summary><strong>🎯 TL;DR</strong></summary>
>
> In diesem Semester sind mehrere Vorträge Teil der Prüfungsleistung.
> Pro Team sind zu halten:
>
> - ein Kurzvortrag (ca. 20 Minuten) zu einem Thema aus dem Bereich
>   Programmiersprachen/-konzepte,
> - ein Fachvortrag (ca. 60 Minuten) zu einem Compiler-Thema,
> - zwei Projektvorträge (einmal im Edmonton-/Minden-Meeting, einmal zum
>   Semesterende).
>
> Alle Vorträge richten sich an Master-Studierende und sollen fachlich
> fundiert, klar strukturiert und mit nachvollziehbaren Beispielen
> unterlegt sein. Bitte planen Sie aktivierende Elemente
> (Diskussionsfragen, kurze Demos) ein.
>
> Die zeitliche Verteilung entnehmen Sie bitte dem
> [Fahrplan](../readme.md).
> </details>

## Kurzvortrag “PL Feature” (ca. 20 Minuten, DE)

Ziel ist die Einführung in ein ausgewähltes Programmiersprachen-Thema.
Das vortragende Team arbeitet die Kernideen heraus und demonstriert
zentrale Konzepte anhand kleiner, prägnanter Beispiele und leitet die
anschließende Diskussion.

Alle Teams sollen die Literatur zu den Kurzvorträgen zumindest grob
überflogen haben. Das vortragende Team leitet die an den Vortrag
anschließende Diskussion und bereitet 2-4 gezielte Diskussionsfragen zur
Aktivierung der Zuhörenden vor.

Verfügbare Themen:

1.  Object-Oriented Paradigm (OOP) (([Gabbrielli und Martini
    2023](#ref-Gabbrielli2023)), Kap. 10)
2.  Functional Programming Paradigm (FP) (([Gabbrielli und Martini
    2023](#ref-Gabbrielli2023)), Kap. 11)
3.  Logic Programming Paradigm (LP) (([Gabbrielli und Martini
    2023](#ref-Gabbrielli2023)), Kap. 12)
4.  Constraint Programming Paradigm (CP) (([Gabbrielli und Martini
    2023](#ref-Gabbrielli2023)), Kap. 13)
5.  Borrow Checking und Lifetimes am Beispiel
    [Rust](https://www.rust-lang.org/)
6.  Dependent Type Systems am Beispiel
    [Idris](https://www.idris-lang.org/)
    - [Why Dependent Types
      Matter](https://people.cs.nott.ac.uk/psztxa/publ/ydtm.pdf)
    - [IDRIS —: systems programming meets full dependent
      types](https://dl.acm.org/doi/10.1145/1929529.1929536)

Hinweise:

- *Jede Person* bereitet sich vorab vor; das präsentierende Team
  moderiert die Diskussion
- Ziel ist Transferfähigkeit: Nach dem Vortrag sollen Zuhörende
  weiterführende Literatur verstehen und Ideen praktisch erproben können
- Empfohlen: Zwei bis drei gut kuratierte Codebeispiele (live oder als
  Snippets), Vorbereitung von einigen Diskussionsfragen
- Vortragssprache ist Deutsch

Empfohlene weitere Referenzen (allgemein):

- Gabbrielli und Martini ([2023](#ref-Gabbrielli2023))
- Krishnamurthi ([2025](#ref-PLAI2025))
- Thain ([2023](#ref-Thain2020))

## Fachvortrag “Compiler” (ca. 60 Minuten + 10 Minuten Q&A, DE)

Ziel ist die systematische Einführung in ein Compiler/VM-Thema mit
genügend fachlicher Tiefe, so dass die Zuhörenden danach relevante
Literatur lesen und das Thema praktisch anwenden können.

Bitte achten Sie auf eine präzise Begriffsbildung und den Einordnung in
den Stand der Forschung/Praxis. Erstellen Sie eigene Beispiele und ggf.
kurze Demos.

Verfügbare Themen:

1.  Parsergeneratoren ([ANTLR](https://www.antlr.org/),
    [Tree-Sitter](http://tree-sitter.github.io/tree-sitter/), Flex &
    Bison, …)
2.  Fortgeschrittene Parsertechniken: LALR, PEG, Pratt,
    Parser-Combinators
3.  Typen, Typsysteme, Type Checking
    - [Hindley-Milner-Typsystem](https://en.wikipedia.org/wiki/Hindley%E2%80%93Milner_type_system)
    - [Propositions as Types
      (Wadler)](https://dl.acm.org/doi/abs/10.1145/2699407)
    - [Typechecker Zoo
      (Diehl)](https://sdiehl.github.io/typechecker-zoo/)
    - [On Understanding Types, Data Abstraction, and Polymorphism
      (Cardelli/Wegner)](https://dl.acm.org/doi/pdf/10.1145/6041.6042)
4.  VM & Bytecode
    - [AST vs. Bytecode: Interpreters in the Age of
      Meta-Compilation](https://dl.acm.org/doi/abs/10.1145/3622808)
    - [An Introduction to Interpreters and JIT
      Compilation](https://stefan-marr.de/2023/09/pliss-summer-school/)
    - [Optimizing the Order of Bytecode Handlers in Interpreters using a
      Genetic
      Algorithm](https://dl.acm.org/doi/abs/10.1145/3555776.3577712)
    - Beispiele: JVM oder WASM
5.  Garbage Collection
    - ([Nystrom 2021](#ref-Nystrom2021)), Kap. 26
    - [Unified Theory of Garbage
      Collection](https://dl.acm.org/doi/10.1145/1035292.1028982)
    - [Fast Conservative Garbage
      Collection](https://dl.acm.org/doi/10.1145/2660193.2660198)
    - [GC vs. explicit memory
      management](https://dl.acm.org/doi/10.1145/1103845.1094836)
6.  Just-in-Time Compilation (JIT)
    - [An Introduction to Interpreters and JIT
      Compilation](https://stefan-marr.de/2023/09/pliss-summer-school/)
    - [AST vs. Bytecode: Interpreters in the Age of
      Meta-Compilation](https://dl.acm.org/doi/abs/10.1145/3622808)

Empfohlene weitere Referenzen (allgemein):

- Nystrom ([2021](#ref-Nystrom2021))
- Torczon und Cooper ([2012](#ref-Torczon2012))
- Thain ([2023](#ref-Thain2020))
- Pierce ([2002](#ref-Pierce2002))

Planen Sie im Anschluss an den 60-minütigen Vortrag ca. 10 Minuten Q&A
und Diskussion ein.

## Zwei Vorträge zum Projekt

1.  Edmonton-/Minden-Meeting (Mo, 01.12., 18-19 Uhr, EN)
    - Dauer: ca. 40-45 Minuten pro Team, parallel in Breakout-Gruppen
    - Ziel: Vorstellung von Idee, Problemstellung, Architektur/Design,
      MVP/Prototyp-Status, Risiken und Evaluationsplan
    - Publikum: Kanadische Studierende; bitte auf klare
      “Problem-Ansatz-Nutzen”-Struktur achten
    - Sprache: Englisch

<!-- -->

1.  Abschlusspräsentation (Di, 20.01., DE)
    - Dauer: ca. 30 Minuten pro Team (Vorlesungs- und Praktikumsslot)
    - Ziel: Ergebnisse, Demos, Evaluation, Lessons Learned, Ausblick

Siehe auch [Beschreibung zum Projekt](project.md).

------------------------------------------------------------------------

> [!NOTE]
>
> <details>
>
> <summary><strong>👀 Quellen</strong></summary>
>
> <div id="refs" class="references csl-bib-body hanging-indent">
>
> <div id="ref-Gabbrielli2023" class="csl-entry">
>
> Gabbrielli, M., und S. Martini. 2023. *Programming Languages:
> Principles and Paradigms*. Springer Cham.
> <https://doi.org/10.1007/978-3-031-34144-1>.
>
> </div>
>
> <div id="ref-PLAI2025" class="csl-entry">
>
> Krishnamurthi, S. 2025. „Programming Languages: Application and
> Interpretation“. <https://www.plai.org/>.
>
> </div>
>
> <div id="ref-Nystrom2021" class="csl-entry">
>
> Nystrom, R. 2021. *Crafting Interpreters*. Genever Benning.
> <https://github.com/munificent/craftinginterpreters>.
>
> </div>
>
> <div id="ref-Pierce2002" class="csl-entry">
>
> Pierce, B. C. 2002. *Types and Programming Languages*. MIT Press.
>
> </div>
>
> <div id="ref-Thain2020" class="csl-entry">
>
> Thain, D. 2023. *Introduction to Compilers and Language Design*.
> <https://www3.nd.edu/~dthain/compilerbook/>.
>
> </div>
>
> <div id="ref-Torczon2012" class="csl-entry">
>
> Torczon, L., und K. Cooper. 2012. *Engineering a Compiler*. Morgan
> Kaufmann.
> <https://learning.oreilly.com/library/view/engineering-a-compiler/9780080916613/>.
>
> </div>
>
> </div>
>
> </details>

------------------------------------------------------------------------

<img src="https://licensebuttons.net/l/by-sa/4.0/88x31.png" width="10%">

Unless otherwise noted, this work is licensed under CC BY-SA 4.0.

<blockquote><p><sup><sub><strong>Last modified:</strong> ca08c5e (orga: improve readability of talk overview, 2025-10-14)<br></sub></sup></p></blockquote>
