# Aufgabe – Notenrechner (Gruppe B – TDD, keine KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** an einem Notenrechner.  
Sie schreiben also zuerst Tests und entwickeln dann Schritt für Schritt die Implementierung.  

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

Arbeiten Sie in kleinen TDD-Schritten:

(1) **Red** – Test schreiben
- Formulieren Sie zunächst in GradeCalculatorTest einen Testfall für einen einfachen Fall, z.B.  95 → "1".
- Führen Sie die Tests aus – der neue Test sollte zunächst fehlschlagen.

(2) **Green** – minimaler Code
- Implementieren Sie GradeCalculator.grade(int punkte) so, dass der Test besteht.
- Schreiben Sie zunächst nur so viel Code wie nötig, um den Test grün zu bekommen.

(3) **Refactor** – aufräumen
- Verbessern Sie bei Bedarf den Code (z.B. Bedingungen übersichtlicher formulieren),
ohne das Verhalten zu ändern. Alle Tests müssen nach wie vor grün sein.

(4) Weitere Tests hinzufügen
- Ergänzen Sie Testfälle für:
  - typische Werte in den einzelnen Notenbereichen (z.B. 85, 70, 55, 30)
  - alle Grenzwerte: 49/50, 64/65, 79/80, 89/90
- Passen Sie die Implementierung an, falls Tests fehlschlagen.  

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf GradeCalculatorTest → Run 'GradeCalculatorTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static String grade(int punkte)).
- Wichtig: Schreiben Sie konsequent Tests zuerst und passen Sie den Code schrittweise an.
