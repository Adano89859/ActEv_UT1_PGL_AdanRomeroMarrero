# 📱 AppContador_UT1

**Autor:** Adán Romero Marrero  
**Fecha:** 16/10/2025  
**Versión Android:** targetSdk 34  
**Tecnología:** Jetpack Compose (Kotlin)

---

## 🧠 Tecnología elegida y por qué
He elegido **Jetpack Compose (Kotlin)** porque ya había trabajado previamente con esta tecnología y me resultó más intuitiva para probar y testear el lenguaje **Kotlin**. Compose permite crear interfaces de forma declarativa, con menos código y una integración directa entre la vista y la lógica.

---

## ⚙️ Configuración del entorno y ejecución
1. Instalé **Android Studio Ladybug o superior**.
2. Creé un nuevo proyecto con plantilla **Empty Activity (Compose)**.
3. Configuración inicial:
    - **Language:** Kotlin
    - **Minimum SDK:** API 24 (Android 7.0 Nougat)
    - Activadas las opciones **Use Kotlin** y **Use Jetpack Compose**
4. Ejecución en el emulador **Medium Phone API 36.1** (configuración por defecto).
5. La app se ejecuta correctamente mostrando el contador y respondiendo a las acciones de los botones.

---

## 📂 Estructura del proyecto

app/
├── manifests/
│ └── AndroidManifest.xml
├── kotlin+java/
│ └── com.example.actev_ut1_pgl/
│ ├── MainActivity.kt
│ └── ui.theme/
│ ├── Color.kt
│ ├── Theme.kt
│ └── Type.kt
├── res/
│ ├── drawable/
│ ├── layout/
│ ├── mipmap/
│ └── values/
└── Gradle Scripts/

**Descripción de archivos principales:**
- `MainActivity.kt`: contiene la función `ContadorApp()` con el contador, botones y el mensaje de felicitación.
- `ui.theme/`: define los colores, tipografía y estilo del tema visual.
- `AndroidManifest.xml`: declara la actividad principal y configuraciones básicas del proyecto.
- `build.gradle`: dependencias y versiones del SDK de Android y Compose.

---

## 🚀 Perfil de despliegue
- **targetSdk:** 34
- **Dispositivo/emulador:** Medium Phone API 36.1
- **Resolución:** 1080x2400 px
- **Densidad:** xxhdpi
- **Modo de ejecución:** Emulador de Android Studio

---

## 📲 Funcionamiento de la app
La aplicación muestra un contador inicializado en **0** y tres botones:
- **"+"** para incrementar el contador.
- **"−"** para disminuirlo.
- **"Reset"** para volver a cero.

Al alcanzar el valor **10**, aparece un mensaje de felicitación:  
Se llegó al número 10. Meta alcanzada

---

## 🧩 Conclusión y limitaciones
Esta actividad me permitió aprender a configurar un proyecto en **Jetpack Compose**, usar `@Composable` y `remember { mutableStateOf() }`, y entender cómo combinar la lógica y la vista dentro de un mismo archivo.

El principal desafío fue **comprender y aplicar correctamente los componentes de Compose**, como `Text`, `Spacer` y `Button`, así como encontrar los **atributos y modificadores** adecuados para que la aplicación se mostrara correctamente.

En el futuro, podría mejorar el diseño visual, añadir animaciones y ajustar la disposición de los elementos para lograr una experiencia más profesional.

---

📂 **Repositorio GitHub:**  
[https://github.com/Adano89859/ActEv_UT1_PGL_AdanRomeroMarrero](https://github.com/Adano89859/ActEv_UT1_PGL_AdanRomeroMarrero)
