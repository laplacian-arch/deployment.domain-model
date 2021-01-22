# **EnvironmentVariableAssignment**
**namespace:** laplacian.arch.deployment.container

An entity describing a environment_variable_assignment.



---

## Properties

### name: `String`
The name of this environment_variable_assignment.
- **Attributes:** *PK*

### value: `String`
The value of this environment_variable_assignment.

## Relationships

### container_deployment: `ContainerDeployment`
The container_deployment of this environment_variable_assignment.
- **Cardinality:** `1`

### definition: `EnvironmentVariableDefinition`
The definition of this environment_variable_assignment.
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  containerDeployment.containerImage.environmentVariables.find{ it.name == name }!!
  ```