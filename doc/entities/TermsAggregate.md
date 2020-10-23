# **TermsAggregate**
**namespace:** laplacian.arch.deployment

A multi-bucket value source based aggregation where buckets are dynamically built
- one per unique value.




---

## Properties

### max_results: `String`
The number of term buckets should be returned (default: 10)


### variable_max_results: `Boolean`
Defines this terms_aggregate is variable_max_results or not.
- **Code:**
  ```kotlin
  maxResults?.contains("\${") ?: false
  ```

### sortByCount: `String`
The sort order ('asc' or 'desc') in which the buckets will be returned


### variable_order: `Boolean`
Defines this terms_aggregate is variable_order or not.
- **Code:**
  ```kotlin
  sortByCount?.contains("\${") ?: false
  ```

### shard_size: `String`
The number of term buckets each shard will return to the coordinating node
(the node that coordinates the search execution)


### variable_shard_size: `Boolean`
Defines this terms_aggregate is variable_shard_size or not.
- **Code:**
  ```kotlin
  shardSize?.contains("\${") ?: false
  ```

### min_doc_count: `String`
the minimum document count required per term


### variable_min_doc_count: `Boolean`
Defines this terms_aggregate is variable_min_doc_count or not.
- **Code:**
  ```kotlin
  minDocCount?.contains("\${") ?: false
  ```

## Relationships