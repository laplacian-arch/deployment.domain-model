

# **Springboot2ApiServiceContainerDeployment**
**namespace:** laplacian.arch.deployment.component.springboot2_api_service

An entity describing a springboot2_api_service_container_deployment.



---

## Properties

### http_port: `Int`
The http_port of this springboot2_api_service_container_deployment.
- **Default Value:**
  ```kotlin
  8080
  ```

### enable_jmx: `Boolean`
Defines this springboot2_api_service_container_deployment is enable_jmx or not.
- **Default Value:**
  ```kotlin
  true
  ```

### jmx_port: `Int`
The jmx_port of this springboot2_api_service_container_deployment.
- **Default Value:**
  ```kotlin
  9010
  ```

### enable_debug: `Boolean`
Defines this springboot2_api_service_container_deployment is enable_debug or not.
- **Default Value:**
  ```kotlin
  false
  ```

### debug_port: `Int`
The debug_port of this springboot2_api_service_container_deployment.
- **Default Value:**
  ```kotlin
  5005
  ```

## Relationships

### datasources: `List<DatasourceConfiguration>`
The datasources of this springboot2_api_service_container_deployment.
- **Cardinality:** `*`
