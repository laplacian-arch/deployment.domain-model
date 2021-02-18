# **MysqlContainerDeployment**
**namespace:** laplacian.arch.deployment.component.mysql

An entity describing a mysql_container_deployment.



---

## Properties

### port: `Int`
The port of this mysql_container_deployment.
- **Default Value:**
  ```kotlin
  3306
  ```

### jdbc_driver_jar: `String`
The jdbc_driver_jar of this mysql_container_deployment.
- **Default Value:**
  ```kotlin
  "mysql:mysql-connector-java:8.0.23"
  ```

### jdbc_connection_string: `String`
The jdbc_connection_string of this mysql_container_deployment.
- **Code:**
  ```kotlin
  "jdbc:mysql://${instanceName}/${databaseName}"
  ```

### jdbc_driver_class_name: `String`
The jdbc_driver_class_name of this mysql_container_deployment.
- **Default Value:**
  ```kotlin
  "com.mysql.jdbc.Driver"
  ```

## Relationships