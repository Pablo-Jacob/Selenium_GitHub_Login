# Selenium Web Automated Test – GitHub Login (Firefox)

Este proyecto demuestra una prueba automatizada utilizando **Java + Selenium WebDriver**,
controlando el navegador **Mozilla Firefox** mediante **GeckoDriver**.

## Objetivo
Automatizar el flujo de inicio de sesión en GitHub:
1. Abrir navegador Firefox
2. Navegar a `https://github.com/login`
3. Completar usuario y contraseña
4. Presionar botón *Sign in*

---

## Tecnología Usada
- Java 8+
- Selenium WebDriver
- Mozilla Firefox
- GeckoDriver
- Maven

---

## Preparación del Entorno

### 1️⃣ Instalar dependencias
- Java JDK 8+
- Firefox Browser
- Maven
- (Opcional) IntelliJ IDEA o Eclipse

### 2️⃣ Descargar GeckoDriver
Descargar versión compatible desde:
Mozilla Releases → (link agregado en README)
Colocarlo en:
./drivers/geckodriver.exe

---

## Ejecución del Test

Si usas un IDE → presiona **Run ▶️**

Desde consola:
```bash
mvn test
```

---

## Capturas
Ejemplo – Navegador abierto automáticamente

![Prueba ejecutada](images/Captura%20de%20pantalla%202025-12-31%20181559.png)

---

## Autor

Pablo Jacob
Estudiante de Ingeniería en Sistemas y Ciencias de la Computación. Enfoque backend y automatización.