

# **ElasticsearchContainerImage**
**namespace:** laplacian.arch.deployment.component.elasticsearch

An entity describing a elasticsearch_container_image.



---

## Properties

### container_image: `String`
The container_image of this elasticsearch_container_image.
- **Default Value:**
  ```kotlin
  "elasticsearch"
  ```

### plugins: `List<String>`
The plugins of this elasticsearch_container_image.

### configuration_file_dir_path: `String`
The configuration_file_dir_path of this elasticsearch_container_image.
- **Default Value:**
  ```kotlin
  "/usr/share/elasticsearch/config"
  ```

### uses_custom_image: `Boolean`
Defines this elasticsearch_container_image is uses_custom_image or not.
- **Code:**
  ```kotlin
  plugins.isNotEmpty() || configurationFiles.isNotEmpty()
  ```

## Relationships

### configuration_files: `List<ConfigurationFile>`
The configuration_files of this elasticsearch_container_image.
- **Cardinality:** `*`
