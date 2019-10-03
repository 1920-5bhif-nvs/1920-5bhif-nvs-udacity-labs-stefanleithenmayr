# Repository zum Udacity Course - Leithenmayr

# Lesson 1
## 1.1 Einführung in den Android Kurs (Welcome to developing Android Apps)
Vorrausetzungen: Android Studio, Kotlin Kenntnisse
Inhalt des Kurses: Jetpack Architektur und Android Grundlagen

## 1.2 Dice Roller
In Lektion 1.2 soll man Android Studio installieren und es wird einem erklärt das man in diesem Kurs seine eigene erste Android von Grund auf erstellen wird.

## 1.3 Installing Android Studio
In Lektion 1.3 installiert man nun Android Studio und falls nötig den Android Emulator.

## 1.4 Creating the Dice Roller Project
In Lektion 1.4 wird das Dice Roller Project angelegt. 

* Start a new Android Studio project
* Auswählen von "Empty Activity"
* Eingeben des Projektnamen: Dice Roller
* Minimum API Level ist API 19 (Android 4.4)
* Fertig

## 1.5 Running your First App
Man kann die neu erstellte App auf einem echten Android Gerät (Smartphone, Tablet) laufen lassen, oder auf einem Emulator.

## 1.6 Running your First App on an Emulator
In dieser Lektion wird gezeigt wie man einen neuen Emulator erstellt.


* AVD (Android Virtual Device) Manager öffnen
    * Im AVD Manager kann man links die verschiedenen Kategorien sehen: Fernsehr, Smartphone, Uhren, Tablets
* Create Virtual Device Button anklicken
* In der Kategorie "Phone" wird das Pixel 2 ausgewählt, welches den Play Store verfügbar hat
* Anschließend muss man eine Android API Version wählen (in diesem Fall wird 28 - PIE gewählt) und downloaden
* Nun startet man die APP im Emulator und Hello World erscheint

## 1.7 Running your First App on a Device
In dieser Lektion 1.7 wird erklärt wie man seine Android Apps auf eine echtes Gerät deployed.
(Dazu muss man in den Einstellung 7 mal auf die Buildnummer des Gerätes klicken und den USB Debugging Mode aktivieren, Verbinden mit PC)

## 1.8 Student Interview: Part 1
In dieser Lektion 1.8 werden verschiedene Menschen, die diesen Kurs absolviert haben interviewt. Der großteil war sehr begeistert und schwärmte davon das man anfangs simple Apps und später immer komplexere Apps entwickelt.

## 1.9 Main App Anatomy
In dieser Lektion 1.9 werden die verschiedenen erzeugten Ordner näher erläutert. Man sollte darauf achten, dass man im Project Ordner mit den Datein / Ordnern im Android Studio ganz oben die Option Android ausgewählt hat.

* manifest Folder (AndroidManiFest.xml mit allen Details zur App, Startpunkt,etc. wird festgelegt)
* Java Folder (two test folders and source file folder with MainActivity)
* generatedJava (automatisch generiert)
* res Folder (ressource Folder mit allen Static Kontext: Strings, Icons, Images etc.) 
* Gradle Scripts sind für das builden zuständig

## 1.10 Quiz: App Anatomy
Ist ein Quiz über Lektion 1.10

## 1.11 Activity and Layout
Zu einer Activity Kotlin Klasse gehört ein XML - File, wo das Layout der Activity "beschrieben" ist. Eine Activity ist eine Bildschirm - Seite in einer Android App.
</br>Vereinfacht gesagt ist in der XML Datei das Layout und in der Kotlin Klasse die Logik und was die App macht. Diese beiden Files sind miteinander über Layout Inflation verbunden.
Die "Inflation im Android Kontext ist das Parsen einer XML Datei in UI- orientierte Daten Strukturen.

## 1.12 Exercise: Hello Android
In dieser Lektion 1.12 wird der Text von "Hello World" zu "Hello Android" umgeschrieben.
Weiteres wird etwas detailierter auf die View Elemente und Tags eingegangen.

## 1.13 Adding the Button
In dieser Lektion 1.13 wird gezeigt wie man einen Button zu der Android App hinzufügt.
* android:layout_width="match_parent" - sagt aus das sich das Element an sein Root Element anpasst (beim äußeren LinearLayout ist es der Bildschirm)
* android:layout_height="wrap_content" - sagt aus das die Höhe des Layout exakt so hoch wie der Content innerhalb des Elementes ist
* android:orientation="vertical" - sagt aus das die Elemente unter einander angeordnet werden (Buttons,etc.), Gegenteil wäre horizontal (nebeneinander)
* android:layout_gravity="center_vertical" Anordnung des Elements mittig
* Hardcoded Strings im XML File sollten in ein eigenes String Ressource File ausgelagert werden (Bessere um mehrere Sprachen anzubieten und Veränderungen der strings einfacher und dynamischer zu gestalten)

## 1.14 Exercise: Adding the Button
In dieser Lektion 1.14 muss man das Tutorial von 1.14 nun selber machen.

## 1.15 Connecting the Button
Als nächstes wird der Button mit der Activity Kotlin Klasse verbunden, wie das grob funktioniert wird in dieser Lektion näher erklärt.
* Wenn man einem Button eine Id gibt, wird diese Id im R File abgespeichert und kann mittels `findViewById(R.id.roll_button)` den Button finden

## 1.16 Exercise: findViewById
In dieser Übung wird der Text des Buttons dynamisch über die Kotlin Klasse verändert.

## 1.17 Exercise: OnClickListener
In dieser Übung wird im Kotlin Code auf einen Button Klick reagiert und ein Toast (Push Benachrichtigung) ausgegeben.

## 1.18 Exercise: Change the Text
In dieser Übung wird nun eine Random Zahl mit Hilfe von der Klasse Random zwischen 1 und 6 erzeugt.

## 1.19 Dice Images
Einführung in die nächste Übung, in welcher wir die Random erzeugten Zahlen nun in Images umwandeln. (`val randomInt = Random().nextInt(6) + 1`)

## 1.20 Exercise: Adding the Image Resource
In dieser Übung werden die Images eingebunden in den drawable Folder des Projekts.

## 1.21 Exercise: Adding the ImageView
In dieser Übung werden die Zahlen nun durch Images ersetzt, mit einer when expression.