# **DatasourceMapping**
**namespace:** laplacian.arch.deployment

datasource_mapping



---

## Properties

### name: `String`
The name of this datasource_mapping.
- **Default Value:**
  ```kotlin
  "default"
  ```

### is_default: `Boolean`
Defines this datasource_mapping is is_default or not.
- **Code:**
  ```kotlin
  name == "default"
  ```

### component_name: `String`
The component_name of this datasource_mapping.

## Relationships

### datasource: `Datasource`
datasource
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  service.functionModel.datasources.find{ it.name == name }!!
  ```

### service: `Springboot2ApiService`
service
- **Cardinality:** `1`

### component: `Component`
component
- **Cardinality:** `1`