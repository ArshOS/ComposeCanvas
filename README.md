# Jetpack Compose Canvas API Examples

A hands-on collection of basic to intermediate usage examples of the **Jetpack Compose Canvas API** in Android. This repository is designed for learning and demonstrating how to recreate popular app logos and custom UI graphics using Compose drawing primitives.

---

## App Logos & Canvas Features Demonstrated

This project showcases step-by-step implementations of famous app logos using pure Jetpack Compose `Canvas` primitives and native Android canvas interoperability:

| Logo | Canvas Concepts & APIs Used | Source File |
| :--- | :--- | :--- |
| **Instagram** | `drawRoundRect`, `drawCircle`, `Brush.linearGradient`, `Stroke` | [`instagram.kt`](app/src/main/java/com/example/myapplication/logo/logos/instagram.kt) |
| **Facebook** | `drawRoundRect`, `nativeCanvas.drawText`, `Paint`, `toArgb()` | [`facebook.kt`](app/src/main/java/com/example/myapplication/logo/logos/facebook.kt) |
| **Messenger** | `drawOval`, `drawPath`, `Path` (`moveTo`, `lineTo`, `close()`) | [`messanger.kt`](app/src/main/java/com/example/myapplication/logo/logos/messanger.kt) |
| **Google Photos** | `drawArc`, `Offset`, `Size`, `startAngle`, `sweepAngle`, `useCenter = true` | [`googlePhotos.kt`](app/src/main/java/com/example/myapplication/logo/logos/googlePhotos.kt) |
| **Weather** | `drawRoundRect`, `drawCircle`, `drawPath`, `cubicTo` (Cubic Bézier curves), `Brush.verticalGradient` | [`weather.kt`](app/src/main/java/com/example/myapplication/logo/logos/weather.kt) |

---

## Key Concepts Covered

1. **Basic Shapes & Styling**:
   - Rounded rectangles (`drawRoundRect`), circles (`drawCircle`), and ovals (`drawOval`).
   - Controlling fill vs. stroke with `Stroke(width = ...)` vs `Fill`.

2. **Gradients & Color Brushes**:
   - `Brush.linearGradient` for multi-color linear transitions (e.g., Instagram border/circle).
   - `Brush.verticalGradient` for vertical color fills (e.g., Weather background card).

3. **Arcs & Rotations**:
   - `drawArc` for drawing circular pie slices and quadrants using angles and offsets (e.g., Google Photos pinwheel).

4. **Custom Paths & Curves**:
   - `Path()` with `moveTo`, `lineTo`, and `close()` for custom polygons (e.g., Messenger speech tail & lightning bolt).
   - Smooth Bézier curves using `cubicTo()` with control points (e.g., Weather cloud shape).

5. **Native Canvas Interoperability**:
   - Interfacing with Android's native `android.graphics.Canvas` via `drawContext.canvas.nativeCanvas` and `android.graphics.Paint` to render custom typography.

---

## Project Architecture

```text
com.example.myapplication/
├── MainActivity.kt               # Main entry point using Compose Scaffold & Edge-to-Edge
├── logo/
│   ├── LogosScreen.kt            # LazyColumn displaying all canvas logo items
│   └── logos/
│       ├── facebook.kt           # Facebook logo implementation
│       ├── googlePhotos.kt       # Google Photos logo implementation
│       ├── instagram.kt          # Instagram logo implementation
│       ├── messanger.kt          # Messenger logo implementation
│       └── weather.kt            # Weather icon implementation with Bézier curves
└── ui/theme/                     # Color, Typography, and Material3 Theme configuration
```

---

## Prerequisites

- **Android Studio** (Ladybug or newer recommended)
- **JDK 17** or higher
- **Android SDK**: `minSdk 24`, `compileSdk 35+` / `targetSdk 35+`

---

## Previews
Every logo composable contains a `@Preview` annotation, allowing you to inspect and modify individual shapes directly within Android Studio's Design / Split view without running the app.
