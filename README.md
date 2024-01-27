# jib-convention-test

All the magic happens in [buildSrc/build.gradle.kts](buildSrc/build.gradle.kts) and [jib-convention.gradle.kts](buildSrc/src/main/kotlin/jib-convention.gradle.kts)

## Test

~~~
./gradlew jibDockerBuild
~~~

And then

~~~
docker run --rm hello-world
~~~
