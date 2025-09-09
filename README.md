# BicyclesApp
Bicycle App - Android Studio Project Setup Guide
This guide provides all the necessary steps and code to create the Bicycle App in Android Studio. Just follow these instructions to get the project running.

Step 1: Create a New Project
Open Android Studio.

Click on New Project.

Select the Empty Activity (Compose) template and click Next.

Configure the project:

Name: BicycleApp

Package name: com.example.bicycleapp

Language: Kotlin

Minimum SDK: API 24 or higher

Click Finish.

Step 2: Update the Gradle Build File
Replace the entire content of your app-level build.gradle.kts file (usually located at app/build.gradle.kts) with the code from the build.gradle.kts file provided below. This adds the required dependencies for Navigation and ViewModel with Compose.

Step 3: Add the Placeholder Image
In the Android Studio Project view (make sure you're on the "Android" perspective), right-click the res folder.

Go to New > Directory.

Name the directory drawable and press Enter.

Download the bicycle.png image you provided and drag-and-drop it into this new res/drawable folder.

Step 4: Create the Project Packages and Files
In the Project view, navigate to app/src/main/java/com/example/bicycleapp.

Right-click the com.example.bicycleapp package and create the following new packages:

data

navigation

ui/screens (Create ui first, then screens inside it)

viewmodel

Now, create the Kotlin files inside the appropriate packages by right-clicking the package and selecting New > Kotlin Class/File.

Copy the content from the files I've provided below into the corresponding files you've just created in Android Studio.

File and Package Structure:

app/build.gradle.kts (Update this file)

app/src/main/res/drawable/bicycle.png (Add your image here)

app/src/main/java/com/example/bicycleapp/MainActivity.kt (Update this file)

app/src/main/java/com/example/bicycleapp/data/Bicycle.kt

app/src/main/java/com/example/bicycleapp/navigation/AppNavigation.kt

app/src/main/java/com/example/bicycleapp/ui/screens/BicycleFormScreen.kt

app/src/main/java/com/example/bicycleapp/ui/screens/BicycleListScreen.kt

app/src/main/java/com/example/bicycleapp/ui/theme/Color.kt (Update this file)

app/src/main/java/com/example/bicycleapp/ui/theme/Theme.kt (Update this file)

app/src/main/java/com/example/bicycleapp/viewmodel/BicycleViewModel.kt

Step 5: Run the App
Once all the files are in place, click the Run 'app' button (the green play icon) in Android Studio to build and run the application on your emulator or connected device.

That's it! Your application should now be running.