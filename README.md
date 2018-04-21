# SpringAngular
## Create Angular App with minimal configurations using angular cli
`ng new spring-angular --minimal`

## Add the below script to package.json for prod build
`"build:prod": "ng build --prod --environment=prod --output-hashing none"`

## Copy Angular project
`Copy all the content to src/main/webapp (for Maven Project) or WebContent folder (Non-Maven Project)`


## Modify index.html
`Change base href to ./`

## Build Angular App
`go to src/main/webapp or WebContent and run the below command in command prompt`
`npm run build:prod`

## Modify index.html again
`Add the scripts generated in dist folder to index.html`

## Modify web.xml
`Add the welcome file to src/index.html`

## Modify mvc-config.xml
`Add <mvc:default-servlet-handler/> to load the welcome file by default`

## Run the Spring App

