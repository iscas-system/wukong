/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */

package com.github.nodeless;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class NodelessConstants {

	
	public final static String POM = "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\r\n" + 
			"	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" + 
			"	xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n" + 
			"	<modelVersion>4.0.0</modelVersion>\r\n" + 
			"\r\n" + 
			"	<groupId>io.github.cloudpluslab</groupId>\r\n" + 
			"	<artifactId>NAME</artifactId>\r\n" + 
			"	<version>1.0.0</version>\r\n" + 
			"	<packaging>jar</packaging>\r\n" + 
			"\r\n" + 
			"	<name>wukong</name>\r\n" + 
			"	<url>http://maven.apache.org</url>\r\n" + 
			"\r\n" + 
			"	<properties>\r\n" + 
			"		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\r\n" + 
			"	</properties>\r\n" + 
			"\r\n" + 
			"	<dependencies>\r\n" + 
			"		<dependency>\r\n" + 
			"			<groupId>junit</groupId>\r\n" + 
			"			<artifactId>junit</artifactId>\r\n" + 
			"			<version>4.11</version>\r\n" + 
			"			<scope>test</scope>\r\n" + 
			"		</dependency>\r\n" + 
			"\r\n" + 
			"		<!-- https://mvnrepository.com/artifact/com.alibaba/fastjson -->\r\n" + 
			"		<dependency>\r\n" + 
			"			<groupId>com.alibaba</groupId>\r\n" + 
			"			<artifactId>fastjson</artifactId>\r\n" + 
			"			<version>1.2.62</version>\r\n" + 
			"		</dependency>\r\n" + 
			"\r\n" + 
			"		<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->\r\n" + 
			"		<dependency>\r\n" + 
			"			<groupId>org.apache.commons</groupId>\r\n" + 
			"			<artifactId>commons-lang3</artifactId>\r\n" + 
			"			<version>3.9</version>\r\n" + 
			"		</dependency>\r\n" + 
			"\r\n" + 
			"		<!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->\r\n" + 
			"		<dependency>\r\n" + 
			"			<groupId>org.springframework</groupId>\r\n" + 
			"			<artifactId>spring-core</artifactId>\r\n" + 
			"			<version>5.2.2.RELEASE</version>\r\n" + 
			"		</dependency>\r\n" + 
			"\r\n" + 
			"		<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->\r\n" + 
			"		<dependency>\r\n" + 
			"			<groupId>org.springframework</groupId>\r\n" + 
			"			<artifactId>spring-context</artifactId>\r\n" + 
			"			<version>5.2.2.RELEASE</version>\r\n" + 
			"		</dependency>\r\n" + 
			"\r\n" + 
			"		<!-- https://mvnrepository.com/artifact/org.springframework/spring-beans -->\r\n" + 
			"		<dependency>\r\n" + 
			"			<groupId>org.springframework</groupId>\r\n" + 
			"			<artifactId>spring-beans</artifactId>\r\n" + 
			"			<version>5.2.2.RELEASE</version>\r\n" + 
			"		</dependency>\r\n" + 
			"		\r\n" + 
			"		DEP\r\n" + 
			"	</dependencies>\r\n" + 
			"\r\n" + 
			"	<build>\r\n" + 
			"		<plugins>\r\n" + 
			"			<plugin>\r\n" + 
			"				<groupId>org.apache.maven.plugins</groupId>\r\n" + 
			"				<artifactId>maven-dependency-plugin</artifactId>\r\n" + 
			"				<executions>\r\n" + 
			"					<execution>\r\n" + 
			"						<id>copy-dependencies</id>\r\n" + 
			"						<phase>package</phase>\r\n" + 
			"						<goals>\r\n" + 
			"							<goal>copy-dependencies</goal>\r\n" + 
			"						</goals>\r\n" + 
			"						<configuration>\r\n" + 
			"							<outputDirectory>${project.build.directory}/lib</outputDirectory>\r\n" + 
			"							<overWriteReleases>false</overWriteReleases>\r\n" + 
			"							<overWriteSnapshots>false</overWriteSnapshots>\r\n" + 
			"							<overWriteIfNewer>true</overWriteIfNewer>\r\n" + 
			"						</configuration>\r\n" + 
			"					</execution>\r\n" + 
			"				</executions>\r\n" + 
			"			</plugin>\r\n" + 
			"			<plugin>\r\n" + 
			"				<groupId>org.apache.maven.plugins</groupId>\r\n" + 
			"				<artifactId>maven-compiler-plugin</artifactId>\r\n" + 
			"				<configuration>\r\n" + 
			"					<source>1.8</source>\r\n" + 
			"					<target>1.8</target>\r\n" + 
			"					<compilerArgs>\r\n" + 
			"						<arg>-parameters</arg>\r\n" + 
			"					</compilerArgs>\r\n" + 
			"				</configuration>\r\n" + 
			"			</plugin>\r\n" + 
			"			<plugin>\r\n" + 
			"				<artifactId>maven-assembly-plugin</artifactId>\r\n" + 
			"				<configuration>\r\n" + 
			"					<archive>\r\n" + 
			"						<manifestEntries>\r\n" + 
			"							<Class-Path>.</Class-Path>\r\n" + 
			"						</manifestEntries>\r\n" + 
			"					</archive>\r\n" + 
			"					<descriptorRefs>\r\n" + 
			"						<descriptorRef>jar-with-dependencies</descriptorRef>\r\n" + 
			"					</descriptorRefs>\r\n" + 
			"				</configuration>\r\n" + 
			"				<executions>\r\n" + 
			"					<execution>\r\n" + 
			"						<id>make-assembly</id>\r\n" + 
			"						<phase>package</phase>\r\n" + 
			"						<goals>\r\n" + 
			"							<goal>single</goal>\r\n" + 
			"						</goals>\r\n" + 
			"					</execution>\r\n" + 
			"				</executions>\r\n" + 
			"			</plugin>\r\n" + 
			"			<plugin>\r\n" + 
			"				<artifactId>maven-resources-plugin</artifactId>\r\n" + 
			"				<executions>\r\n" + 
			"					<execution>\r\n" + 
			"						<id>copy-confs</id>\r\n" + 
			"						<phase>process-sources</phase>\r\n" + 
			"						<goals>\r\n" + 
			"							<goal>copy-resources</goal>\r\n" + 
			"						</goals>\r\n" + 
			"						<configuration>\r\n" + 
			"							<outputDirectory>${basedir}/target/classes</outputDirectory>\r\n" + 
			"							<resources>\r\n" + 
			"								<resource>\r\n" + 
			"									<directory>${basedir}/src/main/java</directory>\r\n" + 
			"									<includes>\r\n" + 
			"										<include>**/*.conf</include>\r\n" + 
			"										<include>**/*.yml</include>\r\n" + 
			"										<include>**/*.properties</include>\r\n" + 
			"									</includes>\r\n" + 
			"								</resource>\r\n" + 
			"							</resources>\r\n" + 
			"						</configuration>\r\n" + 
			"					</execution>\r\n" + 
			"				</executions>\r\n" + 
			"			</plugin>\r\n" + 
			"		</plugins>\r\n" + 
			"	</build>\r\n" + 
			"</project>\r\n" + 
			"";
	
	public static String CLIENT = "/**\r\n" + 
			" * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences\r\n" + 
			" */\r\n" + 
			"package com.github.nodeless;\r\n" + 
			"\r\n" + 
			"import java.util.Map;\r\n" + 
			"\r\n" + 
			"/**\r\n" + 
			" * @author  wuheng@otcaix.iscas.ac.cn\r\n" + 
			" * \r\n" + 
			" * @version 2.3.0\r\n" + 
			" * @since   2020.2.15\r\n" + 
			" * \r\n" + 
			" **/\r\n" + 
			"public class NodelessClient {\r\n" + 
			"\r\n" + 
			"	public static Object client;\r\n" + 
			"	\r\n" + 
			"	public static Object getClient(Map<String, String> map) {\r\n" + 
			"		if (client == null) {\r\n" + 
			"			try {\r\n" + 
			"				client = VALUE;\r\n" + 
			"			} catch (Exception ex) {\r\n" + 
			"				\r\n" + 
			"			}\r\n" + 
			"		}\r\n" + 
			"		return client;\r\n" + 
			"	}\r\n" + 
			"\r\n" + 
			"}\r\n" + 
			"";
}
