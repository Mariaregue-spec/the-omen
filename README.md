# 🔮 The Omen

<div align="center">

### ⚡ API REST de alto rendimiento para gestionar colecciones de películas

![Java](https://img.shields.io/badge/Java-25-blue?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0-green?style=for-the-badge&logo=spring)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange?style=for-the-badge&logo=mysql)
![API](https://img.shields.io/badge/API-REST-black?style=for-the-badge)
![Status](https://img.shields.io/badge/status-production--ready-success?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-yellow?style=for-the-badge)

</div>

---

## 🎬 ¿Qué es The Omen?

En un entorno donde los datos crecen constantemente, **organizar, acceder y manipular información de forma eficiente es clave**.

**The Omen** es una API REST construida con Spring Boot que permite gestionar colecciones de películas mediante una arquitectura limpia, escalable y preparada para producción.

> ⚡ No es solo un CRUD. Es una base sólida para construir aplicaciones reales.

---

## 🚀 ¿Por qué este proyecto?

Este proyecto demuestra:

- 🧠 Diseño de arquitectura backend (Controller → Service → Repository)
- ⚙️ Implementación de API REST profesional
- 💾 Persistencia de datos con JPA + MySQL
- 🔌 Preparación para integración con frontend (CORS habilitado)

---

## ✨ Características principales

- 📽️ CRUD completo de películas  
- 🔍 Búsqueda por ID  
- 📊 Ordenamiento alfabético  
- 🌐 CORS habilitado  
- 💾 Persistencia con MySQL  
- ⚡ Arquitectura desacoplada  

---

## 🧪 Ejemplo real de respuesta

```json
{
  "id": 7,
  "titulo": "Hereditary",
  "anio": 2018,
  "rating": 7.3,
  "poster": "https://...",
  "sinopsis": "El legado de una familia se convierte en una pesadilla."
}
```
---
## 📡 API Endpoints
Base URL
http://localhost:8080

---
Endpoints disponibles

| Método | Endpoint       | Descripción                 |
| ------ | -------------- | --------------------------- |
| GET    | `/movies`      | Obtener todas las películas |
| GET    | `/movies/{id}` | Obtener película por ID     |
| GET    | `/movies/ASC`  | Obtener películas ordenadas |
| POST   | `/movies`      | Crear nueva película        |
| PUT    | `/movies/{id}` | Actualizar película         |
| DELETE | `/movies/{id}` | Eliminar película           |

---
## 🏗️ Arquitectura
Cliente → Controller → Service → Repository → Base de Datos
Flujo interno
Request → Validación → Lógica de negocio → Persistencia → Response

---

## 🛠️ Stack tecnológico
Tecnología	Rol
Java 25	Lenguaje principal
Spring Boot 4	Framework backend
MySQL 8	Base de datos
Maven	Gestión de dependencias
JPA/Hibernate	ORM

---

## ⚙️ Instalación
git clone https://github.com/Mariaregue-spec/the-omen.git
cd the-omen
Configuración

Edita:

src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/the_omen
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password

---

## ▶️ Ejecución
./mvnw spring-boot:run

API disponible en:

http://localhost:8080

---

## 🧪 Testing
./mvnw test

---

## 📁 Estructura del proyecto
src/main/java/com/inditex/the_omen/
│
├── controller/      # Endpoints REST
├── service/         # Lógica de negocio
├── repository/      # Acceso a datos
└── model/           # Entidades

---

## 🧠 Modelo de datos
Campo	Tipo
id	int
titulo	String
anio	int
rating	double
poster	String
sinopsis	String

---

## 🌐 Integración

💡 Esta API está lista para conectarse con cualquier frontend:

React
Angular
Vue
Apps móviles

---

## 📈 Posibles mejoras (Roadmap)
 Paginación
 Filtros avanzados
 Autenticación (JWT)
 Documentación con Swagger
 Deploy en la nube

 ---
 
## 🤝 Contribuciones
Fork del repo
Crea una rama (feature/nueva-feature)
Commit
Pull Request

---
## 📄 Licencia

MIT License
---
<div align="center">
🔮 The Omen
“No predice el futuro. Lo estructura.”
---
⭐ Si te ha gustado el proyecto, dale una estrella
🚀 Si eres recruiter, este proyecto demuestra capacidad backend real

</div> ```
