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

### gradle_version: `String`
The gradle_version of this db_container_deployment.
- **Default Value:**
  ```kotlin
  "6.6.1"
  ```

### flyway_container_base_image: `String`
The flyway_container_base_image of this db_container_deployment.
- **Default Value:**
  ```kotlin
  "adoptopenjdk:11-jdk-hotspot"
  ```

### flyway_version: `String`
The flyway_version of this db_container_deployment.
- **Default Value:**
  ```kotlin
  "7.5.1"
  ```

### jdbc_driver_jar: `String`
The jdbc_driver_jar of this db_container_deployment.

### jdbc_driver_class_name: `String`
The jdbc_driver_class_name of this db_container_deployment.

### jdbc_connection_string: `String`
The jdbc_connection_string of this db_container_deployment.

## Relationships

### initial_data: `List<InitialTableData>`
The initial_data of this db_container_deployment.
- **Cardinality:** `*`