

# **Environment**
**namespace:** laplacian.arch.deployment

An entity describing a environment.



---

## Properties

### name: `String`
The name of this environment.
- **Attributes:** *PK*

### tier: `String`
The tier of this environment.

### uses_locally_built_container_images: `Boolean`
Defines this environment is uses_locally_built_container_images or not.
- **Default Value:**
  ```kotlin
  listOf("development", "local").contains(tier)
  ```

### uses_gcp: `Boolean`
Defines this environment is uses_gcp or not.
- **Default Value:**
  ```kotlin
  deployments.any{ deployment ->
      listOf("gcp", "gce").any {
        deployment.type.contains("_${it}_")
      }
  }
  ```

## Relationships

### deployments: `List<Deployment>`
The deployments of this environment.
- **Cardinality:** `*`

### components: `List<Component>`
The components of this environment.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  deployments.map{ it.component }.distinct()
  ```

### container_deployments: `List<ContainerDeployment>`
The container_deployments of this environment.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  deployments.filterIsInstance<ContainerDeployment>()
  ```

### container_images: `List<ContainerImage>`
The container_images of this environment.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  components.filterIsInstance<ContainerImage>()
  ```
