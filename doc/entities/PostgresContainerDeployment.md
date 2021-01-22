# **PostgresContainerDeployment**
**namespace:** laplacian.arch.deployment.component.postgres

An entity describing a postgres_container_deployment.



---

## Properties

### username: `String`
The username of this postgres_container_deployment.
- **Default Value:**
  ```kotlin
  "test"
  ```

### password: `String`
The password of this postgres_container_deployment.
- **Default Value:**
  ```kotlin
  "secret"
  ```

### database_name: `String`
The database_name of this postgres_container_deployment.
- **Default Value:**
  ```kotlin
  component.name.lowerHyphenize()
  ```

### port: `Int`
The port of this postgres_container_deployment.
- **Default Value:**
  ```kotlin
  5432
  ```

### jdbc_connection_string: `String`
The jdbc_connection_string of this postgres_container_deployment.
- **Code:**
  ```kotlin
  "jdbc:postgresql://${instanceName}:${port}/${databaseName}"
  ```

### r2dbc_connection_string: `String`
The r2dbc_connection_string of this postgres_container_deployment.
- **Code:**
  ```kotlin
  "r2dbc:pool:postgresql://${instanceName}:${port}/${databaseName}"
  ```

## Relationships