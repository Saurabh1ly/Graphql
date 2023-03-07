# Graphql
Simple demonstration on using Apollo client to fetch graphql queries on android app using hilt and coroutines.

Graphql endpoint
https://countries.trevorblades.com/graphql

Above endpoint exposes the list of countries.

To directly download the schema from server, run the following gradle command
./gradlew :app:downloadApolloSchema --endpoint='https://countries.trevorblades.com/graphql' --schema=app/src/main/graphql/com.graphql/schema.graphqls

Note: Need to define the package name for apollo service in app level build.gradle as below
apollo {
    service("service") {
        packageName.set("com.graphql")
    }
}

It will automatically create a server contract schema on local which we will use to add/modify app level schema.

