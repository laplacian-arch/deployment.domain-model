# **ContainerImage**
**namespace:** laplacian.arch.deployment.component.container

An entity describing a container_image.



---

## Properties

### image_name: `String`
The image_name of this container_image.
- **Default Value:**
  ```kotlin
  name.lowerHyphenize()
  ```

### custom_built: `Boolean`
Defines this container_image is custom_built or not.
- **Default Value:**
  ```kotlin
  false
  ```

## Relationships

### environment_variables: `List<EnvironmentVariableDefinition>`
The environment_variables of this container_image.
- **Cardinality:** `*`