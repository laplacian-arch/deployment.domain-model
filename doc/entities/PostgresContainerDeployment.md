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

## Relationships

### initial_data: `List<InitialTableData>`
The initial_data of this postgres_container_deployment.
- **Cardinality:** `*`