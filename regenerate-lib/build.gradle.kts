import java.net.URL
import java.nio.file.Paths
import java.time.ZonedDateTime

// libschemaorg is a Java library built from the Schema.org OWL file.
// Copyright (C) 2022  Antony Cartwright, Polycode Limited
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// Mozilla Public License, v. 2.0 for more details.

buildscript {
    repositories {
        mavenLocal() // OWL to Java Task would be in local
        // https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry
        //maven(url = "https://maven.pkg.github.com/antonycc/owl-to-java") {
        //    name = "GitHubPackages"
        //    credentials {
        //        username = System.getenv("GITHUB_ACTOR")
        //        password = System.getenv("GITHUB_TOKEN")
        //    }
        //}
        // https://tech.europace.de/post/working-with-gradle-and-github-packages/
        listOf("/antonycc/owl-to-java").forEach { path ->
            maven {
                setUrl("https://maven.pkg.github.com${path}")
                content {
                    includeGroup("co.uk.polycode")
                }
                credentials {
                    //username = project.findProperty("gpr.user").toString()
                    //password = project.findProperty("gpr.token").toString()
                    username = System.getenv("GITHUB_ACTOR")
                    password = System.getenv("GITHUB_TOKEN")
                }
            }
        }
    }
    dependencies {
        classpath("co.uk.polycode:owl-to-java:0.0.9-SNAPSHOT")
    }
}

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

tasks {
    // Regenerate Java classes for schema.org using the OWL schema
    val regenerate by registering(uk.co.polycode.owltojava.RegenerateOntologyTask::class) {
        outputs.upToDateWhen { false }
        val srcMain: String = Paths.get("${projectDir}/../src/main").toFile().absolutePath
        val sourceFileName = "schemaorg.owl"
        lang = "en"
        src = Paths.get("${srcMain}/resources/${sourceFileName}").toFile()
        dest = Paths.get("${srcMain}/java").toFile()
        javaBasePackage = "uk.co.polycode.ontology.lib"
        licenceText = """
            This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
            Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
            The Schema.org license is applicable to the generated source files and the license is available from 
            https://creativecommons.org/licenses/by-sa/3.0/
            """
        classes = listOf(
            "https://schema.org/Person",
            "https://schema.org/City",
            "https://schema.org/CorporationX",
            "https://schema.org/Project",
            "https://schema.org/Book",
            "https://schema.org/Article",
            "https://schema.org/Fake"
        )
        primitivePropertyTypes = mapOf(
            "https://schema.org/DataType" to Object::class.java.name,
            "https://schema.org/Text"     to String::class.java.name,
            "https://schema.org/Time"     to ZonedDateTime::class.java.name,
            "https://schema.org/DateTime" to ZonedDateTime::class.java.name,
            "https://schema.org/Date"     to ZonedDateTime::class.java.name,
            "https://schema.org/URL"      to URL::class.java.name,
            "https://schema.org/Integer"  to BigInteger::class.java.name,
            "https://schema.org/Float"    to BigDecimal::class.java.name,
            "https://schema.org/Number"   to BigDecimal::class.java.name,
            "https://schema.org/Boolean"  to "java.lang.Boolean" // Boolean::class.java.name, unboxes to boolean.
        )
        ignoredPropertyTypes = listOf(
            "https://schema.org/Role"
        )
        prunedPropertyTypes = listOf(
            "https://schema.org/Text",
            "https://schema.org/URL"
        )
        ignoredSuperclasses = listOf<String>(
            "https://www.w3.org/2000/01/rdf-schema#Class"
        )
    }
    logger.debug("regenerate task created: ${regenerate}")
}
