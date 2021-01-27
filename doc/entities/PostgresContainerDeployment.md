# **PostgresContainerDeployment**
**namespace:** laplacian.arch.deployment.component.postgres

An entity describing a postgres_container_deployment.



---

## Properties

### port: `Int`
The port of this postgres_container_deployment.
- **Default Value:**
  ```kotlin
  5432
  ```

### jdbc_driver_jar: `String`
The jdbc_driver_jar of this postgres_container_deployment.
- **Default Value:**
  ```kotlin
  "org.postgresql:postgresql:42.2.18"
  ```

### jdbc_connection_string: `String`
The jdbc_connection_string of this postgres_container_deployment.
- **Code:**
  ```kotlin
  "jdbc:postgresql://${instanceName}/${databaseName}"
  ```

### jdbc_driver_class_name: `String`
The jdbc_driver_class_name of this postgres_container_deployment.
- **Default Value:**
  ```kotlin
  "org.postgresql.Driver"
  ```

## Relationships