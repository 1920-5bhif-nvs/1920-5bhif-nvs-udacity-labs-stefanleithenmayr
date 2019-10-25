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

## 1.22 Student Interview: Part 2
In dieser Lektion 1.22 werden wieder Kurs Absolventen interviewt, wie es Ihnen bei den ersten Schritten mit Android ging. (Einer erwähnte das die Android Dokumentation sehr gut ist)

## 1.23 Exercise: Finding Views Efficiently
In dieser Lektion 1.23 wird sich um effizienten und leserlichen Code gekümmert. findViewById ist sehr performancelastig. (Besser man erstellt lokale Variablen auf die Views). Dabei wird das Kotlin Keyword `lateinit` verwendet, welches sicherstellt das vor dem ersten Aufruf der Variable ein Wert zugewissen wird und somit nicht null ist.

## 1.24 Namespaces
Es gibt in der XML Datei (View) verschiedene Namespaces. Zum Beispiel wenn man jetzt in der Preview ein Foto angezeigt haben möchte, aber später in der echten Android App nicht mehr kann man den Namespace tools verwenden (`tools:src="@drawable/dice_1"`), welcher nur für die Preview gedacht ist.

## 1.25 Introduction to Gradle
Gradle ist das Build Tool von Android. Ist verantwortlich für das Kompilieren, Dependencies hinzufügen, Automated Tests, ... Am Schluss kommt ein APK File heraus. Es gibt verschiedene Module, welches jedes ein eigenes Gradle File besitzt.

## 1.26 Build.gradle
Repository in Gradle ist ein externer Server, wo die Librarys heruntergeladen werden. In dem build.gradle im App Ordner werden die Grundlegenden Dinge des Projektes festgelegt. ApplicationId ist die Id, mit welcher Google die Applikation identifziert. (Es darf maximal eine App mit der selben ApplicationId auf einem Gerät installiert werden, muss eindeutig sein).

## 1.27 Android Compatibility
Android ist auf vielen verschiedenen Geräten verfügbar. (Tablets, Smartphones, Fernsehr, Uhren). API - Level sind dafür wichtig. Umso niedriger das API - Level, desto mehr Geräte können die APP benutzen. Man kann innerhalb im Code checken, welche Android Version verwendet wird. Die Wahl des API - Levels sollte gut bedacht werden. AndroidX ist Namespace von Android JetPack.

## 1.28 Exercise: Vector Drawables
Vektorimages (in diesem Fall die Würfelseiten) sind als Vektorformat erst mit dem API - Level 21 verfügbar. Gradle macht aber einfach bei Geräten mit dem API - Level darunter ein png File daraus, was mehr Speicherplatz benötigt. Abhilfe, das man diese PNG Files nicht hinzufügen muss ist (`vectorDrawables.useSupportLibrary = true`). Weiteres verwendet man im Layout den App Namespace, welcher nicht von dem Android Framework direkt kommt. (`xmlns:app="http://schemas.android.com/apk/res-auto"`)

## 1.29 Recap
In dieser kurzen Lektion wird die erste Lesson zusammengefasst.

# Lesson 2
## Leson 2.1 Art with Aleks
Die Lektion 2.1 ist nur eine kurze Einführung. Im groben geht es um Constraintlayouts, und was man damit machen kann (Horizontale und Vertikale Anordnung von Elementen).

## 2.2 Introduction
Die Lektion 2.2 ist eine weitere Einführung, um was es geht in dieser Lesson, nämlich Layouts. Weiteres wird es um Databinding gehen.

## 2.3 View Groups & View Hierarchy
Alle Element leiten von der View Klasse ab, welche eine Höhe, eine Breite und einen Hintergrund haben. (Beispiel. Textview, Button, Colour Pickers, etc.) Man kann auch seine eigene Custom View implementieren.
Einheit: `Density Independent Pixel (dp)` (automatische Konvertierung auf Android Geräten). Layouts fassen mehrere Views zusammen. Umso mehr Layouts man hat umso schlechter ist die Performance.

## 2.4 Exercise: Create the AboutMe Project
In dieser Lektion wird lediglich das neue Projekt "AboutMe" angelegt.

## 2.5 Exercise: Create the Layout File
In dieser Lektion wird das Android Layout File mit Hilfe von Android Studio erstellt. Layout Files werden im res/layout Ordner gespeichert. Um ein neues Layout File hinzuzufügen klickt man auf den res Ordner mit der rechten Maustaste und wählt New/Android Resource File. Anschließend vergibt man einen Namen und wählt unter Resource type Layout aus.

## 2.6 Layout Editor Basics
In dieser Lektion wird der visuelle Designer zum Erstellen von View gezeigt und die Basics erklärt. In der Component Tree werden alle Elemente (Kind + Eltern Element angezeigt). Abschließend gibt es ein kleines Quiz.

## 2.7 Adding a TextView
In der Lektion 2.7 wird ein TextView Element zum xml File hinzugefügt. Anschließend werden einige Attribute gesetzt, wie zum Beispiel eine ID, oder es wird gezeigt wie man den Text nicht als hardgecodeden String in das XML File schreibt sondern ein extra string ressource file anlegt.

## 2.8 Styling a TextView
In dieser Sektion wird die TextView mit Hilfe von Padding ausgerichtet.Padding zwischen Content und Border. Margin ist außerhalb der Border. Weiteres wird ein anderes Font eingestellt (Roboto Font - Regular). Weiteres wird gezeigt wie man den Style eines Layout extrahieren kann. Rechtsklick auf eine View Komponente - Refactor - Extract Style

## 2.9 Exercise: Add a TextView, ImageView, and Styling
In dieser Lektion wird ein ImageView eingefügt.

## 2.10 Exercise: Add a ScrollView
Als nächstes werden einige persönliche Informationen hinzugefügt, wo es nicht schlecht wäre, wenn man scrollen könnte. In Android gibt es dafür eine ScrollView, bei welcher man maximal ein Unterlayout hinzufügen kann. 

## 2.11 Adding an EditText for Text Input
Als nächstes wird zu dieser App ein User Input hinzufügt, in Form einer Plain Text Box. Anschließend wird die Validierung hergezeigt und das man einen Hint (Tipp) vergeben kann.

## 2.12 Adding a Done Button to Accept Text Input
In dieser Lektion wird ein neuer Button hinzugefügt und gestylt.

## 2.13 Exercise: Add EditText, Done Button, ClickHandler
In dieser Lektion wird der Button regestriert und welche Logik anschließend ausgeführt werden soll. `findViewById<Button>(R.id.done_button).setOnClickListener {
   addNickname(it)
}` - so kann man einen Button regestrieren.

## 2.14 Data Binding
Das direkte zugreifen auf ein Element mittels findViewById kann in großen komplexen Projekten zu Performance Problemen führen. Um das zu vermeiden kann man mit Hilfe von Data Binding, sogenannte Binding Objekte zur Laufzeit erstellen lassen.

## 2.15 Data Binding: Views
Data Binding muss erstmals aktiviert werden im build.gradle File. Dazu `dataBinding {
        enabled = true
    }` einfügen. Anschließend synct man das Projekt einmal. Nun wird zum Layout ein laout Tag hinzugefügt. Anschließend kann man in der MainActivity Kotlin Klasse ein Binding Objekt erstellen: `private lateinit var binding: ActivityMainBinding`

## 2.16 Data Binding: Data
Data Binding macht den Code lesbarer und performanter. In dieser Lektion wird das erste mal gezeigt wie man in Kotlin eine Data Klasse anlegt.
Data - Block im Layout File:
    `<data>
        <variable
                name="myName"
                type="com.example.aboutme.MyName" />
    </data>`

## 2.17 Exercise: Implement Data Binding
In dieser Lektion wird das gelernte aus den letzten Lektionen nun am Projekt umgesetzt.

## 2.18 Google Interview: John Hoford and Nicolas Roard
In dieser Lektion werden wieder Interviews durchgeführt.

## 2.19 Constraint Layout: ColorMyViews App
Was ist ein Constraint? - Ein Constraint ist eine Verbindung oder eine Ausrichtung zu einem anderen UI - Element, zum Eltern - Layout oder zu einer unsichtbaren (Richt-)Linie. Constraint - Layout haben viele Vorteile: Responsive, Optimiert, Free-Form

## 2.20 Creating ColorMyViews Project
In dieser Lektion wird das ColorMyViews Projekt angelegt.

## 2.21 Exercise: Create ColorMyViews Project and One Box
Als erstes werden in dem neuen Projekt, im Layout File - Autoconnect ausgeschaltet. (im Designer - auf das Hufeisensymbol klicken) - da die Constraints manuell hinzugefügt werden. Weiteres werden noch einige Adaptierungen durchgeführt und gezeigt wie man die Display - Auflösung umstellen kann.

## 2.22 Constraints
In dieser Lektion wird nochmals etwas näher auf Constraints eingegangen. In der absoluten Position wird mit layout_margin gearbeitet. Relative Margins sind immer besser (responsive).

## 2.23 Ratios
In dieser Lektion geht es um Verhältnisse. (Zum Beispiel: Höhe ist 2 zu 1 zur Breite) Somit muss man keine Höhen und Breiten hard codieren.

## 2.24 Chaining
Chaines verbinden horizontale oder vertikale Views. Ein Spread Chain lasst zwischen den View Elementen immer gleich viel Abstand. A Spread Inside Chain, nutzt den ganzen Platz aus. Weighted Chain füllt den ganzen Platz mit den Views aus. Packed Chain with Bios ist so kompakt wie möglich.

## 2.25 - Adding Box Two Below Box One
In dieser Übung, werden nun zum Miniprojekt zwei Constraints hinzugefügt.

## 2.26 - Adding Three Aligned Boxes
Nun werden drei Constraints und Chains hinzugefügt, mit 3 weiteren Textboxen.

## 2.27 - Exercise: Add Aligned Boxes with Click Handlers
In dieser Lektion werden zu den Buttons nun Klick Event Handler hinzugefügt. Wird einer dieser geklickt wird er farbig angezeigt.

## 2.28 - Baseline Constraint
In dieser Lektion wird gezeigt wie man Baseline Constraints hinzufügt. Weiteres werden zwei neue Textboxen hinzugefügt.
 
 ## 2.29 - Exercise: Add Baseline Constraint and Button Chain
 Abschließend werden noch Buttons mit Event Handlern hinzugefügt, um die Boxes mit den Buttons einzufärben.

 ## 2.30 - Where to Go Next?
 Nun ist die Design - Lektion zu Ende.

 # Lesson 3
 ## 3.1 - The Guide and the Traveler
 Einführungsvideo: Um was geht es in der Lektion.

 ## 3.2 - Android Navigation Patterns
 In diesem Video wird die App erklärt, wobei mehrere Views erstellt werden. Hauptsächlich geht es um Navigation.

 ## 3.3 - Quiz: Navigation Terms
 Quiz!

 ## 3.4 - Fragments
 In Android 3.0 Honeycomb wurden Fragments eingeführt. Eine Activity enthält UI Fragments. Ein Fragment ist eine View innerhalb einer Activity. Man kann zwischen Activities oder auch Fragmenten innerhalb einer Activity navigieren. Die Activites werden im Back Stack gespeichert. Es gibt auch einen Fragment Back Stack (Fragment Manager). Man kann beide kombinieren.

 ## 3.5 - Quiz: Fragment Basics
 Quiz!