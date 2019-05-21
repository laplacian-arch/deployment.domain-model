## Description of entities

### Structure
![](./image/model-diagram.svg)



---
### **deployment_environment** (*laplacian_arch.deployment.model.DeploymentEnvironment*)
  deployment_environment

#### Properties
* **name:** *PK* `String`
  The name of this deployment_environment.

#### Relationships
* **nodes:** `List<DeploymentNode>`
  nodes




---
### **deployment_node** (*laplacian_arch.deployment.model.DeploymentNode*)
  deployment_node

#### Properties
* **name:** *PK* `String`
  The name of this deployment_node.
* **type:** `String`
  The type of this deployment_node.
* **domain_name:** `String?`
  The domain_name of this deployment_node.
* **acme_name:** `String?`
  The acme_name of this deployment_node.

#### Relationships
* **db_migration_jobs:** `List<DbMigrationJobComponent>`
  db_migration_jobs
* **environment:** `DeploymentEnvironment`
  environment
* **components:** `List<DeploymentComponent>`
  components
* **clients:** `List<ClientComponent>`
  clients
* **services:** `List<ServiceComponent>`
  services
* **datastores:** `List<DatastoreComponent>`
  datastores
* **acme:** `Acme?`
  acme




---
### **acme** (*laplacian_arch.deployment.model.Acme*)
  acme

#### Properties
* **name:** *PK* `String`
  The name of this acme.
* **provider:** `String?`
  The provider of this acme.
* **email:** `String`
  The email of this acme.
* **api_key:** `String`
  The api_key of this acme.

#### Relationships