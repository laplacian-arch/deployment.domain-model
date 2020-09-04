# **Environment**
**namespace:** laplacian.arch.deployment

environment



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
deployments
- **Cardinality:** `*`

### components: `List<Component>`
components
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  deployments.map{ it.component }.distinct()
  ```