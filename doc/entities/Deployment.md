# **Deployment**
**namespace:** laplacian.arch.deployment

deployment



---

## Properties

### name: `String`
The name of this deployment.
- **Attributes:** *PK*

### type: `String`
The type of this deployment.

## Relationships

### environment: `Environment`
environment
- **Cardinality:** `1`

### component: `Component`
component
- **Cardinality:** `1`