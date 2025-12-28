# Sequence Diagrams (Mermaid)

Below are Mermaid sequence diagrams that describe the common interactions for the programs in this repository. Copy the mermaid code blocks into a Markdown file or a Mermaid live editor to render them.

## 1) User runs MenuDriven and selects an example

```mermaid
sequenceDiagram
    participant User
    participant JVM
    participant MenuDriven
    participant ExampleClass
    User->>JVM: java MenuDriven
    JVM->>MenuDriven: start (main)
    MenuDriven->>User: showMenu()
    User->>MenuDriven: select option (e.g., "1: SumCalculator")
    MenuDriven->>ExampleClass: invoke ExampleClass.run()/main()
    ExampleClass->>ExampleClass: perform computation / algorithm
    ExampleClass-->>MenuDriven: return result / status
    MenuDriven->>User: print result / prompt for next action
```

Notes:
- `MenuDriven` may directly call static `main` methods or instantiate classes and call instance methods.
- Examples are synchronous and console-based.

## 2) Running a single example directly

```mermaid
sequenceDiagram
    participant User
    participant Shell
    participant javac
    participant java
    participant ExampleClass
    User->>Shell: javac ExampleClass.java
    Shell->>javac: compile -> ExampleClass.class
    Shell->>java: java ExampleClass
    java->>ExampleClass: start (main)
    ExampleClass->>User: prompt / output
```

Notes:
- Compile step (javac) produces .class files; consider using a build tool to manage compilation.

## 3) Developer push -> CI (recommended)

```mermaid
sequenceDiagram
    participant Developer
    participant GitHub
    participant GitHubActions
    participant BuildRunner
    participant TestSuite
    Developer->>GitHub: push branch (feature/docs)
    GitHub->>GitHubActions: webhook (run workflow)
    GitHubActions->>BuildRunner: checkout, run javac / build
    BuildRunner->>TestSuite: execute unit tests (if present)
    alt tests pass
        GitHubActions->>GitHub: report success
    else tests fail
        GitHubActions->>GitHub: report failure (details)
    end
```

Notes:
- The repository currently lacks a CI workflow and unit tests — adding GitHub Actions with `javac` and JUnit steps is recommended.

## How to render
- GitHub's markdown currently supports Mermaid diagrams in some contexts. Use a Mermaid-enabled viewer or VS Code extension for preview.
- For CLI rendering: use mermaid-cli or embed diagrams in GitHub Pages.
