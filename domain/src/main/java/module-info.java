module domain {
    requires spring.context;
    requires java.sql;

    exports com.example.modules.domain.entities;
    exports com.example.modules.domain.services;
}