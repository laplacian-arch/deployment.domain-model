# **SearchEngineMapping**
**namespace:** laplacian.arch.deployment

search_engine_mapping



---

## Properties

### name: `String`
The name of this search_engine_mapping.
- **Default Value:**
  ```kotlin
  "default"
  ```

### is_default: `Boolean`
Defines this search_engine_mapping is is_default or not.
- **Code:**
  ```kotlin
  name == "default"
  ```

### component_name: `String`
The component_name of this search_engine_mapping.

## Relationships

### service: `Springboot2ApiService`
service
- **Cardinality:** `1`

### component: `Component`
component
- **Cardinality:** `1`