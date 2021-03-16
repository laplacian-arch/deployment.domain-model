

# **Deployment**
**namespace:** laplacian.arch.deployment

An entity describing a deployment.



---

## Properties

### name: `String`
The name of this deployment.
- **Attributes:** *PK*

### type: `String`
The type of this deployment.

## Relationships

### environment: `Environment`
The environment of this deployment.
- **Cardinality:** `1`

### component: `Component`
The component of this deployment.
- **Cardinality:** `1`
