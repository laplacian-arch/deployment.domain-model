# **ElasticsearchIndex**
**namespace:** laplacian.arch.deployment

elasticsearch_index



---

## Properties

### name: `String`
The name of this elasticsearch_index.
- **Attributes:** *PK*

### document_model_name: `String`
The document_model_name of this elasticsearch_index.

## Relationships

### document_model: `Entity`
document_model
- **Cardinality:** `1`

### queries: `List<ElasticsearchQuery>`
queries
- **Cardinality:** `*`