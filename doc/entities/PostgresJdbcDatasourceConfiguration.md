# **PostgresJdbcDatasourceConfiguration**
**namespace:** laplacian.arch.deployment.datasource

An entity describing a postgres_jdbc_datasource_configuration.



---

## Properties

### jdbc_connection_string: `String`
The jdbc_connection_string of this postgres_jdbc_datasource_configuration.
- **Code:**
  ```kotlin
  "jdbc:postgresql://${url}/${databaseName}"
  ```

### driver_class_name: `String`
The driver_class_name of this postgres_jdbc_datasource_configuration.
- **Default Value:**
  ```kotlin
  "org.postgresql.Driver"
  ```

## Relationships