# Faden verloren

Android-App (Kotlin / Jetpack Compose), die unterbrochene Gedanken und „Fäden“ schnell einfängt und später wiederfindet.

## Idee (MVP)

- Gedanken in Sekunden erfassen (Text)
- Liste der erfassten Fäden
- Wiederfinden per Suche

Dieses Repo startet mit einem **minimalen Gerüst**: eine Start-Activity mit Compose-Screen (App-Name + Platzhalter „Gedanken erfassen“). Speichern, Liste und Suche folgen als nächste Schritte.

## Voraussetzungen

- [Android Studio](https://developer.android.com/studio) (Ladybug oder neuer empfohlen)
- JDK 17
- Android SDK 35 (wird von Android Studio bei Bedarf angeboten)

## Bauen und starten

1. Repo klonen:
   ```bash
   git clone https://github.com/Kreizbiggl/faden-verloren.git
   ```
2. In Android Studio: **Open** → Ordner `faden-verloren` wählen.
3. Gradle-Sync abwarten (Wrapper wird ggf. automatisch ergänzt).
4. Emulator oder Gerät wählen → **Run** (`app`).

Oder per Kommandozeile (wenn der Gradle-Wrapper vorhanden ist):

```bash
./gradlew :app:assembleDebug
./gradlew :app:installDebug
```

## Projektstruktur (kurz)

- `app/src/main/java/de/kreizbiggl/fadenverloren/` — Kotlin-Quellcode
- `app/src/main/res/` — Ressourcen (Strings, Theme)
- `app/build.gradle.kts` — App-Modul (Compose, SDK)

## Lizenz

Noch offen — bei Bedarf ergänzen.
