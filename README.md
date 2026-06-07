![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧳 Sistema de Gestión – Llanquihue Tour

## 👤 Autor del proyecto
- **Nombre completo:** Daniela Herrera Villalobos
- **Asignatura:** Desarrollo Orientado a Objetos I
- **Carrera:** Analista programador computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la **Semana 3 – Experiencia de Aprendizaje 1** de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema orientado a objetos desarrollado en Java, cuyo objetivo es modelar y gestionar las personas vinculadas a **Llanquihue Tour**, una agencia de turismo ubicada en la comuna de Llanquihue, Región de Los Lagos.

El sistema representa entidades clave como clientes y empleados, aplicando los principios de **encapsulamiento**, **composición** y **herencia**, con el fin de digitalizar y estructurar los procesos internos de la agencia que actualmente se gestionan de forma manual.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/        # Clase principal con el método main (Main.java)
└── model/      # Clases de dominio (Direccion, Persona, Empleado)
```

### Descripción de las clases

| Clase | Paquete | Descripción |
|---|---|---|
| `Direccion` | `model` | Clase de composición que representa la dirección física de una persona |
| `Persona` | `model` | Clase base con atributos comunes: nombre, RUT, email y dirección |
| `Empleado` | `model` | Hereda de `Persona` y agrega cargo y salario |
| `Main` | `app` | Clase principal que instancia objetos y muestra resultados por consola |

### Relaciones entre clases

- **Composición:** `Persona` contiene un objeto `Direccion` como atributo.
- **Herencia:** `Empleado` extiende `Persona`, reutilizando sus atributos y métodos.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/danielaherrerav/LlanquihueTour.git
```

2. Abre el proyecto en **IntelliJ IDEA** (`File > Open` → selecciona la carpeta del proyecto).

3. Verifica que el JDK esté configurado correctamente: `File > Project Structure > SDK`.

4. Ejecuta el archivo `Main.java` desde el paquete `app`:
   - Clic derecho sobre `Main.java` → **Run 'Main'**

5. Observa los resultados en la consola. Ejemplo de salida esperada:

```
****** CLIENTE ******
~Nombre: Daniela Herrera
~Rut: 18.694.730-4
~Email: dherrerav.94@gmail.com
~Dirección: General Freire 0627, La Cisterna, Santiago

****** EMPLEADO ******
~Nombre: Juan Perez
~Rut: 10.123.456-5
~Email: juan.perez@gmail.com
~Dirección: Mexico 541, Recoleta, Santiago
~Cargo: Guia Turistico
~Sueldo: $800000.0
```

---

**Repositorio GitHub:** https://github.com/danielaherrerav/LlanquihueTour.git  
**Fecha de entrega:** [06/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I
