# swagger
- Integerate with openapi 
- Generete openapi.json plugn
- Generate api client using openApiGenerate 

#### Open Api 
```
implementation 'org.springdoc:springdoc-openapi-ui:1.6.15'
```

#### gradle plugin to generate openapi.json
```
id "org.springdoc.openapi-gradle-plugin" version "1.6.0"
```

#### gradle plugin for client generation 
```
id "org.openapi.generator" version "6.4.0"
```

###### gradle command
```
 .\gradlew clean generateOpenApiDocs openApiGenerate
```
