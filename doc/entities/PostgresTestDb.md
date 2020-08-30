# **PostgresTestDb**
**namespace:** laplacian.arch.deployment

postgres_test_db



---

## Properties

### username: `String`
The username of this postgres_test_db.
- **Default Value:**
  ```kotlin
  "test"
  ```

### password: `String`
The password of this postgres_test_db.
- **Default Value:**
  ```kotlin
  "secret"
  ```

### container_image: `String`
The container_image of this postgres_test_db.
- **Default Value:**
  ```kotlin
  "postgres"
  ```

### database_name: `String`
The database_name of this postgres_test_db.
- **Default Value:**
  ```kotlin
  name.lowerHyphenize()
  ```

### port: `Int`
The port of this postgres_test_db.
- **Default Value:**
  ```kotlin
  5432
  ```

### jdbc_connection_string: `String`
The jdbc_connection_string of this postgres_test_db.
- **Code:**
  ```kotlin
  "jdbc:postgresql://${instanceName}:${port}/${databaseName}"
  ```

### r2dbc_connection_string: `String`
The r2dbc_connection_string of this postgres_test_db.
- **Code:**
  ```kotlin
  "r2dbc:pool:postgresql://${instanceName}:${port}/${databaseName}"
  ```

## Relationships