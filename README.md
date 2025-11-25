# Aufgabe – Notenrechner (Gruppe C – TDD + KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** und dürfen zusätzlich eine KI
(z.B. ChatGPT) unter klar definierten Bedingungen verwenden.  

---

## Aufgabe

Implementieren Sie in der Klasse [GradeCalculator](src/main/java/de/ba/experiment/GradeCalculator.java) die Methode

```java
public static String grade(int punkte){}
```  

Die Methode soll für eine Punktzahl punkte folgende Noten zurückgeben:
- 90–100 Punkte → "1"
- 80–89 Punkte → "2"
- 65–79 Punkte → "3"
- 50–64 Punkte → "4"
- < 50 Punkte → "nicht bestanden"

Die Rückgabe erfolgt als String.   

Schreiben Sie Tests in der [GradeCalculatorTest](src/test/java/GradeCalculatorTest.java) Klasse.    

---

## Vorgehen (TDD: Red – Green – Refactor)

Grundsätzlich arbeiten Sie wie in Gruppe B:

(1) Red – Test schreiben
- Schreiben Sie zuerst eigene Testfälle in GradeCalculatorTest.
- Starten Sie mit einfachen Fällen (z.B. 95 → "1", 30 → "nicht bestanden").

(2) Green – minimaler Code
- Implementieren Sie GradeCalculator.grade(int punkte) so, dass Ihre Tests grün werden.

(3) Refactor – aufräumen
- Verbessern Sie Code und evtl. Tests, ohne das Verhalten zu ändern.
- Ergänzen Sie nach und nach weitere Tests, insbesondere Grenzwerte (49/50, 64/65, 79/80, 89/90).  

---

## Nutzung von KI

Sie dürfen eine KI (z.B. ChatGPT) zur Unterstützung einsetzen – aber nur nach bestimmten Regeln:

**(1) Wofür Sie KI verwenden dürfen**
- Vorschläge für weitere Testfälle (insbesondere Grenzwerte)
- Ideen für eine sinnvolle if/else if/else-Struktur
- Refactoring-Vorschläge (z.B. Vereinfachung von Bedingungen, bessere Namen)
- Erklärungen zu Fehlern in Ihren Tests/Implementierungen

**(2) KI-Log führen ([ki-log.md](ki-log.md))**
- Jede KI-Nutzung dokumentieren:
  - Datum/Uhrzeit
  - verwendeter Prompt
  - kurz: Was wurde übernommen? (z.B. „Testfall für 89/90 hinzugefügt“)  
  - In der [ki-log.md](ki-log.md) Datei befindet sich ein Beispiel

**(3) Wichtig:**
- Sie sind verantwortlich, die KI-Vorschläge kritisch zu prüfen und ggf. anzupassen.
- Das spätere Quiz zur Einheit wird ohne KI bearbeitet.  

---

**Technische Hinweise**  
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf GradeCalculatorTest → Run 'GradeCalculatorTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Halten Sie sich an die vorgegebene Methodensignatur (public static String grade(int punkte)).
- Dokumentieren Sie jede KI-Nutzung vollständig in ki-log.md.
- Arbeiten Sie weiterhin im Sinne von TDD: Tests geben den Takt vor, nicht die KI.