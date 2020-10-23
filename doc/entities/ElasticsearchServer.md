# **ElasticsearchServer**
**namespace:** laplacian.arch.deployment

elasticsearch_server



---

## Properties

### container_image: `String`
The container_image of this elasticsearch_server.
- **Default Value:**
  ```kotlin
  "elasticsearch"
  ```

### port: `Int`
The port of this elasticsearch_server.
- **Default Value:**
  ```kotlin
  9200
  ```

### plugins: `List<String>`
The plugins of this elasticsearch_server.

### configuration_file_dir_path: `String`
The configuration_file_dir_path of this elasticsearch_server.
- **Default Value:**
  ```kotlin
  "/usr/share/elasticsearch/config"
  ```

### uses_custom_image: `Boolean`
Defines this elasticsearch_server is uses_custom_image or not.
- **Code:**
  ```kotlin
  plugins.isNotEmpty() || configurationFiles.isNotEmpty()
  ```

## Relationships

### configuration_files: `List<ElasticsearchConfigurationFiles>`
configuration_files
- **Cardinality:** `*`