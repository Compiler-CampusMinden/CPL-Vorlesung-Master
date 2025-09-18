---
has_license: true
no_beamer: true
title: "MIF 1.5: Concepts of Programming Languages (Winter 2025/26)"
---

![](admin/images/architektur_cb.png){width="80%"}

# Kursbeschreibung

Der Compiler ist das wichtigste Werkzeug in der Informatik. In der Königsdisziplin
der Informatik schließt sich der Kreis, hier kommen die unterschiedlichen
Algorithmen und Datenstrukturen und Programmiersprachenkonzepte zur Anwendung.

In diesem Modul geht es um ein fortgeschrittenes Verständnis für interessante
Konzepte im Compilerbau sowie um grundlegende Konzepte von Programmiersprachen und
-paradigmen. Wir schauen uns dazu relevante aktuelle Tools und Frameworks an und
setzen diese bei der Erstellung eines Bytecode-Compilers für unterschiedliche
Programmiersprachen für die Java-VM oder WASM ein.

# Überblick Modulinhalte

1.  Lexikalische Analyse: Scanner/Lexer
    -   Reguläre Sprachen
    -   Manuelle Implementierung, Parsergeneratoren (ANTLR, Flex, ...)
2.  Syntaxanalyse: Parser
    -   Kontextfreie Grammatiken (CFG), Chomsky
    -   LL-Parser (Top-Down-Parser)
    -   LR-Parser (Bottom-Up-Parser)
    -   Manuelle Implementierung, Parsergeneratoren (ANTLR, Bison, ...)
3.  Semantische Analyse und Optimierungen
    -   Symboltabellen
    -   Typen, Typ-Inferenz, Type Checking
    -   Datenfluss- und Kontrollfluss-Analyse
    -   Optimierungen: Peephole u.a.
4.  Zwischencode: Intermediate Representation (IR), LLVM-IR
5.  Interpreter: AST-Traversierung vs. Bytecode/VM, Garbage Collection
6.  Code-Generierung
7.  Programmiersprachen-Konzepte: OOP, FP, LP, CP u.a. und die Auswirkungen auf
    Compiler/Interpreter und Laufzeitumgebung

# Team

-   [BC
    George](https://www.hsbi.de/minden/ueber-uns/personenverzeichnis/birgit-christina-george)
-   [Carsten
    Gips](https://www.hsbi.de/minden/ueber-uns/personenverzeichnis/carsten-gips)
    (Sprechstunde nach Vereinbarung)

# Kursformat

| Seminaristischer Unterricht (2 SWS) | Praktikum (3 SWS)            |
|:------------------------------------|:-----------------------------|
| Di, 09:45 - 11:15 Uhr (Zoom)        | Di, 11:30 - 13:45 Uhr (Zoom) |

Durchführung des seminaristischen Unterrichts als *Flipped Classroom* (Carsten) bzw.
als *reguläre Vorlesung* (BC). Zugangsdaten Zoom siehe
[ILIAS](https://www.hsbi.de/elearning/goto.php/crs/1555873).

# Fahrplan

Hier finden Sie einen abonnierbaren [Google
Kalender](https://calendar.google.com/calendar/ical/4ba4736f0bc2005e4bcd75d48671e49cd4c9f3839988bf4f522f45a8bfbf676b%40group.calendar.google.com/public/basic.ics)
mit allen Terminen der Veranstaltung zum Einbinden in Ihre Kalender-App.

| Woche      | Sem. Unterricht: Selbststudium (Vorbereitung)                                                                                                           | Sem. Unterricht: Gemeinsame Sitzung                                                                             | Praktikum                                                                                            | Edmonton/Minden-Meetings                                                                                                |
|:-----------|:--------------------------------------------------------------------------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------|
| W01 / KW41 | [Überblick](lecture/00-intro/overview.md) \| [Sprachen](lecture/00-intro/languages.md) \| [Anwendungen](lecture/00-intro/applications.md)               | [Orga](https://github.com/Compiler-CampusMinden/CPL-Vorlesung-Master-W25) (*Zoom*)                              |                                                                                                      |                                                                                                                         |
| W02 / KW42 |                                                                                                                                                         | [Reguläre Sprachen](lecture/01-lexing/regular.md)                                                               | [CFG](lecture/02-parsing/cfg.md)                                                                     |                                                                                                                         |
| W03 / KW43 | [Lexer (Implementierung)](lecture/01-lexing/recursive.md)                                                                                               | [LL-Parser](lecture/02-parsing/ll-parser.md)                                                                    | [LL-Parser (Implementierung)](lecture/02-parsing/ll-parser-impl.md)                                  |                                                                                                                         |
| W04 / KW44 |                                                                                                                                                         | [LR-Parser](lecture/02-parsing/lr-parser.md)                                                                    | *Vortrag "Compiler": Parsergeneratoren (ANTLR, Treesitter, Flex&Bison, ...)*                         |                                                                                                                         |
| W05 / KW45 | Symboltabellen: [Überblick](lecture/03-semantics/symbtab0-intro.md) \| [Scopes](lecture/03-semantics/symbtab1-scopes.md)                                | [Funktionen](lecture/03-semantics/symbtab2-functions.md) \| [Klassen](lecture/03-semantics/symbtab3-classes.md) | *Vortrag "Compiler": LALR, PEG, Pratt, Combinators*                                                  |                                                                                                                         |
| W06 / KW46 |                                                                                                                                                         | *Vortrag "Compiler": Type Checking, Hindley-Milner*                                                             | *Kurzvortrag/Diskussion "PL-Feature": OOP (Gabbrielli & Martini, Kap. 10)*                           |                                                                                                                         |
| W07 / KW47 | [Syntaxgesteuerte Interpreter](lecture/06-interpretation/syntaxdriven.md) \| [AST-basierte Interpreter 1](lecture/06-interpretation/astdriven-part1.md) | [AST-basierte Interpreter 2](lecture/06-interpretation/astdriven-part2.md)                                      | *Vorstellung der Konzepte [DSL-Projekt](homework/project.md)*                                        |                                                                                                                         |
| W08 / KW48 |                                                                                                                                                         | *Vortrag "Compiler": VM & Bytecode*                                                                             | *Kurzvortrag/Diskussion "PL-Feature": FP (Gabbrielli & Martini, Kap. 11)*                            |                                                                                                                         |
| W09 / KW49 |                                                                                                                                                         | *Sprechstunde*                                                                                                  | *Kurzvortrag/Diskussion "PL-Feature": LP (Gabbrielli & Martini, Kap. 12)*                            | **Mo, 01.12., 18:00 - 19:00 Uhr (online): Edmonton/Minden: Minden Presentations**: *Vortrag: Vorstellung "DSL-Projekt"* |
| W10 / KW50 |                                                                                                                                                         | [Optimierung und Datenfluss- und Kontrollflussanalyse](lecture/05-optimization/optimization.md)                 | *Kurzvortrag/Diskussion "PL-Feature": CP (Gabbrielli & Martini, Kap. 13)*                            | **Mo, 08.12., 18:00 - 19:00 Uhr (online): Edmonton/Minden: Edmonton Presentations**                                     |
| W11 / KW51 |                                                                                                                                                         | *Vortrag "Compiler": Garbage Collection*                                                                        | *Vortrag "Compiler": JIT*                                                                            |                                                                                                                         |
| *- / KW52* |                                                                                                                                                         | *Weihnachtspause*                                                                                               |                                                                                                      |                                                                                                                         |
| *- / KW01* |                                                                                                                                                         | *Weihnachtspause*                                                                                               |                                                                                                      |                                                                                                                         |
| W12 / KW02 |                                                                                                                                                         | *Kurzvortrag/Diskussion "PL-Feature": Borrow Checking und Lifetimes ([Rust](https://www.rust-lang.org/))*       | *Kurzvortrag/Diskussion "PL-Feature": Dependent Type Systems ([Idris](https://www.idris-lang.org/))* |                                                                                                                         |
| W13 / KW03 |                                                                                                                                                         | *Sprechstunde*                                                                                                  | *Freies Arbeiten*                                                                                    |                                                                                                                         |
| W14 / KW04 |                                                                                                                                                         | *Vorträge [DSL-Projekt](homework/project.md)*                                                                   | *Vorträge [DSL-Projekt](homework/project.md)*                                                        |                                                                                                                         |

# Prüfungsform, Note und Credits

**Mündliche Prüfung plus Studienleistung (Portfolio)**, 10 ECTS

-   **Studienleistung**: "Portfolio" - Kriterien je Person:

    1.  Teilnahme an beiden Edmonton/Minden-Terminen mit aktiver Beteiligung, pro
        Team ist am ersten Treffen ein Vortrag zum DSL-Projekt a 20 Minuten zu
        halten (Englisch!)
    2.  Kurzvortrag plus Diskussionsleitung "PL Features" a 20 Minuten (pro Team)
    3.  Vortrag "Compiler" a 60 Minuten (pro Team)
    4.  Abschlussvortrag zum DSL-Projekt am Semesterende (W14) a 30 Minuten (pro
        Team)

    Je Kriterium: Abgabe eines Post Mortem im ILIAS (**jede Person individuell**)

-   **Gesamtnote**: Mündliche Prüfung (einzeln, ca. 45 Minuten)

::: {.details title="Hinweise"}

-   Die Bearbeitung der Leistungen erfolgt im Team.
-   Ein Team umfasst 3 Personen.
-   Die Post Mortems sind individuell zu erstellen und abzugeben.
-   "Aktive Beteiligung" umfasst Anwesenheit und sachbezogene Beiträge;
    Anwesenheit/Beteiligung werden dokumentiert.
-   **Post Mortem**: Jede Person beschreibt individuell(!) die Bearbeitung des
    jeweiligen Kriteriums bzw. die Teilnahme am Edmonton/Minden-Meeting
    zurückblickend mit mind. 200 bis max. 400 Wörtern (Nutzlast; Überschriften und
    Links zählen nicht mit). Gehen Sie dabei aussagekräftig und nachvollziehbar auf
    folgende Punkte ein:

    1.  Zusammenfassung: Was wurde gemacht bzw. was wurde auf dem Meeting
        besprochen?
    2.  Details: Kurze Beschreibung besonders interessanter Aspekte.
    3.  Reflexion: Was war der schwierigste Teil? Wie haben Sie dieses Problem
        gelöst?
    4.  Reflexion: Was haben Sie gelernt oder (besser) verstanden?
    5.  Team: Mit wem haben Sie zusammengearbeitet?
    6.  Link zu Ihrem Repo mit den relevanten Artefakten (Lösung, Slides für den
        Vortrag, ...).

    Für die Edmonton/Minden-Meetings passen Sie bitte die Punkte (1) bis (4) und (5)
    entsprechend inhaltlich an, (6) entfällt.

    Die Post Mortems geben Sie bitte pro Person bis spätestens zur letzten
    gemeinsamen Sitzung im
    [ILIAS](https://www.hsbi.de/elearning/goto.php/exc/1582798) ab.

    Siehe auch
    https://github.com/Compiler-CampusMinden/CPL-Vorlesung-Master-W25/discussions/2.

:::

# Materialien

1.  ["**Compilers: Principles, Techniques, and
    Tools**"](https://learning.oreilly.com/library/view/compilers-principles-techniques/9789357054881/).
    Aho, A. V. und Lam, M. S. und Sethi, R. und Ullman, J. D. and Bansal, S.,
    Pearson India, 2023. ISBN
    [978-9-3570-5488-1](https://fhb-bielefeld.digibib.net/openurl?isbn=978-9-3570-5488-1).
    [Online](https://learning.oreilly.com/library/view/compilers-principles-techniques/9789357054881/)
    über die [O'Reilly-Lernplattform](https://www.oreilly.com/library-access/).
2.  ["**Crafting
    Interpreters**"](https://github.com/munificent/craftinginterpreters). Nystrom,
    R., Genever Benning, 2021. ISBN
    [978-0-9905829-3-9](https://fhb-bielefeld.digibib.net/openurl?isbn=978-0-9905829-3-9).
    [Online](https://www.craftinginterpreters.com/).
3.  ["**Engineering a
    Compiler**"](https://learning.oreilly.com/library/view/engineering-a-compiler/9780080916613/).
    Torczon, L. und Cooper, K., Morgan Kaufmann, 2012. ISBN
    [978-0-1208-8478-0](https://fhb-bielefeld.digibib.net/openurl?isbn=978-0-1208-8478-0).
    [Online](https://learning.oreilly.com/library/view/engineering-a-compiler/9780080916613/)
    über die [O'Reilly-Lernplattform](https://www.oreilly.com/library-access/).
4.  ["Introduction to Compilers and Language
    Design"](https://www3.nd.edu/~dthain/compilerbook/). Thain, D., 2023. ISBN
    [979-8-655-18026-0](https://fhb-bielefeld.digibib.net/openurl?isbn=979-8-655-18026-0).
    [Online](https://www3.nd.edu/~dthain/compilerbook/).
5.  ["Writing a C
    Compiler"](https://learning.oreilly.com/library/view/writing-a-c/9781098182229/).
    Sandler, N., No Starch Press, 2024. ISBN
    [978-1-0981-8222-9](https://fhb-bielefeld.digibib.net/openurl?isbn=978-1-0981-8222-9).
    [Online](https://learning.oreilly.com/library/view/writing-a-c/9781098182229/)
    über die [O'Reilly-Lernplattform](https://www.oreilly.com/library-access/).
6.  ["**Seven Languages in Seven
    Weeks**"](https://learning.oreilly.com/library/view/seven-languages-in/9781680500059/).
    Tate, B.A., Pragmatic Bookshelf, 2010. ISBN
    [978-1-93435-659-3](https://fhb-bielefeld.digibib.net/openurl?isbn=978-1-93435-659-3).
    [Online](https://learning.oreilly.com/library/view/seven-languages-in/9781680500059/)
    über die [O'Reilly-Lernplattform](https://www.oreilly.com/library-access/).

# Förderungen und Kooperationen

## Kooperation mit University of Alberta, Edmonton (Kanada)

Über das Projekt ["We CAN
virtuOWL"](https://www.uni-bielefeld.de/international/profil/netzwerk/alberta-owl/we-can-virtuowl/)
der Fachhochschule Bielefeld ist im Frühjahr 2021 eine Kooperation mit der
[University of
Alberta](https://www.hsbi.de/en/international-office/alberta-owl-cooperation)
(Edmonton/Alberta, Kanada) im Modul "Compilerbau" gestartet.

Wir freuen uns, auch in diesem Semester wieder drei gemeinsame Sitzungen für beide
Hochschulen anbieten zu können. (Diese Termine werden in englischer Sprache
durchgeführt.)

------------------------------------------------------------------------------------

# LICENSE

![](https://licensebuttons.net/l/by-sa/4.0/88x31.png)

Unless otherwise noted, [this
work](https://github.com/Compiler-CampusMinden/CPL-Vorlesung-Master) by [BC
George](https://github.com/bcg7), [Carsten Gips](https://github.com/cagix) and
[contributors](https://github.com/Compiler-CampusMinden/CPL-Vorlesung-Master/graphs/contributors)
is licensed under [CC BY-SA
4.0](https://github.com/Compiler-CampusMinden/CPL-Vorlesung-Master/blob/master/LICENSE.md).
See the [credits](CREDITS.md) for a detailed list of contributing projects.
