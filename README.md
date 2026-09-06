# Faden verloren

Android-App (Kotlin / Jetpack Compose), die unterbrochene Gedanken und „Fäden“ schnell einfängt und später wiederfindet.

## Idee (MVP)

- Gedanken in Sekunden erfassen (Text)
- Liste der erfassten Fäden (lokal per Room/SQLite)
- Wiederfinden per Suche *(noch offen)*

## Aktueller Stand

- Start-Screen mit Textfeld und **Speichern**
- Persistenz lokal (Room), Liste neueste zuerst
- Suche, Löschen, Sync, Store: noch nicht

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

- `app/.../data/` — Room: `Faden`, Dao, Datenbank
- `app/.../MainActivity.kt` — Erfassen + Liste
- `app/.../FadenViewModel.kt` — Speichern / Beobachten

## Lizenz

Noch offen — bei Bedarf ergänzen.
