# Conexión Java - MariaDB (JDBC)

Este proyecto muestra un ejemplo simple de cómo conectar Java con una base de datos **MariaDB** utilizando JDBC.

## Requisitos previos

- **Java JDK** instalado.
- **MariaDB** instalado y en ejecución.
- IDE **IntelliJ IDEA**.
- Archivo **JAR** del conector de MariaDB/MySQL.

---

## Descarga del conector MariaDB/MySQL

Para que Java pueda comunicarse con MariaDB, necesitamos el **driver JDBC**.

Puedes obtenerlo de dos formas:

1. **Conector oficial de MariaDB**  
   - Descarga: [https://mariadb.com/kb/en/mariadb-connector-j/](https://mariadb.com/kb/en/mariadb-connector-j/)  
   - El archivo se llamará algo como:  
     `mariadb-java-client-x.x.x.jar`

2. **Conector de MySQL (compatible)**  
   - Descarga: [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)  
   - El archivo se llamará algo como:  
     `mysql-connector-j-x.x.x.jar`

---

## Cómo agregar el JAR al proyecto

### En IntelliJ IDEA
1. Clic derecho sobre el proyecto → **Open Module Settings**.
2. Ir a la pestaña **Libraries**.
3. Presionar el botón **+** → **Java**.
4. Seleccionar el archivo `.jar` descargado.
5. Confirmar y aplicar los cambios.

---

## Configuración en el código

En el `main`, la conexión se realiza así:

```java
String url = "jdbc:mysql://localhost:3300/pruebadb";
String user = "root";
String password = "1234";

try {
    Connection conn = DriverManager.getConnection(url, user, password);
    System.out.println("Conexión exitosa");
    conn.close();
} catch (Exception e) {
    e.printStackTrace();
}
```

### Explicación de la configuración

- **`url`**  
  - `"jdbc:mysql://localhost:3300/pruebadb"`  
  - `jdbc:mysql://` → Protocolo y subprotocolo JDBC para MySQL/MariaDB.  
  - `localhost` → Indica que la base de datos está en la misma máquina.  
  - `3300` → Puerto donde escucha MariaDB (por defecto es `3306`; aquí se usa `3300`).  
  - `pruebadb` → Nombre de la base de datos a la que te vas a conectar.

- **`user`**  
  - `"root"` → Usuario de la base de datos.

- **`password`**  
  - `"1234"` → Contraseña del usuario.

- **`DriverManager.getConnection(url, user, password)`**  
  - Método que establece la conexión a la base de datos utilizando la URL y credenciales.

- **`conn.close()`**  
  - Cierra la conexión para liberar recursos.

---

### Ejecución

1. Asegúrate de que el servidor **MariaDB** esté corriendo y que la base `pruebadb` exista.
2. Ejecuta la clase `Main` desde tu IDE o desde la terminal.
3. Si todo está correcto, verás el mensaje:
