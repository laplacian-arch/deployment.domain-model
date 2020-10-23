# **ElasticsearchAggregate**
**namespace:** laplacian.arch.deployment

elasticsearch_aggregate



---

## Properties

### name: `String`
The name of this elasticsearch_aggregate.
- **Attributes:** *PK*

### description: `String`
The description of this elasticsearch_aggregate.
- **Default Value:**
  ```kotlin
  "${name} ${aggregationType} aggregation"
  ```

### aggregation_type: `String`
The aggregation_type of this elasticsearch_aggregate.

### field: `String`
The field of this elasticsearch_aggregate.

## Relationships

### sub_aggregates: `List<ElasticsearchAggregate>`
sub_aggregates
- **Cardinality:** `*`