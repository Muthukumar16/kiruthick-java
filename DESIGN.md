# kiruthick-java — Design Document

## Purpose
This repository is a collection of small Java programs and exercises (console/BlueJ style) demonstrating algorithms, number puzzles, and simple interactive programs. The goal is educational: to present runnable examples that illustrate core Java programming concepts.

## Scope
- Catalog and describe the existing programs.
- Explain how to build and run them locally (javac/java and BlueJ).
- Describe typical runtime flows with Mermaid sequence diagrams (see SEQUENCE_DIAGRAMS.md).
- Recommendations for organizing, testing, and documenting the examples.

## Repository structure (root)
- Java source files (examples, many in root):
  - GamesProgram.java
  - MenuDriven.java
  - SumCalculator.java
  - StringManipulator.java
  - MovieMagic.java
  - ElectricBill.java
  - TicTacToe.class (compiled)
  - ...and other small programs (BookFair, DisariumNumber, DudeneyNumber, HappyNumber, OverloadSum, RockPaperScissors, etc.)
- .gitignore
- docs/ (empty, reserved)
- package.bluej / BlueJ project metadata

Note: Many compiled `.class` files are present; consider removing compiled artifacts from the repo and adding a .gitignore rule to avoid them.

## Actors
- Developer (author/maintainer)
- Learner / Reader (runs programs locally)
- Build tool (javac / optional IDE or BlueJ)
- Operating system / Java runtime

## Key ideas & responsibilities
- Each .java file is a self-contained example with a `main` method or BlueJ-style class.
- `MenuDriven.java` provides a menu-based entry point that dispatches to several example programs.
- Programs focus on algorithmic logic rather than network or persistence concerns.

## Build & run (recommended)
1. Install JDK (11+ recommended, adjust if code uses older constructs).
2. From repository root:
   - Compile all .java files:
     javac *.java
   - Run a program (example):
     java MenuDriven
3. Alternatively open in BlueJ if you use the BlueJ project files.

## Error handling and assumptions
- Programs are console-based with minimal input validation. As these are examples, input validation is usually simple (e.g., numeric parsing and basic checks).
- When converting to a larger project, add robust input validation, unit tests, and structured error handling.

## Recommendations / Next steps
- Remove .class files from source control and add them to .gitignore.
- Move examples into src/ with package namespaces (e.g., src/main/java/com/yourname/examples) to align with standard Java project conventions.
- Add a build tool (Maven or Gradle) to allow `mvn test`, `mvn package`, and to manage JDK compatibility.
- Add README entries per example explaining purpose, usage, and expected input/output.
- Add unit tests (JUnit) for algorithmic methods (separate from interactive main methods).
- Add the design docs (DESIGN.md, ARCHITECTURE.md, SEQUENCE_DIAGRAMS.md) to `feature/docs` branch and open a PR for review.
