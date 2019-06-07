[![CircleCI](https://circleci.com/gh/nabla-squared/laplacian-arch.model.deployment.svg?style=shield)](https://circleci.com/gh/nabla-squared/laplacian-arch.model.deployment)

# laplacian-arch:model:deployment

This model represents the logical structure of application deployments to the certain environments.



## The structure of the *deployment* model

The following diagram summarizes the structure of the model:

![](./doc/image/model-diagram.svg)


As shown in above diagram, this model depends on the following external models.

- *metamodel* (laplacian.model.metamodel)

- *client-app-arch* (laplacian-arch.model.client-app-arch)

- *service-api-arch* (laplacian-arch.model.service-api-arch)

- *datasource* (laplacian-arch.model.datasource)



## Getting started

Firstly, you need to add the following entry to your `laplacian-module.yml` :

```yaml
project:
  group: ${your.project.group}
  name: ${your.project.name}
  type: project
  version: "1.0.0"
  models:
  ## ↓↓ ADD ↓↓ ##
  - group: laplacian-arch
    name: deployment
    version: "1.0.0"
  ## ↑↑ ADD ↑↑ ##
```

To reflect the change, you need to type the following command in your console :
```bash
./gradlew lM
```

Then put some template files under the *./template* directory and type the following command to generate files:
```bash
./gradlew lG
```