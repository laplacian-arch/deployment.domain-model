<!-- @head-content@ -->
# laplacian-arch/deployment.domain-model

This model represents the deployment configuration of a system.


*Read this in other languages*: [[日本語](README_ja.md)] [[简体中文](README_zh.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
- [Overview](#overview)

  * [Model overview](#model-overview)

- [Usage](#usage)

- [Index](#index)

  * [Entity list](#entity-list)

  * [Script List](#script-list)

  * [Source code list](#source-code-list)



<!-- @toc@ -->

<!-- @main-content@ -->
## Overview


### Model overview


The following diagram explains the entities included in this module and the relationship
between them.
![](./doc/image/model-diagram.svg)

## Usage

To apply this Model module, add the following entry to your project definition.
```yaml
project:
  models:
  - group: laplacian-arch
    name: deployment.domain-model
    version: 1.0.0
```

You can run the following command to see a list of resources affected by the application of this module and their contents.
```console
$ ./script/generate --dry-run

diff --color -r PROJECT_HOME/.NEXT/somewhere/something.md PROJECT_HOME/somewhere/something.md
1,26c1,10
< content: OLD CONTENT
---
> content: NEW CONTENT
```

If there is no problem, execute the following command to reflect the change.
```console
$ ./script/generate

```


## Index


### Entity list


- [**Component**](<./doc/entities/Component.md>)
An entity describing a component.
- [**ContainerImage**](<./doc/entities/ContainerImage.md>)
An entity describing a container_image.
- [**EnvironmentVariableDefinition**](<./doc/entities/EnvironmentVariableDefinition.md>)
An entity describing a environment_variable_definition.
- [**ElasticsearchContainerDeployment**](<./doc/entities/ElasticsearchContainerDeployment.md>)
An entity describing a elasticsearch_container_deployment.
- [**ElasticsearchContainerImage**](<./doc/entities/ElasticsearchContainerImage.md>)
An entity describing a elasticsearch_container_image.
- [**ConfigurationFile**](<./doc/entities/ConfigurationFile.md>)
An entity describing a configuration_file.
- [**MavenArtifact**](<./doc/entities/MavenArtifact.md>)
An entity describing a maven_artifact.
- [**MysqlContainerDeployment**](<./doc/entities/MysqlContainerDeployment.md>)
An entity describing a mysql_container_deployment.
- [**MysqlContainerImage**](<./doc/entities/MysqlContainerImage.md>)
An entity describing a mysql_container_image.
- [**PostgresContainerDeployment**](<./doc/entities/PostgresContainerDeployment.md>)
An entity describing a postgres_container_deployment.
- [**PostgresContainerImage**](<./doc/entities/PostgresContainerImage.md>)
An entity describing a postgres_container_image.
- [**RedisContainerDeployment**](<./doc/entities/RedisContainerDeployment.md>)
An entity describing a redis_container_deployment.
- [**RedisContainerImage**](<./doc/entities/RedisContainerImage.md>)
An entity describing a redis_container_image.
- [**Springboot2ApiServiceContainerImage**](<./doc/entities/Springboot2ApiServiceContainerImage.md>)
An entity describing a springboot2_api_service_container_image.
- [**Springboot2ApiServiceContainerDeployment**](<./doc/entities/Springboot2ApiServiceContainerDeployment.md>)
An entity describing a springboot2_api_service_container_deployment.
- [**Dataset**](<./doc/entities/Dataset.md>)
An entity describing a dataset.
- [**Deployment**](<./doc/entities/Deployment.md>)
An entity describing a deployment.
- [**ContainerDeployment**](<./doc/entities/ContainerDeployment.md>)
An entity describing a container_deployment.
- [**DataFile**](<./doc/entities/DataFile.md>)
An entity describing a data_file.
- [**EnvironmentVariableAssignment**](<./doc/entities/EnvironmentVariableAssignment.md>)
An entity describing a environment_variable_assignment.
- [**DbContainerDeployment**](<./doc/entities/DbContainerDeployment.md>)
An entity describing a db_container_deployment.
- [**InitialTableData**](<./doc/entities/InitialTableData.md>)
An entity describing a initial_table_data.
- [**ContainerOnGceInstance**](<./doc/entities/ContainerOnGceInstance.md>)
An entity describing a container_on_gce_instance.
- [**ContainerOnGcpCloudrun**](<./doc/entities/ContainerOnGcpCloudrun.md>)
An entity describing a container_on_gcp_cloudrun.
- [**DatasourceConfiguration**](<./doc/entities/DatasourceConfiguration.md>)
An entity describing a datasource_configuration.
- [**JdbcDatasourceConfiguration**](<./doc/entities/JdbcDatasourceConfiguration.md>)
jdbc datasource setting with Hikari connection pool.
- [**MysqlJdbcDatasourceConfiguration**](<./doc/entities/MysqlJdbcDatasourceConfiguration.md>)
An entity describing a mysql_jdbc_datasource_configuration.
- [**OracleJdbcDatasourceConfiguration**](<./doc/entities/OracleJdbcDatasourceConfiguration.md>)
An entity describing a oracle_jdbc_datasource_configuration.
- [**PostgresJdbcDatasourceConfiguration**](<./doc/entities/PostgresJdbcDatasourceConfiguration.md>)
An entity describing a postgres_jdbc_datasource_configuration.
- [**Environment**](<./doc/entities/Environment.md>)
An entity describing a environment.
### Script List


- [./script/generate.sh](<./scripts/generate.sh>)

  Generates the resources in each directory of `src/` `model/` `template/` in this project.
  The results are reflected in each directory of `dest/` `doc/` `script/`.

  *Generator input files*

  - `src/`
    Stores static resources that are not processed the generator.
    The contents of this directory are copied directly into the `dest/` directory.

  - `model/`
    Stores the static model data files written in *YAML* or *JSON* format used for the generation.

  - `template/`
    This directory contains the template files used for the generation.
    Files with a extension `.hbs` will be handled as templates. All other files are copied as is.

    - `template/dest` `template/doc` `template/scripts`
      Each of these directories contains the template files of the resource to be output
      in the directory `dest/` `doc/` `scripts`.

    - `template/model` `template/template`
      These directories store template files updating the contents of `template/` and `model/` used for the generation.
      If the content of `template/` `model/` is updated as a result of the generation,
      the generation process is executed recursively.
      The changes to `template/` `model/` that occur during the above process are treated as an intermediate state
      and will be lost after the completion of the process.
      Use the *--dry-run* option to check these intermediate files.

  *Generator output files*

  - `dest/`
    Outputs the source files of applications and modules created as the result of
    the generation process.

  - `doc/`
    Outputs the project documentation.

  - `scripts/`
    Outputs various scripts used in development and operation.

  > Usage: generate.sh [OPTION]...
  >
  > -h, --help
  >
  >   Displays how to use this command.
  >   
  > -v, --verbose
  >
  >   Displays more detailed command execution information.
  >   
  > -d, --dry-run
  >
  >   After this command is processed, the generated files are output to the `.NEXT` directory
  >   without reflecting to the folders of `dest/` `doc/` `scripts/`.
  >   In addition, the difference between the contents of the `.NEXT` directory and the current files.
  >   This directory also contains any intermediate files created during the generation.
  >   
  > -r, --max-recursion [VALUE]
  >
  >   The upper limit of the number of times to execute recursively
  >   when the contents of the `model/` `template/` directory are updated
  >   during the generation process.
  >    (Default: 10)
  > , --local-module-repository [VALUE]
  >
  >   The repository path to store locally built modules.
  >   The modules in this repository have the highest priority.
  >   
  > , --updates-scripts-only
  >
  >   Updates script files only.
  >   This option is used to generate the generator script itself
  >   when the project is initially generated.
  >   
- [./script/publish-local.sh](<./scripts/publish-local.sh>)

  After the resources in the project are generated,
  the resources in the `./dest` directory are built as a model module
  and registered in the local repository.

  > Usage: publish-local.sh [OPTION]...
  >
  > -h, --help
  >
  >   Displays how to use this command.
  >   
  > -v, --verbose
  >
  >   Displays more detailed command execution information.
  >   
  > -r, --max-recursion [VALUE]
  >
  >   This option is the same as the option of the same name in [generate.sh](<./scripts/generate.sh>).
  >    (Default: 10)
  > , --skip-generation
  >
  >   This option is the same as the option of the same name in [generate.sh](<./scripts/generate.sh>).
  >   
  > , --local-module-repository [VALUE]
  >
  >   The path to the local repository where the built module will be stored.
  >   If the repository does not exist in the specified path, it will be created automatically.
  >   
### Source code list


- [model/project.yaml](<./model/project.yaml>)
- [src/model/entities/component/component.yaml](<./src/model/entities/component/component.yaml>)
- [src/model/entities/component/container-image.yaml](<./src/model/entities/component/container-image.yaml>)
- [src/model/entities/component/elasticsearch/elasticsearch-container-deployment.yaml](<./src/model/entities/component/elasticsearch/elasticsearch-container-deployment.yaml>)
- [src/model/entities/component/elasticsearch/elasticsearch-container-image.yaml](<./src/model/entities/component/elasticsearch/elasticsearch-container-image.yaml>)
- [src/model/entities/component/maven_artifiact.yaml](<./src/model/entities/component/maven_artifiact.yaml>)
- [src/model/entities/component/mysql/mysql-container-deployment.yaml](<./src/model/entities/component/mysql/mysql-container-deployment.yaml>)
- [src/model/entities/component/mysql/mysql-container-image.yaml](<./src/model/entities/component/mysql/mysql-container-image.yaml>)
- [src/model/entities/component/postgres/postgres-container-deployment.yaml](<./src/model/entities/component/postgres/postgres-container-deployment.yaml>)
- [src/model/entities/component/postgres/postgres-container-image.yaml](<./src/model/entities/component/postgres/postgres-container-image.yaml>)
- [src/model/entities/component/redis/redis-container-deployment.yaml](<./src/model/entities/component/redis/redis-container-deployment.yaml>)
- [src/model/entities/component/redis/redis-container-image.yaml](<./src/model/entities/component/redis/redis-container-image.yaml>)
- [src/model/entities/component/springboot2-api-service/springboot2-api-service-conrainer-image.yaml](<./src/model/entities/component/springboot2-api-service/springboot2-api-service-conrainer-image.yaml>)
- [src/model/entities/component/springboot2-api-service/springboot2-api-service-container-deployment.yaml](<./src/model/entities/component/springboot2-api-service/springboot2-api-service-container-deployment.yaml>)
- [src/model/entities/dataset.yaml](<./src/model/entities/dataset.yaml>)
- [src/model/entities/deployment/container/container-deployment.yaml](<./src/model/entities/deployment/container/container-deployment.yaml>)
- [src/model/entities/deployment/container/db-container-deployment.yaml](<./src/model/entities/deployment/container/db-container-deployment.yaml>)
- [src/model/entities/deployment/container_on_gce_instance.yaml](<./src/model/entities/deployment/container_on_gce_instance.yaml>)
- [src/model/entities/deployment/container_on_gcp_cloudrun.yaml](<./src/model/entities/deployment/container_on_gcp_cloudrun.yaml>)
- [src/model/entities/deployment/datasource_configuration/datasource-configuration.yaml](<./src/model/entities/deployment/datasource_configuration/datasource-configuration.yaml>)
- [src/model/entities/deployment/datasource_configuration/jdbc-datasource-configuration.yaml](<./src/model/entities/deployment/datasource_configuration/jdbc-datasource-configuration.yaml>)
- [src/model/entities/deployment/datasource_configuration/mybatis-jdbc-datasource-configuratoin.yaml](<./src/model/entities/deployment/datasource_configuration/mybatis-jdbc-datasource-configuratoin.yaml>)
- [src/model/entities/deployment/datasource_configuration/oracle-jdbc-datasource-configuratoin.yaml](<./src/model/entities/deployment/datasource_configuration/oracle-jdbc-datasource-configuratoin.yaml>)
- [src/model/entities/deployment/datasource_configuration/postgres-jdbc-datasource-configuratoin.yaml](<./src/model/entities/deployment/datasource_configuration/postgres-jdbc-datasource-configuratoin.yaml>)
- [src/model/entities/deployment.yaml](<./src/model/entities/deployment.yaml>)
- [src/model/entities/environment.yaml](<./src/model/entities/environment.yaml>)


<!-- @main-content@ -->
