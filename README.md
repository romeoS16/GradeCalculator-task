# Aufgabe – Notenrechner (Gruppe A – klassischer Ansatz / test-after)

In dieser Aufgabe implementieren Sie eine Methode, die aus einer Punktzahl eine Note berechnet.  
Sie arbeiten nach dem **test-after-Prinzip**: Zuerst wird die Implementierung geschrieben, dann die Tests.  

---

## Aufgabe

Implementieren Sie in der Klasse [GradeCalculator](src/main/java/de/ba/experiment/GradeCalculator.java) die Methode

```java
public static String grade(int punkte) {}
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

## Vorgehen (test-after)

(1) Implementieren Sie zuerst die Methode GradeCalculator.grade(int punkte) in [GradeCalculator](src/main/java/de/ba/experiment/GradeCalculator.java).  

(2) Testen Sie Ihre Implementierung anschließend mit JUnit-Tests:
- Legen Sie Testfälle in [GradeCalculatorTest](src/test/java/GradeCalculatorTest.java) an.
- Testen Sie typische Werte (z.B. 95, 82, 70, 50, 30).
- Testen Sie besonders die Grenzwerte: 49/50, 64/65, 79/80, 89/90.

(3) Führen Sie Ihre Tests regelmäßig aus und ergänzen Sie weitere Testfälle, wenn Sie Fehler finden.

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf GradeCalculatorTest → Run 'GradeCalculatorTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static String grade(int punkte)).
- Ziel ist, zuerst eine Lösung zu implementieren und danach passende Tests zu formulieren (klassisches test-after).

