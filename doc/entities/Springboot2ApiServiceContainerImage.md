

# **Springboot2ApiServiceContainerImage**
**namespace:** laplacian.arch.deployment.component.springboot2_api_service

An entity describing a springboot2_api_service_container_image.



---

## Properties

### function_model_name: `String`
The function_model_name of this springboot2_api_service_container_image.

### custom_built: `Boolean`
Defines this springboot2_api_service_container_image is custom_built or not.
- **Code:**
  ```kotlin
  true
  ```

### container_base_image: `String`
The container_base_image of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "adoptopenjdk:11-jdk-hotspot"
  ```

### gradle_version: `String`
The gradle_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "6.6.1"
  ```

### jdk_major_version: `String`
The jdk_major_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "11"
  ```

### kotlin_version: `String`
The kotlin_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "1.4.30"
  ```

### kotlin_coroutine_version: `String`
The kotlin_coroutine_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "1.4.2"
  ```

### reactor_kotlin_extension_version: `String`
The reactor_kotlin_extension_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "1.1.2"
  ```

### r2dbc_postgres_driver_version: `String`
The r2dbc_postgres_driver_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "0.8.3.RELEASE"
  ```

### oracle_jdbc_driver_version: `String`
The oracle_jdbc_driver_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "19.8.0.0"
  ```

### postgres_jdbc_driver_version: `String`
The postgres_jdbc_driver_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "42.2.18"
  ```

### mysql_jdbc_driver_version: `String`
The mysql_jdbc_driver_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "8.0.23"
  ```

### spring_version: `String`
The spring_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "5.2.7.RELEASE"
  ```

### reactor_version: `String`
The reactor_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "3.2.5.RELEASE"
  ```

### springboot_version: `String`
The springboot_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "2.3.1.RELEASE"
  ```

### springboot_graphql_webflux_version: `String`
The springboot_graphql_webflux_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "2.0"
  ```

### spring_dependency_manager_version: `String`
The spring_dependency_manager_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "1.0.9.RELEASE"
  ```

### graphql_java_version: `String`
The graphql_java_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "15.0"
  ```

### graphql_extended_scalar_version: `String`
The graphql_extended_scalar_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "1.0.1"
  ```

### springboot_mybatis_version: `String`
The springboot_mybatis_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "2.1.4"
  ```

### datasource_proxy_version: `String`
The datasource_proxy_version of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  "1.7"
  ```

### repositories: `List<String>`
The repositories of this springboot2_api_service_container_image.
- **Default Value:**
  ```kotlin
  listOf(
      "mavenCentral()"
  )
  ```

## Relationships

### function_model: `Service`
The function_model of this springboot2_api_service_container_image.
- **Cardinality:** `1`

### additional_libraries: `List<MavenArtifact>`
The additional_libraries of this springboot2_api_service_container_image.
- **Cardinality:** `*`
