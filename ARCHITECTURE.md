# Architecture Overview — kiruthick-java

## High-level view
This repo is a collection of standalone console programs. There is no server, persistence, or external integrations. The architecture is intentionally minimal:

- Programs
  - Each file contains one example class (often with `main`).
  - `MenuDriven` acts as a launcher/menu dispatcher for interactive selection.
- Local execution environment
  - JDK runtime (java) and compiler (javac) execute the compiled classes.
- Optional BlueJ support
  - BlueJ metadata files are present (package.bluej, .ctxt) and can be used to open the examples in BlueJ.

## Component descriptions
- Launcher (MenuDriven.java)
  - Presents a menu and calls example classes based on user input.
- Example Classes (SumCalculator, StringManipulator, GamesProgram, etc.)
  - Contain application logic and console interaction.
- Project metadata (package.bluej, team.defs)
  - BlueJ and team project configuration files for educational use.

## Developer workflows
- Local build
  - javac *.java
  - java MenuDriven
- BlueJ
  - Open the project in BlueJ for visual class interactions.

## Recommended packaging & modernization path
If the repository should evolve into a maintainable library or multi-module project:
1. Introduce Maven or Gradle.
2. Reorganize sources into a standard layout:
   - src/main/java/com/username/examples/...
   - src/test/java/... (JUnit tests)
3. Remove binary files (.class) from git.
4. Add a CI pipeline (GitHub Actions) to run build and unit tests on PRs.
5. Document each example with usage and expected behavior.

## Non-functional considerations
- Simplicity: Keep examples focused and single-responsibility.
- Reproducibility: Include JDK version in documentation.
- Education: Use comments and README fragments to explain algorithms.
