![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧳 Sistema de Gestión – Llanquihue Tour

## 👤 Autor del proyecto
- **Nombre completo:** Daniela Herrera Villalobos
- **Asignatura:** Desarrollo Orientado a Objetos I
- **Carrera:** Analista programador computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Semana 3 – Experiencia de Aprendizaje 1 de la asignatura Desarrollo Orientado a Objetos I. Consiste en un sistema en Java para gestionar las personas de Llanquihue Tour, una agencia de turismo de la Región de Los Lagos.
El sistema modela clientes y empleados aplicando encapsulamiento, composición y herencia.

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

2. Abre el proyecto en IntelliJ IDEA.

4. Ejecuta el archivo `Main.java` desde el paquete `app`:
   
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
