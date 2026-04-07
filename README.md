# 🎬 The Omen - API de Películas

<div align="center">

![Java](https://img.shields.io/badge/Java-25-blue.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0-green.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Licencia](https://img.shields.io/badge/Licencia-MIT-yellow.svg?style=for-the-badge)

*Una API REST para gestionar tu colección personal de películas*

</div>

---

## 📋 Tabla de Contenidos

- [Acerca de](#acerca-de)
- [Características](#características)
- [Tecnologías](#tecnologías)
- [Endpoints de la API](#endpoints-de-la-api)
- [Primeros Pasos](#primeros-pasos)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Licencia](#licencia)

---

## 🎯 Acerca de

**The Omen** es una API REST construida con Spring Boot que te permite gestionar una colección personal de películas. Ofrece operaciones CRUD completas, incluyendo funcionalidades como ordenamiento, búsqueda por ID y más.

> *"La única cosa que debemos temer es temer perdernos una gran película."*

---

## ✨ Características

| Característica | Descripción |
|----------------|-------------|
| 📽️ **Operaciones CRUD** | Crear, Leer, Actualizar y Eliminar películas |
| 🔍 **Buscar por ID** | Recuperar películas específicas por su identificador |
| 📊 **Ordenamiento** | Obtener películas ordenadas alfabéticamente por título |
| 🌐 **CORS Habilitado** | Listo para integración con frontend |
| 💾 **Almacenamiento Persistente** | Base de datos MySQL para almacenamiento confiable |

---

## 🛠️ Tecnologías

<div align="center">

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="24" height="24"> Java | 25 | Lenguaje de Programación |
| <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="24" height="24"> Spring Boot | 4.0 | Framework Backend |
| <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" width="24" height="24"> MySQL | 8.0 | Base de Datos |
| <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="24" height="24"> Maven | - | Herramienta de Construcción |
| <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" width="24" height="24"> IntelliJ IDEA | - | IDE |

</div>

### Dependencias

- `spring-boot-starter-data-jpa` - Acceso a base de datos con JPA
- `spring-boot-starter-webmvc` - Soporte para API REST
- `mysql-connector-j` - Driver JDBC de MySQL
- `spring-boot-devtools` - Herramientas de desarrollo

---

## 📡 Endpoints de la API

### URL Base
```
http://localhost:8080
```

### Endpoints

| Método | Endpoint | Descripción | Cuerpo de Solicitud |
|--------|----------|-------------|---------------------|
| `GET` | `/movies` | Obtener todas las películas | - |
| `GET` | `/movies/{id}` | Obtener película por ID | - |
| `GET` | `/movies/ASC` | Obtener películas ordenadas alfabéticamente | - |
| `POST` | `/movies` | Crear una nueva película | ✅ |
| `PUT` | `/movies/{id}` | Actualizar una película | ✅ |
| `DELETE` | `/movies/{id}` | Eliminar una película | - |

### Ejemplo de Cuerpo de Solicitud

```json
{
  "titulo": "El Conjuro",
  "anio": 2013,
  "rating": 7.8,
  "poster": "https://ejemplo.com/poster.jpg",
  "sinopsis": "Una familia es aterrorizada por un demonio ancestral."
}
```

### Ejemplo de Respuesta

```json
{
  "id": 1,
  "titulo": "El Conjuro",
  "anio": 2013,
  "rating": 7.8,
  "poster": "https://ejemplo.com/poster.jpg",
  "sinopsis": "Una familia es aterrorizada por un demonio ancestral."
}
```

### Códigos de Estado HTTP

| Código | Estado | Descripción |
|--------|--------|-------------|
| `200` | OK | Solicitud exitosa |
| `201` | CREADO | Película creada exitosamente |
| `302` | ENCONTRADO | Película encontrada |
| `404` | NO ENCONTRADO | Película no encontrada |

---

## 🚀 Primeros Pasos

### Requisitos Previos

- Java 25 o superior
- Maven 3.6+
- MySQL 8.0+
- Tu IDE favorito (IntelliJ IDEA recomendado)

### Instalación

1. **Clonar el repositorio**
```bash
git clone https://github.com/tu-usuario/the-omen.git
cd the-omen
```

2. **Configurar la base de datos**

Actualiza `src/main/resources/application.properties` con tus credenciales de MySQL:

```properties
spring.application.name=the-omen
server.port=8080

# Configuración MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/the_omen?createDatabaseIfNotExist=true
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Configuración JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

3. **Compilar el proyecto**
```bash
./mvnw clean install
```

4. **Ejecutar la aplicación**
```bash
./mvnw spring-boot:run
```

La API estará disponible en `http://localhost:8080`

---

## 📁 Estructura del Proyecto

```
the-omen/
├── src/
│   └── main/
│       ├── java/com/inditex/the_omen/
│       │   ├── TheOmenApplication.java          # Punto de entrada
│       │   ├── controller/
│       │   │   └── MovieController.java        # Endpoints REST
│       │   ├── model/
│       │   │   └── Movie.java                   # Entidad Película
│       │   ├── repository/
│       │   │   └── MovieRepository.java         # Capa de acceso a datos
│       │   └── service/
│       │       └── MovieService.java            # Lógica de negocio
│       └── resources/
│           └── application.properties           # Configuración
├── pom.xml                                      # Dependencias Maven
└── README.md                                    # Este archivo
```

### Arquitectura

```
┌─────────────────────────────────────────────────────────┐
│                     Solicitud del Cliente                 │
└─────────────────────────┬───────────────────────────────┘
                          │
                          ▼
┌─────────────────────────────────────────────────────────┐
│                   MovieController                         │
│                   (Endpoints REST)                        │
└─────────────────────────┬───────────────────────────────┘
                          │
                          ▼
┌─────────────────────────────────────────────────────────┐
│                    MovieService                          │
│                   (Lógica de Negocio)                    │
└─────────────────────────┬───────────────────────────────┘
                          │
                          ▼
┌─────────────────────────────────────────────────────────┐
│                  MovieRepository                         │
│                    (Repositorio JPA)                     │
└─────────────────────────┬───────────────────────────────┘
                          │
                          ▼
┌─────────────────────────────────────────────────────────┐
│                        MySQL                              │
│                    (Base de Datos)                        │
└─────────────────────────────────────────────────────────┘
```

---

## 🔧 Desarrollo

### Ejecutar Pruebas
```bash
./mvnw test
```

### Compilar para Producción
```bash
./mvnw clean package -DskipTests
```

---

## 📝 Modelo de Película

| Campo | Tipo | Descripción |
|-------|------|-------------|
| `id` | int | Identificador único (auto-generado) |
| `titulo` | String | Título de la película |
| `anio` | int | Año de lanzamiento |
| `rating` | double | Puntuación de la película (0-10) |
| `poster` | String | URL de la imagen del póster |
| `sinopsis` | String | Sinopsis/descripción de la película |

---

## 🌟 Ejemplos de Uso de la API

### Crear una Película
```bash
curl -X POST http://localhost:8080/movies ^
  -H "Content-Type: application/json" ^
  -d "{\"titulo\":\"El Exorcista\",\"anio\":1973,\"rating\":8.1,\"poster\":\"url\",\"sinopsis\":\"Descripción\"}"
```

### Obtener Todas las Películas
```bash
curl http://localhost:8080/movies
```

### Obtener Película por ID
```bash
curl http://localhost:8080/movies/1
```

### Actualizar una Película
```bash
curl -X PUT http://localhost:8080/movies/1 ^
  -H "Content-Type: application/json" ^
  -d "{\"titulo\":\"Título Actualizado\",\"anio\":2024,\"rating\":9.0,\"poster\":\"url\",\"sinopsis\":\"Nueva descripción\"}"
```

### Eliminar una Película
```bash
curl -X DELETE http://localhost:8080/movies/1
```

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

---

<div align="center">

**Hecho con ☕ y 🎬 por María Regueiro**

*¡Dale una estrella si te resulta útil!*

</div>
