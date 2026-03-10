# CConversor_Monedas_Desafio_Alura

## Descripción

Este proyecto es un **conversor de monedas** desarrollado en Java que permite a los usuarios convertir entre distintas monedas utilizando datos en tiempo real desde la API [ExchangeRate-API](https://www.exchangerate-api.com/). Además, mantiene un **historial de conversiones** realizadas durante la ejecución del programa para referencia futura.

El objetivo del proyecto es **practicar Programación Orientada a Objetos (POO), consumo de APIs, manejo de listas y arrays, y buenas prácticas en Java**,aplicando todo lo aprendido en el curso de Alura.

---

## Características

- Conversión entre monedas:
  - USD a CLP
  - USD a ARS
  - ARS a USD
  - BRL a USD
  - USD a EUR
  - EUR a USD
- Visualización del historial de conversiones realizadas.
- Resultados legibles y con formato adecuado para el usuario.
- Manejo de excepciones al consumir la API.
- Posibilidad de ampliar funcionalidades futuras (más monedas, registros con timestamp, historial persistente).

---

## Tecnologías

- Java 17+
- Librería [Gson](https://github.com/google/gson) para el parseo de JSON.
- API utilizada: [ExchangeRate-API](https://www.exchangerate-api.com/)
- Git y GitHub para control de versiones y repositorio remoto.
- IDE recomendado: IntelliJ IDEA

---

## Estructura del proyecto

ConversorDeMonedasJava/
├── src/
│ └── com/conversor/
│ ├── Main.java
│ ├── Conversor.java
│ └── ConsultarAPI.java
├── .gitignore
├── ConversorDeMonedasJava.iml
└── README.md

### Clases principales

- Main.java: clase que contiene el menú principal y la lógica de interacción con el usuario.
- Conversor.java: clase modelo que representa una conversión de moneda, con atributos, getters, setters y método `toString()`.
- ConsultarAPI.java: clase que realiza las consultas a la API para obtener las tasas de conversión en tiempo real.

---

## Cómo usar el proyecto

1. **Clonar el repositorio**
2. git clone https://github.com/VictoriaGrageda/Conversor_Monedas_Desafio_Alura.git
   cd Conversor-monedas-Java-Alura

2.-Abrir el proyecto en IntelliJ IDEA

Seleccionar la carpeta raíz del proyecto.

Asegurarse de que la librería Gson esté incluida en las dependencias.

Ejecutar el programa

Ejecutar la clase Main.java.

Elegir la opción de conversión deseada o consultar el historial de conversiones.

Menú de ejemplo

--- Conversor de Monedas ---

1. USD a CLP
2. USD a ARS
3. ARS a USD
4. BRL a USD
5. USD a EUR
6. EUR a USD
7. Salir
8. Historial de conversiones
   Ingrese una opción:

Ejemplo de uso:

Ingrese una opción: 1
Ingrese el monto a convertir: 500
Resultado: 500 USD = 469656.75 CLP

Ingrese una opción: 8
--- Historial de Conversiones ---
500 USD = 469656.75 CLP

Mejoras futuras

Guardar el historial en un archivo .txt para mantenerlo entre ejecuciones.

Agregar soporte para más monedas y conversiones.

Incluir fecha y hora en cada registro usando java.time.

Mostrar resultados con símbolos monetarios.

Implementar una interfaz gráfica con JavaFX o Swing.

Autor

VictoriaGrageda - Proyecto realizado como parte del curso de Java en Alura.
