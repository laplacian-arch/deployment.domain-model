# **DbContainerDeployment**
**namespace:** laplacian.arch.deployment.container

An entity describing a db_container_deployment.



---

## Properties

### username: `String`
The username of this db_container_deployment.

### password: `String`
The password of this db_container_deployment.

### database_name: `String`
The database_name of this db_container_deployment.
- **Default Value:**
  ```kotlin
  component.name.lowerHyphenize()
  ```

### port: `Int`
The port of this db_container_deployment.

## Relationships

### initial_data: `List<InitialTableData>`
The initial_data of this db_container_deployment.
- **Cardinality:** `*`