

# **DataFile**
**namespace:** laplacian.arch.deployment.container

An entity describing a data_file.



---

## Properties

### filename: `String`
The filename of this data_file.
- **Attributes:** *PK*

### dir: `String`
The dir of this data_file.
- **Default Value:**
  ```kotlin
  "data"
  ```

### dataset_name: `String`
The dataset_name of this data_file.

## Relationships

### dataset: `Dataset`
The dataset of this data_file.
- **Cardinality:** `1`
