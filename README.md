# BicyclesApp

A simple Android app to **list**, **create**, and **edit** bicycles. Built with **Kotlin** and Jetpack Compose, keeping all data **local/in-memory**.

---

## Project Setup

- **App Name:** `BicycleApp`
- **Package:** `com.example.bicycleapp`
- **Language:** `Kotlin`
- **Minimum SDK:** `24+`

> Images are **not required**. If you want a placeholder, add it at `app/src/main/res/drawable/bicycle.png`.

---

## Requirements

- Display a list of bicycles
- Create a new bicycle
- Edit an existing bicycle
- Do **not** use real images; use the provided placeholder if desired
- Works **locally only** (no backend)
- Keep it simple and clean
- Ask questions as needed & propose improvements

---

## Getting Started

1. Open the project in **Android Studio**.
2. Sync Gradle and ensure Kotlin + Compose toolchain is installed.
3. (Optional) Add `bicycle.png` at `app/src/main/res/drawable/`.
4. Run on an emulator or device (API 24+).

---

## Project Structure

app/build.gradle.kts

app/src/main/res/drawable/bicycle.png (Add your image here)

app/src/main/java/com/example/bicycleapp/MainActivity.kt (Update this file)

app/src/main/java/com/example/bicycleapp/data/Bicycle.kt

app/src/main/java/com/example/bicycleapp/navigation/AppNavigation.kt

app/src/main/java/com/example/bicycleapp/ui/screens/BicycleFormScreen.kt

app/src/main/java/com/example/bicycleapp/ui/screens/BicycleListScreen.kt

app/src/main/java/com/example/bicycleapp/ui/theme/Color.kt (Update this file)

app/src/main/java/com/example/bicycleapp/ui/theme/Theme.kt (Update this file)

app/src/main/java/com/example/bicycleapp/viewmodel/BicycleViewModel.kt