# Java Version Features Overview

## Java 8 (March 2014)
- **Lambda Expressions**: Enable functional programming by allowing functions as first-class citizens.
- **Streams API**: Provides a functional approach to process collections and other data sources.
- **Optional Class**: Helps handle null values gracefully.
- **Default Methods**: Allow methods in interfaces to have an implementation.
- **Date and Time API (java.time)**: A modern date and time API inspired by Joda-Time.
- **Nashorn JavaScript Engine**: A new lightweight JavaScript engine. - Deprecated in JAVA 11
- **CompletableFuture**: Enhancements in concurrency APIs.
- **Annotations on Types**: Extended use of annotations to types.
- **Permanent Generation Removal**: Replaced by metaspace for better memory management.

---

## Java 9 (September 2017)
- **Java Platform Module System (JPMS)**: Introduced modularity to manage dependencies and encapsulation.
- **JShell (REPL)**: A read-eval-print loop tool for quick prototyping.
- **Factory Methods for Collections**: Simplified creation of immutable collections (e.g., `List.of()`, `Set.of()`).
- **Improved Stream API**: Added methods like `takeWhile()`, `dropWhile()`, and `iterate()`.
- **Private Interface Methods**: Allowed private methods inside interfaces.
- **Compact Strings**: Improved memory efficiency for strings.
- **Multi-Release JAR Files**: Allowed different classes in the same JAR to target different Java versions.

---

## Java 10 (March 2018)
- **Local Variable Type Inference (var)**: Simplified variable declarations with `var`.
- **Garbage Collection Improvements**: Experimental support for the G1 garbage collector.
- **Application Class-Data Sharing (AppCDS)**: Boosted startup performance.
- **Parallel Full GC for G1**: Improved performance in G1 garbage collector.
- **Thread-Local Handshakes**: Enhanced thread management.

---

## Java 11 (September 2018)
- **Long-Term Support (LTS)**: First LTS release after Java 8.
- **HTTP Client (Standard)**: Introduced a new `java.net.http` package for HTTP/2 and WebSocket support.
- **String API Enhancements**: New methods like `lines()`, `isBlank()`, `strip()`, and `repeat()`.
- **File Methods**: Added `readString()` and `writeString()` in `Files`.
- **Running Java Files without Compilation**: Allowed running `.java` files directly with `java <filename.java>`.
- **Lambda Parameter Type Inference**: Improved type inference for lambdas.
- **Removed Features**: Deprecated and removed Java EE and CORBA modules.

---

## Java 12 (March 2019)
- **Switch Expressions (Preview)**: Introduced enhanced `switch` with expression-style syntax.
- **JVM Constants API**: Simplified access to low-level JVM constants.
- **Default CDS Archives**: Improved startup time with class-data sharing.
- **G1 Garbage Collector Improvements**: Reduced pause times.

---

## Java 13 (September 2019)
- **Text Blocks (Preview)**: Introduced multiline string literals using `"""`.
- **Switch Expressions (2nd Preview)**: Enhanced further from Java 12.
- **Reimplement Legacy Socket API**: Modernized the socket implementation.
- **Dynamic CDS Archives**: Made class-data sharing more flexible.

---

## Java 14 (March 2020)
- **JEP 359: Records (Preview)**: Simplified creation of data-holding classes.
- **JEP 305: Pattern Matching for `instanceof` (Preview)**: Simplified type casting.
- **Switch Expressions (Standard)**: Finalized `switch` expressions.
- **JEP 364: Z Garbage Collector on macOS**: Extended ZGC to macOS.
- **Helpful NullPointerException Messages**: Improved error messages.

---

## Java 15 (September 2020)
- **JEP 360: Sealed Classes (Preview)**: Restricted inheritance to specified subclasses.
- **JEP 339: EdDSA Algorithm**: Added support for Edwards-Curve Digital Signature Algorithm.
- **JEP 371: Hidden Classes**: Improved support for framework development.
- **Text Blocks (Standard)**: Finalized text blocks from previews.

---

## Java 16 (March 2021)
- **JEP 394: Records (Standard)**: Finalized record types.
- **JEP 395: Pattern Matching for `instanceof` (Standard)**: Finalized the feature.
- **JEP 376: ZGC on Windows and macOS**: Broadened platform support for Z Garbage Collector.
- **JEP 338: Vector API (Incubator)**: Added support for vectorized computations.
- **JEP 387: Elastic Metaspace**: Reduced memory overhead for class metadata.

---

## Java 17 (September 2021, LTS)
- **JEP 406: Pattern Matching for `switch` (Preview)**: Simplified switch cases with patterns.
- **JEP 356: Enhanced Pseudo-Random Number Generators**: Improved random number API.
- **JEP 382: New macOS Rendering Pipeline**: Replaced OpenGL with Metal API.
- **JEP 391: macOS/AArch64 Port**: Added support for Apple Silicon.
- **Sealed Classes (Standard)**: Finalized sealed classes.

---

## Java 18 (March 2022)
- **JEP 400: UTF-8 by Default**: Made UTF-8 the default character set.
- **JEP 413: Code Snippets in API Documentation**: Enhanced documentation with code examples.
- **Simple Web Server**: Added a minimal web server for prototyping.
- **Vector API Enhancements (Incubator)**: Improved vector operations.

---

## Java 19 (September 2022)
- **JEP 405: Record Patterns (Preview)**: Extended pattern matching to decompose record types.
- **JEP 425: Virtual Threads (Preview)**: Lightweight threads as part of Project Loom.
- **JEP 428: Structured Concurrency (Incubator)**: Simplified concurrent programming.
- **Foreign Function & Memory API (Preview)**: Improved interoperability with native code.

---

## Java 20 (March 2023)
- **JEP 429: Scoped Values (Incubator)**: Simplified sharing of immutable data.
- **Virtual Threads (2nd Preview)**: Improved lightweight threading.
- **Structured Concurrency (2nd Incubator)**: Enhanced API for concurrent tasks.
- **Record Patterns and Pattern Matching Updates**: Continued refinements.

---

## Java 21 (September 2023, LTS)
- **JEP 431: Sequenced Collections**: Standardized order-preserving collection interfaces.
- **JEP 445: Unnamed Classes and Instance Main Methods (Preview)**: Simplified writing single-file programs.
- **JEP 441: Pattern Matching for `switch` (Standard)**: Finalized pattern-based switches.
- **JEP 439: Generational ZGC**: Introduced generational capabilities to Z Garbage Collector.
- **JEP 434: Foreign Function & Memory API (Standard)**: Finalized the API for native interop.
- **JEP 430: String Templates (Preview)**: Enhanced string formatting with templates.
