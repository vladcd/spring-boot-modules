module rest {
    requires domain;

    requires spring.beans;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires com.fasterxml.jackson.core;

    opens com.example.modules.rest;
    opens com.example.modules.rest.controller;
}