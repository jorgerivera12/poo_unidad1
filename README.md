# Proyecto - Unidad 2: Programación Orientada a Objetos (POO)

Este proyecto Java corresponde al desarrollo de la Unidad 2 del curso de Programación Orientada a Objetos. El objetivo es aplicar los principios de **herencia**, **polimorfismo**, **agregación**, **composición** y **asociación**, usando clases audiovisuales como base.

## 🧩 Contenido

El programa simula una colección de contenidos audiovisuales como películas, series, documentales, videos de YouTube y cortometrajes. Cada clase representa un tipo distinto con atributos y comportamientos específicos.

### 🧠 Clases principales

- `ContenidoAudiovisual` (abstracta)
- `Pelicula` → incluye actores (agregación)
- `SerieDeTV` → incluye temporadas (composición)
- `Documental` → incluye investigador (asociación)
- `VideoYouTube` (subclase)
- `Cortometraje` (subclase)

### 🔄 Clases auxiliares

- `Actor`
- `Temporada`
- `Investigador`

## 💡 Conceptos implementados

| Concepto       | Implementación                                                                 |
|----------------|----------------------------------------------------------------------------------|
| Herencia       | Todas las clases heredan de `ContenidoAudiovisual`                             |
| Polimorfismo   | Método sobrescrito `mostrarDetalles()`                                          |
| Agregación     | `Pelicula` → `Actor[]` o lista de actores                                       |
| Composición    | `SerieDeTV` contiene `Temporada`                                                |
| Asociación     | `Documental` se relaciona con un `Investigador`                                |
| Subclases nuevas | `VideoYouTube`, `Cortometraje` con atributos propios                          |

## 🚀 Ejecución

### Requisitos

- Java 17+
- Eclipse IDE o Visual Studio Code con Java Extensions

### Compilar desde terminal

```bash
javac -d bin src/models/*.java src/poo/*.java
java -cp bin poo.PruebaAudioVisual
