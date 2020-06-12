module rest {
    requires transitive domain;
    requires transitive repo;

    requires spring.boot.starter.web;
    requires spring.boot.starter;
    requires spring.boot.starter.logging;
    requires spring.boot.starter.json;
    requires spring.boot.starter.tomcat;
    requires spring.boot;
    requires spring.core;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires spring.webmvc;
    requires spring.aop;
    requires spring.expression;
    requires spring.beans;

    requires logback.classic;
    requires logback.core;
    requires org.slf4j;
    requires org.apache.logging.log4j;
    requires org.apache.logging.slf4j;
    requires jul.to.slf4j;
    requires java.annotation;
    requires org.yaml.snakeyaml;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.datatype.jdk8;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires com.fasterxml.jackson.module.paramnames;
    requires org.apache.tomcat.embed.core;
    requires jakarta.el;
    requires org.apache.tomcat.embed.websocket;

    exports com.example.modules.rest;
    exports com.example.modules.rest.controller;

    opens com.example.modules.rest;
    opens com.example.modules.rest.controller;
}