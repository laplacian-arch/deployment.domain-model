# **InitialTableData**
**namespace:** laplacian.arch.deployment.component.postgres

An entity describing a initial_table_data.



---

## Properties

### table_name: `String`
The table_name of this initial_table_data.
- **Attributes:** *PK*

### table_model_name: `String`
The table_model_name of this initial_table_data.
- **Default Value:**
  ```kotlin
  tableName.lowerUnderscorize()
  ```

### schema_name: `String`
The schema_name of this initial_table_data.

### dataset_name: `String`
The dataset_name of this initial_table_data.

## Relationships

### dataset: `Dataset`
The dataset of this initial_table_data.
- **Cardinality:** `1`

### table_model: `Entity`
The table_model of this initial_table_data.
- **Cardinality:** `1`