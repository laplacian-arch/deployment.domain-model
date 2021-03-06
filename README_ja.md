<!-- @head-content@ -->
# laplacian-arch/deployment.domain-model

システムのデプロイメント構成を表すモデルです。


*Read this in other languages*: [[English](README.md)] [[简体中文](README_zh.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
- [概要](#概要)

  * [モデル概要](#モデル概要)

- [使用方法](#使用方法)

- [インデックス](#インデックス)

  * [エンティティ一覧](#エンティティ一覧)

  * [スクリプト一覧](#スクリプト一覧)

  * [ソースコード一覧](#ソースコード一覧)



<!-- @toc@ -->

<!-- @main-content@ -->
## 概要


### モデル概要


以下の図は、このモジュールに含まれる各エンティティの内容とそれらの間の関係を表しています。
![](./doc/image/model-diagram.svg)

## 使用方法

この modelモジュールを適用するには、プロジェクト定義に以下のエントリを追加してください。
```yaml
project:
  models:
  - group: laplacian-arch
    name: deployment.domain-model
    version: 1.0.0
```

下記のコマンドを実行すると、このモジュールの適用によって影響を受ける資源の一覧とその内容を確認できます。

```console
$ ./script/generate --dry-run

diff --color -r PROJECT_HOME/.NEXT/somewhere/something.md PROJECT_HOME/somewhere/something.md
1,26c1,10
< content: OLD CONTENT
---
> content: NEW CONTENT
```

内容に問題が無ければ、下記コマンドを実行して変更を反映してください。

```console
$ ./script/generate

```


## インデックス


### エンティティ一覧


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
### スクリプト一覧


- [./script/generate.sh](<./scripts/generate.sh>)

  このプロジェクト内の資源を自動生成します。
  `src/` `model/` `template/` の各ディレクトリに格納された資源をもとに自動生成を行い、その結果を`dest/` `doc/` `script/` の各ディレクトリに反映します。

  *自動生成入力ファイル*

  - `src/`
    自動生成の対象とならない静的な資源を格納します。
    このディレクトリの内容は `dest/` 配下にそのままコピーされます。

  - `model/`
    自動生成で使用されるYAMLもしくはJSON形式で記述された静的なモデルデータを格納します。

  - `template/`
    自動生成で使用されるテンプレートファイルを格納します。ファイル拡張子に `.hbs` を含むファイルがテンプレートして扱われます。
    それ以外のファイルはそのままコピーされます。

    - `template/dest` `template/doc` `template/scripts`
      これらのディレクトリはそれぞれ、`dest/` `doc/` `scripts`の各ディレクトリに出力される資源のテンプレートを格納します。

    - `template/model` `template/template`
      自動生成で使用される`template/` `model/`の内容を更新するためのテンプレートを格納します。
      自動生成の結果、`template/` `model/` の内容が更新された場合は、自動生成処理を再帰的に実行します。
      なお、上記処理中に発生した`template/` `model/`への変更は、中間状態として扱われるため、処理完了後は失われます。
      これらの中間ファイルを確認するためには *--dry-run* オプションを使用してください。

  *自動生成結果ファイル*

  - `dest/`
    自動生成の結果作成されるアプリケーションやモジュールのソースファイル等を出力します。

  - `doc/`
    プロジェクトのドキュメントを出力します。

  - `scripts/`
    開発・運用で使用する各種スクリプトを出力します。

  > Usage: generate.sh [OPTION]...
  >
  > -h, --help
  >
  >   このコマンドの使用方法を表示します。
  >   
  > -v, --verbose
  >
  >   より詳細なコマンドの実行情報を表示します。
  >   
  > -d, --dry-run
  >
  >   自動生成処理を実行後、生成されたファイルを`dest/` `doc/` `scripts/`の各フォルダに反映せずに、`.NEXT`ディレクトリに出力します。
  >   また、`.NEXT`ディレクトリの内容と現在のファイルの差異を出力します。
  >   このディレクトリには自動生成中に作成された中間ファイルも含まれます。
  >   
  > -r, --max-recursion [VALUE]
  >
  >   自動生成処理中に`model/` `template/`ディレクトリの内容が更新された場合に、
  >   再帰的に自動生成処理を実行する回数の上限。
  >    (Default: 10)
  > , --local-module-repository [VALUE]
  >
  >   ローカルでビルドされたモジュールを格納するリポジトリのパス。
  >   ここに存在するモジュールが最優先で参照されます。
  >   
  > , --updates-scripts-only
  >
  >   スクリプトファイルのみを更新の対象とします。
  >   プロジェクトを初期生成する際、自動生成スクリプト自体を初回作成する場合などに指定します。
  >   
- [./script/publish-local.sh](<./scripts/publish-local.sh>)

  プロジェクト内の資源を自動生成した後、ディレクトリにある資源をモデルモジュールとしてビルドし、
  ローカルリポジトリに登録します。

  > Usage: publish-local.sh [OPTION]...
  >
  > -h, --help
  >
  >   このコマンドの使用方法を表示します。
  >   
  > -v, --verbose
  >
  >   より詳細なコマンドの実行情報を表示します。
  >   
  > -r, --max-recursion [VALUE]
  >
  >   [generate.sh](<./scripts/generate.sh>)の同名のオプションと同じものです。
  >    (Default: 10)
  > , --skip-generation
  >
  >   自動生成処理を行わずに、ビルドおよびローカルリポジトリへの登録を行います。
  >   
  > , --local-module-repository [VALUE]
  >
  >   ビルドしたモジュールを格納するローカルリポジトリのパス。
  >   指定したパスにリポジトリが存在しない場合は、自動的に作成されます。
  >   
### ソースコード一覧


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
