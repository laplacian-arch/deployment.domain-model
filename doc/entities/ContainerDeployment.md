# **ContainerDeployment**
**namespace:** laplacian.arch.deployment.container

An entity describing a container_deployment.



---

## Properties

### instance_name: `String`
The instance_name of this container_deployment.
- **Default Value:**
  ```kotlin
  component.name.lowerHyphenize()
  ```

### tag: `String`
The tag of this container_deployment.
- **Default Value:**
  ```kotlin
  "latest"
  ```

### use_locally_built_image: `Boolean`
Defines this container_deployment is use_locally_built_image or not.
- **Default Value:**
  ```kotlin
  true
  ```

## Relationships

### environment_variables: `List<EnvironmentVariableAssignment>`
The environment_variables of this container_deployment.
- **Cardinality:** `*`

### data_files: `List<DataFile>`
The data_files of this container_deployment.
- **Cardinality:** `*`

### container_image: `ContainerImage`
The container_image of this container_deployment.
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  component as ContainerImage
  ```