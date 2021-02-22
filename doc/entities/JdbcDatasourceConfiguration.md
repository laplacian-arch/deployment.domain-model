# **JdbcDatasourceConfiguration**
**namespace:** laplacian.arch.deployment.datasource

jdbc datasource setting with Hikari connection pool.




---

## Properties

### jdbc_connection_string: `String`
The jdbc_connection_string of this jdbc_datasource_configuration.

### url: `String`
The url of this jdbc_datasource_configuration.
- **Default Value:**
  ```kotlin
  name.lowerHyphenize()
  ```

### username: `String`
The username of this jdbc_datasource_configuration.

### password: `String`
The password of this jdbc_datasource_configuration.

### database_name: `String`
The database_name of this jdbc_datasource_configuration.
- **Default Value:**
  ```kotlin
  name.lowerHyphenize()
  ```

### driver_class_name: `String`
The driver_class_name of this jdbc_datasource_configuration.

### slow_query_threshold_mills: `Int`
The slow_query_threshold_mills of this jdbc_datasource_configuration.

### minimum_idle: `Int`
The minimum_idle of this jdbc_datasource_configuration.

### maximum_pool_size: `Int`
The maximum_pool_size of this jdbc_datasource_configuration.

### idle_timeout: `Int`
The idle_timeout of this jdbc_datasource_configuration.

### max-lifetime: `Int`
The max-lifetime of this jdbc_datasource_configuration.

### connection_timeout: `Int`
The connection_timeout of this jdbc_datasource_configuration.

## Relationships