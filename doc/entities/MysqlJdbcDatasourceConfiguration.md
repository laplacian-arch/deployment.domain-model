

# **MysqlJdbcDatasourceConfiguration**
**namespace:** laplacian.arch.deployment.datasource

An entity describing a mysql_jdbc_datasource_configuration.



---

## Properties

### jdbc_connection_string: `String`
The jdbc_connection_string of this mysql_jdbc_datasource_configuration.
- **Code:**
  ```kotlin
  "jdbc:mysql://${url}/${databaseName}"
  ```

### driver_class_name: `String`
The driver_class_name of this mysql_jdbc_datasource_configuration.
- **Default Value:**
  ```kotlin
  "com.mysql.jdbc.Driver"
  ```

## Relationships
