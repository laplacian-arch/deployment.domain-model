# **MavenArtifact**
**namespace:** laplacian.arch.deployment.component

An entity describing a maven_artifact.



---

## Properties

### group: `String`
The group of this maven_artifact.
- **Attributes:** *PK*

### name: `String`
The name of this maven_artifact.
- **Attributes:** *PK*

### version: `String`
The version of this maven_artifact.

### gradle_dependency_entry: `String`
The gradle_dependency_entry of this maven_artifact.
- **Code:**
  ```kotlin
  "${group}:${name}:${version}"
  ```

## Relationships