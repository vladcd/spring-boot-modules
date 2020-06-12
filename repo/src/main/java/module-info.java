module repo {
    requires spring.boot.starter.data.jpa;
    requires spring.boot.starter.aop;
    requires spring.boot.starter;
    requires spring.boot.starter.jdbc;
    requires spring.boot.autoconfigure;
    requires spring.aop;
    requires spring.beans;
    requires spring.core;
    requires spring.jdbc;
    requires spring.tx;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.orm;
    requires spring.expression;
    requires spring.jcl;

    requires org.aspectj.weaver;
    requires java.transaction;
    requires java.persistence;

    requires org.hibernate.orm.core;
    requires org.jboss.logging;
    requires javassist;
    requires net.bytebuddy;
    requires antlr;
    requires org.jboss.jandex;
    requires com.fasterxml.classmate;
    requires dom4j;
    requires org.hibernate.commons.annotations;
    requires org.glassfish.jaxb.runtime;
    requires java.xml.bind;
    requires com.sun.istack.runtime;
    requires jakarta.activation;
    requires org.slf4j;

    requires transitive domain;

    exports com.example.modules.repo.services.impl; // makes the ActorServiceImpl @Service bean available
    exports com.example.modules.repo.config; // makes the RepoConfig @Configuration bean available

    opens com.example.modules.repo.mapper to spring.beans;
    opens com.example.modules.repo.config to spring.core;
    opens com.example.modules.repo.entities to org.hibernate.orm.core, spring.core, spring.beans;
    opens com.example.modules.repo.services.impl to spring.core;
}