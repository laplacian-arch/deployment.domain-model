# **Springboot2ApiService**
**namespace:** laplacian.arch.deployment

springboot2_api_service



---

## Properties

### function_model_name: `String`
The function_model_name of this springboot2_api_service.

### port: `Int`
The port of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  8080
  ```

### container_base_image: `String`
The container_base_image of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "adoptopenjdk:11-jdk-hotspot"
  ```

### gradle_version: `String`
The gradle_version of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "6.5.1"
  ```

### jdk_major_version: `String`
The jdk_major_version of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "11"
  ```

### kotlin_version: `String`
The kotlin_version of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "1.4.10"
  ```

### kotlin_coroutine_version: `String`
The kotlin_coroutine_version of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "1.3.9"
  ```

### r2dbc_postgres_driver_version: `String`
The r2dbc_postgres_driver_version of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "0.8.3.RELEASE"
  ```

### springboot_version: `String`
The springboot_version of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "2.3.1.RELEASE"
  ```

### springboot_graphql_webflux_version: `String`
The springboot_graphql_webflux_version of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "2.0"
  ```

### spring_dependency_manager_version: `String`
The spring_dependency_manager_version of this springboot2_api_service.
- **Default Value:**
  ```kotlin
  "1.0.9.RELEASE"
  ```

## Relationships

### function_model: `Service`
function_model
- **Cardinality:** `1`

### datasource_mappings: `List<DatasourceMapping>`
datasource_mappings
- **Cardinality:** `*`

### search-engine-mappings: `List<SearchEngineMapping>`
search-engine-mappings
- **Cardinality:** `*`

### external_rest_api_mappings: `List<ExternalRestApiMapping>`
external_rest_api_mappings
- **Cardinality:** `*`