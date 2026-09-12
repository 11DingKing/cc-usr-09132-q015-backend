plugins { kotlin("jvm") version "2.1.0"; application }
repositories { mavenCentral() }
dependencies { implementation("io.ktor:ktor-server-core-jvm:3.0.3"); implementation("io.ktor:ktor-server-netty-jvm:3.0.3"); implementation("com.mysql:mysql-connector-j:9.2.0"); implementation("org.apache.kafka:kafka-clients:3.9.0"); testImplementation(kotlin("test")) }
